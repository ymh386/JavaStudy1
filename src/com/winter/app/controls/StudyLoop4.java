package com.winter.app.controls;

public class StudyLoop4 {
	
	public static void main(String[] args) {
		
//		int dan=4;
//		for(int i=1;i<10;i++) {
//			System.out.println(dan+" * "+i+" = "+dan*i+"\t");
//		}
//		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				
				System.out.println(i+" : "+j);
				
				if(j==3) {
					//속해 있는 반복문만 벗어남
					break;
				}
			}
		}
	}

}
