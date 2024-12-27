package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//1.로그인 시도 2.프로그램종료
		boolean flag=true;
		while(flag) {
			System.out.println("1.로그인 2.프로그램종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("아이디 입력");
				int myId = sc.nextInt();
				System.out.println("비밀번호 입력");
				int myPw = sc.nextInt();
				if(myId == id && myPw == pw) {
					System.out.println("로그인 성공! 게임 시작");
					flag=false;
					break;
				}
				else {
						System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
				}
			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		if (flag==false) {
			int level = 1;
			int gold = 0;
			
			boolean check = true;
			while(check) {
				System.out.println("1.사냥하러가기 2.종료");
				int select = sc.nextInt();
				if(select==1) {
					for(int i=0;i<3*level;i++) {
						System.out.println(i+1 + "마리 처치완료");
					}
					level++;
					System.out.println("레벨업!(현재 " + level + "레벨)");
//					switch(level) {
//					case 5 :
//						gold = gold + 1000;
//						System.out.println(level + "레벨달성보상 " + 200*level + "골드지급!");
//						break;
//					case 10:
//						gold = gold + 2000;
//						System.out.println(level + "레벨달성보상 " + 200*level + "골드지급!");
//						break;
//					case 15:
//						gold = gold + 3000;
//						System.out.println(level + "레벨달성보상 " + 200*level + "골드지급!");
//						break;
//					}
					if(level%5 == 0) {
						gold = gold + (200*level);
						System.out.println(level + "레벨달성보상 " + 200*level + "골드지급!");
				}
					System.out.println("현재 레벨:" + level);
					System.out.println("현재 골드:" + gold);
					if(level == 15) {
						System.out.println("축! 15레벨(만렙) 달성!");
						System.out.println("레벨:" + level);
						System.out.println("골드:" + gold);
						System.out.println("종료");
						break;
					}
				}
				else if (select == 2) {
					System.out.println("레벨:" + level);
					System.out.println("골드:" + gold);
					System.out.println("종료");
					break;
				}
				else {
					System.out.println("다시 입력해주세요");
				}
			}
		}
	}

}
