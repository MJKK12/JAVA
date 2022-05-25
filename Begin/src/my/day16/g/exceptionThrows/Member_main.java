package my.day16.g.exceptionThrows;

public class Member_main {

	public static void main(String[] args) {

		try {
			
			Member lssMbr = new Member();
			lssMbr.name = "이순신";
			lssMbr.kor = "80";
			lssMbr.eng = "90";
			lssMbr.math = "70";
			
			lssMbr.info();		// info를 실행하는 쪽에서 error 메세지를 써라! (앞에 Member에서 해라!)
			
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
			Member ejhMbr = new Member();
			ejhMbr.name = "엄정화";
			ejhMbr.kor = "100";
			ejhMbr.eng = "팔십";	// >> 오류 메시지 내용 : For input string: "팔십"
			ejhMbr.math = "70";
			
			ejhMbr.info();
		
		} catch (Exception e) {
			System.out.println(">> 오류 메시지 내용 : " + e.getMessage());
		}
		
	}// end of main----------------------------

}
