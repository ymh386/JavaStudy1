package com.winter.app.himart;

import java.util.Scanner;

public abstract class Product {
	
	private int price;
	private int point;
	private String brand;
	
	
	public void info() {
		System.out.println("가격 : " + this.price);
		System.out.println("포인트 : " + this.point);
		System.out.println("브랜드 : " + this.brand);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
