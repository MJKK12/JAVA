package my.day04.b.scanner;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk();	// 기본생성자
		
		int progress = 0;	// 진행상태
		
		try {
			
			System.out.print("1. 학번 : ");
			lssSj.hakbun = sc.nextLine();	//instance 필드에 넣어주겠다.
			
			System.out.print("2. 성명 : ");
			lssSj.name = sc.nextLine();		// "이순신" (이순신 네임필드에 넣어주겠다.)
			
			System.out.print("3. 국어 : ");
			byte kor = Byte.parseByte(sc.nextLine());	// 국어점수 "90" (O) , 안녕하세요 (X)
														// "-80"  (JAVA상으로는 오류가 없지만, 점수는 -가 없기때문에 오류!!) / "2000" (byte 범위를 넘어버리므로 오류)
														// "110"
			// 우리가 원하는 숫자의 범위는 0 ~ 100
			// byte : -128 ~ 127
			
			if( lssSj.checkJumsu(kor) ) {
				lssSj.kor = kor;	// kor => 0 ~ 100
				
			}
			
			else {					// kor => -128 ~ -1 또는 101 ~ 127
			//	System.exit(0);		// 프로그램 강제종료
			//  또는
				sc.close();
				return;
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
			
			}
			
			System.out.print("4. 영어 : ");
			byte eng = Byte.parseByte(sc.nextLine());
		
			if( lssSj.checkJumsu(eng) ) {
				lssSj.eng = eng;	// eng => 0 ~ 100
				
			}
			
			else {					// eng => -128 ~ -1 또는 101 ~ 127
		
				sc.close();
				return;
			
			}
			
			System.out.print("5. 수학 : ");
			byte math = Byte.parseByte(sc.nextLine());
			
			if( lssSj.checkJumsu(math) ) {
				lssSj.math = math;	// math => 0 ~ 100
				
			}
			
			else {					// math => -128 ~ -1 또는 101 ~ 127
			
				sc.close();
				return;
			}
			
			progress = 1;	// 진행상태
	
			System.out.print("6. 나이 : ");
			short age = Short.parseShort(sc.nextLine());
						// "20" "30" "50" ==> OK!
						// "행복하세요" "567890" ==> NumberFormatException
						// "10" "70"  ==> Short로 가능하지만, 나이제한(20 ~ 50)에 걸림.
			if (lssSj.checkAge(age)) { //age => 20 ~ 50
				lssSj.age = age;		// 바이트는 바이트인데 메소드를 호출해줘서 범위 내에(20~50) 들어오는 바이트입니까 아니면 그 범위 외에 바이트입니까?
			}
			else {		//age => -32768 ~ 19 또는 51 ~ 32767
				sc.close();
				return;
			}
			
			lssSj.showInfo();
			//국영수 성적을 출력해주는 것 
			//올바르게 했을때에만 showInfo()까지 보여지는 것.
			
		} catch(NumberFormatException e) {					// NumberFormatException ==> 숫자로 변환할 수 없는 경우에 발생 
			
			if(progress == 0) 
			System.out.println(">> 점수 입력은 0 이상 100 까지만 가능합니다. <<\n");
			
			
			else 
			System.out.println(">> 나이 입력은 20 이상 50 까지만 가능합니다. <<\n");
				
				
			e.printStackTrace();	
		}
	
		sc.close();					//Scanner를 닫고 끝내라!
		
	} //end of main(String[] args)------------------

}
