package com.webbanhang.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.webbanhang.Dto.CartDto;
import com.webbanhang.Entity.Bills;

@Service
public interface IBillsService {
	
	public int AddBill(Bills bill);
	
	public void AddBillDetail(HashMap<Integer, CartDto> carts);

}
