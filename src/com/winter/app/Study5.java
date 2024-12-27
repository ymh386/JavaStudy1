package com.winter.app;

import java.util.Scanner;

public class Study5 {
	/**
	 * 연산자
	 * 산술연산자 - 숫자 계산
	 * +, -, *, /, %(나머지값 구하는 연산자)
	 * 
	 * + : 
	 * 1) 산술연산자
	 * 2) 연결연산자
	 * 
	 */
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = num1 + 20;
		num2 = (int)(num1 + 1.2);
		
		System.out.println("국어점수를 입력하세요");
		int n1 = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int n2 = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int n3 = sc.nextInt();
		
		int sum = n1 + n2 + n3;
		double average = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);

		System.out.println("프로그램 종료");
		
	}

}
