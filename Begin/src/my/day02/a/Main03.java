package my.day02.a;

import my.util.MyUtil; // 다른패키지에 있으면 반 드 시 import를 한다!!!!

//=== static 메소드에 대해서 알아봅니다. ===
public class Main03 {

	public static void main(String[] args) {
		
		System.out.println("=== 여기는 Main03 클래스 입니다. ===");
		
		// 현재시각 출력
		// 한번만 만든 다음에 부른다 : static method
		MyUtil.currentTime();
	}

}
//내가 늘 쓰는것은 (my.util) 만들어놓고 불러다가 쓴다! static.★ 모두 공유 가능
