package com.webbanhang.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Entity.Users;
import com.webbanhang.Service.User.HomeServiceImpl;
import com.webbanhang.Service.User.PaginatesServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	@Autowired
	PaginatesServiceImpl _paginatesService;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("categories", _homeService.GetDataCategories());
		_mvShare.addObject("products", _homeService.GetDataProducts());
		_mvShare.addObject("nsx", _homeService.GetDataNSX());
		_mvShare.addObject("admin", new Users());
		return _mvShare;
	}
}
