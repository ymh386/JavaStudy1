package com.winter.app.study2.modifier;

public class Test {
	
	int num1=10;
	
	public static int num3=1;
	
	public void m1() {
		System.out.println(this.num1);
		System.out.println(Test.num3);
	}
	
	public static void m2() {
		System.out.println(this.num1);
		System.out.println(Test.num3);
	}

}
