package my.day14.c.inheritance;

// public class Me extends Father { // Me는 Father의 자식이다!!
// public class Me extends Mother { 	
   public class Me extends Father,Mother { // 오류가 뜨는것이 정상이다.
   // 자바에서는 클래스 생성시 다중 상속이 불가하다.!!!
   // c++ 에서는 클래스 생성시 다중 상속이 가능하다.!!!
   // 그러면 자바에서 다중 상속을 하려면 인터페이스를 사용하면 된다.
   
   	void info() {
		//System.out.println("1. 아이디 : " + super.userid);
		  System.out.println("2. 이름 : " + super.userid);
	  }

}
