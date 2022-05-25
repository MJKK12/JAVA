package my.day08.a.random;

import java.util.Scanner;

public class _1MathRandomMain {

	private static String key;

	public static void main(String[] args) {

		// === 랜덤함 정수를 뽑아낸다 === //
		double random = Math.random();				// return 타입은 double 타입임.
		System.out.println("random => " + random);	// random 이므로 매일 뽑을때마다 다른 숫자가 나옴. (Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0. )
		
		/*
        java.lang.Math.random() 메소드는 
        0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다. 
        즉,  0.0 <= 임의의 난수(실수) < 1.0 
           
        1(시작값)부터 10까지(구간범위) 중 랜덤한 정수를 얻어와 본다.
        
        랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
        
        0.0        (int)(0.0*(10-1+1))+1         ==>  1		// 구간범위 : 1~10 / 10-1+1(10개!)
        0.23346438 (int)(0.23346438*(10-1+1))+1  ==>  3		//2.3+1 = 3 (int ==> 정수.!!)
        0.67835431 (int)(0.67835431*(10-1+1))+1  ==>  7		//7.7 = 7 (정수)
        0.99999999 (int)(0.99999999*(10-1+1))+1  ==> 10
        
        3 부터 7까지중 랜덤한 정수를 얻어와 본다. (항상 3,4,5,6,7 만 나와야 함)
        
        0.0        (int)(0.0*(7-3+1))+3         ==>  3
        0.23346438 (int)(0.23346438*(7-3+1))+3  ==>  4
        0.67835431 (int)(0.67835431*(7-3+1))+3  ==>  6
        0.99999999 (int)(0.99999999*(7-3+1))+3  ==>  7
           
      */
		
		//  1(시작값)부터 10까지(구간범위) 중 랜덤한 정수를 얻어와 본다.
		int rand1 = (int)(Math.random()*(10-1+1))+1;
		System.out.println("1부터 10까지의 랜덤한 정수  => " + rand1);
		
        // 3 부터 7까지중 랜덤한 정수를 얻어와 본다. (항상 3,4,5,6,7 만 나와야 함)
		int rand2 = (int)(Math.random()*(7-3+1))+3;
		System.out.println("3부터 7까지의 랜덤한 정수  => " + rand2);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		/////////////////////////////////////////////////////////////////////////
		
		double db_random = Math.random();
		
		//  1(시작값)부터 45까지(구간범위) 중 랜덤한 정수를 얻어와 본다.
		int rand3 = (int)(db_random*(45-1+1))+1;
		System.out.println("1부터 45까지의 랜덤한 정수  => " + rand3);

		//	'A' 부터 'Z' 까지의 랜덤한 알파벳 대문자 한개를 얻어와 본다.
		int upper_int = (int)(db_random*('Z'-'A'+1))+'A';	// char 인데 int 타입으로 바뀌므로 아스키코드로 바뀌는 것임.
		System.out.println("'A' 부터 'Z' 까지의 랜덤한 알파벳 대문자 + => " + (char)upper_int);

		//	'a' 부터 'z' 까지의 랜덤한 알파벳 소문자 한개를 얻어와 본다.
		int lower_int = (int)(db_random*('z'-'a'+1))+'a';
		System.out.println("'a' 부터 'z' 까지의 랜덤한 알파벳 소문자 + => " + (char)lower_int);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");	
		
		/////////////////////////////////////////////////////////////////////////

		// 인증키는 랜덤한 숫자 3개(0~9)와 랜덤한 소문자 4개로 만들어진다. // (휴대폰으로 인증하거나 할 때..)
		// 예> 103qdtq	020abat	
		
		String key = "";
		
		for(int i=0; i<3; i++) {
			int num = (int)(Math.random()*(9-0+1))+0;
			key += num;
		}

		for(int i=0; i<4; i++) {
			int num = (int)(Math.random()*('z'-'a'+1))+'a';	// 지역변수 num에 넣어주는 것 (오른쪽에 있는 것을)
			key += (char)num;								// 알파벳이므로.
		}
		System.out.println("인증키 => "+ key);
		
		//인증키 => 553sypl		: 항상 랜덤한 값이 나온다.
		//인증키 => 180wott
		//인증키 => 191tvfd
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~ 홀짝 맞추기 ~~~~~~~~~~~~~~~~~~\n");			
		/////////////////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);							//1이면 홀수 0 이면 짝수.
		outer:			//do-while 반복문을 빠져나간다. (그만하겠다는 문구 이후에)
		do {
			try {
				System.out.println("선택 [1: 홀수 / 0:짝수]");				// 짝수가 0인 이유는 pc_choice_no%2==0 임을 감안했기 때문이다.
				String choice = sc.nextLine();							// 그러나① 여기서 또 유저가 말을 안듣고 "안녕하세요","1.2345"를 입력함. ▶ 한 세트를 Exception 처리 ▶ try-catch 후 예외처리 ㄱ
																		// 그러나② 정수가 들어오긴 했지만, 1,2가 아닌 8 9 이런 숫자를 입력함. ▶ if 생성후 경고메세지 출력
				int user_choice_no = Integer.parseInt(choice);			// 유저가 선택한 number이다.
				
				if(user_choice_no != 0 && user_choice_no != 1) {
					System.out.println(">> [경고] 0 또는 1만 입력하세요.!! << \n");
				}
				else {													// 1또는 2만 썼을 경우 (올바름)
					// PC에서 랜덤하게 1 또는 10 까지중 하나만 가지도록 만들자.
					int pc_choice_no = (int)(Math.random()*(10-1+1))+1;
					
					String result = ""; 								// 맞췄다/틀렸다 두 가지 뿐.
					
					if(pc_choice_no%2 == user_choice_no) {
						result = "맞추었습니다.";							// 맞춘 후에 또 할래? 라고 물어봐야함. ▶ 아래에 do-while 문 생성
					}
					else {
						result = "틀렸습니다.";
					}
					
					System.out.println("컴퓨터가 낸 수 : " + pc_choice_no + " => " + result );	// 자꾸 문자열 쓸 때 + 오류내지 마라..
					
					do {
						System.out.print(">> 또 할래? [Y/N] => ");
						String yn = sc.nextLine();
						
						if("Y".equalsIgnoreCase(yn)) { 		// 입력받은 값이 대소문자 구분없이 Y 
							break;
						}
						else if("N".equalsIgnoreCase(yn))  //입력받은 값이 대소문자 구분없이 N 이라면,!! 그만하겠다.
							break outer;					//do-while 반복문을 완전히 빠져나간다. (그만하겠다는 문구 이후에)
							
						else {
							System.out.println(">> [경고] Y 또는 N만 입력하세요.!! << \n");
						}
						
					} while (true);
					// end of do~while문----------------------
					
				}
				
				
			} catch (NumberFormatException e) {
				System.out.println(">> [경고] 정수만 입력하세요!! <<");
			}		
			
			
		} while (true);											// 그만할때까지 계속해서 입력해야함. (조건에 맞으면 break가 있어야 함), 무조건 참이면 다시 또 올라감.
		// end of do~while--------------------------------------
		
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
	} // end of main(String[] args)----------------------------------

}
