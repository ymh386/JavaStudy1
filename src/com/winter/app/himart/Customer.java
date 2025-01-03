package com.winter.app.himart;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);
	
	private int don=10000;
	private int point = 0;
	
	public Customer() {
	
	}
	
	public void info() {
		System.out.println("현재금액 : " + don);
		System.out.println("현재포인트 : " + point);
	}
	
	//buy
	public void buy(Product pd) {
		this.don = this.don - pd.getPrice();
		this.point = this.point + pd.getPoint();
		this.info();
	}
	
	public void buy(Product [] pds) {
		for(int i=0;i<pds.length;i++) {
			if(this.don == 0) {
				break;
			}
			this.buy(pds[i]);
//			this.don = this.don - pds[i].getPrice();
//			this.point = this.point + pds[i].getPoint();
		}
		this.info();
	}
	
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
