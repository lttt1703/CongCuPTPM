package com.webbanhang.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dto.CartDto;
import com.webbanhang.Entity.Bills;
import com.webbanhang.Entity.Products;

@Service
public interface IBillsService {
	@Autowired
	public int AddBill(Bills bill);
	@Autowired
	public void AddBillDetail(HashMap<Integer, CartDto> carts);
	@Autowired
	public List<Bills> GetDataBill();

}
