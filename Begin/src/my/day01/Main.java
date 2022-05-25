package my.day01;

public class Main {

	
	// 콘솔 프로그램의 실행은 main(String[] args) 메소드에서 실행한다. 
	public static void main(String[] args) {

		// 1명의 새로운 회원이 필요하다. 
		Member lssmbr = new Member(); //ram에 올리자! (new)  // 이순신
		// lssmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		lssmbr.id = "leess"; 					// = 은 어떤값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다. (leess=이순신)
		lssmbr.pwd = "abcd"; 
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		
		System.out.println("lssmbr : " + lssmbr);
		// lssmbr : my.day01.Member@379619aa
		// @ 다음에 나오는 16진수의 값인 379619aa는 메모리(RAM)상의 위치(주소)를 가리키는 것이다.
		
		
		// 또 1명의 새로운 회원이 필요하다. 
		Member eomjhmbr = new Member(); 	  //ram에 올리자! (new)  // 엄정화 // 새롭게 만든 회원을 eomjhmbr로 보겠다!
		// eomjhmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		eomjhmbr.id = "eomjh"; // = 은 어떤값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다. (eomjh=엄정화)
		eomjhmbr.pwd = "qwer1234"; 
		eomjhmbr.name = "엄정화";
		eomjhmbr.email = "eomjh@gmail.com";
		
		System.out.println("eomjhmbr : " + eomjhmbr);
		// eomjhmbr : my.day01.Member@7de26db8

		// 현재 메모리에는 이순신 & 엄정화 메모리가 올라와 있는 것임. 주소!!
		
		
		/*
			== RAM(메모리) == 
			 @379619aa ==> lssmbr 
						   id ==> "leess"
						   pwd ==> "abcd"
						   name ==> "이순신"
						   email ==> "leess@naver.com" 	
						   
						   showInfo() 메소드
						   
			 				System.out.println("==== 회원정보 ====\n"
							+"1. 아이디 : " + id	+ "\n"				
							+"2. 비밀번호 : " + pwd + "\n"
							+"3. 성명 : " + name + "\n"
							+"4. 이메일 : " + email + "\n"
							);	
					   	
			 							   	
			 							   	
			 @7de26db8 ==> eomjhmbr 
							id ==> "eomjh"
							pwd ==> "qwer1234"
						    name ==> "엄정화"
						    email ==> "eomjh@gmail.com"
						    
						    showInfo() 메소드

							System.out.println("==== 회원정보 ====\n"
							+"1. 아이디 : " + id	+ "\n"				
							+"2. 비밀번호 : " + pwd + "\n"
							+"3. 성명 : " + name + "\n"
							+"4. 이메일 : " + email + "\n"
							);	
					   	

		 */									
		lssmbr.showInfo();  //lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		eomjhmbr.showInfo();  //eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		///////////////////////////////////////////
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		lssmbr.address = "인천광역시 송도구";  //static 변수는 살짝 기울임글꼴로 나옴 (공유(내 고유의 것이 아님), 같이쓰고 있기 때문에 엄정화랑 이순신에 같은 주소가 나오는 것임)
		
		lssmbr.showInfo();  //lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		eomjhmbr.showInfo();  //eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기

		System.out.println("\n######################################\n");
		
		eomjhmbr.address = "서울특별시 마포구";  
		
		lssmbr.showInfo();  //lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		eomjhmbr.showInfo();  //eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기

		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"); 
		
		Member.address = "경기도 군포시"; //다같이 공유하기 때문에 클래스명.address로 쓴다. // 99.9%는 인스턴스 객체임. static = 인스턴스변수끼리 공유한다. (그러나 거의 공유하는 경우는 없음.)
									   //static 변수는 클래스명.static변수명 으로 사용한다. (eomjhmbr.address = "서울특별시 마포구";  << 이렇게 쓰지 말라!)

		
		lssmbr.showInfo();  //lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		eomjhmbr.showInfo();  //eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
	}

}
