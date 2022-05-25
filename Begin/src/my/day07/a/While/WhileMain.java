package my.day07.a.While;

public class WhileMain {

	/*
	    === while 문 형식 ===
	    
	    변수의 초기화;
	       
	    while(조건식) {
	       조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고,
	       조건식이 거짓(false)이라면 while의 { } 이부분을 빠져나간다. 
	       
	       반복해서 실행할 명령문;
	       증감식;
	    }
	 */   
	
	public static void main(String[] args) {

		int cnt=5, loop=0;					// loop : 반복횟수
		while (loop < cnt) { // 0<5	1<5 2<5 3<5 4<5 (참) 5<5 (거짓.!!) // 거짓인 것은 while 문을 빠져나온다.
			System.out.println((loop+1)+".안녕 자바~~");
			loop++;
		}// end of while------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		cnt=5; loop=0;					// loop : 반복횟수
		while (loop++ < cnt) { // 0<5	1<5 2<5 3<5 4<5 (참) 5<5 (거짓.!!) // 거짓인 것은 while 문을 빠져나온다. // 1이 5보다 작느냐 하고 
			System.out.println(loop+".Hello Java~~");
		}// end of while------------------------------------

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		cnt=5; loop=0;					// loop : 반복횟수
		while (loop < cnt) { // 0<5	1<5 2<5 3<5 4<5 (참) 5<5 (거짓.!!) // 거짓인 것은 while 문을 빠져나온다. // 1이 5보다 작느냐 하고 
			System.out.println(++loop+".안녕 이클립스~~");
		}// end of while------------------------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		loop=0;	
		while(true) {
			System.out.println(++loop+".안녕 Eclipse~~");
			if(loop == 5) 
				break;					// if()조건식이  참이면 break 해라.
		} // end of while------------------------------------
		
		//★(!()) 잘 기억하기. if를 쓸 필요가 없어짐.
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		loop=0;	
		while(!(++loop>5)) {						//While 조건식이 false 면 도달할 수 없다. // while 문을 빠져나가는 조건은 while(false) 대신에 while (!(true))를 많이 사용한다.
													// ! ( ) ==> 괄호() 속에는 while 반복문을 빠져나갈 조건식의 정의를 내려주는 것이다.
			System.out.println(loop+".안녕 오라클~~");	// 6일때 while 문을 빠져나감. 따라서 ++loop>5 면 빠져나감.
			
		} // end of while------------------------------------

		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		loop=0;		// 무한반복
		while(true) {
			
			if(++loop>10) {	// 탈출조건. 11이면 탈출한다 while문을 빠져나온다.
				break;
				
			}
			
			if(loop%2 == 0) {
				continue;	// 반복문에서 break;는 탈출조건 이지만, continue;는 아래로 내려가지 않고 while{} 괄호() 속의 조건식으로 이동한다.
			}
			
			System.out.println(loop+".Hi Oracle~~");
			
		} // end of while---------------------------
		
		/*
		  1. Hi Oracle~~
		  3. Hi Oracle~~
		  5. Hi Oracle~~
		  7. Hi Oracle~~
		  9. Hi Oracle~~		
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("\n=== 5단 ===");

		loop =0;
		while(++loop <10) {
		
			System.out.println("5*"+loop+"="+(5*loop));		// 0으로 초기화 했으므로 전위연산자(++loop)를 사용한다.
		
		}
		
		System.out.println("\n>> 프로그램 종료 << ");

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("\n=== 6단 ===");

		loop =0;
		while(true) {										//무한루프(무조건 참)
			if(++loop > 9 ) break;
			System.out.println("6*"+loop+"="+(6*loop));		// 0으로 초기화 했으므로 전위연산자(++loop)를 사용한다.
		
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("\n=== 7단 ===");
		loop =0; {
		while(!(++loop > 9)) 									//무한루프(무조건 참) , //while문의 탈출조건을 쓴다. (참이면 반복문을 빠져나오지 못함, 뺑글뺑글 돌아간다. 거짓이면 빠져나온다.
			System.out.println("7*"+loop+"="+(7*loop));			// 0으로 초기화 했으므로 전위연산자(++loop)를 사용한다.
	}																	
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.printf("%35s\n","=== 구구단 ===");

		//9행 8열
		//jul dan
		int jul=0, dan=1;
		
		while(!(++jul>9)) { // 9행
			
			while(!(++dan>9)) { // 8열								//dan < == 10일때 빠져나옴.
				String str = (dan<9)?"\t":"\n";
				System.out.print( dan+"*"+jul+ "=" + (dan*jul)+str);
				// 2*1=2
				
			}//end of while------------------------------------
						
			dan=1;	// 다시 한 번 초기화
			
		} //end of while------------------------------------
			
		System.out.println("\n>> 프로그램 종료 << ");
		
		}// end of main(String[] args)--------------------------
		
	} 


