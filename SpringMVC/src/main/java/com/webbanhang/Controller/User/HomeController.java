package com.webbanhang.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Service.User.CategoriesServiceImpl;
import com.webbanhang.Service.User.ProductsServiceImpl;




@Controller
public class HomeController {
	@Autowired
	CategoriesServiceImpl categoriesImpl;
	@Autowired
	ProductsServiceImpl productsImpl;
	
	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		//ModelAndView mv = new ModelAndView("user/index");
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("categories", categoriesImpl.GetDataCategories());
		mv.addObject("products", productsImpl.GetDataProducts());
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
