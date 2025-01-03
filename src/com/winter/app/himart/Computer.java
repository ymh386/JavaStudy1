package com.winter.app.himart;

public class Computer extends Product {

	private String cpu;
	
	public Computer() {
		this.setPrice(800);
		this.setBrand("SAMSUNG");
		this.setCpu("인텔 i5");
		this.setPoint(80);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("cpu : " + this.cpu);
		System.out.println("=================================");


	}
	
}
