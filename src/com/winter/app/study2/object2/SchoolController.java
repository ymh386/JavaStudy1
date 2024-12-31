package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolController {
	
	//start
	public void start() {
		
		//1. 학생정보입력 2.학생정보출력 3.프로그램종료
		Scanner sc = new Scanner(System.in);
		
		SchoolMate schoolMate = new SchoolMate();
		SchoolMateFactory sf = new SchoolMateFactory();
		SchoolMateView sv = new SchoolMateView();
		SchoolMate [] schoolMates = new SchoolMate[0];
		boolean check = true;
		while(check) {
			System.out.println("1.학생정보입력 2.학생정보출력 3.프로그램종료");
			int select = sc.nextInt();
			if(select == 1) {
				schoolMates = sf.make(schoolMates);
				//System.out.println("입력");
			}
			else if(select == 2) {
				//System.out.println("출력");
				//sv.view(schoolMate);
				sv.viewAll(schoolMates);
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
