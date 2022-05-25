package my.day16.b.Interface;

public class Rectangle implements Figure {	// 사각형

	// Rectangle 이라는 '클래스'는 Figure 라는 '인터페이스'를 반드시 implements(구현, 재정의) 해야 한다.
	
	@Override
	public double area(double x, double y) {

		return x*y;
	}

	@Override		// 내가 쓰지 않더라도 빈 껍데기는 꼭 만들어놔야함. (사각형이 원의 면적이 필요하지 않고, 안쓸지라도!)
	public double circleArea(double r) {

		return 0;
	}	
	
}
