package com.webbanhang.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Service.User.AccountServiceImpl;

@Controller
public class AdminController extends BaseAdminController{
	
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
		
	@RequestMapping(value = { "/admin/trang-chu" }, method = RequestMethod.GET)
	public ModelAndView admin() {		
		_mvShare.setViewName("admin/index");
		return _mvShare;
	} 
	@RequestMapping(value = { "/admin/list-user" }, method = RequestMethod.GET)
	public ModelAndView ListUser() {	
		_mvShare.addObject("listUser", accountService.GetDataUsers());
		_mvShare.setViewName("admin/listuser");
		return _mvShare;
	}
	@RequestMapping(value = { "/admin/list-products" }, method = RequestMethod.GET)
	public ModelAndView ListProducts() {	
		_mvShare.setViewName("admin/listproducts");
		return _mvShare;
	}

}
