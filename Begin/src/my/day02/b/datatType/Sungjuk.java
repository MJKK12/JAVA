package my.day02.b.datatType;

public class Sungjuk {
	
	/*
	   === *** 자료형 *** ===

	   ※ 자료형의 종류

	   1. 원시형 타입(Primitive Type)

	   1.1  정수형(byte, short, int, long)
	    -- 자바에서 정수형의 기본타입은 int 이다.
	    -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
	            
	      byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127 
	      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
	      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  (대략 21억)
	      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807         
	            
	   
	   1.2 실수형(float, double) 
	      float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.     135.3246235 (대~~충 쓰겠다. 메모리를 double형에 비해서 메모리를 아낌)
	      double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642 (아~주 세밀하게!!)
	   -- 자바에서 실수형의 기본타입은 double 이다. 
	      그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다. 
	            
	        
	   1.3 문자형(char) : 글자 '한 개'를 의미함.
	      char : 자바는 유니코드 체계를 사용하므로
                 문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
                 그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
	                               
	           UNICODE 표 참조 
	           http://www.tamasoft.co.jp/en/general-info/unicode.html                     
	        
	        === !!! 꼭 기억합시다 !!! ===
	        int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
	             사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
	        
	        'A' => 65     'a' => 97
	        'B' => 66     'b' => 98
	        'C' => 67     'c' => 99
	        
	        '대문자' + 32 => 소문자에 해당하는 숫자
	        '소문자' - 32 => 대문자에 해당하는 숫자
	        
	        '0' => 48
	        '1' => 49
	        '2' => 50
	        '9' => 57
	        ' ' => 32
	        
	        
	   1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 
	   -- 크기가 1byte 이다.
	        
	           
	   2. 참조형 타입(Reference Type)
	      --> 클래스 객체(==object ==instance) 타입   
	      --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
	      --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.  

	           
	 */

	
	// === 속성, property, attribute, field ===
	
	/*
	 	=== 변수의 명명규칙 ===
	 	1. 변수명의 길이에는 제한이 없다. String abcdeabcdeabcdeabcdeabcde;
		2. 대,소문자 구분이 있다. String hakbun; / String hakBun;
		3. 첫글자에 숫자는 쓸 수 없다. String 7hakbun; (X)
		4. 특수문자는 '_'와 '$'만 사용이 가능하다. String hak_$bun; 
		5. 예약어(예. package, import, public, class, String, int, float 등...)는 변수명으로 사용불가하다. String package (X)
		6. 필수사항은 아니지만 변수명명규칙의 관례인데, 카멜표기법과 스네이크표기법을 따른다. 가독성이 좋아짐.
		- 카멜표기법: 단어와 단어가 결합된 경우라면 두번째 단어는 대문자로 시작하도록 하는 것. (ex. byte korPoint) 
		- 스네이크표기법: 단어와 단어가 결합된 경우라면 단어 사이에 _를 붙여주는 것.(ex.byte eng_point) 
		▶ 이 표기법을 따르지 않게되면 변수인지 클래스인지 헷갈릴 수 있기 때문에 카멜/스네이크 표기법을 따라주는 것이 좋음.
		7. 데이터 값이 숫자로만 이루어지더라도 맨 앞에 0이 올 수 있는 경우라면, String 타입으로 해야한다. (ex. String hakbun = "012345";)
	 */
	
	String hakbun; // 학번 null "12345" "20191234" "091234" "013456" 
				   //▶ 맨앞에 0이 나올수가 있기 때문에, int형이 아닌 String 타입을 써야함. (8지수로 인식하고 다른 숫자가 나올 수 있기 때문에..)
	
	String name;   // 학생명 null
	
	// 메모리를 아껴서 쓰자. byte말고 다음 정수형 타입들도 0을 다 포함하고 있지만, 0~100까지만 값만 필요하기 때문에 byte를 사용하자.
	byte korPoint;  // 국어점수 0			//값을 안잡아주고 그대로 냅두면 디폴트값이 0이다.
	byte eng_point;	// 영어점수 0				
	byte mathpoint; // 수학점수 0 
	//▶ long mathpoint = 40억; 을 해도, 자바의 기본형은 int타입으로 보기때문에 21억까지만 인정을 해주지만, 그 이상의 값을 쓰고 싶다면 40억뒤에 L이나 l(소문자)를 붙인다. (헷갈리니까 L쓸것)
	
	char hakjum;  // 학점   ' '(초기화를 안할경우 기본값이 ''(공백)이 된다.)  'A' 'B' 'C' 'D' 'F' 주고자 함.
	
	
	
	// === 기능, 행위, behavior, method === //
	// 성적결과를 화면에 출력해주는 메소드(기능)를 만들고자 한다.
	
	void showSungjuk() { //static을 쓰게되면 공유이므로 void만 쓸 것 (그렇지 않으면 eomjh만 나온다..)

		short total = (short) (korPoint + eng_point + mathpoint); // 0 ~ 300 (국영수합 300점), 강제형변환(캐스팅)
		
		// 자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가 사칙연산(+ - * /)을 만나면 
	    // 자동적으로 그 변수의 데이터 타입은 int 로 변하게 되어있다.!!!! (short에서 int로 자동으로 형변환이 되지 않음. short이 포함하는 값이 int보다 적음)
		// korPoint + eng_point + mathpoint ==> 자동적으로 int 타입으로 형변환(casting, 데이터타입이 바뀌는 것) 됨.
		// (short) (korPoint + eng_point + mathpoint) ==> 원래 int 타입인 것을 개발자가 강제로 short로 형변환 시킨것. ▶ 강제형변환(casting)이라고 부른다.
		
		// double avg = total/3; // 정수/정수 ==> 정수(몫,소수부를 잘라버린 정수)
			
		//double avg = total/3.0; // 정수/실수 ==> 실수  
								  // 실수/정수 ==> 실수
								  // 실수/실수 ==> 실수
		
	     double avg_double= (double)total/3; //(double)(total/3;)은 정수를 실수로 만들어주는 것이기 때문에 쓰면 안됨.
	     
	     float avg_float= (float)total/3;
	     
	     float avg_float2= total/3.0F; // double로 되어진 실수를 float로 쓰겠다. total/3.0F; = total/(float)3.0; ▶8byte를 4byte로 바꿈
	     
	     if(avg_double >= 90) {
	     //만약에 내가 ~라면, if(조건 ) , ~를 하십시오.
	    	 hakjum = 'A'; //""는 문자열 타입 (String type, 2개이상)
	     }
  	     else if(avg_double >= 80) {
	     //위에 것이 아니라면,
	    	 hakjum = 'B';
	     }
	     else if(avg_double >= 70) {
		 //위에 것이 아니라면,
		     hakjum = 'C';
	     }
	     else if(avg_double >= 60) {
		 //위에 것이 아니라면,
		     hakjum = 'D';
	     }
	     else {
	     // 위에것도 다 아니라면, 그 외에는
	    	 hakjum = 'F';	    	 
	     }
	     
	     
	     String star = "";  //""와 " "는 다름.
	    	     
	     switch (hakjum) {
	     	case 'A':
	     		star = "☆☆☆☆☆";
	     		break; 		// switch 문을 빠져나오는 것이다.
		     				// if는 등호나 부등호를 쓰는데, switch문은 등호(같냐,다르냐)밖에 안됨. hakjum이랑 'A'랑 같냐?	
	    	case 'B':
	     		star = "☆☆☆☆";
	     		break; 		// switch 문을 빠져나오는 것이다.
	     		
	    	case 'C':
	     		star = "☆☆☆";
	     		break; 		// switch 문을 빠져나오는 것이다. 			
	     		
	    	case 'D':
	     		star = "☆☆";
	     		break; 		// switch 문을 빠져나오는 것이다. 		
	     		
	    
	    	default:		//default = else (기타, 나머지)
	    		star = "☆";
			break;			// switch 문을 빠져나오는 것이다. 
		}
	     
	     String diamond = "";
	     
	     switch ((total/3)/10) {  //  300/3    299/3    288/3    270/3
				     			  //   100       99		  96	   90
				     			  //  100/10   99/10	96/10	90/10
				     			  //    10       9		 9		 9
	     	// 주의할 점은 switch(어떤식) 에서 어떤식에는 byte, short, int, char, String 타입만 들어올 수 있다.
	     	// 			 위의 어떤식에는 long, float, double 이 들어올 수 없다.!!! (long 및 실수형 타입은 안된다.)
	     
	     	case 10: 
	     		diamond = "◆◆◆◆◆";
	     		break;

	     	case 9:
	     		diamond = "◆◆◆◆◆";	
	     		break;

	     	case 8:
	     		diamond = "◆◆◆◆";	
	     		break;
	     		
	     	case 7:
	     		diamond = "◆◆◆";	
	     		break;
	     		
	     	case 6:
	     		diamond = "◆◆";	
	     		break;
	     		
			default:
				diamond = "◆";
				break;
		}
	     
		/*   	
			case 10: 
			diamond = "◆◆◆◆◆";
			break;
			
			case 9:
			diamond = "◆◆◆◆◆";	
			break;	   
			
			랑
			
			case 10: 
			case 9:
			diamond = "◆◆◆◆◆";	
			break;	
			는 같은 것임
		*/  
	     
	    // === 문자형 타입 === //
	    // 자바는 char 타입을 표현할 때 unicode 를 사용한다. 
	    char ch1 = 'k';
	    char ch2 = 107; 	//char 타입이기 때문에 소문자 k가 나옴
	    char ch3 = 'k' + 2; // = 107+1		// 자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가 사칙연산(+ - * /)을 만나면 
	    									// 자동적으로 그 변수의 데이터 타입은 int 로 변경 된다.!!!! 
	    char ch4 = '\u23F3';			    // 역슬래쉬u: 유니코드를 뜻한다.
	    
	    // === boolean 타입 === // 참거짓 타입 (참이냐 거짓이냐를 묻는 것)
	    boolean bool_1 = false;  //  true ==> 참,
	    
	    boolean bool_2 = (5-3 == 4); // false ==> 거짓 
	    boolean bool_3 = (5-3 != 4); // != : 같지 않다는 뜻
	    	    
	    
		System.out.println("=== "+ name +" 성적결과 ===\n"
						+ "1. 학번 : " + hakbun + "\n"
						+ "2. 성명 : " + name + "\n"
						+ "3. 국어 : " + korPoint + "\n"
						+ "4. 영어 : " + eng_point + "\n"
						+ "5. 수학 : " + mathpoint + "\n"
						+ "6. 총점 : " + total + "\n"
						+ "7. 평균1 : " + avg_double + "\n"
						+ "8. 평균2 : " + avg_float + "\n"
						+ "9. 평균3 : " + avg_float2 + "\n"
						+ "10. 학점1 : " + hakjum + "\n"
						+ "11. 학점2(☆) : " + star + "\n"
						+ "12. 학점3(◆) : " + diamond + "\n"
						+ "소문자 k : " + ch1 + "\n" 
						+ "소문자 k : " + ch2 + "\n" 	//char 타입이기 때문에 소문자 k가 나옴
						+ "소문자 m : " + ch3 + "\n"
						+ "모래시계 : " + ch4 + "\n"
						+ "boolean 타입인 bool : " + bool_1 + "\n"
						+ "boolean 타입인 boo2 : " + bool_2 + "\n"
						+ "boolean 타입인 boo3 : " + bool_3 + "\n"
						); //name은 필드값임 (String name;) , 총점은 국영수 값만 더해주면 됨.(그러므로 필드값이 아니라 지역변수로 사용한다.)
			
			/*
			=== 이순신 성적결과 ===
			1. 학번 : 091234
			2. 성명 : 이순신
			3. 국어점수 : 68
			4. 영어점수 : 95
			5. 수학점수 : 100
			6. 총점 : 263
		*/
	}

	
}
