package my.day18.b.generic;

import java.util.*;


// === 타입에 제한이 있는 제네릭(Generic) 클래스 === //

public class Box_Employee<T extends Employee> { // 클래스명 다음에 제네릭 타입 T extends Employee를 선언한다.	
											    // 제네릭(<>) 타입 T extends Employee의 뜻은 Box_Employee 클래스에서 선언되는 필드 타입과 메소드의 파라미터 및 리턴타입에서 
											    // 사용되는 제네릭 타입은 Employee 클래스를 포함한 Employee 자식 클래스까지만 타입으로 들어올 수 있다는 것이다.(Box_Employee은 저장소 역할) (어떤 것이든 다 OK!!)
	
	private List<T> list = new ArrayList<>();	// new ArrayList<T>라고 적어도 되지만, 앞에서 이미 사용됐기 때문에 사용안해도 무관!

	public List<T> getList() {
		return list;
	}

	public void register(T item) {
		list.add(item);
	}
	
	
	
	
}
