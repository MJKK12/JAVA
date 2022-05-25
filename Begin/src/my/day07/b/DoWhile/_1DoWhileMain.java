package my.day07.b.DoWhile;

public class _1DoWhileMain {
	
	/*
	    === do ~ while() ===
	    
	    변수초기화;
	    
	    do{
	       반복해서 실행할 명령문;
	       증감식;
	    } while(조건식);
	    
	    while 문의 경우 조건식이 true 일때만 반복 실행하지만,
	    do ~ while 문의 경우는 조건식이 false 일지라도
	    무조건 do{ } 속에 있는 명령문은 1번은 실행하고서 반복문을 벗어난다.
	        
	    그러므로 do ~ while 문은 무조건 do{ } 속에 있는 명령문을 실행하고서
	    while(조건식) 속의 조건에 따라 참(true)이라면 계속 반복하고,
	    조건이 거짓(false)이라면 중지한다.  
	*/   
	
	public static void main(String[] args) {

		do {
			System.out.println("안녕 자바~~~~");
		} while(false);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int cnt=5, loop=0;
		do {							//do cntr+space 눌러서 조건식 빠르게 생성
			System.out.println(++loop + ".Hello Java~~");
		} while (loop < cnt);			//0<5 1<5 2<5 3<5 4<5 5<5	//거짓이면 빠져나온다.
		
		/*
			1.Hello Java~~
			1.Hello Java~~
			1.Hello Java~~
			1.Hello Java~~
			1.Hello Java~~			
		*/

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		cnt=5; loop=0;
		do {							//do cntr+space 눌러서 조건식 빠르게 생성
			System.out.println(++loop + ".Hello 자바~~");
		} while (!(loop == 5));					// !( )은 괄호()속에는 do~while 반복문을 탈출할 조건을 입력해주는 것이다. // ()처럼 되면 빠져나가라(반복하지 마라)!
												// loop가 5가 되면 하지 말아라.
		/*
			1.Hello 자바~~
			2.Hello 자바~~
			3.Hello 자바~~
			4.Hello 자바~~
			5.Hello 자바~~
		*/

	}// end of main (String[] args)----------------------

}
