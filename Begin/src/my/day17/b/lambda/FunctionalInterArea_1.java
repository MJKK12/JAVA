package my.day17.b.lambda;

@FunctionalInterface	// 함수형 인터페이스 , 1개의 메소드밖에 못쓴다!!★★★★★★ 여러개의 메소드에서 고를 필요가 없다. 하나밖에 못쓰기 때문.
public interface FunctionalInterArea_1 {

	void area(double x, double y, int type);		// 인터페이스는 ★오로지 딱 한개만의 추상메소드★로 이루어져야 한다.


}
