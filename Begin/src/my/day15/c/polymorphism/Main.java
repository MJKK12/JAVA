package my.day15.c.polymorphism;

import java.util.Scanner;

public class Main {								// Gujikja 와 Company 모두 제어 해야함

	public static void main(String[] args) {

		Member[] mbrArr = new Member[8];		// Gujikja와 Company 다 합침
		
		Gujikja admin_gu = new Gujikja();
		admin_gu.setId("admin");
		admin_gu.setPasswd("qWer1234$");
		admin_gu.setName("관리자");
		admin_gu.setJubun("8805072");
		
		Gujikja lss_gu = new Gujikja();
		lss_gu.setId("leess");
		lss_gu.setPasswd("qWer1234$");
		lss_gu.setName("이순신");
		lss_gu.setJubun("9005072");
		
		Gujikja ejh_gu = new Gujikja();
		ejh_gu.setId("eomjh");
		ejh_gu.setPasswd("qWer1234$");
		ejh_gu.setName("엄정화");
		ejh_gu.setJubun("9805072");
		
		Gujikja yks_gu = new Gujikja();
		yks_gu.setId("you_ks");
		yks_gu.setPasswd("qWer1234$");
		yks_gu.setName("유관순");
		yks_gu.setJubun("9803012");

		
/*		Gujikja gu1 = new Gujikja();
		gu1.setId("leess");						// 아이디가 공백이나 조건에 충족하지 못하는 것이 들어오면 안되니까 부모인 member 클래스에서 private 처리 해버림. ▶ 안보일때는 메소드를 만들어서 넣어줘야함.
		gu1.setPasswd("qWer1234$");
*/
		mbrArr[Member.count++] = admin_gu;		// count 가 private 가 아닌데 왜 빨간줄이 뜰까? : count가 default 이기 때문이다.
		mbrArr[Member.count++] = lss_gu;		// 동일 패키지는 import 할 필요가 없음. 구직자 13에서 가져왔기 때문이다.(다른패키지)
		mbrArr[Member.count++] = ejh_gu;		// 다른패키지에서 복붙해올때 맨 위에 import를 지운다.
		mbrArr[Member.count++] = yks_gu;
		

		Company com1 = new Company();
		com1.setId("samsung");
		com1.setPasswd("aBcd1234$");
		com1.setComname("삼성전자");
		com1.setCombunho("12-345");
		com1.setJobtype("");
		com1.setSeedmoney(7000);		// 문자열이 아니므로 숫자를 "" 안에 넣지 않는다.(?)

		Company com2 = new Company();
		com2.setId("sist");
		com2.setPasswd("aBcd1234$");
		com2.setComname("쌍용강북교육센터");
		com2.setCombunho("82-345");
		com2.setJobtype("교육서비스업");
		com2.setSeedmoney(5000);		// 문자열이 아니므로 숫자를 "" 안에 넣지 않는다.
	
		mbrArr[Member.count++] = com1;	// ★배열에 다시 담아주는 작업이 필요, 이 부분이 없었기 때문에, 가입된 아이디가 있다고 해놨음에도 프로그램을 돌리면 새로운 id처럼 인식돼서 회원가입이 됐음.
		mbrArr[Member.count++] = com2;	// com2; 만 담아놓는 작업을 해놨기 때문에 처음에 com1을 담아두지 않았을 때에는 com1이 중복확인에서 체크가 안됐음. (가입되어있지 않은 id 처럼 인식됨)
		
		//////////////////////////////////////////////////////////////////////		
		Scanner sc = new Scanner(System.in);
		
		Controller ctrl = new Controller();
		ctrl.startMenu(sc, mbrArr); //▶ ctrl 한 후 파라미터를 넘겨준다. (컨트롤러에)
		
		sc.close();
		System.out.println(">> 프로그램이 종료 되었습니다. <<");

	}

}
