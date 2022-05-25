package my.day08.c.array;

public class Member {			// 멤버 3명만 저장하려고 함.

	// field
	String id;
	String passwd;
	String name;	
	int point;
	
	static int count=2; //static변수는 바로 클래스명.count 쓴다. (뒤에 MemberMain에서 쓰임)
	
	// method
	// 특정사용자의 개인정보를 보여주도록 하는 메소드	
	public String showMyInfo() {
		return "1. 아이디 :"+id+" \n"
			 + "2. 비밀번호 : "+passwd+" \n"
			 + "3. 성명 : "+name+" \n"
			 + "4. 포인트 : "+point+" \n"; 
	}

	// 모든사용자의 비밀번호를 제외한 개인정보를 보여주도록 하는 메소드
	public String showInfo() {			// 모든사람들이 다 볼꺼니까 ()안에 파라미터가 필요 없다. 리턴타입은 관계가 없고, 파라미터의 종류와 개수가 같아지면 메소드가 중복되는것이다. 이름은 똑같지만 다른 메소드임.
		return id+"\t"+name+"\t"+point;
	}
	
}
