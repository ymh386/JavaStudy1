package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	public SchoolMate [] make(SchoolMate [] schoolMates) {
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
		
		//1. +1 된 새로운 배열 생성
		//2. 기존의 값을 새로운배열로 값을 저장
		//3. 마지막 index 새로만든 schoolmate 대입
		SchoolMate [] copys = new SchoolMate[schoolMates.length + 1];
		for(int i=0;i<schoolMates.length;i++) {
			copys[i] = schoolMates[i];
		}
		copys[schoolMates.length]=schoolMate;
		return copys;
	
	}

}
