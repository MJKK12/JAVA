package my.day16.b.Interface;

public class Circle implements Figure {

	// Circle 이라는 '클래스'는 Figure 라는 '인터페이스'를 반드시 implements(구현, 재정의) 해야 한다.
	
	@Override
	public double area(double x, double y) {
		return 0;
	}

	@Override
	public double circleArea(double r) {

		return r*r*PI;
	}

}
