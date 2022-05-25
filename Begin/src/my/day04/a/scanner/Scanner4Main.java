package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner4Main {

	public static void main(String[] args) {

		System.out.println("== 키보드로부터 2개의 숫자를 입력받아서 더한 결과 알아보기 ==\n");

		Scanner sc = new Scanner(System.in);

		String inputStr = "";			//지역변수, 전체 큰 괄호내에서 intpurStr을 쓰기 위해서 사용함. = 지역변수가 중괄호에서 선언되었다.
		
		try {
			System.out.print("1. 첫번째 정수 : ");
			inputStr = sc.nextLine();	// "10" 
										// "안녕하세요"
			
			int num1 = Integer.parseInt(inputStr);
			
			System.out.print("2. 두번째 정수 : ");
			inputStr = sc.nextLine();	// "20" 
										// "좋은하루"
			
			int num2 = Integer.parseInt(inputStr);
			
			System.out.println(">> 더한 결과 : "+num1+" + "+num2+" = " +(num1 + num2) );
			
		} catch(NumberFormatException e) {
			System.out.println(">> "+inputStr+"은(는) 정수가 아니므로 정수로 입력하세요. <<");
		} 
		
		sc.close();
		
	} // end of main

}
