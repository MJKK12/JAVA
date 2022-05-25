package my.day05.b.If;

public class MemberMain {

	public static void main(String[] args) {
		// 각자 다른 메모리에 들어가기 때문에, 메모리 주소가 다름.
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.name = "이순신";
		mbr1.nickName = new String("장군");
		
		Member mbr2 = new Member();
		mbr2.id = "eomjh";
		mbr2.name = "엄정화";
		mbr2.nickName = new String("가수");
		
		Member mbr3 = new Member();
		mbr3.id = "leess";
		mbr3.name = "이순신";
		mbr3.nickName = new String("장군");
		
		if (mbr1 == mbr2) {
		// 인스턴스(객체) 와 인스턴스(객체) 를 비교(==) 할 때는 메모리상의 올라가 있는 인스턴스(객체)의 메모리 주소를 비교하는 것이다. 	
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2는 동일한 메모리 주소를 참조하고 있습니다.");
 		}
		else if(mbr1 == mbr3) {
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr3는 동일한 메모리 주소를 참조하고 있습니다.");
 		}
		else {
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2와 인스턴스 mbr3은 모두 다른 메모리 주소를 참조하고 있습니다.");
 		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String passwd_1 = new String("abcd");
		String passwd_2 = new String("abcd");
		
		if(passwd_1 == passwd_2) {
		// 인스턴스(객체) 와 인스턴스(객체) 를 비교(==) 할 때는 메모리상의 올라가 있는 인스턴스(객체)의 메모리 주소를 비교하는 것이다. 	
			
			System.out.println("passwd_1 과 passwd_2 는 동일한 메모리 주소를 참조하고 있습니다.");
		}
		else {
			System.out.println("passwd_1 과 passwd_2 는 서로 다른 메모리 주소를 참조하고 있습니다.");
 		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String passwd_3 = "abcd";			//여긴 new로 해오지 않았음. 저장된 값을 비교하는 것.!! (메모리 주소가 아니라!!)
		String passwd_4 = "abcd";
		
		if(passwd_3 == passwd_4) {
		// 이때의 passwd_3 == passwd_4 
		// 은 passwd_3 에 저장된 값("abcd")과 passwd_4 에 저장된 값("abcd")을 비교하는 것이다. (메모리 상의 주소를 비교하는 것이 아니라 값을 비교하는 것이다.)
			System.out.println("passwd_3 과 passwd_4 는 동일한 값을 가지고 있습니다.");
		}
		else {
			System.out.println("passwd_3 과 passwd_4 는 서로 다른 값을 가지고 있습니다.");
 		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		mbr1.showInfo();
		mbr2.showInfo();
		mbr3.showInfo();
		

		if(mbr1.name == mbr2.name) {
			System.out.println(mbr1.name + " 와 " + mbr2.name + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr2.name + " 은 같지 않습니다.");
 		}
		
 		if(mbr1.name == mbr3.name) { // 값을 비교하는 것이다. (.equals를 사용하면 값을 비교함.)
			System.out.println(mbr1.name + " 와 " + mbr3.name + " 은 같습니다.");
		}
 		else {
			System.out.println(mbr1.name + " 와 " + mbr3.name + " 은 같지 않습니다.");
 		}
 		
		if(mbr1.nickName == mbr2.nickName) {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName + " 은 같지 않습니다.");
		}
		
		if(mbr1.nickName == mbr3.nickName) { // 필드에 값을 넣을때, nickName은 new String으로 입력을 해서 넣었으므로, 메모리 상의 주소를 비교하는 것이다. (값을 비교하는 것이 X)
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName + " 은 같지 않습니다.");
		}
		
		System.out.println("\n~~~~~~ 문자열 값을 비교시 .equals() 메소드를 사용하자 ~~~~~~~\n");	//메모리 상의 주소가 아니라 값이 같냐 다르냐 알고 싶을 때, 위에거 쓰지 말고 .equals()를 사용하자 (헷갈리니까)
		
		if(mbr1.name.equals(mbr2.name)) {	// 이 자체가 new를 해오든 상관 없이, 문자열의 '값'을 비교하는 것이다.
			System.out.println(mbr1.name + " 와 " + mbr2.name + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr2.name + " 은 같지 않습니다.");
 		}
		
 		if(mbr1.name.equals(mbr3.name)) {	// 이 자체가 new를 해오든 상관 없이, 문자열의 '값'을 비교하는 것이다. 
			System.out.println(mbr1.name + " 와 " + mbr3.name + " 은 같습니다.");
		}
 		else {
			System.out.println(mbr1.name + " 와 " + mbr3.name + " 은 같지 않습니다.");
 		}
 		
		if(mbr1.nickName.equals(mbr2.nickName) ) {	// 이 자체가 new를 해오든 상관 없이, 문자열의 '값'을 비교하는 것이다.
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName + " 은 같지 않습니다.");
		}
		
		if(mbr1.nickName.equals(mbr3.nickName)) {	// 이 자체가 new를 해오든 상관 없이, 문자열의 '값'을 비교하는 것이다. 
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName + " 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName + " 은 같지 않습니다.");
		}
 		
	}
 
}
