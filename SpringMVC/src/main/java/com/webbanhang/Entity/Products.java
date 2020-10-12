package com.webbanhang.Entity;

public class Products {
	private int id;
	private String name;
	private int category_id;
	private int producer_id;
	private float price;
	private String detail;
	private String image;
	private int sale;
	public Products(int id, String name, int category_id, int producer_id, float price, String detail, String image,
			int sale) {
		super();
		this.id = id;
		this.name = name;
		this.category_id = category_id;
		this.producer_id = producer_id;
		this.price = price;
		this.detail = detail;
		this.image = image;
		this.sale = sale;
	}
	public Products() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getProducer_id() {
		return producer_id;
	}
	public void setProducer_id(int producer_id) {
		this.producer_id = producer_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
}
