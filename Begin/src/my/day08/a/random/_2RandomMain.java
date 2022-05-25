package my.day08.a.random;

import java.util.Random;
import java.util.Scanner;

public class _2RandomMain {

	private static String key;

	public static void main(String[] args) {

		// === 랜덤함 정수를 뽑아낸다 === //
		
		// 보안상 Math.random() 보다는 new Random();을 사용하는 것이 더 안전하다.
		
		Random rnd = new Random();
		
		// int rndNum = rnd.nextInt(마지막 수 - 처음 수 + 1) + 처음수;
		 
		// 1(시작값)부터 10까지(구간범위) 중 랜덤한 정수를 얻어와 본다.
		int rand1 = rnd.nextInt(10 - 1 + 1) + 1;
		System.out.println("1부터 10까지의 랜덤한 정수  => " + rand1);
		
        // 3 부터 7까지중 랜덤한 정수를 얻어와 본다. (항상 3,4,5,6,7 만 나와야 함)
		int rand2 = rnd.nextInt(7 - 3 + 1) + 3;
		System.out.println("3부터 7까지의 랜덤한 정수  => " + rand2);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		/////////////////////////////////////////////////////////////////////////

		
		//  1(시작값)부터 45까지(구간범위) 중 랜덤한 정수를 얻어와 본다.
		int rand3 = rnd.nextInt(45 - 1 + 1) + 1;
		System.out.println("1부터 45까지의 랜덤한 정수 + => " + rand3);

		//	'A' 부터 'Z' 까지의 랜덤한 알파벳 대문자 한개를 얻어와 본다.
		int upper_int = rnd.nextInt('Z' - 'A' + 1) + 'A';	// char 인데 int 타입으로 바뀌므로 아스키코드로 바뀌는 것임.
		System.out.println("'A' 부터 'Z' 까지의 랜덤한 알파벳 대문자  => " + (char)upper_int);

		//	'a' 부터 'z' 까지의 랜덤한 알파벳 소문자 한개를 얻어와 본다.
		int lower_int = rnd.nextInt('z' - 'a' + 1) + 'a';
		System.out.println("'a' 부터 'z' 까지의 랜덤한 알파벳 소문자  => " + (char)lower_int);
		
		// 대,소문자를 같게 하고자 한다. 예> 대문자 P 가 나오면 소문자 p가 나오도록 하고 싶다.
		upper_int = rnd.nextInt('Z' - 'A' + 1) + 'A';	// char 인데 int 타입으로 바뀌므로 아스키코드로 바뀌는 것임.
		System.out.println("'A' 부터 'Z' 까지의 랜덤한 알파벳 대문자  => " + (char)upper_int);
		System.out.println("'a' 부터 'z' 까지의 랜덤한 알파벳 소문자  => " + (char)(upper_int+32)); 	//대문자 P면 소문자 p로 나올 것임.


		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");	
		
		/////////////////////////////////////////////////////////////////////////

		// 인증키는 랜덤한 숫자 3개(0~9)와 랜덤한 소문자 4개로 만들어진다. // (휴대폰으로 인증하거나 할 때..)
		// 예> 103qdtq	020abat	
		
		String key = "";
		
		for(int i=0; i<3; i++) {
			int num = rnd.nextInt(9 - 0 + 1) + 0;
			key += num;
		}

		for(int i=0; i<4; i++) {
			int num = rnd.nextInt('z'-'a'+1)+'a';	// 지역변수 num에 넣어주는 것 (오른쪽에 있는 것을)
			key += (char)num;								// 알파벳이므로.
		}
		System.out.println("인증키 => "+ key);
		
		//인증키 => 553sypl		: 항상 랜덤한 값이 나온다.
		//인증키 => 180wott
		//인증키 => 191tvfd
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~ 홀짝 맞추기 ~~~~~~~~~~~~~~~~~~\n");			
		/////////////////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);					//1이면 홀수 0 이면 짝수.
		outer:			//do-while 반복문을 빠져나간다. (그만하겠다는 문구 이후에)
		do {
			try {
				System.out.println("선택[1: 홀수 / 0:짝수]");				// 짝수가 0인 이유는 pc_choice_no%2==0 임을 감안했기 때문이다.
				String choice = sc.nextLine();							// 그러나① 여기서 또 유저가 말을 안듣고 "안녕하세요","1.2345"를 입력함. ▶ 한 세트를 Exception 처리 ▶ try-catch 후 예외처리 ㄱ
																		// 그러나② 정수가 들어오긴 했지만, 1,2가 아닌 8 9 이런 숫자를 입력함. ▶ if 생성후 경고메세지 출력
				int user_choice_no = Integer.parseInt(choice);			// 유저가 선택한 number이다.
				
				if(user_choice_no != 0 && user_choice_no != 1) {
					System.out.println(">> [경고] 0 또는 1만 입력하세요.!! << \n");
				}
				else {													// 1또는 2만 썼을 경우 (올바름)
					// PC에서 랜덤하게 1 또는 10 까지중 하나만 가지도록 만들자.
					int pc_choice_no = rnd.nextInt(10-1+1)+1;			// nextInt에 *를 붙여서 오류났던 거였음..^^;;
					
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
