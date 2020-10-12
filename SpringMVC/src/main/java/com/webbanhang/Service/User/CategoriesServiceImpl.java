package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.CategoriesDao;
import com.webbanhang.Entity.Categories;

@Service
public class CategoriesServiceImpl implements ICategoriesService{
	@Autowired
	private CategoriesDao categoriesDao;
	
	public List<Categories> GetDataCategories() {
		return categoriesDao.GetDataCategories();
	}

}
