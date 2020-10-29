package com.webbanhang.Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Dto.PaginatesDto;
import com.webbanhang.Entity.Users;
import com.webbanhang.Service.User.AccountServiceImpl;

@Controller
public class HomeController extends BaseController {

	private int _limitProduct = 12;
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();

	@RequestMapping(value = { "/", "/trang-chu" }, method = RequestMethod.GET)
	public ModelAndView Index() {

		int totalData = _homeService.GetDataProducts().size();

		PaginatesDto paginate = _paginatesService.GetInfoPaginates(totalData, _limitProduct, 1);

		_mvShare.addObject("paginateInfo", paginate);

		_mvShare.addObject("productsPaginate",
				_homeService.GetDataProductsPaginate(paginate.getStart(), _limitProduct));

		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = { "/trang-chu/page-{currentPage}" })
	public ModelAndView Index(@PathVariable String currentPage) {

		int totalData = _homeService.GetDataProducts().size();

		PaginatesDto paginate = _paginatesService.GetInfoPaginates(totalData, _limitProduct,
				Integer.parseInt(currentPage));

		_mvShare.addObject("paginateInfo", paginate);

		_mvShare.addObject("productsPaginate",
				_homeService.GetDataProductsPaginate(paginate.getStart(), _limitProduct));

		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = { "san-pham/{id}" })
	public ModelAndView Detail(@PathVariable String id) {
		_mvShare.addObject("productsById", _homeService.GetDataProductsById(id));
		_mvShare.setViewName("user/detail");
		return _mvShare;
	}

	@RequestMapping(value = { "/gio-hang" }, method = RequestMethod.GET)
	public ModelAndView Cart() {
		_mvShare.setViewName("user/cart");
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-ky" }, method = RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.addObject("user", new Users());
		_mvShare.setViewName("user/Register");
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-ky" }, method = RequestMethod.POST)
	public ModelAndView CreateAccount(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if (count > 0) {
			_mvShare.addObject("status", "Đăng ký tài khoản thành công");
		} else {
			_mvShare.addObject("status", "Đăng ký tài khoản thất bại");
		}
		_mvShare.setViewName("user/SignInPage");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/dang-nhap" }, method = RequestMethod.GET)
	public ModelAndView SignInPage(Users user) {
		_mvShare.addObject("user", new Users());
		_mvShare.setViewName("user/SignInPage");
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-nhap" }, method = RequestMethod.POST)
	public ModelAndView SignInPage(HttpSession session, @ModelAttribute("user") Users user) {
		boolean check = accountService.CheckAccount(user);
		_mvShare.addObject("statusLogin", "");
		if (check) {		
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("userInfo", user);
		} else {
			_mvShare.addObject("statusLogin", "Tên đăng nhập hoặc mật khẩu không chính xác!");
		}
		return _mvShare;
	}

}
