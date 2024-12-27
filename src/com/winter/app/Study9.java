package com.winter.app;

import java.util.Scanner;

public class Study9 {
	/**
	 * 비교 연산자 (관계연산자)
	 * 결과물은 boolean
	 * a>b ,a>=b a<b, a<=b, a==b, a1=b
	 * 
	 * ==, != primitive type Ok, ReferenceType은 안전하지 않음
	 * 
	 * 
	 * 논리연산자
	 * boolean type끼리의 연산 : 결과물은 boolean
	 * && : and
	 * || : or
	 * !  : not(부정 연산자, 단항 연산자)
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=30;
		int b = 20;
		boolean result = a>b;
		
		
		b=20;
		System.out.println(a==b);
		
		String name="iu";
		String name2="iu";
		System.out.println(name==name2);
		System.out.println("이름 입력");
		String name3 = sc.next();
		System.out.println(name==name3);
		
	}

}
