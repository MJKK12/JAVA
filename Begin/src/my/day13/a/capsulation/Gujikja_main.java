package my.day13.a.capsulation;

import java.util.Scanner;

public class Gujikja_main {

	public static void main(String[] args) {
		
		Gujikja admin_gu = new Gujikja();
		admin_gu.setUserid("admin");
		admin_gu.setPasswd("qWer1234$");
		admin_gu.setName("관리자");
		admin_gu.setJubun("8805072");
		
		Gujikja lss_gu = new Gujikja();
		lss_gu.setUserid("leess");
		lss_gu.setPasswd("qWer1234$");
		lss_gu.setName("이순신");
		lss_gu.setJubun("9005072");
		
		Gujikja ejh_gu = new Gujikja();
		ejh_gu.setUserid("eomjh");
		ejh_gu.setPasswd("qWer1234$");
		ejh_gu.setName("엄정화");
		ejh_gu.setJubun("9805072");
		
		Gujikja yks_gu = new Gujikja();
		yks_gu.setUserid("you_ks");
		yks_gu.setPasswd("qWer1234$");
		yks_gu.setName("유관순");
		yks_gu.setJubun("9803012");
				
		Gujikja[] guArr = new Gujikja[5];		// 저장소를 []개 만큼 하겠다. []개 초과는 들어오지 못하므로 막아주어야 함.
	
		guArr[Gujikja.count++] = admin_gu;		
		guArr[Gujikja.count++] = lss_gu;
		guArr[Gujikja.count++] = ejh_gu;
		guArr[Gujikja.count++] = yks_gu;
		
		///////////////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		
		GujikjaCtrl ctrl = new GujikjaCtrl();		
		ctrl.showMenu(sc, guArr);				// 스캐너에 sc를 넘겨주자
	//	ctrl.register(sc, guArr);				// 저장을 sc, guArr에 한다.
		
		sc.close();								// 끝났으면 close 시키고 프로그램 종료.
		System.out.println(">> == 프로그램 종료 == <<");
	} // end of main(String[] args) {


}
