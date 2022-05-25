package my.day17.d.collection;

import java.util.List;
import java.util.Scanner;

public class Controller implements InterController {	// 어떠한 interface를 구현해온 클래스. ▶ 접근제한자는 무조건 public이다!!
	
	// == 메뉴를 보여주는 메소드 생성하기 == //
	@Override	// InterController(인터페이스)에 정의되어 있던 미완성 메소드(추상메소드)를 재정의해왔다는 것이다.
	public final void startMenu(Scanner sc, List<Member> mbrList) { //main 메소드 or 다른 클래스에서도 호출해야하기 때문에 public을 쓰는 것임. (상속을 안한다고 private를 쓰면 안됨)
		// 접근제한자 다음에 final을 붙이면 해당 메소드는 자식 클래스에서 override(재정의)가 불가하다.

		GujikjaCtrl guCtrl = new GujikjaCtrl();
		CompanyCtrl comCtrl = new CompanyCtrl();
		
		
		String str_choice = "";
		
		do {
			System.out.println("\n==== >> 시작메뉴 << ====\n"
					         + "A.구직자 메뉴로 가기    B.구인회사 메뉴로 가기\n"
					         + "C.프로그램 종료");
			System.out.print("▷ 메뉴번호 선택 => ");
			
			str_choice = sc.nextLine();  // "A"  "a"
			
			switch (str_choice.toUpperCase()) { // "A"
				case "A":  // 구직자 메뉴로 가기
					guCtrl.showMenu(sc, mbrList);
					break;
		
				case "B":  // 구인회사 메뉴로 가기
					comCtrl.showMenu(sc, mbrList);
					break;
					
				case "C":  // 프로그램 종료
					
					break;	
					
				default:
					System.out.println(">> [경고] 메뉴에 없는 것을 선택하셨습니다. << \n");
					break;
			}// end of switch (str_choice)-------------
		
		} while( !("C".equals(str_choice.toUpperCase())) );
		
	}// end of public void startMenu(Scanner sc)----------------------------
	
	 // 구직자 또는 구인회사(return type▶멤버)로 로그인 처리를 해주는 메소드 생성하기 //
	@Override	// 혼자서 독단적으로 만들지 않았다는 것을 표현하기 위해 오버라이딩 해왔다는 것을 명시함.
	public final Member login(Scanner sc, List<Member> mbrList) {	//private가 아니라, protected를 씀으로써 내 자식도 쓸 수 있게 해준다.
		// 접근제한자 다음에 final을 붙이면 해당 메소드는 자식 클래스에서 override(재정의)가 불가하다.
		// 메소드 내용을 바꿔야 하지, 이름을 바꾸면 새로운 메소드가 됨...(이름을 바꾸면 재정의가 아니게됨.)

		System.out.println("\n==== 로그인 하기 ====");
		
		System.out.print("▷ 아이디: ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호: ");
		String passwd = sc.nextLine();
		
		Member login_mbr = null;
		
		for(int i=0; i<mbrList.size(); i++) {	//mbrList.get(i) 리스트에서 끄집어 옴
			String stored_userid = mbrList.get(i).getId();
			String stored_passwd = mbrList.get(i).getPasswd();
			
			if( stored_userid.equals(id) && stored_passwd.equals(passwd) ) {
				login_mbr = mbrList.get(i);
			}
			
		}// end of for------------------------
		
		return login_mbr;
		
	}// end of private Member login(Scanner sc, List<Member> mbrList)-------------------------
	
}
