package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz2Main {

	public static void main(String[] args) {
		
		char alphabet = 'a';
		int count = 0;
		
		for(alphabet = 'a'; alphabet<='z'; alphabet++) {
			int i = 1;
			if (i%2==0)	{
				//answer += Character.toUpperCase(i);
				System.out.print(Character.toUpperCase(alphabet));
			}
			else {
				System.out.print(Character.toLowerCase(alphabet));
			}
			
			}
		
	} // end of for---------

	} // end of main(String[] args)---------------------------------

//}


