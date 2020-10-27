package com.webbanhang.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webbanhang.Dto.CartDto;
import com.webbanhang.Entity.Products;
@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao productsDao = new ProductsDao();

	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {
		CartDto itemCart = new CartDto();

		Products product = productsDao.GetProductById(id);
		if (product != null ) {
			if(!cart.containsKey(id)) {
				itemCart.setProduct(product);
				itemCart.setQuanty(1);
				itemCart.setTotal(product.getPrice());
			}else {
				itemCart = cart.get(id);
				itemCart.setQuanty(itemCart.getQuanty() + 1);
				itemCart.setTotal(itemCart.getQuanty() * itemCart.getProduct().getPrice());
			}
		}
		cart.put(id, itemCart);
		return cart;
	}

	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double total = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotal(total);
		}
		cart.put(id, itemCart);
		return cart;
	}

	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	public int TotalQuanty(HashMap<Integer, CartDto> cart) {
		int total = 0;
		for (Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			total += itemCart.getValue().getQuanty();
		}
		return total;
	}

	public double TotalPrice(HashMap<Integer, CartDto> cart) {
		double total = 0;
		for (Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			total += itemCart.getValue().getTotal();
		}
		return total;
	}
}
