package my.day06.b.multifor.gugudan;

public class Gugudan_main2 {

	/*
	  == 구구단 ==
	   2*1=2   3*1=3    4*1=4    ....   9*1=9
	   2*2=4   3*2=6    4*2=8    ....   9*2=18
	   2*3=6   3*3=9    4*3=12   ....   9*3=27
	   2*4=8   3*4=12   4*4=16   ....   9*4=36
	  2*5=10   3*5=15   4*5=20   ....   9*5=45
	  2*6=12   3*6=18   4*6=24   ....   9*6=54
	  2*7=14   3*7=21   4*7=28   ....   9*7=63
	  2*8=16   3*8=24   4*8=32   ....   9*8=72
	  2*9=18   3*9=27   4*9=36   ....   9*9=81
	*/
	
	// 위의 구구단은 9행 8열이다.
	// row(행) ==> 줄, col(열) ==> 단
	
	public static void main(String[] args) {

		System.out.println("== 구구단 ==");
		
		for(int row=1; row<=9; row++) {	// 9행
			
			for(int col=2; col<=9; col++) {	// 8열
				
				System.out.print(col +"*"+row+"="+(row*col)+"\t");				
			} // end of for------------------------------
			
			System.out.println("\n");
			
		} // end of for------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.printf("%40s\n","== 구구단 ==");	// s == string 타입 / f == format : 뭔가를 찍어주는데 String 타입이 온다는 것. ==구구단==이 %s로 들어옴. // %s로 한 다음에 \n 줄바꿈 해주어라.
													// %40s : 40글자의 공간을 확보하고, 오른쪽에서부터 채워나간다는 뜻 , 문자열이라면 %s를 쓴다 (String)
		for(int row=1; row<=9; row++) {	// 9행
			
			for(int col=2; col<=9; col++) {	// 8열				
				
				System.out.printf(col +"*"+row+"=%-4d",+(col*row));			//%d: 10진수 (바,숏,인)	%-4d : 4자리를 확보해서 왼쪽부터(-) 채워나간다!!
				
			} // end of for------------------------------
			
			System.out.println("\n");
			
		} // end of for------------------------------
		
		
	} // end of main(String[] args)----------------------

}
