package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz3Main {

	public static void main(String[] args) {

		System.out.println("▷ 휴대폰 번호를 입력하세요(예> 010-2345-6789) : ");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		String newchar = inputStr.replaceAll("-", "");
		System.out.print(newchar);
		
	} // end of main(String[] args) ------------------


}
