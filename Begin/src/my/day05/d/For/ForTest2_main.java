package my.day05.d.For;

public class ForTest2_main {

	public static void main(String[] args) {

		System.out.println(">> 1. break <<");
		
		for(int i=0; i<10; i++) {
			if(i==5) break;	// 반복문 for에서 break; 를 만나면 가장 가까운 반복문을 벗어나는 것이다.
			System.out.println(i+1);
 		}// end of for-------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int cnt = 0;
		
		for(;;) {
			System.out.println(++cnt + "번째 반복");	// 반복문 for인데 조건이 없으면 '무한 반복'!!! 계~~속 뺑글뺑글 돌면서, 빠져나올 것이 없다.  break를 써서 멈춤! // 전위 : 찍어주면서 계속 증가
			if(cnt == 5) break;
		}// end of for-------------------------
		
		System.out.println(">> 2. continue <<");
		
		// 반복문에서 continue; 를 만나면 실행순서가 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 이동한다.
		
		for(int i=0; i<10; i++) {
			
			if( (i+1)%2 == 0 )// 출력하고자 하는 값(i+1) 이 짝수라면 
				continue;	  // 반복문에서 조건을 만족하고 continue; 를 만나면 실행순서가 밑으로 (sysout) 내려가지 않고 가장 가까운 반복문의 증감식으로 이동한다.(위의 if문으로 이동한다.)
			System.out.print((i+1) + " ");
			// 1 3 5 7 9 
		} // end of for-----------------------------------
		
		
	}

}
