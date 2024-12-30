package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {
	
	public static void main(String[] args) {
		//한반에서 국어시험의 결과를 저장
		//학생 수는 N명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int student = sc.nextInt();
		int [] scores = new int [student];
		int allScore = 0;
		double avg = 0;
		for(int i=0;i<scores.length;i++) {
			System.out.println(i+1 + "번째학생의 점수입력");
			scores[i] = sc.nextInt();
			allScore = allScore + scores[i];
		}
		avg = (double)allScore / scores.length;
		System.out.println("총점 : " + allScore);
		System.out.println("평균 : " + avg);
		
		
	}

}
