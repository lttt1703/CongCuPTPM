package com.webbanhang.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Controller.User.BaseController;
import com.webbanhang.Entity.Users;
import com.webbanhang.Service.User.AccountServiceImpl;
import com.webbanhang.Service.User.BillsServiceImpl;

@Controller
public class AdminController extends BaseController{
		
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	@Autowired
	BillsServiceImpl billsService = new BillsServiceImpl();
		
	@RequestMapping(value = { "/admin/","/admin/trang-chu" }, method = RequestMethod.GET)
	public ModelAndView admin(Users admin) {
		_mvShare.addObject("admin", new Users());
		_mvShare.setViewName("admin/index");
		return _mvShare;
	} 
	@RequestMapping(value = { "/admin/danh-sach-nguoi-dung" }, method = RequestMethod.GET)
	public ModelAndView ListUser() {	
		_mvShare.addObject("listUser", accountService.GetDataUsers());
		_mvShare.setViewName("admin/listuser");
		return _mvShare; 
	}
	@RequestMapping(value = { "/admin/danh-sach-san-pham" }, method = RequestMethod.GET)
	public ModelAndView ListProducts() {	
		_mvShare.setViewName("admin/listproducts");
		return _mvShare;
	}
	@RequestMapping(value = { "/admin/danh-sach-danh-muc" }, method = RequestMethod.GET)
	public ModelAndView ListCategory() {	
		_mvShare.setViewName("admin/listcategory");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/danh-sach-nsx" }, method = RequestMethod.GET)
	public ModelAndView ListNSX() {	
		_mvShare.setViewName("admin/listnsx");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/dang-nhap" }, method = RequestMethod.GET)
	public ModelAndView Login(Users admin) {
		_mvShare.addObject("admin", new Users());
		_mvShare.setViewName("admin/login");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/dang-nhap" }, method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session, @ModelAttribute("admin") Users admin) {
		admin = accountService.CheckAccountAdmin(admin);
		_mvShare.addObject("statusLogin", "");
		if (admin != null) {		
			_mvShare.setViewName("redirect:/admin/trang-chu");
			session.setAttribute("adminInfo", admin);
		} else {
			_mvShare.addObject("statusLogin", "Tên đăng nhập hoặc mật khẩu không chính xác!");
		}
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/dang-xuat" }, method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("adminInfo");
		return "redirect:"+ request.getHeader("Referer");
	}
	
	@RequestMapping(value = { "/admin/danh-sach-don-hang" }, method = RequestMethod.GET)
	public ModelAndView ListBill() {
		_mvShare.addObject("bills", billsService.GetDataBill());
		_mvShare.setViewName("admin/listbill");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/them-san-pham" }, method = RequestMethod.GET)
	public ModelAndView AddProduct() {
		_mvShare.addObject("user", new Users());
		_mvShare.setViewName("user/Register");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/them-san-pham" }, method = RequestMethod.POST)
	public ModelAndView AddProduct(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if (count > 0) {
			_mvShare.addObject("status", "Đăng ký tài khoản thành công");
		} else {
			_mvShare.addObject("status", "Đăng ký tài khoản thất bại");
		}
		_mvShare.setViewName("user/SignInPage");
		return _mvShare;
	}

}
