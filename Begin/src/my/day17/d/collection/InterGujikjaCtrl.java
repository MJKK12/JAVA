package my.day17.d.collection;

import java.util.*;

public interface InterGujikjaCtrl extends InterController {
	// 접근제한자는 public으로 해야함. ▶ Private은 안됨.
	// method override를 가져옴. GujikjaCtrl에서.

	// == 구직자 메뉴를 보여주는 메소드 생성하기 == //
	public void showMenu(Scanner sc, List<Member> mbrList); 

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == //
	public void register(Scanner sc, List<Member> mbrList);
	
	// 관리자 전용 메뉴를 보여주는 메소드 생성하기 //
	public void showAdminMenu(Scanner sc, List<Member> mbrList);
	
	// 관리자를 제외한 모든 구직자 정보를 조회해주는 메소드 생성하기 //
	public void showAllGujikja_info(List<Member> mbrList);
	
	// 연령대및성별을 검색해주는 메소드 생성하기 //
	public void searchAgeLineGender(List<Member> mbrList, Scanner sc);
	
}
