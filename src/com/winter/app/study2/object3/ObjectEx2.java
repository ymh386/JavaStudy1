package com.winter.app.study2.object3;

public class ObjectEx2 {
	
	//method overloading
	//같은 이름의 메서드를 여러개 만드는것
	//새로만드는 new의 개수
	
	//조건
	//1. 메서드의 이름은 같아야 함
	//2. 매개변수의 갯수나, 타입이 달라야 함
	//3. 메서드의 내용을 달라도 상관없음
	//4. 리턴타입이나 접근지정자는 달라도 상관 없음
	
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void sum(int num1) {
		System.out.println(num1);
	}
	
	public void sum(int num1, long num2) {
		System.out.println(num1+num2);
	}
	
	public void sum(int num1, Float num2) {
		System.out.println(num1+num2);
	}
	
	public void sum(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	

}
