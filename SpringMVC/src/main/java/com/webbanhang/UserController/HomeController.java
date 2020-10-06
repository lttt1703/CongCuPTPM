package com.webbanhang.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
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
