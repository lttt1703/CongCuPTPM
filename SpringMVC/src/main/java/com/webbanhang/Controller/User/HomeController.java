package com.webbanhang.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		_mvShare.addObject("products", _homeService.GetDataProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping(value = {"san-pham/{id}"})
	public ModelAndView Detail(@PathVariable String id) {
		_mvShare.addObject("productsById", _homeService.GetDataProductsById(id));
		_mvShare.setViewName("user/detail");
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
