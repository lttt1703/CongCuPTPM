package com.webbanhang.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dto.CartDto;

@Service
public interface ICartService {
	@Autowired
	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart);
	@Autowired
	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer, CartDto> cart);
	@Autowired
	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart);
	@Autowired
	public int TotalQuanty(HashMap<Integer, CartDto> cart);
	@Autowired
	public double TotalPrice(HashMap<Integer, CartDto> cart);
}
