package my.day10.a.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyComma_main2 {

/*
	▷ 금액을 입력하세요(정수로만) => 1234567890 엔터
	1,234,567,890 원
	
	▷ 금액을 입력하세요(정수로만) => 100
	,100 원

 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 금액을 입력하세요(정수로만) => ");	// 공백을 넣었을 때를 대비한다. "		12345678910		"
	/*
		String str = sc.nextLine();
		System.out.println("입력시작:"+str+"입력끝");
		System.out.println("입력시작:"+str.trim()+"입력끝");	// trim은 시작과 끝의 공백을 없앨 수 있고, 가운데 공백은 없앨 수 없음. (양쪽 사이드에 있는 공백만을 없앤다.)
	*/	
		// "	문자열		".trim()을 하면 좌우쪽의 공백이 있으면 공백을 제거한 "문자열" 이 된다.
	
		long money = Long.parseLong(sc.nextLine().trim());				//	1234567890	
																		//  100	
		
		DecimalFormat df = new DecimalFormat("#,###");  				// 세 자리마다 콤마를 넣어준다.
		String smoney = df.format(money); 								//long 타입 (마우스 갖다대고 확인할 것)
		
		System.out.println(smoney);		
		//423,445,352 : 세 자리 마다 콤마가 찍어서 출력됨
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("▶ 금액을 입력하세요(정수로만) => ");	
		String inputStr = sc.nextLine().trim();				//	"123456789"		"23456789"
															//   "100"		
		
		int len = inputStr.length();						// len => 9 3자리 초과 될 때 ,을 찍어주도록 할 것 (세자리수 씩.!!)
				
		int	commaCount = len/3;								// commaCount => 3(콤마가 세개가 들어가야함) 2
				
		if(len%3 == 0) commaCount -= 1;						// len이 9니까, commaCount 3-1 (3의 배수니까 len%3 할때 1을 빼준다.)
		
		//	",123,456,789"												
		//	",100"
		
		char[] inputChArr = inputStr.toCharArray();
		/*
				  -------------------		-----------------
		데이터값 => |1|2|3|4|5|6|7|8|9|		|2|3|4|5|6|7|8|9|
				  --------------------		-----------------
		index  =>  0 1 2 3 4 5 6 7 8 		 0 1 2 3 4 5 6 7
		*/
		
		char[] outputChArr = new char[len+commaCount];	// new char[9+2] (뒤에 2는 추가된 콤마수 - 원래 9자리 였는데 콤마때문에 2자리가 늘어남)
		/*
				  --------------------------------------------------------		--------------------------------------------------
		데이터값 => |' '||' '||' '||' '||' '||' '||' '||' '||' '||' '||' '|		|' '||' '||' '||' '||' '||' '||' '||' '||' '||' '|
				  --------------------------------------------------------		--------------------------------------------------
		index  =>   0	 1	  2	   3	4	 5	  6	  7	   8	 9	  10 		  0    1	2	 3	  4		5	6	 7	   8   9
				  ★ 디폴트가 위처럼 공백인데, 입력받은 값으로 채운다.
				  
				  -----------------------		---------------------
		데이터값 => |1|2|3|,|4|5|6|,|7|8|9|		|2|3|,|4|5|6|,|7|8|9|
				  -----------------------		---------------------
		index  =>  0 1 2 3 4 5 6 7 8 9 10 	     0 1 2 3 4 5 6 7 8 9
				   배열 크기가 11개				 배열 크기가 10개					
	  콤마가들어올 => 7번 , 3번						=> 6번, 2번
		index				
		*/
		int cnt = 0;	// 반복하는 횟수
		for(int i=outputChArr.length-1, j=inputChArr.length-1; i>=0; i--,j--) { //맨 뒤에서부터 거꾸로 나감, 배열의 길이에서 -1을 해줌
			outputChArr[i] = outputChArr[j];								   //i번째 자리에 (위의 공백 10번째 자리에, 밑의 데이터값 9에 해당하는 것이 들어가야함.)
			cnt++;
																		   //4번째 자리마다 콤마가 들어간다. (몇번 반복하는지도 체크해야함)
			if(cnt%4 != 0) {
				// 값을 넣어주는 것이다.
				outputChArr[i] = inputChArr[j];
			}
			
			else {
				// 콤마(,)를 넣어주는 것이다.
				outputChArr[i] = ',';				// 콤마를 넣어줄 때 j는 1감소 하지만, 데이터값에 6이 들어와야하는데 5가 들어가면 안됨. ( 4,5,5가 되면 안됨 )
				j++; 								// ★ 이해할 것 ! 증가(++)했다가 위에 다시 올라가서 감소(--)해서 원상복구 하게 되므로, 그 6의 자리에 5가 들어가는 오류가 발생하지 않게됨!	
			}
		} // end of for----------------------------
		
		String result ="";
		for(int i=0; i<outputChArr.length; i++) {
			result += outputChArr[i]; // 배열의 값을 끄집어내서 쌓아둔다.
		}
		
		System.out.println(result);
		
		sc.close();
	
	} // end of main(String[] args)----------------------

}
