package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	private Scanner sc;
//	{
//		sc=new Scanner(System.in);
//	}
	
	public SchoolMateFactory() {
		this.sc = new Scanner(System.in);
	}
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	public SchoolMate [] make(SchoolMate [] schoolMates) {
		
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
	
	public SchoolMate find(SchoolMate [] schoolMates) {
		SchoolMate box = null;
		System.out.println("번호를 검색하시오");
		int num = sc.nextInt();
		for(int i=0;i<schoolMates.length;i++) {
			if(num == schoolMates[i].num) {
				box = schoolMates[i];
				break;
			}
		}
		
		return box;
	}
	
	public SchoolMate [] delete(SchoolMate [] schoolMates) {
		System.out.println("삭제할 번호 입력");
		int select = sc.nextInt();
		int find=-1;
		for(int i=0;i<schoolMates.length;i++) {
			if(select == schoolMates[i].num) {
				find = i;
				SchoolMate [] copy = new SchoolMate[schoolMates.length-1];
				int idx=0;
				for(int j=0;j<schoolMates.length;j++) {
					if(i==j) {
						continue;
					}
					copy[idx]=schoolMates[j];
					idx++;
				}
				
				schoolMates = copy;
				break;
			}
		}
		
//		if(find > -1) {
//			SchoolMate [] copy = new SchoolMate[schoolMates.length-1];
//			
//			int idx=0;
//			
//			for(int i=0;i<schoolMates.length;i++) {
//				if(find==i) {
//					continue;
//				}
//				copy[idx]=schoolMates[i];
//				idx++;
//			}
//		}
		
		
		return schoolMates;	

	}
	
		

}
