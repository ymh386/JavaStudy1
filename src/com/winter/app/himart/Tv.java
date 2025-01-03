package com.winter.app.himart;

public class Tv extends Product {
	
	private int picture;
	private int size;
	
	public Tv() {
		this.setPrice(1000);
		this.setBrand("LG");
		this.setPicture(1080);
		this.setPoint(100);
		this.setSize(100);
	}
	
	public int getPicture() {
		return picture;
	}
	public void setPicture(int picture) {
		this.picture = picture;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public void info() {
		 super.info();
		 System.out.println("화질 : " + this.picture);
		 System.out.println("크기 : " + this.size);
		 System.out.println("=================================");
	}
	
}
