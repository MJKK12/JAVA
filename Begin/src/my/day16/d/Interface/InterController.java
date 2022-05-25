package my.day16.d.Interface;

import java.util.Scanner;

public interface InterController {	// 목차 기능, 공통의 인터페이스를 구현해옴. 

	// == 메뉴를 보여주는 메소드 생성하기 == //
	void startMenu(Scanner sc, Member[] mbrArr);  //main 메소드 or 다른 클래스에서도 호출해야하기 때문에 public을 쓰는 것임. (상속을 안한다고 private를 쓰면 안됨)
		
	 // 구직자 또는 구인회사(return type▶멤버)로 로그인 처리를 해주는 메소드 생성하기 //
	Member login(Scanner sc, Member[] mbrArr);	// 미완성 메소드이므로 ;를 붙인다. Public abstract가 빠져있는 것. (protected는 사용 불가)
	
}
