package my.day05.f.For;

import java.util.Scanner;

import my.util.MyUtil;

import my.util.MyUtil;
import my.util.MyUtil;

public class MemberMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 회원가입 하기 (유효성 검사) ===\n");
		String userid = "";
		for(;;) {
			System.out.print("1. 아이디 => ");
			userid = sc.nextLine();
			if(userid.length() == 0) {
				System.out.println(">> [경고] 아이디는 필수 입력사항 입니다. <<  \n");
			}
			else {
				break;
			}		
	} //end of for ------------- (유효성 검사)

		String passwd = "";
		for(;;) {
			System.out.print("2. 암호 => ");
			passwd = sc.nextLine();
	
			if(!MyUtil.isCheckPasswd(passwd)) {				// !는 not을 뜻함. 맨 뒤에 == false 보다는 맨 앞에 ! 를 쓰는 것이 더 편하다.
				System.out.println(">> [경고] 암호는 8글자 이상 15글자 이하의 대문자, 소문자, 숫자, 특수문자가 혼합되어져야만 통과한다. <<  \n");
			}
			else {
				break;
			}
		}	// end of for(;;)

		
		// (통과가 될때까지 계속 뺑글뺑글 돌아가고, 그 이후에 성명을 물어볼 것이다.)
		System.out.println();
		
		String name = "";
		for(;;) {
			System.out.print("3. 성명 => ");
			name = sc.nextLine();
			if(name.length() == 0) {
				System.out.println(">> [경고] 성명은 필수 입력사항 입니다. <<  \n");
			}
			else {
				break;
			}
	}
		
		Member mbr = new Member();
		mbr.userid = userid;
		mbr.passwd = passwd;			// 지역변수를 가져온다.
		mbr.name = name;
		
		mbr.showInfo();		//인스턴스 메소드 ==> 해당 mbr의 정보를 보여라.
		
		
		
		
		sc.close();
	}

}
