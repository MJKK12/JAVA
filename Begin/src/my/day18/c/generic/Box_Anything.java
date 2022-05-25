package my.day18.c.generic;

import java.util.*;

// === 타입에 제한이 없는 제네릭(Generic) 클래스 === //


public class Box_Anything<T> { // 클래스 이름 다음에 제네릭 타입 T를 선언한다.	//<T> 는 보통 type으로, 어떤 type이든지 다 받겠다 라는 뜻!!
							   // T는 관습상 type 이라는 뜻으로 쓴 것으로서 T 대신에 아무 글자가 와도 괜찮다.
							   // 제네릭(<>) 타입 T의 뜻은 Box_Anything 클래스에서 선언되는 필드 타입과 메소드의 파라미터 및 리턴타입에서 
							   // 어떤 클래스라도 타입으로 들어올 수 있다는 것이다.(Box_Anything은 저장소 역할) (어떤 것이든 다 OK!!)
	
	private List<T> list = new ArrayList<>();	// new ArrayList<T>라고 적어도 되지만, 앞에서 이미 사용됐기 때문에 사용안해도 무관!

	public List<T> getList() {
		return list;
	}

	public void register(T item) {
		list.add(item);
	}
	
	
	
	
}
