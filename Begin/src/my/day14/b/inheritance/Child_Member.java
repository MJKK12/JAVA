package my.day14.b.inheritance;

import my.day14.a.inheritance.Member;

public class Child_Member extends Member {	 // 부모클래스가 있음.		// 자식클래스라고 하더라고 해당 부모클래스에서 default 값으로 설정되어 있으면 자식클래스에 뜨지 않음.
																	// 패키지 & 클래스에 따라 .. ▶ 일반적으로 protected를 쓴다.
	void showInfo() {
		System.out.println("ID : " + this.getId());		// 세개 모두 쓸 수 있는 방식임.
		System.out.println("ID : " + super.getId());
		System.out.println("ID : " + getId());
	}
	
}
