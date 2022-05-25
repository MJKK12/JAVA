package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner3Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		System.out.print("정수를 입력하세요 => ");

		try {
			String inputStr = sc.nextLine();			// "2021"
														// "안녕하세요"
			int n = Integer.parseInt(inputStr) + 10;	// 2021 + 10 ==> 2031
			// Integer.parseInt(inputStr); 은 문자열 inputStr 을 int로 바꾸어 주는 것이다.
			//"안녕하세요"는 정수로 변경이 불가하다.
														 
			System.out.println("입력한 정수에 10을 더한 값 : " + n );
		} catch (NumberFormatException e) {				//여기서 java.lang이 없어도, 맨위 패키지에 java.lang.*이 생략되어져 있기 때문에 java.util 처럼 굳이 안써줘도 됨.
			System.out.println(">>> 정수만 입력하세요 !! <<< \n");
			e.printStackTrace(); 						//오류를 추적한 결과물을 화면에 찍는다.	
		}
		
		sc.close();
	}

}

// 그러나 매번 sc. nextLine을 쓰기 번거로움.