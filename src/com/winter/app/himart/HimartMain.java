package com.winter.app.himart;

import java.util.Scanner;

public class HimartMain {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.info();
		 
		Computer pc = new Computer();
		pc.info();
		 
		Washer ws = new Washer();
		ws.info();
		
		Customer ct = new Customer();
		
		ct.info();
		
		Product pds [] = new Product[2];
		pds[0] = pc;
		pds[1] = ws;
		pds[2] = tv;
		
		ct.buy(pds);
		
		
		 
	}

}
