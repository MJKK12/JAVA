package my.day16.a.Final;

// public class ChildClass_3 extends FinalClass_1 {	// 상속 불가함.
   public class ChildClass_3 extends NoFinalClass_2 {
	void test() {
		String name = super.name;
	//	super.pi = 0.123432;   // super.pi 는 final 이므로 값 변경이 불가하다.
		
		double radius = 5.5;
		double circle_area = radius*radius*super.PI; 
		
		System.out.println(circle_area);
		
	}

	@Override
	protected void test1() {
		System.out.println("~~~ 안녕하세요? 하하하 ~~~");
		
	}
	
	/*
	@Override
	protected void test2() {
		System.out.println("~~~ 안녕하세요? 하하하 ~~~");
	}	
	*/
	// ▲ 2번에서 final 처리 했으므로 오버라이드 안됨.
	
}
