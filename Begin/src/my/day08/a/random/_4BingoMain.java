package my.day08.a.random;

import java.util.*;

public class _4BingoMain {
/*
    PC가 만들수 있는 숫자는  1 ~ 100 까지중 아무거나 1개를 만든다.

      예> 59 (PC가 랜덤하게 만든 숫자)
         
    1 부터 100 사이의 숫자입력 => 50엔터
    >> 50보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 71엔터
    >> 71보다 적은값입니다. 

    1 부터 100 사이의 숫자입력 => 60엔터
    >> 60보다 적은값입니다.

    1 부터 100 사이의 숫자입력 => 58엔터
    >> 58보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 59엔터
    #### 빙고!!  5번만에 맞추었습니다. ####       
*/   
/*
[[ 그냥 편하게 내 생각대로 흐름을 생각해보자 / 경우의수와 함께!!]]
내가 1부터 100사이의 숫자를 입력해. 그럼 피씨가 랜덤하게 만든 숫자가 출력이 돼.
내가 계속 입력을 해. 이때 피씨에서 만든 숫자가 내가 입력한 숫자보다 크면, "oo보다 큰값입니다." 라는 문구를 출력해.
내가 입력한 숫자보다 작으면, "oo보다 작은값입니다." 라는 문구를 출력해.
근데 이 문구가 컴퓨터에서 나온 문구와 내가 입력한 문구가 일치할때까지 계~~~속 반복해야해.

내가 입력한 숫자가 컴퓨터랑 일치해. 그렇다면 계속 나오던 반복문을 빠져나와야해.

그 다음에는 "    #### 빙고!! " +변수+"번만에 맞추었습니다. ####  라는 문구를 출력해야해.

그럼 끝이야~	
 */
/*
   위와같이 나오도록 하세요.
   
   1. 메일제목 : 과제3_숫자맞추기_김민정
   2. 첨부파일 : 과제3_숫자맞추기_김민정.zip 파일로 제출
               (_4BinggoMain.java)
   3. 제출기한 : 2021.12.17 18:00 까지 제출
   4. 보내는메일주소 : tjdudgkr0959@naver.com  
*/   
	public static void main(String[] args) {

		Random rnd = new Random();

		int rand1 = rnd.nextInt(100 - 1 + 1) + 1;
		
		int user_choice_no ;
		int count = 0;
		int userNum;
		
		do {

			System.out.print("1부터 100 사이의 숫자 입력 => " );		
			Scanner sc = new Scanner(System.in);
			userNum = sc.nextInt();			
			count++;
			
			if (userNum < rand1) {
				System.out.println(">> "+userNum+"보다 큰값입니다.");
			}
			if (userNum > rand1) {
				System.out.println(">> "+userNum+"보다 작은값입니다.");			
			}
		} while (userNum != rand1);	
				System.out.println(">> #### 빙고!! "+userNum+" 번만에 맞추었습니다. ####");
		
			
		} // end of main------------------
	}


