package my.day11.d.abstraction;

import java.util.Calendar;

import my.util.MyUtil;

public class Gujikja {

	// === 객체지향프로그래밍(Object Oriented Programming) 이란? === //  class 가 꼭 들어가야함 !! (필드, 메소드, 클래스!)
	// 필드 == 추상화 (필요한 정보만 가져오는 것)
	// 어떤 프로그램이냐에 따라 그 목적에 맞도록 필요한 데이터(필드)를 추상화(필요한 것만 추출하는 것. (반대가 정밀화))시키고,
	// 또한 그 목적에 맞는 기능(메소드,행위)만 부여한 ★클래스★를 생성하여 프로그래밍 하는 것이다.
	
	// === 객체지향프로그래밍(Object Oriented Programming) 의 4가지 특징 === //  
	/*
		1. 상속성(Inheritance) : 클래스의 ★재사용★과 소스 코드의 ★중복제거★를 목적으로 하는 기술
		2. 추상성(Abstraction) : 프로그램이 ★필요로 하는★ 실제 데이터들을 모델링하는 기술
		3. 캡슐화(EnCapsulation == 은닉화(숨기는 것)) : 객체지향의 가장 중요한 ★데이터 보호★기술	( 캡슐약 처럼 안에 것을 숨김.. )
		4. 다형성(Polymorphism): 상속을 이용하여 여러 클래스 타입을 ★하나의 클래스 타입으로★ 다루는 기술 (부모 class or Interface로 받겠다.)
		(상추가 캡짱 많多!!)
	
		구인구직 어플리케이션 프로그래밍 제작시,			
		필요한 요소(부품)가 무엇이 있는지 생각해보자.
		아주 다양하고, 많은 요소들이 필요할 것이다.
		
		예를 들어,
		구직자, 구인회사, 채용 ..... 등등등 많이 있다. (이러한 부품들이 필요하다.)
		이러한 요소(부품)들이 바로 객체인데 이 객체를 만드는 설계도면이 클래스이다.
		
		위와(구인구직 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는 
		다양한 객체(부품)들을 각각 하나하나 (ex.구직자-학력,나이,전공... / 회사-연봉..) 추상화 시켜서 (필요한 것만 뽑아와서) 클래스로 옮기는 것을 객체지향 프로그래밍(OOP) 이라고 한다.
		
	    ※여기서 추상화(abstraction)란? (↔ 정밀화)
		--> 일반적인 의미의 추상화란 어떤 물체(object)에서 주된
         	특징을 부각시켜 표현하고, 나머지 부분은 과감하게 생략하는것을 말한다.
         	추상화의 반대는 아주 시시콜콜한것(세세한 것)까지 전부 몽땅
         	다 묘사하는 것을 말하는데 이것을 정밀화 라고 말한다.
         	
	    객체지향 프로그래밍(OOP)에서 사용되는 추상화도 이와 비슷하다.
	    어떤 하나의 물체를 대표하는 속성(명사, 멤버변수)과 기능(동사, 메소드)을 추출해내는 것을 
	    객체지향 프로그래밍(OOP)에서 "추상화" 라고 한다. 
	 
		>>> 예를 들어, 구인구직 어플리케이션 프로그래밍 제작시
		    필요한 부품(요소)중 하나인 "구직자" 에 대해서 알아보자.
		    "구직자" 가 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
		 1). 속성(property, attribute, field)은 멤버변수가 되고,
		 2). 행동양식(기능)은 메소드가 되는 것이다.
		 
		 Gujikja(클래스)
		    |
		    |-- 속성(property, attribute, field) : 아이디, 암호, 성명, 연락처, 이메일, 주소, 학력, 희망구직직종, 희망연봉.....  
		    |-- 행동양식(기능, 메소드) : 구직자로 접속(로그인)할수 있는 기능, 구직자정보를 조회해주는 기능, 구직자정보를 변경해주는 기능, ....... 
		
	
	*/
	
	// field(속성) 생성 (추상화)
	String userid; // 아이디
	String passwd; // 비밀번호
	String name;   // 성명	
	String jubun;  // 주민번호 앞에 7자리 까지만 쓸 것
				   // 예: "951220 1" 남자		"011220 3"남자
				   // 예: "951220 2" 여자		"011220 4"여자
	
	public static int count;	// Gujikja 객체(인스턴스)의 개수를 알아보려는 용도.
	
		
	
	// Method 생성 (==> field(속성)를 어떤 방식으로 처리하고자 할 때 메소드를 통해서 처리한다.)
	
	// == 구직자의 현재 나이를 알려주는 메소드 생성하기 == //
	
	int getAge() {
		// "951220 1" 남자		"011220 3"남자
		// "951220 2" 여자		"011220 4"여자
	
	   // 현재나이 = 현재년도 - 태어난년도 + 1
		
	   Calendar currentDate = Calendar.getInstance(); 
	   // 현재날짜와 시간을 얻어온다.
	   
	   int currentYear = currentDate.get(Calendar.YEAR);
	   
	   String sGender = jubun.substring(jubun.length()-1);				// 성별을 나타냄 (주민번호 두번째에서 첫째자리는 성별을 나타냄 (1 or 2 or 3 or 4)
	  
	   int birthYear = 0;	   
	   if("1".equals( sGender ) || "2".equals( sGender )) {				// 성별이 " " 입니까? jubun의 길이는 7인데, 여기서 -1을 하면 6임. 즉, 맨끝에 있는 숫자임.!!
		   birthYear = Integer.parseInt(jubun.substring(0, 2)) + 1900;	// 1 또는 2라면 주민번호가 1900대 년생
		   							//			95 + 1900 ==> 1995
	   }
	   else {
		   birthYear = Integer.parseInt(jubun.substring(0, 2)) + 2000;	   	 
		   							//     		01 + 2000 ==> 2001	
	   }

	   				//   95    	  1  +  1900 또는 2000
	   				// 1995	   2001	
	   
	   return currentYear-birthYear+1;
		   
	}// end of int getAge()------------------------------------
	
	// == 구직자의 성별을 알려주는 메소드 생성하기 == //

	String getGender() {
		
		   String sGender = jubun.substring(jubun.length()-1);			// 성별을 나타냄 (주민번호 두번째에서 첫째자리는 성별을 나타냄 (1 or 2 or 3 or 4)

		   if("1".equals( sGender ) || "3".equals( sGender )) 			// 성별이 " " 입니까? jubun의 길이는 7인데, 여기서 -1을 하면 6임. 즉, 맨끝에 있는 숫자임.!!
			   return "남";
		   		   
		   else 
			   return "여";		   								
		   

	}// end of String getGender()------------------------------------
		
	
	// == 구직자 1명의 정보를 보여주는 메소드 생성하기 == //
	
	void showInfo() {
		
		System.out.println("1. 아이디 : "+userid+"\n" + 
						   "2. 비밀번호 : "+passwd+"\n" + 
						   "3. 성명 : "+name+"\n" + 
						   "4. 현재나이 : "+ getAge() +"\n" + // getAge() : 현재 나이를 알려주는 '메소드' . 빨간줄이 그어질텐데, 우리는 메소드를 새로 만들어야함!
						   "5. 성별 : "+getGender()+"\n" 	// getGender() : 성별을 알려주는 '메소드'.
							);

	}// end of void showInfo------------------------------------
	
	void viewInfo() {
	      System.out.printf("%-10s\t%-15s\t%-8s\t%3d\t%-2s\n",userid,passwd,name,getAge(),getGender());
	   }
	
}
