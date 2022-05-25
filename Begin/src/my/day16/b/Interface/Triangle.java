package my.day16.b.Interface;

public class Triangle implements Figure {	// 삼각형

	// Triangle 이라는 '클래스'는 Figure 라는 '인터페이스'를 반드시 implements(구현, 재정의) 해야 한다.

	
	@Override
	public double area(double x, double y) {
		return x*y*0.5;
	}

	@Override
	public double circleArea(double r) {
		return 0;
	}

}
