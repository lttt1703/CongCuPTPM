package com.webbanhang.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Dto.CartDto;
import com.webbanhang.Dto.PaginatesDto;
import com.webbanhang.Entity.Bills;
import com.webbanhang.Entity.Users;
import com.webbanhang.Service.User.AccountServiceImpl;
import com.webbanhang.Service.User.BillsServiceImpl;
import com.webbanhang.Service.User.CartServiceImpl;

@Controller
public class HomeController extends BaseController {

	private int _limitProduct = 12;
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@Autowired
	BillsServiceImpl billsService = new BillsServiceImpl();
	
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();

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
		user = accountService.CheckAccount(user);
		_mvShare.addObject("statusLogin", "");
		if (user != null) {		
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("userInfo", user);
		} else {
			_mvShare.addObject("statusLogin", "Tên đăng nhập hoặc mật khẩu không chính xác!");
		}
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-xuat" }, method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("userInfo");
		return "redirect:"+ request.getHeader("Referer");
	}
	
	@RequestMapping(value = { "/check-out" }, method = RequestMethod.GET)
	public ModelAndView Checkout(HttpServletRequest request, HttpSession session) {
		_mvShare.setViewName("user/checkout");
		Bills bill = new Bills();
		Users loginInfo = (Users)session.getAttribute("userInfo");
		if(loginInfo!=null) {
			bill.setUser(loginInfo.getUser());
		}
		_mvShare.addObject("bill", new Bills());
		return _mvShare;
	}
	
	@RequestMapping(value = { "/check-out" }, method = RequestMethod.POST)
	public String Checkout(HttpServletRequest request, HttpSession session, @ModelAttribute("bill") Bills bill) {
		
		Users loginInfo = (Users)session.getAttribute("userInfo");
		if(loginInfo!=null) {
			bill.setUser(loginInfo.getUser());
			HashMap<Integer, CartDto> carts = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
			bill.setQuanty(cartService.TotalQuanty(carts));
			bill.setTotal(cartService.TotalPrice(carts));
			if(billsService.AddBill(bill)>0) {
				
				billsService.AddBillDetail(carts);
			}
			session.removeAttribute("Cart");
		}	
		return "redirect:gio-hang";
	}
	
	@RequestMapping(value = { "tim-kiem/{search}" })
	public ModelAndView Search(@PathVariable String search) {
		_mvShare.addObject("productsBySearch", _homeService.GetDataProductsBySearch(search));
		_mvShare.setViewName("user/search");
		return _mvShare;
	}
	
	
}
