package com.webbanhang.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController extends BaseController{
	
	@RequestMapping(value = {"/danh-muc/{id}"})
	public ModelAndView Category(@PathVariable String id) {
		_mvShare.addObject("ProductsByCategory", _homeService.GetDataProductsByCategory(id));
		_mvShare.addObject("Category", _homeService.GetDataCategoryById(id));
		_mvShare.setViewName("user/category");
		return _mvShare;
	}
}
