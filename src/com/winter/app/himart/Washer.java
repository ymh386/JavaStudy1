package com.winter.app.himart;

public class Washer extends Product {

	private int save;
	private String kind;
	
	public Washer() {
		this.setPrice(900);
		this.setBrand("SAMSUNG");
		this.setPoint(90);
		this.setKind("드럼식");
		this.setSave(16);
	}
	
	public int getSave() {
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("용량 : " + this.save);
		System.out.println("종류 : " + this.kind);
		System.out.println("=================================");

	}
	
}
