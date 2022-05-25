package my.day17.d.collection;

import java.util.*;


public class Main {

	public static void main(String[] args) {

		List<Member> mbrList = new ArrayList<>();
		
//		Member[] mbrArr = new Member[8];	// 위의 List를 씀으로써 배열을 날림
				
		Gujikja admin_gu = new Gujikja();
		admin_gu.setId("admin");
		admin_gu.setPasswd("qWer1234$");
		admin_gu.setName("관리자");
		admin_gu.setJubun("8905071");
		
		Gujikja lss_gu = new Gujikja();
		lss_gu.setId("leess");
		lss_gu.setPasswd("qWer1234$");
		lss_gu.setName("이순신");
		lss_gu.setJubun("9005071");
		
		Gujikja ejh_gu = new Gujikja();
		ejh_gu.setId("eomjh");
		ejh_gu.setPasswd("qWer1234$");
		ejh_gu.setName("엄정화");
		ejh_gu.setJubun("9810072");
		
		Gujikja yks_gu = new Gujikja();
		yks_gu.setId("youks");
		yks_gu.setPasswd("qWer1234$");
		yks_gu.setName("유관순");
		yks_gu.setJubun("9103012");
		
//		mbrArr[Member.count++] = admin_gu; ▼ 배열을 날리고 아래의 List에 들어감 (콜렉션)
//		mbrArr[Member.count++] = lss_gu;
//		mbrArr[Member.count++] = ejh_gu;
//		mbrArr[Member.count++] = yks_gu;
		
		
		Company com1 = new Company();
		com1.setId("samsung");
		com1.setPasswd("aBcd1234$");
		com1.setComname("삼성전자");
		com1.setCombunho("12-345");
		com1.setJobtype("IT");
		com1.setSeedmoney(7000);
		
		Company com2 = new Company();
		com2.setId("sist");
		com2.setPasswd("aBcd1234$");
		com2.setComname("쌍용강북교육센터");
		com2.setCombunho("82-345");
		com2.setJobtype("교육서비스업");
		com2.setSeedmoney(5000);
		
//		mbrArr[Member.count++] = com1; ▼ 배열을 날리고 아래 List에 들어감 (콜렉션)
//		mbrArr[Member.count++] = com2;

		mbrList.add(admin_gu);	// Member는 부모클래스이므로 자식인 Gujikja와 Company를 받을 수 있다.
		mbrList.add(lss_gu);
		mbrList.add(ejh_gu);
		mbrList.add(yks_gu);		
		mbrList.add(com1);		// 자식클래스인 com1, com2가 들어옴.
		mbrList.add(com2);

		
		///////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		
		Controller ctrl = new Controller();
		ctrl.startMenu(sc, mbrList);
		
		
		sc.close();
		System.out.println(">> 프로그램이 종료 되었습니다. <<");
		
	}

}
