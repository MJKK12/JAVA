package my.day16.a.Final;

public class NoFinalClass_2 {

	String name = "이순신";
	final double PI = 3.141592; 	// 어떤 값의 변경이 불가할 때도 final을 붙인다. (원주율 pi는 불변하는 수) ▶ final : 읽기전용임!! write가 불가함.
	// 필드에 final을 붙이면 해당 변수에 값을 부여한 다음에 새로운 값으로 변경이 불가하다. 
	// 그래서 final 변수를 상수변수라고도 부른다. (변수이지만 값을 한번 주면 바뀌지 않음. 常:상수(항상상 ▶항상 그 수!!)
	// ctrl + shift + X 를 눌러서 대문자로 만든다.!!
	
	protected void test1() {
		System.out.println("~~~~ 테스트1 입니다. ~~~~");
	}	
	
	protected final void test2() {
		// 메소드에 final 을 붙이면 해당 메소드는 자식클래스에서 오버라이딩(재정의)이 불가하다.
		System.out.println("~~~~ test2 입니다. ~~~~");
				
	}
	
	
}
