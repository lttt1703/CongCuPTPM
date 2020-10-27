package com.webbanhang.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Dto.PaginatesDto;


@Controller
public class HomeController extends BaseController{
	
	private int _limitProduct = 12;
	
	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		
		int totalData = _homeService.GetDataProducts().size();
		
		PaginatesDto paginate = _paginatesService.GetInfoPaginates(totalData, _limitProduct, 1);
		
		_mvShare.addObject("paginateInfo", paginate);
		
		_mvShare.addObject("productsPaginate", _homeService.GetDataProductsPaginate(paginate.getStart(), _limitProduct));
		
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/trang-chu/page-{currentPage}"})
	public ModelAndView Index(@PathVariable String currentPage) {
		
		int totalData = _homeService.GetDataProducts().size();
		
		PaginatesDto paginate = _paginatesService.GetInfoPaginates(totalData, _limitProduct, Integer.parseInt(currentPage));
		
		_mvShare.addObject("paginateInfo", paginate);
		
		_mvShare.addObject("productsPaginate", _homeService.GetDataProductsPaginate(paginate.getStart(), _limitProduct));
		
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping(value = {"san-pham/{id}"})
	public ModelAndView Detail(@PathVariable String id) {
		_mvShare.addObject("productsById", _homeService.GetDataProductsById(id));
		_mvShare.setViewName("user/detail");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/gio-hang"}, method = RequestMethod.GET)
	public ModelAndView Cart() {
		_mvShare.setViewName("user/cart");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dang-nhap"}, method = RequestMethod.GET)
	public ModelAndView SignInPage() {
		ModelAndView mv = new ModelAndView("user/SignInPage");
		return mv;
	}
	
	@RequestMapping(value = {"/dang-ky"}, method = RequestMethod.GET)
	public ModelAndView Register() {
		ModelAndView mv = new ModelAndView("user/Register");
		return mv;
	}
}
