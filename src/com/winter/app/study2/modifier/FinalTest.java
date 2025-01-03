package com.winter.app.study2.modifier;

//상속을 하지 마라(부모로 사용 금지)
public final class FinalTest {
	
	//상수로 사용(한번 들어간 값은 변경 금지)
	//소문자 Camel case
	//상수형은 모두 대문자로 사용, snake case
	private final int MAX_NUM;
	
	public FinalTest() {
		MAX_NUM=10;
	}
	//private static final in MAX_NUM; -> 그외지정자 중복사용가능(단, final이랑 abstract는 동시사용불가)
	
	
	//상속에서 오버라이딩 금지
	public final void m1() {
		//this.num=20; -> num이 final이라서 에러발생
		//상수로 사용
		final int n=2;
		
		//this.num=20
	}

}
