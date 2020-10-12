package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Entity.Categories;

@Service
public interface ICategoriesService {
	@Autowired
	public List<Categories> GetDataCategories();
}
