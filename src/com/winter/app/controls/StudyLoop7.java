package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop7 {
	/**
	 * 
	 * while(조건식){
	 * 조건식이 true일때 실행
	 * }
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		//1.정보입력	2.정보수정		3.정보출력		4.프로그램종료
		while(check) {
			System.out.println("1.정보입력 2.정보수정 3.정보출력 4.프로그램종료");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("정보입력 코드");
				break;
			case 2:
				System.out.println("정보수정 코드");
				break;
			case 3:
				System.out.println("정보출력 코드");
				break;
			case 4:
				System.out.println("프로그램종료");
				check=!check;
				break;
			default:
				System.out.println("다시 입력하세요");
			}
			
//			if(num==1) {
//				System.out.println("정보를 입력합니다");
//			}
//			else if(num==2) {
//				System.out.println("정보를 수정합니다");
//			}
//			else if(num==3) {
//				System.out.println("정보를 출력합니다");
//			}
//			else if(num==4){
//				System.out.println("프로그램 종료");
//				break;
//			}
//			else {
//				System.out.println("다시 입력하세요");
//			}
		}
		
	}

}
