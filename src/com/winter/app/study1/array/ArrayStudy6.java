package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생수를 입력 받음
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		//학생 수 만큼 학생이름 입력 받고, 출력
		
		String [] names = new String [count];
		int [] kors = new int [count];
		int [] maths = new int [count];
		int [] totals = new int [count];
		
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"번째 학생 이름 입력");
			names[i]=sc.next();
			
		}
		//학생수 만큼 국어 점수 입력
		//입력한 이름의 국어 점수 입력, 수학 점수 입력
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"학생 국어점수 입력");
			kors[i]=sc.nextInt();
			System.out.println(names[i]+"학생 수학점수 입력");
			maths[i]=sc.nextInt();
			totals[i] = kors[i] + maths[i];
		}
		
		//----------------------------------------------------------------------------
		//총점 기준으로 내림차순 정렬
		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(totals[i]<totals[j]) {
					int temp = totals[i];
					totals[i] = totals[j];
					totals[j] = temp;
					temp = kors[i];
					kors[i] = kors[j];
					kors[j] = temp;
					temp = maths[i];
					maths[i] = maths[j];
					maths[j] = temp;
				}
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(names[i]+" 국어점수 : "+kors[i]+" 수학점수 : "+maths[i]+" 총점 : "+totals[i]);
		}
		
	}

}
