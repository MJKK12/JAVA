package my.day16.g.exceptionThrows;

public class Member {

	//field
	String name;
	String kor;
	String eng;
	String math;
	
	
	//method
	void info() throws Exception {	// NumberFormatException을 유발(throws)할 것인데, info()를 호출한 쪽에서 Exception 처리를 해라.
		// 유발되어질 어떠한 Exception이든지 발생한다면, info() 메소드를 호출한 쪽에서 처리해라.
		// 원래는 info() 메소드내에서 익셉션 처리를 해야 하지만
	    // 여기서는 info() 메소드 다음에 throws Exception 을 썼으므로
	    // info() 메소드내에서 익셉션 처리(try~catch)를 하지 않고 
	    // info() 메소드를 ★호출하는 쪽★에서  Exception 을 처리해라는 뜻이다. 
		
		int n_kor = Integer.parseInt(kor);	//▶ 이것들이 NumberFormatException를 유발한다.
		int n_eng = Integer.parseInt(eng);
		int n_math = Integer.parseInt(math);
	
		int total = n_kor + n_eng + n_math;
		
		String info = "1. 학생명 : " + name+"\n"
	 			     +"2. 국어 : " + kor+"점\n"
					 +"3. 영어 : " + eng+"점\n"
					 +"4. 수학 : " + math+"점\n"
					 +"5. 총점 : " + total+"점\n";
		
		System.out.println(info);
		
	} // end of info---------------
	
}
