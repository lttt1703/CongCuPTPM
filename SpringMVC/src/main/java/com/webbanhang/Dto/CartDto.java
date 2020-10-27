package com.webbanhang.Dto;

import com.webbanhang.Entity.Products;

public class CartDto {
	private int quanty;
	private double total;
	private Products product;
	public CartDto(int quanty, double total, Products product) {
		super();
		this.quanty = quanty;
		this.total = total;
		this.product = product;
	}
	public CartDto() {
		super();
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}

}
