package my.day12.a.encapsulation;

public class Sungjuk_ctrl {

	public void saveSungjuk(Sungjuk_capsule[] sungjukArr, Sungjuk_capsule sj) {			// Sungjuk_capsule[] sungjukArr 라는 저장소를 받아옴. & Sungjuk_capsule sj 저장해야할 성적을 받아옴
		
		if ( sj.isPass() ) {				// return 타입이 boolean 타입		
			sungjukArr[Sungjuk_capsule.count++] = sj;			// 0번째에 sj를 넣어주겠다. 그러나 그 sj가 조건을 충족해야 배열에 넣을 수 있음. 그렇기 때문에 그 조건을 충족하는지 검사해야함. (체크할 메소드를 capsule에 만든다.)
			System.out.println(">> 저장 성공 !! <<\n");
		}
		
		else {
			System.out.println(">> 저장 실패 !! <<\n");
		}
		
	}
	
}
