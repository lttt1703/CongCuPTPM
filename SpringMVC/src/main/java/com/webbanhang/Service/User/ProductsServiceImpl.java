package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.ProductsDao;
import com.webbanhang.Entity.Products;
@Service
public class ProductsServiceImpl implements IProductsService{
	@Autowired
	private ProductsDao productDao;
	
	public List<Products> GetDataProducts() {	
		return productDao.GetDataProducts();
	}

}
