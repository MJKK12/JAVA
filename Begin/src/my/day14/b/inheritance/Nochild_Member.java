package my.day14.b.inheritance;

import my.day14.a.inheritance.Member;

public class Nochild_Member { // 부모클래스가 없음.

	Member mbr = new Member();
	
/*	System.out.println("ID : " + this.getId());		// package my.day14.a.inheritance; 의 Member 클래스에서 public으로 바꿔줘야 비로소 쓸 수 있음.
	System.out.println("ID : " + super.getId());	// ▶ Member class를 public으로 바꾼 후, import를 해줘야함. 그러기 위해 Member객체를 만든다.
	System.out.println("ID : " + mbr.getId());		// 그러나 Member 클래스에서 접근제한자를 private으로 하면 객체만들어도 백날 안된다!!
*/	
}
