package my.day16.d.Interface;

import java.util.Scanner;

public interface InterCompanyCtrl extends InterController {
	// 접근제한자는 public으로 해야함. ▶ Private은 안됨.
	// method override를 가져옴. CompanyCtrl에서.
	
	// == 구인회사 메뉴를 보여주는 메소드 생성하기 == //
	public void showMenu(Scanner sc, Member[] mbrArr);
	
	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == //
	public void register(Scanner sc, Member[] mbrArr);
	
	// 관리자전용 메소드 생성하기 //
	public void showAdminMenu(Scanner sc, Member[] mbrArr);
	
	// 모든 구인회사 정보조회 해주는 메소드 생성하기 //
	public void showAllCompany_info(Member[] mbrArr);
	
	// 구인회사 업종별 검색 해주는 메소드 생성하기 //
	public void searchJobtype(Member[] mbrArr, Scanner sc);
	
}
