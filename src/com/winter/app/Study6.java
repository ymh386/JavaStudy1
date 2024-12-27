package com.winter.app;

import java.util.Scanner;

public class Study6 {
	
	public static void main(String[] args) {
		//나머지 연산자 %
		double n1 = 12.123%3;
		
		System.out.println(n1);
		
		Scanner sc = new Scanner(System.in);
		//편의점 자동 계산
		//물건의 총 합계금액 입력
		//25300
		//낸돈 50000
		//거스름돈 24700
		//만원 2, 천원 4, 백원 7
		
		System.out.println("총 금액");
		int sum = sc.nextInt();
		System.out.println("낸 돈");
		int don = sc.nextInt();
		
		int jandon = don - sum;
		System.out.println("거스름 돈 : " + jandon);
		
		int m = jandon / 10000;
		int c = (jandon % 10000) / 1000;
		int b = ((jandon % 10000) % 1000) / 100;
		
		System.out.println("만원 : " + m + " 천원 : " + c + " 백원 : " + b);
		

	}

}
