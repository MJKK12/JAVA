package my.day06.a.multifor;

public class MultiForMain {

	public static void main(String[] args) {
		
		// == 다중 for문에 대해서 알아봅니다. ==
		// 다중 for문이라 함은 for문 속에 또 다른 for문이 있는 것을 말한다.
		
		/*
		 == 출력결과 ==
			abcdefg		3행(가로) 7열(세로)
			hijklmn		
			opqrstu
		 */
		char ch = 'a';
		
		for(int i=0; i<3; i++){			// 바깥 for문 ==> 행
		
			for(int j=0; j<7; j++){		// 내부 for문 ==> 열
				System.out.print(ch++);	//a를 먼저 찍어주고 1증가시켜야 함. 그래서 후위연산자 사용.
			}	//end of for--------------		
			
			System.out.println("\n");
		} //end of for--------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		/*
		== 단일 for문을 사용하여 아래처럼 나오도록 하세요 == (for문을 1번만 사용해서 위와 똑같이 나타내기)
		
			abcdefg		3행(가로) 7열(세로)
			hijklmn		
			opqrstu
		*/
		
		ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++) {		// a부터 u까지 반복 : 'u'-'a'+1
			System.out.print(ch++);
			if((i+1)%7 == 0) {					//i는 0부터 시작한다는 것을 기억!! , 나누었을 때 0이 나와야 해당 수의 배수가 됨.
				System.out.println("\n");		// 왜 한줄씩 더 띄어지지 ???
			}
		}

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");		
	/*
	 이중 for문을 사용하여 아래처럼 나오도록 하세요.
	 
	 == 출력결과 ==
	 
        [0,0][0,1][0,2]   4행3열
        [1,0][1,1][1,2]
        [2,0][2,1][2,2]
        [3,0][3,1][3,2]
     */
		ch = '0';
		for(int i=0; i<4; i++){			// 바깥 for문 ==> 4행
		
			for(int j=0; j<3; j++){		// 내부 for문 ==> 3열
		
				System.out.print("["+i+","+j+"]");	//a를 먼저 찍어주고 1증가시켜야 함. 그래서 후위연산자 사용.
			}	//end of for--------------		
			
			System.out.println(" ");
		} //end of for--------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");		
		
		/*
		 이중 for문을 사용하여 아래처럼 나오도록 하세요.
		 
		 == 출력결과 ==
		 
	        [0,0][0,1][0,2]   3행3열
	        [1,0][1,1][1,2]
	        [3,0][3,1][3,2]
	    */
		// ※ continue; ==> continue; 를 만나면 가장 가까운 반복문의 증감식으로 이동한다.
		
		for(int i=0; i<4; i++){			// 바깥 for문 ==> 4행
			
			if(i==2) continue;			// continue;가 되어지면 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 간다.// 밑에 for문이 아니라, 위의 for문에서 i++가 가장 가까운 반복문임.
										// i==2 이면, 밑으로 내려가지 않고, i++되어 3이된다.
			
			for(int j=0; j<3; j++){		// 내부 for문 ==> 3열
		
				System.out.print("["+i+","+j+"]");	//a를 먼저 찍어주고 1증가시켜야 함. 그래서 후위연산자 사용.
			}	//end of for--------------		
			
			System.out.println(" ");
		} //end of for--------------

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");				
		/*
		 이중 for문을 사용하여 아래처럼 나오도록 하세요.
		 
		 == 출력결과 ==
		 
	        [0,0][0,2]   
	        [1,0][1,2]
	        [3,0][3,2]
	    */
		// ※ continue; ==> continue; 를 만나면 가장 가까운 반복문의 증감식으로 이동한다.
		
		for(int i=0; i<4; i++){			// 바깥 for문 ==> 행 ( 원래 4행에서 3행으로 줄어들었음 )
			
			if(i==2) continue;			// continue;가 되어지면 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 간다.// 밑에 for문이 아니라, 위의 for문에서 i++가 가장 가까운 반복문임.
										// i==2 이면, 밑으로 내려가지 않고, i++되어 3이된다.
			
			for(int j=0; j<3; j++){		// 내부 for문 ==> 열 ( 원래 3열에서 2열로 줄어들었음 )
				
				if(j==1) continue;
				
				System.out.print("["+i+","+j+"]");	//a를 먼저 찍어주고 1증가시켜야 함. 그래서 후위연산자 사용.
			}	//end of for--------------		
			
			System.out.println(" ");
		} //end of for--------------

		System.out.println("\n안녕하세요\t\"좋은아침\"\t입니다.\n");	
		//	\n 줄바꿈 	\" 쌍따옴표		\t 탭
		
		System.out.println(">> [퀴즈] 이중 for문을 사용하여 아래처럼 나오도록 하세요 << \n");
		/*
		
			501호 502호 503호 505호
			301호 302호 303호 305호
			201호 202호 203호 205호
			101호 102호 103호 105호
		*/
		for(int i=5; i>0; i--){			// 바깥 for문 ==> 4행 ( 원래 4행에서 3행으로 줄어들었음 )
			
			if(i == 4) continue;			// continue;가 되어지면 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 간다.// 밑에 for문이 아니라, 위의 for문에서 i++가 가장 가까운 반복문임.
											// i==2 이면, 밑으로 내려가지 않고, i++되어 3이된다.
			
			for(int j=0; j<5; j++){		// 내부 for문 ==> 4열 ( 원래 3열에서 2열로 줄어들었음 )
				
				if(j == 4) continue;
				
				System.out.print(i+"0"+(j+1)+"호\t");	//a를 먼저 찍어주고 1증가시켜야 함. 그래서 후위연산자 사용.
			}//	end of for--------------		
			
			System.out.println(" ");
		}//	end of for--------------		
		

	}// end of main(String[] args)-------------------------- 

}// end of MultiForMain
		
