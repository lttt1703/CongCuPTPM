package com.webbanhang.Controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webbanhang.Controller.User.BaseController;
import com.webbanhang.Entity.BillDetail;
import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.Products;
import com.webbanhang.Entity.Users;
import com.webbanhang.Service.User.AccountServiceImpl;
import com.webbanhang.Service.User.BillsServiceImpl;
import com.webbanhang.Service.User.HomeServiceImpl;

@Controller
public class AdminController extends BaseController {

	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	@Autowired
	BillsServiceImpl billsService = new BillsServiceImpl();
	@Autowired
	HomeServiceImpl homeService = new HomeServiceImpl();

	@RequestMapping(value = { "/admin/", "/admin/trang-chu" }, method = RequestMethod.GET)
	public ModelAndView admin() {
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
		_mvShare.addObject("products", homeService.GetDataProducts());
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/danh-sach-danh-muc" }, method = RequestMethod.GET)
	public ModelAndView ListCategory() {
		_mvShare.setViewName("admin/listcategory");
		_mvShare.addObject("categories", homeService.GetDataCategories());
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
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = { "/admin/danh-sach-don-hang" }, method = RequestMethod.GET)
	public ModelAndView ListBill() {
		_mvShare.addObject("bills", billsService.GetDataBill());
		_mvShare.setViewName("admin/listbill");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/them-san-pham" }, method = RequestMethod.GET)
	public ModelAndView AddProduct() {
		_mvShare.addObject("newProduct", new Products());
		_mvShare.setViewName("admin/addproduct");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/them-san-pham" }, method = RequestMethod.POST)
	public ModelAndView AddProduct(@ModelAttribute("newProduct") Products newProduct) {
		int count = homeService.AddProduct(newProduct);
		if (count > 0) {
			_mvShare.setViewName("redirect:/admin/danh-sach-san-pham");
			// _mvShare.addObject("products", homeService.GetDataProducts());
		}
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/chinh-sua-san-pham/{id}" }, method = RequestMethod.GET)
	public ModelAndView EditProduct(@PathVariable String id) {
		try {
			_mvShare.addObject("editProduct", homeService.GetProductById(id));
			_mvShare.setViewName("admin/editproduct");
			return _mvShare;
		} catch (Exception e) {
			_mvShare.setViewName("redirect:/admin/danh-sach-san-pham");
			return _mvShare;
		}

	}

	@RequestMapping(value = { "/admin/chinh-sua-san-pham/{id}" }, method = RequestMethod.POST)
	public ModelAndView EditProduct(@ModelAttribute("editProduct") Products editProduct, @PathVariable String id) {

		int count = homeService.EditProduct(editProduct);
		if (count > 0)
			_mvShare.setViewName("redirect:/admin/danh-sach-san-pham");
		return _mvShare;

	}

	@RequestMapping(value = { "/admin/xoa-san-pham/{id}" }, method = RequestMethod.GET)
	public ModelAndView DeleteProduct() {
		_mvShare.setViewName("redirect:/admin/danh-sach-san-pham");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/xoa-san-pham/{id}" }, method = RequestMethod.POST)
	public ModelAndView DeleteProduct(@PathVariable String id) {

		int count = homeService.DeleteProduct(id);

		_mvShare.setViewName("redirect:/admin/danh-sach-san-pham");
		// _mvShare.addObject("products", homeService.GetDataProducts());

		return _mvShare;

	}

	@RequestMapping(value = { "/admin/chi-tiet-don-hang/{id}" }, method = RequestMethod.GET)
	public ModelAndView BillDetail(@PathVariable String id) {
		_mvShare.addObject("billDetail", billsService.GetDataBillDetail(id));
		_mvShare.setViewName("admin/billdetail");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/them-danh-muc" }, method = RequestMethod.GET)
	public ModelAndView AddCategory() {
		_mvShare.addObject("newCategory", new Categories());
		_mvShare.setViewName("admin/addcategory");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/them-danh-muc" }, method = RequestMethod.POST)
	public ModelAndView AddCategory(@ModelAttribute("newCategory") Categories newCategory) {
		int count = homeService.AddCategory(newCategory);
		if (count > 0) {
			_mvShare.setViewName("redirect:/admin/danh-sach-danh-muc");
			_mvShare.addObject("categories", homeService.GetDataCategories());
		}
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/chinh-sua-danh-muc/{id}" }, method = RequestMethod.GET)
	public ModelAndView EditCategory(@PathVariable String id) {
		_mvShare.addObject("editCategory", homeService.GetCategoryById(id));
		_mvShare.setViewName("admin/editcategory");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/chinh-sua-danh-muc/{id}" }, method = RequestMethod.POST)
	public ModelAndView EditCategory(@ModelAttribute("editCategory") Categories editCategory, @PathVariable String id) {
		int count = homeService.EditCategory(editCategory);
		if (count > 0) {
			_mvShare.setViewName("redirect:/admin/danh-sach-danh-muc");
			_mvShare.addObject("categories", homeService.GetDataCategories());
		}
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/xoa-danh-muc/{id}" }, method = RequestMethod.GET)
	public ModelAndView DeleteCategory() {
		_mvShare.setViewName("redirect:/admin/danh-sach-danh-muc");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/xoa-danh-muc/{id}" }, method = RequestMethod.POST)
	public ModelAndView DeleteCategory(@PathVariable String id) {
		int count = homeService.DeleteCategory(id);
		if (count > 0) {
			_mvShare.setViewName("redirect:/admin/danh-sach-danh-muc");
			_mvShare.addObject("categories", homeService.GetDataCategories());
		}
		return _mvShare;
	}

}
