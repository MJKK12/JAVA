package my.day07.b.DoWhile;

//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;
//java에 있는 util 패키지는 다 쓰겠다.!!

public class _3PrimeNumberMain {

	   // === 소수란? === 
	   // 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수 
	   // 예> 1 부터 10까지의 소수를 나타내면 
	   //       2%2 ==> 0   2 는 소수
	   //       3%3 ==> 0   3 는 소수
	   //       4%2 ==> 0   4 는 소수가 아님
	   //       5%5 ==> 0   5 는 소수
	   //       6%2 ==> 0   6 는 소수가 아님
	   //       7%7 ==> 0   7 는 소수
	   //       8%2 ==> 0   8 는 소수가 아님
	   //       9%3 ==> 0   9 는 소수가 아님
	   //      10%2 ==> 0  10 는 소수가 아님  
	
/*
	    ==실행결과==
      ▷시작 자연수 : 1엔터
      ▷끝  자연수 : 20엔터 
	  1 부터 20 까지의 소수는?
	  2,3,5,7,11,13,17,19
	  
	  1부터 20 까지의 소수의 개수? 8개  
	  
	  1부터 20 까지의 소수들의 합? 77 
	  
	  === 프로그램 종료 ===      
*/	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startNo=0, endNo =0;
		
			do {												// 잘못되어지면 경고를 뿌린 다음에 종료가 나오는게 아니라, 처음부터 다시 나와서 기회를 주어야 한다.!(반복! do while문 사용)
				try {
				System.out.print("▷시작 자연수 : ");
				startNo = sc.nextInt();							//위의 문장을 받아준다. (엔터를 받아준다.) ▶ 이때 사용자가 말 안듣고 자연수 안쓰고 한글 또는 실수를 입력할 경우가 있다. ▶ 경우의 수에 따라 처리!!
				sc.nextLine();									// next.int 나오면 무조건 스캐너 버퍼 불러서 싹 비워줘야 한다.		
																// inputMismatchException : input에 자연수가 아니라 다른걸 입력했을 때..오류가 남. (Exception in thread "main" java.util.InputMismatchException
																// ▶try-catch를 사용해서 오류에 대비하자.!! ▶ inputMismatchException 에 연결되도록 함
				System.out.print("▷끝 자연수 : " );
				endNo = sc.nextInt();						//위의 문장을 받아준다. (엔터를 받아준다.) ▶ 이때 사용자가 말 안듣고 자연수 안쓰고 한글 또는 실수를 입력할 경우가 있다.
				sc.nextLine();									// next.int 나오면 무조건 스캐너 버퍼 불러서 싹 비워줘야 한다.
				
				//사용자가 올바르게 입력을 안할 경우 (1-20사이 소수가 아니라, 그 외 범위/소수가 아닌 수/한글 해당..)
				if(startNo < 1 || endNo < 1) { 
					System.out.println(">> [경고] 입력하시는 값은 모두 자연수이어야 합니다 !! << \n");				// 첫번째 case ①
				}
				else if (startNo >= endNo) {
					System.out.println(">> [경고] 두번째 입력한 숫자가 첫번째 입력한 숫자보다 커야 합니다. !! << \n");	//두번째 case ②  ▶ 이후에 while(true)를 만나서 다시 위로 올라가서 시작자연수부터 입력하게끔 함. 
				}
				
				else  {
					break;	// 위 두개 조건을 충족하고 제대로 값을 입력 했을 때.!!// 올바르게 입력했으면 , 빠져나오자.
				}
				
			} catch(InputMismatchException e) {					// 빨간줄은 import라는 뜻 (맨 위에 import java.util.InputMismatchException;)
				System.out.println(">>[경고] 자연수만 입력하세요. ");
			}
		} while (true);
		// end of do~while----------------------------
			
		/*
			▷시작 자연수 : 1		5
			▷끝  자연수 : 20		20
			// 1부터 20까지의 소수를 구해야 한다.
			// 소수란 ? 1과 자기 자신의 수로만 나누었을 때 나머지가 0인 1이외의 정수를 말한다.
		*/
			String str_result = ""; 		//여기에 소수만 차곡차곡 쌓아둔다.
			int cnt=0; 						//소수의 누적 갯수를 세기 위함. (누적되어진 갯수)
			int sum=0;						//소수들의 누적의 합계
			
			for(int i=startNo; i<=endNo; i++) {
				
				if(i==1) 										//*1은 소수가 아님을 주의하자.!! (1이외의 정수가 없기 때문) ,i가 매번 증가일 때, 소수인지 아닌지 검사를 해야함.(i가 검사할 대상이다.)
					continue;									// 1은 소수가 아니므로 검사할 필요가 없기에 continue;를 해야 한다.
				/*
					나누기를 했을 때, 나머지가 얼마가 되는지 일일이 검사를 한다.
					만약에 i가 2라면 ==> 2%2==0								2는 소수이다.
					만약에 i가 3라면 ==> 3%2!=0	3%3==0						3은 소수이다.
					만약에 i가 4라면 ==> 4%2==0	4%3(3%3은 검사할 필요가 없다) 	4는 자신(4) 이외의 수로 나누어지기 때문에 소수가 아니다.
					만약에 i가 5라면 ==> 5%2!=0 	5%3!=0 5%4!= 5%5==0			5는 소수이다.
					.................
					만약에 i가 9라면 ==> 9%2!=0 	9%3==0 9%4(검사할 필요가 없다)	9는 자신(9) 이외의 수로 나누어지기 때문에 소수가 아니다.
					*이때, 자기자신은 자기자신으로 나누면 무조건 0이니까 검사할 필요가 없다. (위에서 2%2,3%3,5%%와 같은 것을 할 필요가 없다.)
					*분모는 분자의 1이 작을때까지 검사를 하면 된다.
				*/
				boolean isSosu = true;		//소수인지 아닌지 나타내는것 (2가지 경우의 수) : boolean
				
				for(int j=2; j<i; j++) {	//j가 분모에 들어갈 값이다. 매번 1증가하면서 분자보다 1 작을때까지 검사.(0으로 떨어지나 안떨어지나 계속 보는 것임.!! )
											//*이때, 자기자신은 자기자신으로 나누면 무조건 0이니까 검사할 필요가 없다. 그러므로 분모가 1 작을때까지만 검사.)
					if(i%j == 0) {			//검사 대상인 i는 소수가 아닌 경우 ①
						isSosu = false;		// 소수가 아님을 표시!!
						break;				//소수가 아니므로 빠져나온다. 이때 위에 flag 역할로 소수인지아닌지 2가지 경우의 수에 해당하는 boolean (T/F)를 입력해준다. 해당 수가 소수인지 아닌지를 표시해야함.
					}
					
				} // end of for------------------------
				
				if(isSosu) 	{												// 검사 대상인 i가 소수라면 (i==소수,분자)
					String str_add = (!"".equals(str_result))?",":"";		// i 앞에 ,를 넣어주기 위한 조건문 (삼항연산자) // ("".equals(str_result) == str_result = "" (맨 첫번째에 있는 값이라는 뜻)
					str_result += str_add + i;								//j를 분모 -1인 분자의 수 까지 다 돌렸을때 0으로 안떨어진다면, 소수라는 뜻. isSosu=true;로 계속 남아있는 것임. (isSosu == isSosu==true)
																			// 최초가 아니라면 ","를 넣어주고, 최초라면 앞에 아무것도 안넣어준다. 
					
					cnt++;													// isSosu가 소수입니까?, 소수라면(if) 소수의 갯수를 누적.(cnt++;)
					sum += i;												// isSosu가 소수입니까?, 소수라면(if) 소수들의 누적의 합계 (sum += i;)
				}
				
			} // end of for------------------------
		
			System.out.println("\n"+startNo+"부터 "+endNo+" 까지의 소수는?\n" + str_result +"\n");
			//2,3,5,7,11,13,17,19

			System.out.println(startNo+"부터 "+endNo+" 까지의 소수의 개수? " + cnt + "개\n" );		//cnt = 개수!! (count) , 소수 셀때마다 누적.
							
			System.out.println(startNo+"부터 "+endNo+" 까지의 소수들의 합? " + sum + "\n" );			//sum = 누적!! 모두 더하는 것.

			
		sc.close();
		System.out.println("==== 프로그램 종료 ====");
		
	} // end of main(String[] args)

}
