package my.day07.b.DoWhile;

import java.util.Scanner;

public class _2FactorialMain {

// === 입사문제 === //
/*
	 >> 알고싶은 팩토리얼 수 입력 => 5엔터 	// 유효성검사까지 해보자!
	 >> 5! = 120
	 
	 5! ==> 5*4*3*2*1
	 7! ==> 7*6*5*4*3*2*1	 
*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		outer: 												//outer:은 레이블이다. 맨위 반복문 앞에 적는다. 
		do {
			try {
				System.out.print(">> 알고싶은 팩토리얼 수 입력 => ");
				int num = Integer.parseInt(sc.nextLine()); // 입력한것을 받는다. (이때 정수인지 아닌지를 판가름한다.) 
														   // ▶ 정수만 입력해야하는데 한글을 입력할 수도 있음. ("5" (O) "1.234" (X) "안녕"(X))	, 경고를 띄워준 다음에 다시 또 알고싶은 팩토리얼 수 창을 띄워야함. (반복)
														   // 올바르게 입력할때 까지 계속 '반복'
				if (num <= 0) {							   // "-7" "0" 은 불가. ▶ if문 추가
					System.out.println(">> [경고] 자연수만 입력하세요 !! << \n");
					continue;					
					// continue를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다. // for문에서 continue;를 만나면 증감식으로 가고, while / do-while 문에서는 조건식으로 간다.
				}
				// 5*4*3*2*1 = 반복이 필요함.
				
				long result =1; // 초기치에 1을 주고, 매번 곱해나감. 0으로 설정하면 어떤수에 *해봤자 모두 0이기 때문에, 초기치는 1로 설정한다. 	// int 범위를 넘어서는 것을 쓰기 위해서 여기를 int에서 long으로 바꿈
				for(int i=num; i>0; i--) {	// 5*4*3*2*1
					
					result *= i; // result = result * i; (할당연산자 => 먼저 계산후(result*i) 다시 그 결과값을 result에 대입)
								 // result = 1*5; ▶ 이것을 result에 넣어주겠다.
								 // result = 1*5*4;
					 			 // result = 1*5*4*3;
								 // result = 1*5*4*3*2;	
								 // result = 1*5*4*3*2*1;  (누적을 시켜줌)
					
				}// end of for--------------------------
				
				System.out.println(num+"! "+"="+result); 	//결과물을 보여준다.
				do {
					System.out.print(">> 또 할래?[Y/N] => ");	//또 할래? 라고 물어보는 것. (종료는 사용자가 그만하겠다 라고 하면 끝내는 거고, 아니면 무한 뺑뺑이) : n할때까지 무한 반복--> do-while문
					String yn = sc.nextLine();				// 위의 문장을 받는다.
															// 무한반복 (위의 한세트가 무한하게 뺑글뺑글 도는 것임) ▶ 이제 경우의 수를 따져보자
					if("Y".equalsIgnoreCase(yn))	{		// 대소문자 관계없이 Y(yes) 입니까?
						break;								// 또 한다고 하면 빠져나간 후에 팩토리얼 문구가 다시 나와야 함. (이때 전체 do-while문을 빠져나가면 안됨, 그러므로 break;를 사용한다.) 
															//break;는 가장 가까운 반복문을 빠져나가는 것이기 때문
					}
					
					else if("N".equalsIgnoreCase(yn)) {
						break outer;									//▶ 이때 맨위에 생성한 레이블인 outer를 생성하고 불러온 후에 바깥 do-while문을 빠져나와야 sc.close 하고 프로그램종료 버튼이 나옴. 
					}
					
					else {
						System.out.println(">> [경고] Y또는 N만 입력하세요.!!  \n");
					}
					
				} while (true);								
				// end of do while--------------------------
			
				
			} catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요. <<\n");	//▶ 정수 이외에 것을 입력하면 안된다는 메세지를 보여줘야 함.
			}
		
		} while (true);							// 무한반복 //참이기 때문에 못빠져나감. ▶ 다시 ">> 알고싶은 팩토리얼 수 입력 =>" 창이 뜸. do문으로 돌아감.!!
		//end of do~while----------------------------------------
		
		sc.close();
		
		System.out.println("\n~~~~ 프로그램 종료 ~~~~~\n");

		
	} // end of main(String[] args)------------------------

}
