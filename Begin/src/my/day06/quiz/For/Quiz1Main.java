package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz1Main {

	public static void main(String[] args) {
		String str = "";	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("▷ 문자열을 입력하세요 : ");
		String inputstr = sc.nextLine();
		
		int alphaUpper = 0, alphaLower=0, num =0, Specialchar=0;
		
		for(int i=0; i<str.length(); i++) {
			if( 64 < str.charAt(i) && str.charAt(i) < 91)
				alphaUpper++;
			else if 
				('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				alphaLower++;
			else if('0' < str.length() && str.length()<'9')
				num++;
			else
				Specialchar++;
			
		} //end of for---------------------------
			
		
		System.out.println("입력한 문자열 : "+inputstr+"" );

		System.out.println("입력한 문자열 길이 : "+inputstr.length()+"" );
		
		System.out.println("대문자 개수 : "+alphaUpper+"개" );
		
		System.out.println("소문자 개수 : "+alphaLower+"개");
	
		System.out.println("숫자 개수 : "+num+"개");
				
		System.out.println("특수문자 개수 : "+Specialchar+"개");
				
	   }// end of main(String[] args)---------------------------

   }	
		
 

