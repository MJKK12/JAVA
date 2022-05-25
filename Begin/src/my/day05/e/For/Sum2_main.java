package my.day05.e.For;

import java.util.Scanner;

public class Sum2_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		for(;;) {
			
			try {
			
			System.out.print(">> 누적해야할 시작 숫자 => ");
			int startNo = Integer.parseInt(sc.nextLine());
			//	startNo ==> 5
			
			System.out.print(">> 누적해야할 마지막 숫자 => ");
			int endNo = Integer.parseInt(sc.nextLine());
			//	endNo ==> 1
			
			if (endNo < startNo) {
				System.out.println("== [경고] 마지막 숫자는 시작 숫자보다 같거나 커야 합니다. == \n");
				continue;
			}

			// startNo  	=> 1  2 3
			// endNo		=> 10 9 5 번
			// 반복해야할 횟수 => endNo - startNo + 1
			// 반복해야할 횟수 => 10 8 3 번
			
			int cnt = endNo-startNo+1;// 반복해야할 횟수 => endNo - startNo + 1 //cnt=count
			int sum = 0; //누적의 합을 저장시켜주는 변수. 0으로 초기화 함.
			
			int start = startNo;
			String str = "";
			
			for(int i=0; i<cnt; i++) { // i<3
				
				String str_add = (i<cnt-1)?"+":""; // (// 1+2+3+...+10 =55를 출력하기 위해서 if문 또는 삼항연산자를 사용해도 됨) // i<cnt-1: 마지막보다 작다.
				
				str += start + str_add;
				
				sum += start++; // sum = sum + start;  //넣어준다음에 다음에 1증가
				
								// sum =  0 + 3;
								// sum =  0 + 3 + 4;
								// sum =  0 + 3 + 4 + 5; (누적되어 더해진 것이 sum에 들어가는 것)
			}// end of for------------------------------------
			
			System.out.println(startNo+" 부터 " +endNo+" 까지의 누적의 합은 "+sum+" 입니다.");
			System.out.println(str+ " = " +sum);
			
			break;															//숫자를 올바르게 넣으면 빠져나간다.
			
			} catch(NumberFormatException e) {
				System.out.println("== [경고] 정수만 입력해주세요~~ == \n");		// 사용자가 숫자가 넣을때까지 계속 반복해주어야 한다.
 			}
			
		} //end of for -------------------------------
		
		
		
		sc.close();
	}

}
