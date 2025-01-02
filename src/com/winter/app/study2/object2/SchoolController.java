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
		SchoolMate [] schoolMates = null;
		boolean check = true;
		while(check) {
			System.out.println("1.학생정보입력 2.학생정보출력 3.학생정보검색 4.학생정보삭제 5.프로그램종료");
			int select = sc.nextInt();
			if(select == 1) {
				schoolMates = sf.make(schoolMates);
				//System.out.println("입력");
			}
			else if(select == 2) {
				//System.out.println("출력");
				//sv.view(schoolMate);
				sv.view(schoolMates);
			}
			else if(select == 3) {
				SchoolMate box = sf.find(schoolMates);
				if(box != null) {
					sv.view(box);
				}
				else {
					System.out.println("일치하는 학생이 없다");
				}
			}	
			else if(select == 4) {
				schoolMates = sf.delete(schoolMates);
				sv.view(schoolMates);
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
