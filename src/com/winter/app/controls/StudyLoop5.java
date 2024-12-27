package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop5 {
	
	/**
	 * FPS
	 * 총알 30발
	 * 탄창 1*30
	 * 탄창 3개
	 * 1.단발모드 2.점사모드
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("사격모드 설정 1.단발모드 or 2.점사모드");
			int mode = sc.nextInt();
			
			int count=10;
			String sound="타타탕!";
			if(mode==1) {
				count=30;
				sound="탕!";
			}
			for(int j=0;j<count;j++) {
				System.out.println(j+1 + sound);
			}
			System.out.println("탄창 소비");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
