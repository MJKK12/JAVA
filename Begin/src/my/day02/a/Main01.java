package my.day02.a;

public class Main01 {

	String id;    			 // 문자열 타입
	String pwd;
	String name;
	String email;
	int age;				 // 정수 타입
	double height;  		 // 실수 타입
	double weight = 58.6;    // 실수 타입
	
	
	/*
    멤버변수 => instance 변수 와 static 변수를 합친것을 멤버변수라고 부른다.
 	instance 변수 및 static 변수는 초기화(어떤 변수에 처음부터 값을 (대입해)주는 것 id="abcd".. 이런식으로)를 하지 않더라도 자동적으로 초기화가 되어진다.
    정수형인 데이터타입(byte, short, int, long)은 자동적으로 0 으로 초기화가 되고,
    실수형인 데이터타입(float, double)은 자동적으로 0.0 으로 초기화가 되고, 
    문자형인 데이터타입(char)는 자동적으로 ' ' 으로 초기화가 되고,
 	String 을 포함한 클래스 타입은 자동적으로 null 로 초기화가 된다. (값을 주지 않으면!) ★암기★
	*/
	
	
	
	void showInfo1() {
		
		int hopeMoney = 5000; 
		//지역변수는 반드시 초기화(어떤 변수에 처음부터 값을 부여해주는 것)를 해주어야 한다. (Local variable)
		//멤버변수는 자동, 지역변수는 수동!!!
		//지역변수는 { } 내에서만 사용되어지기 때문에 { }를 벗어나는 순간 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다. (이 지역{}안에서만 쓰이기 때문에 지역변수이다.)
		//(여기서는 int hopeMoney가 지역변수, 벗어나서 썼는데 파란글씨 나오면, 인스턴스 객체가 됨)
		// void = return 하는 타입이 없음.
		
		System.out.println("=== 회원정보 === \n"
						 + "1. 아이디 : " + id + "\n"
						 + "2. 암호 : " + pwd + "\n"
						 + "3. 이름 : " + name + "\n"
						 + "4. 이메일 : " + email + "\n"
						 + "5. 나이 : " + age + "\n"
						 + "6. 신장 : " + height + "\n"
						 + "7. 몸무게 : " + weight + "\n"
						 + "8. 희망급여 : " + hopeMoney + " 만원\n"
						 );
		
		  // 문자열 과 문자열 사이의 + 는 문자열결합을 뜻하는 것이고,
	      // 숫자 와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
	      // 문자열 과 숫자 사이의 + 는 문자열결합을 뜻하는 것이다.
		 //static이 없으면 인스턴스 메소드 이다.
	}
	
	void showInfo2() {
			
		int hopeMoney = 7000; 
		//지역변수는 반드시 초기화(어떤 변수에 처음부터 값을 부여해주는 것)를 해주어야 한다. (Local variable)
		//멤버변수는 자동, 지역변수는 수동!!!
		//지역변수는 { } 내에서만 사용되어지기 때문에 { }를 벗어나는 순간 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다. (이 지역{}안에서만 쓰이기 때문에 지역변수이다.)
		//(여기서는 int hopeMoney가 지역변수, 벗어나서 썼는데 파란글씨 나오면, 인스턴스 객체가 됨)
		//그러므로 showInfo1() 메소드내에서 선언되어진 int hopeMoney 지역변수와 showInfo2() 메소드 내에서 선언된 int hopeMoney 지역변수는 전혀 다른 것이다.(지역{}이 다르기 때문)
		//그렇기 때문에 이름이 같아도 아무 문제가 없다.
		
		System.out.println("=== 회원정보 === \n"
						 + "1. 아이디 : " + id + "\n"
						 + "2. 암호 : " + pwd + "\n"
						 + "3. 이름 : " + name + "\n"
						 + "4. 이메일 : " + email + "\n"
						 + "5. 나이 : " + age + "\n"
						 + "6. 신장 : " + height + "\n"
						 + "7. 몸무게 : " + weight + "\n"
						 + "8. 희망급여 : " + hopeMoney + " 만원\n"
						 );
		
		  // 문자열 과 문자열 사이의 + 는 문자열결합을 뜻하는 것이고,
	      // 숫자 와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
	      // 문자열 과 숫자 사이의 + 는 문자열결합을 뜻하는 것이다.
		  // static이 없으면 인스턴스 메소드 이다.
	}
	  	  // 중괄호 - 메소드, 생성자
	
	public static void main(String[] args) {

		//인스턴스 객체를 만들어야 메모리에 올라간다!!
		Main01 ma1 = new Main01(); 	// 인스턴스화 (== 객체생성) 설계도면을 가지고 메모리에 올린다. = 뒤를 ma1로 부르겠다.
		ma1.id = "leess"; 			// id에 ""를 넣어주겠다.
		ma1.pwd = "qwer1234";		// 필드마다 값을 넣어줌.
		ma1.name = "이순신";
		ma1.email = "leess@naver.com";
		ma1.age = 25;
		
		ma1.showInfo1();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Main01 ma2 = new Main01(); 	// 인스턴스화 (== 객체생성)
		ma2.showInfo1();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		ma2.showInfo2();
		
		/* (어차피 jvm이 자동으로 해주기때문에 굳이 안해줘도 됨)
			인스턴스에 할당되었던 메모리 공간을 비워야 한다. (윈도우 같은 운영체제 한테 다시 반납.)
			ma1 = null; // 이렇게하면 싹 비워버리는 것
			ma2 = null;
			
			System.gc(); // Gc(Garbage collector), 더이상 메모리에 올라가봐야 쓰지 않는 것. (쓰레기 수집)
		*/
		// 위의 인스턴스에 할당되었던 메모리 공간을 비우는 것과 Gc(Garbage collector, 쓰레기수집)를 하는 작업을 기술할 필요가 없다.
		// 왜냐하면 프로그램이 종료되는 순간 이런 작업이 자동적으로 해주기 때문이다.
		
				
	}

}
// 멤버-지역변수 : 초기화 하느냐 아니냐
// 지역변수 : 지역을 벗어나는 순간 메모리에서 사라진다.