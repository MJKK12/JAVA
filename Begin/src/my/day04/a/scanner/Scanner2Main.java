package my.day04.a.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner2Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		System.out.print("정수를 입력하세요 => ");

		try {
			int inputNum = sc.nextInt(); // 2021 치고 엔터를 입력하면 inputNum에 들어가게 됨. ★이건 삭제되는 것이 아니고 그대로 남아있음.
										 // 안녕하세요 엔터 , 정수가 아닌 것을 int에 넣을 수 없음 (InputMismatchException)
			
			sc.nextLine();
			System.out.println("입력한 정수 : " + inputNum);
		} catch (InputMismatchException e) {
			System.out.println(">>> 정수만 입력하세요 !! <<< \n");
			e.printStackTrace(); 		//추적한 결과물을 화면에 찍는다.	
		}
		
		sc.close();
	}

}
