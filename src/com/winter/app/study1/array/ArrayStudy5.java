package com.winter.app.study1.array;

import java.util.Random;

public class ArrayStudy5 {
	
	public static void main(String[] args) {
		// 로또 번호 6 (1-45)
		Random random = new Random();
		int [] nums = new int [6];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}

			}

		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
