package my.day14.a.inheritance;

import java.util.Scanner;

public class Controller {
	
	GujikjaCtrl guCtrl = new GujikjaCtrl(); // ▶GujikjaCtrl 는 String 과 비슷한 역할 (변수 앞에 타입 설정하듯이)
	CompanyCtrl comCtrl = new CompanyCtrl();
	
	// == 메뉴를 보여주는 메소드 생성하기 == //

	public void startMenu(Scanner sc, Gujikja[] guArr, Company[] comArr) {			// 구직자 배열을 받아와야 하므로 Gujikja[] guArr를 넣는다.
																					// Main 에 가서 Ctrl에 sc 와 gu&com 배열을 모두 넘긴다.
		String str_choice = "";
		
		do {			
			
			System.out.println("\n==== >> 시작메뉴 << ====\n"
							 + "A. 구직자 메뉴로 가기   B. 구인회사 메뉴로 가기\n"
							 + "C. 프로그램 종료");
			System.out.println("\n▷ 메뉴번호 선택 => ");			
			
			
			str_choice = sc.nextLine();		// "A" "a"
			
			switch (str_choice.toUpperCase()) {	// "A"	// 전부 대문자나 소문자로 입력해야한다. ▶ 소문자로 입력해도 대문자로 변환되게 끔 함.
				case "A" : 	// 구직자 메뉴로 가기
					guCtrl.showMenu(sc, guArr);		// ▶sc만 주면 안되고, 저장되어진 데이터인 배열을 받아와야 제어를 할 수 있다.
					break;
	
				case "B" :	// 구인회사 메뉴로 가기
					comCtrl.showMenu(sc, comArr, guArr);			// 저장된 데이터인 배열을 받아와야 제어를 할 수 있다.
					break;
		
				case "C" :
					
					break;	// 프로그램 종료
			
				default:
					System.out.println(">> [경고] 메뉴에 없는 것을 선택하셨습니다. <<\n");
					break;
				
			}// end of switch (str_choice)------------------------------------

		} while (!("C".equals(str_choice.toUpperCase())));		// 입력받은게 C(프로그램 종료)면 뺀다! (입력한것이 대문자로 자동인식 되게끔 .toUpperCase 넣어줌)
		
	}// end of public void showMenu()--------------------
	
}
