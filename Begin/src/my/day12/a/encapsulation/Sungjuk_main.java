package my.day12.a.encapsulation;

public class Sungjuk_main {

	public static void main(String[] args) {

		Sungjuk_noncapsule lee_sj = new Sungjuk_noncapsule();
		
		lee_sj.name = "이순신";
		
		if( lee_sj.isCheckJumsu(95) ) {
			lee_sj.kor = 95;
		}
		
		lee_sj.eng = 100;
		lee_sj.math = 80;
		
		lee_sj.showSungjuk();
		
		////////////////////////////////////////////////////////////
		
		System.out.println("\n~~~~~~ 캡슐화 한 것 ~~~~~~\n");
		
		Sungjuk_capsule eom_sj = new Sungjuk_capsule();
		
		eom_sj.setKor(200);		
		System.out.println(">> 국어점수 : " + eom_sj.getKor());				// .kor이 안나올 때, capsule 클래스에서 getkor 메소드를 만들어서 불러온다/
//		eom_sj.showSungjuk();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		eom_sj.setKor(95);		
		System.out.println(">> 국어점수 : " + eom_sj.getKor());				// .kor이 안나올 때, capsule 클래스에서 getkor 메소드를 만들어서 불러온다/
//		eom_sj.showSungjuk();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//		eom_sj.kor = -1232;
//		eom_sj.showSungjuk();
				
		System.out.println("\n############################################\n");  //▼ if 한 적이 없음에도, 호출만으로 class에서 다 하고 있는 것임. 개발자가 의도한바대로 들어와야 함.w
		
		Sungjuk_capsule[] sungjukArr = new Sungjuk_capsule[5];
/*		
		Sungjuk_capsule sj_1 = new Sungjuk_capsule();
		sj_1.setName("       ");				// name에 공백을 넣으면 안됨. 잘못된 것임 ▶ 이렇게 잘못 된 것은 데이터가 잘못되었기 때문에 sungJuk_capsule[] 배열에 들어가면 안됨
		sj_1.setKor(90);
		sj_1.setEng(80);
		sj_1.setMath(100);
		
		Sungjuk_capsule sj_2 = new Sungjuk_capsule();
		sj_2.setName("서강준");				
		sj_2.setKor(-300);					// ▶ 100점 초과한 300 점은 이렇게 잘못 된 것은 데이터가 잘못되었기 때문에 sungJuk_capsule[] 배열에 들어가면 안됨
		sj_2.setEng(80);
		sj_2.setMath(100);
*/		
		Sungjuk_capsule sj_3 = new Sungjuk_capsule();
		sj_3.setName("이순신");				// 모두 올바르게 정보가 들어감. sungJuk_capsule[] 배열에 들어갈 수 있다.
		sj_3.setKor(90);
		sj_3.setEng(80);
		sj_3.setMath(100);
		
		Sungjuk_ctrl ctrl = new Sungjuk_ctrl();
//		ctrl.saveSungjuk(sungjukArr, sj_1);				// sungjukArr에 sj_1를 넣어주고 싶다!! 	(들어갈 수 X - 조건 불충족)
//		ctrl.saveSungjuk(sungjukArr, sj_2);				// sungjukArr에 sj_2를 넣어주고 싶다!! 	(들어갈 수 X - 조건 불충족)		
		ctrl.saveSungjuk(sungjukArr, sj_3);				// sungjukArr에 sj_3를 넣어주고 싶다!! 	(들어갈 수 o - 조건 충족 ▷ 배열에 쑥 들어가서 저장 성공!!)
			
	}//end of main (String[] args)----------------------------

}
