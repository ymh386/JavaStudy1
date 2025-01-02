package com.winter.app.study2.object3;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car car1 = new Car();
		car1.info();
		
		Car car2 = new Car("White");
		//car2.color = "White";
		car2.info();
		
		//K5, Red
		Car car3 = new Car("Red");
		car3.info();
		//K7, Yellow
		Car car4 = new Car("Yellow", "K7");
		car4.info();
	}

}
