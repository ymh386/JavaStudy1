package com.winter.app;

//클래스명의 첫글자는 무조건 대문자
public class Study3 {
	
	public static void main(String [] args) {
		//변수명의 첫글자는 무조건 소문자로 시작
		//두 단어 이상으로 만들어 질때는 두 번째 단어의 첫글자를
		//대문자로 한다 Camel Case
		// max_level Snake Case
		//길어도 상관 없고, 의미가 만들어야 함
		//특수문자는 _, $만 가능
		//숫자사용가능 (첫글자로 사용 안됨)
		
		int age=0;	//정수형의 초기값의 기본값은 0
		long l = 0L;
		
		float f = 0.0F;	//실수형의 초기값의 기본값은 0.0
		double d = 0.0;
		
		char ch = ' ';	//문자형의 초기값의 기본값은 ' '
		
		boolean check = false;	//논리형의 초기값의 기본값은 false
		
		String name = null;	//String의 초기값의 기본값은 null
		
		byte b1 = 120;
		byte b2 = 100;
		byte b3 = (byte)(b1 + b2);
	}

}
