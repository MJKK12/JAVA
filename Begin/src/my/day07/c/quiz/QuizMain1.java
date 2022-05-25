package my.day07.c.quiz;

import java.util.Scanner;

public class QuizMain1 {
/*      
   === 홀수 및 짝수의 합 구하기 ===
   
   ▷ 첫번째 정수 입력하세요: 1
   ▷ 두번째 정수 입력하세요: 10
   
   >>> 결과 <<<
   1부터 10까지의 홀수의 합 : 25
   1+3+5+7+9 = 25
   
   1부터 10까지의 짝수의 합 : 30
   2+4+6+8+10 = 30
   
   === 홀수 및 짝수의 합 구하기 ===
   
   ▷ 첫번째 정수 입력하세요: 2
   ▷ 두번째 정수 입력하세요: 9
   
   >>> 결과 <<<
   2부터 9까지의 홀수의 합 : 24
   3+5+7+9 = 24
   
   2부터 9까지의 짝수의 합 : 20
   2+4+6+8 = 20
*/
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 홀수 및 짝수의 합 구하기 ==="); // 무한반복, while 문 사용하자.
		
		while(true) {
			
			try {
				System.out.println("▷ 첫번째 정수 입력하세요 : ");
				String strFirstNo = sc.nextLine();
				int FirstNo = Integer.parseInt(strFirstNo);
				
				System.out.println("▷ 두번째 정수 입력하세요 : ");
				String strSecondNo = sc.nextLine();
				int SecondNo = Integer.parseInt(strSecondNo); 	//바로 위의 줄을 받아와야함
					
				int holsum = 0; 						//홀수의 누적 합계를 저장하는 변수
				int jjaksum = 0; 						//짝수의 누적 합계를 저장하는 변수
				
				int holsu_start_no = 0, jjaksu_start_no = 0; // 둘다 초기치에 0값을 준다.
															 // 홀/짝이든 매번 2씩 증가한다.
				
				if(FirstNo%2 == 0) {					// 첫번째 입력받은 값이 짝수라면
														// 2
					holsu_start_no = FirstNo+1;			// 2~10 까지 '홀수'의 합이므로, 초기값이 3임.
					jjaksu_start_no = FirstNo;			// 짝수의 합 ==> 초기값이 2.
				}
				
				else {									// 첫번째 입력받은 값이 홀수라면
														// 1
					holsu_start_no = FirstNo;			// 3
					jjaksu_start_no = FirstNo+1;		// 2
				}
				
				// == 홀수 및 짝수의 합을 구한다. ==
				String str_holsu = "", str_jjaksu = "";
				
				while(true) {
					
					String str_add = ("".equals(str_holsu))?"":"+";
					
					if(holsu_start_no <= SecondNo) {
					holsum += holsu_start_no;	
					str_holsu += str_add + holsu_start_no;		//+1+3+5+7+9 여기서 맨 앞에 +를 없애주어야 함. 무조건 +를 쓰는것이 아니고, 두번째 부터 +임. ==> str_add 더하고 삼항연산자(String str_add = (조건)?"+":"";)를 만든다.
					holsu_start_no += 2;						// 매번 2씩 증가한다.
					}
					
					if(jjaksu_start_no <= SecondNo) {
					jjaksum += jjaksu_start_no;
					str_jjaksu += str_add + jjaksu_start_no;	// 짝수 jjaksu_start_no
					jjaksu_start_no += 2;						// 매번 2씩 증가한다.
					}
					
					if(holsu_start_no > SecondNo && jjaksu_start_no > SecondNo) {	// 둘다 2번째(SecondNo)보다 커버리면 나와라.
						break;
					}
					
				}// end of while------------------------------
				
				System.out.println(">>> 결과 <<<");
				System.out.println(strFirstNo+" 부터 "+strSecondNo+" 까지의 홀수의 합 : " + holsum);	 // 입력받은 것 (String strFirstNo = sc.nextLine();)
				System.out.println(str_holsu+"="+holsum);
				System.out.println("");
				
				System.out.println(strFirstNo+" 부터 "+strSecondNo+" 까지의 짝수의 합 : " + jjaksum); // 입력받은 것 (String strSecondNo = sc.nextLine();
				System.out.println(str_jjaksu+"="+jjaksum);

				sc.close();
				break;
				
				
			} catch (NumberFormatException e) {
				System.out.println(">> [경고] 정수만 입력하세요 !! << \n");
			}
			
		}// end of while----------------
		
		System.out.println("\n== 프로그램종료 ==");/// while문에서 break;를 사용해서 빠져 나와야만 프로그램이 종료된다.
				
	}// end of main(String[] args)------------------------

}
