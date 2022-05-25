package my.day07.c.quiz;

public class QuizMain2 {

	public static void main(String[] args) {

		//1. == for 문을 사용해서 출력하기 == //

		for(int i=9;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}//end of for
			System.out.println();
		}// end of for-------------------------				
		
		//2. == while 문을 사용해서 출력하기 == //
		
		int i=1;		
		while (i<=9) {
			int j=9;
			while (j>=i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}// end of while------------------------
		
		//3. == do~while 문을 사용해서 출력하기 == //
		
/*		do {
			i=1;
			int j=9;
			if (j>=i)		
				System.out.print("*");
				j--;
		} while(i<=9);
*/
		
		i=1;
		do {
				String star = "";
				int j=10-i;
				
				do {
					star +="*";
				} while(!(--j==0));
				//end of do~while--------------------------
			
				System.out.println(star+i);
		} while(!(++i > 10));
		
		// end of do~while------------------
		
		

	} // end of main(String[] args) ------------
}
