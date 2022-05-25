package my.day16.d.Interface;

import java.util.Scanner;

public interface InterGujikjaCtrl extends InterController {
	// 접근제한자는 public으로 해야함. ▶ Private은 안됨.
	// method override를 가져옴. GujikjaCtrl에서.

	// == 구직자 메뉴를 보여주는 메소드 생성하기 == //
	public void showMenu(Scanner sc, Member[] mbrArr); 

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == //
	public void register(Scanner sc, Member[] mbrArr);
	
	// 관리자 전용 메뉴를 보여주는 메소드 생성하기 //
	public void showAdminMenu(Scanner sc, Member[] mbrArr);
	
	// 관리자를 제외한 모든 구직자 정보를 조회해주는 메소드 생성하기 //
	public void showAllGujikja_info(Member[] mbrArr);
	
	// 연령대및성별을 검색해주는 메소드 생성하기 //
	public void searchAgeLineGender(Member[] mbrArr, Scanner sc);
	
}
