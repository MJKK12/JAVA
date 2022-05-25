package my.day08.a.random;

import java.util.*;

public class _3GawibawiboMain {

	public static void main(String[] args) {
		
		Random rnd = new Random();							// PC에 랜덤하게 무언가를 하나 줌. (메모리에 올려!)
		
		Scanner sc = new Scanner(System.in);				// 키보드에 입력
		
		int userNum =0;

		do {
			System.out.println("================ 메뉴 ================\n "
							  +"1.가위\t2.바위\t3.보\t4.게임종료\n"					// 숫자 1~4 이외에 다른 문자를 입력할 수 있음, 시도를(try) 한번 해보고 막아준다.(cat (NumberException~~) ▶ try-catch를 통해 NumberFormatException 생성하여 "경고"를 보여주자.
							  +"=====================================\n ");
	
			System.out.println(">> 선택하세요 => ");				// 한세트가 계속 반복해야함. (1,2,3 번 일땐 계속 반복 가능, 그러나 4번의 게임종료하면 끝내야함.)
			
			try {
				userNum = Integer.parseInt(sc.nextLine());			// 사용자가 선택한 Number.			
			} catch (NumberFormatException e) {
				System.out.println("▷ [경고] 숫자로만 입력하세요.!! \n");		// 여기서는 userNum이 0인 상태. 안녕을 int로 바꿀 수 없음. ==> NumberFormatException	
				continue;
			}
			if( !(1 <= userNum && userNum <= 4) ) {					// 1부터 4가 아니라면, 경고!! 메뉴에 없는 5를 사용자가 입력할 수도 있음. ▶ if 생성.!!
				System.out.println("▷ [경고] 메뉴에 존재하지 않는 번호입니다.\n");
				continue;											// 위의 문구 다음에 다시 처음으로 돌아가야 하므로, continue;를 사용하여 못빠져나가게 한 후 처음으로 되돌린다. (for + continue; 증감식) (while, do~while + continue;는)
			}
			
			if(userNum != 4) {										// 사용자가 1 또는 2 또는 3을 입력한 경우이다. 
			//	System.out.println("입력받은 값을 가지고 가위 바위 보 결과를 알아본다."); // ▶ 4(게임종료)를 입력하면, 결과를 알아볼 필요가 없다.
				
				// PC도 1 또는 2 또는 3 중에 하나를 랜덤하게 내야한다. 
				int pcNum = rnd.nextInt(3-1+1)+1; // 객체(rnd.nextInt)를 불러와.!! --> 이 값은 PC의 넘버이다.(int pcNum)
				
				String msg = "";
				
				// 사용자가 이긴 경우
				if(pcNum==1 && userNum==3 || pcNum==2 && userNum==1 || pcNum==3 && userNum==2) {
					msg = ">> 사용자님이 이겼습니다!! << \n";
				}
				
				// 사용자가 진 경우
				else if(pcNum==2 && userNum==1 || pcNum==3 && userNum==2 || pcNum==1 && userNum==3) {
					msg = ">> 사용자님이 졌습니다!! << \n";
				}
				
				// 사용자와 PC가 비긴 경우
				else {
					msg = ">> 비겼습니다!! << \n";
				}
				
				System.out.println(msg);							// 프로그램 종료할때 까지 계속 이 문구가 뜨면 됨.
				
			}
			
		} while( !( userNum == 4) );								// 조건식에 !는 탈출. ()가 참이면 do-while문을 탈출이다. //userNum == 4이면, 탈출해라! (게임종료), 4가 아니면 빠져나갈 수 없다.
		// end of do~while------------------------------------
		
		sc.close();
		System.out.println("\n ~~~ 프로그램 종료 ~~~");
		
		
		
	}// end of main(String[] args)----------------------------

}
