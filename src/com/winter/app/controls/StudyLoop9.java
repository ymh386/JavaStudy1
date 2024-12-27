package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop9 {
	/**
	 * MMORPG
	 * 
	 * 
	 * 레벨 1 - 15레벨
	 * 
	 * 몬스터의 경험치가 동일
	 * 
	 * 1 -> 2 : 3
	 * 2 -> 3 : 6
	 * 3 -> 4 : 9
	 * 4 -> 5 : 12
	 * ...
	 * 14 -> 15 : 42
	 * 
	 * GOLD : 0
	 * 레벨이 5달성시 1000G
	 * 레벨이 10달성시 2000G
	 * 레벨이 15달성시 3000G
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
//				switch(level) {
//				case 5 :
//					gold = gold + 1000;
//					System.out.println(level + "레벨달성보상 " + 1000 + "골드지급!");
//					break;
//				case 10:
//					gold = gold + 2000;
//					System.out.println(level + "레벨달성보상 " + 2000 + "골드지급!");
//					break;
//				case 15:
//					gold = gold + 3000;
//					System.out.println(level + "레벨달성보상 " + 3000 + "골드지급!");
//					break;
//				}
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
