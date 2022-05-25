package my.day02.c.constructor;

public class MemberMain {

	public static void main(String[] args) {

		Member hongMbr = new Member(); //파라미터가 없는 생성자를 기본생성자(default constructor)라고 부른다. //자바에서 ()는 메소드 or 생성자 딱 두개. 
		hongMbr.userid = "hongkd";
		hongMbr.passwd = "1234";
		hongMbr.name = "홍길동";
		hongMbr.age = 20;
		hongMbr.point = 100;
		
		hongMbr.showInfo();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
		Member iyouMbr = new Member("iu", "abcd","아이유", 29, 300);
		iyouMbr.showInfo();
	
		System.out.println("\n=================================================\n");

		Member chaewMbr = new Member("chaew", "qwer","차은우");
		chaewMbr.showInfo();
		
		System.out.println("\n##################################################\n");
		
		//  == return 타입이 void 인 메소드 생성하기 == //
		
		// hongMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출  //암호를 바꾸어주는 기능 (메소드를 만들어야 한다.-Password)
		hongMbr.updatePasswd("sffd", "0070$"); //parameter == argument == 매개변수 == 인자
		
		// hongMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출  //암호를 바꾸어주는 기능 (메소드를 만들어야 한다.-Password)
		iyouMbr.updatePasswd("abcd", "4533$");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// == return 타입이 있는 메소드 호출 == //
		int balancePoint = hongMbr.pointPayment(30); 		//포인트를 20만큼 쓰겠습니다! //어떤 기능을 수행한 다음에 어떤 값을 돌려주는 것이다. return 타입이 없다? void 사용한다.
		System.out.println("남은 포인트 : " + balancePoint);
		/*
		  >> 홍길동님의 남은 포인트는 30 입니다 <<
		 */
		
		System.out.println("\n--------------------------------------------------------\n");
		
		String info = hongMbr.changeInfo("5678", 30, 400);
					  					//암호,  나이, 포인트
		System.out.println(info);
			/*
		 	=== 홍길동님의 회원정보 수정하기 전 ===
		 	1. 아이디 : hongkd
		 	2. 암호 : 1234
		 	3. 성명 : 홍길동
		 	4. 나이 : 20
		 	5. 포인트 : 70
		 				▼▼▼▼▼▼▼
		 	=== 홍길동님의 회원정보 수정 후 ===
		 	1. 아이디 : hongkd
		 	2. 암호 : 5678
		 	3. 성명 : 홍길동
		 	4. 나이 : 30
		 	5. 포인트 : 400
		 */
		
		System.out.println("\n*******************************************************\n");
		info = iyouMbr.changeInfo("5678", "이지은", 25, 8000); //이미 위에 String info가 있기 때문에 info를 가져다 쓰겠다.
								// 암호,    성명,   나이, 포인트
		System.out.println(info);	
		/*
	 	=== 아이유님의 회원정보 수정하기 전 ===
	 	1. 아이디 : IU
	 	2. 암호 : 4533$
	 	3. 성명 : 아이유
	 	4. 나이 : 29
	 	5. 포인트 : 300
	 				▼▼▼▼▼▼▼
	 	=== 아이유님의 회원정보 수정 후 ===
	 	1. 아이디 : IU
	 	2. 암호 : 5678
	 	3. 성명 : 아이유
	 	4. 나이 : 25
	 	5. 포인트 : 8000
	 */
	}

}
// 컨트롤키 누를 상태에서 클래스에 갖다대고 open declaration을 누르면 해당 문장으로 이동함.