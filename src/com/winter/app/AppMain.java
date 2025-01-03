package com.winter.app;

import com.winter.app.students.CollStudent;
import com.winter.app.students.HighStudent;
import com.winter.app.students.MiddleStudent;
import com.winter.app.students.Student;

public class AppMain {

	public static void main(String[] args) {

		MiddleStudent ms = new MiddleStudent();
		
		// MiidleStudent IS A Student
		// MiddleStudent 타입은 Student 타입이다.
		
		HighStudent hs = new HighStudent();
		
		ms.setHistory(60);

		Student st = ms;
		ms = (MiddleStudent)st;
//		ms = hs;
		
		System.out.println(ms.getHistory());
		
		st = new Student("test");
		
		ms = (MiddleStudent)st;
		
		//
		
		ms = new MiddleStudent();
		hs = new HighStudent();
		
		Student [] students = new Student[2];
		students[0]=ms;
		students[1]=hs;
		
		ms = (MiddleStudent)students[0];
		hs = (HighStudent)students[1];
		
		
		
	}
}
