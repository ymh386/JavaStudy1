package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	public SchoolMate make() {
		Scanner sc = new Scanner(System.in);
		SchoolMate schoolMate = new SchoolMate();
		System.out.println("이름입력");
		schoolMate.name = sc.next();
		System.out.println("학번입력");
		schoolMate.num = sc.nextInt();
		System.out.println("국어점수입력");
		schoolMate.kor = sc.nextInt();
		System.out.println("영어점수입력");
		schoolMate.eng = sc.nextInt();
		System.out.println("수학점수입력");
		schoolMate.math = sc.nextInt();
		schoolMate.total = schoolMate.kor + schoolMate.eng + schoolMate.math;
		schoolMate.avg = (double)schoolMate.total  / 3;
		
		return schoolMate;
		
	}

}
