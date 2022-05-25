package my.day04.b.scanner;

public class Sungjuk {

	String 	hakbun;		// 학번 "091234"
	String 	name;		// 성명
	byte 	kor;		// 국어 byte -128 ~ 127		0~100 로 제한
	byte 	eng;		// 영어
	byte 	math;		// 수학
	short 	age;		// 나이 short -32768 ~ 32767	20 ~ 50 로 제한
	
// public Sungjuk() { } 	// 기본생성자 : 눈에 안보이지만 생략되어 있는 것이다.
	
	// 입력받은 점수가 0 ~ 100 사이의 점수인지 아닌지를 판별해주는 메소드 생성하기.
	boolean checkJumsu(byte Jumsu) {			//~인지 아닌지
		
		if(0 <= Jumsu && Jumsu <= 100 ) 
			return true;
		
		else {
			System.out.println("### 점수 입력은 0 이상 100 까지만 가능합니다. ###");
			return false;
		}
			
	} // end of boolean checkJumsu(byte Jumsu)---------------------
	
	// 입력받은 나이가 20 ~ 50 사이의 점수인지 아닌지를 판별해주는 메소드 생성하기.
	boolean checkAge(short Age) {			//~인지 아닌지
		
		if(20 >= age && age <= 50 ) 
			return true;
		
		else {
			System.out.println(">>> 나이 입력은 20세 이상 50세 이하 까지만 가능합니다. <<<");
			return false;
		}
	}
		
		
	  // 입력되어진 필드값을 화면에 출력해주는 메소드 생성하기
	void showInfo() {
		
		short total = (short)(kor+eng+math);	//byte short char가 사칙연산을 만나는 순간 자동으로 int로 변환된다. (국영수 합이 300이긴 하지만, int 타입의 300이다.)	
												// 괄호가 연산자에서 제일 빠른 계산을 의미하므로, int300을 계산하고 그 다음에 short로 변환해줘라!
		float avg = Math.round(total/3.0F*10)/10.0F;					// 자바에서 실수형 기본타입은 double 타입이기 때문에, float 타입으로 바꾸어준다. (3.0f;)!!
		// my.day05.a.math.MathMaih 클래스 참조할 것!
		
		String hakjum = "";
		if(avg >= 90)		hakjum = "A";
		else if (avg >= 80) hakjum = "B";
		else if (avg >= 70) hakjum = "C";
		else if (avg >= 60) hakjum = "D";
		else				hakjum = "E";
		
		System.out.println("\n === \""+name+"\"님의 성적결과 ==== \n"
						+"1. 학번 : "+ hakbun + "\n"
						+"2. 성명 : "+ name + "\n"
						+"3. 국어 : "+ kor + "\n"
						+"4. 영어 : "+ eng + "\n"
						+"5. 수학 : "+ math + "\n"
						+"6. 총점 : "+ total + "\n"
						+"7. 평균 : "+ avg + "\n"
						+"8. 학점 : "+ hakjum + "\n"
						+"9. 나이 : "+ age + "세\n"
						);


	} //end of showInfo()-------------------------------

	
	
}


// 필드를 만든다.
// 클래스를 만든다.(SungjukMain class)
