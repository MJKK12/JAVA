package my.day17.a.annonymousClass;

public class Annonymous_main {

	public static void main(String[] args) {

		System.out.println("\n===1. 일반 클래스 사용 시 ===");
		
		InterArea area1 = new Area();
		double areaSize1 = area1.area(10.5, 5.5);
		System.out.println("가로 10.5, 세로 5.5 인 면적은 : " + areaSize1);
		//가로 10.5, 세로 5.5 인 면적은 : 57.75

		InterArea area2 = new Area();
		double areaSize2 = area2.area(15.5, 25.5);
		System.out.println("가로 15.5, 세로 25.5 인 면적은 : " + areaSize2);
		//가로 15.5, 세로 25.5 인 면적은 : 395.25

		System.out.println("\n===2. 익명(== 무명, annonymous) 클래스 사용 시 ===");
	
	/*
        익명(무명) 클래스는 말 그대로 이름이 없는 클래스이다.
        인터페이스를 구현한 클래스가 특정한 한곳에서만 사용되고 ★다른 곳에서는 재사용되지 않는 경우★라면
        이럴 경우에는 굳이 클래스 파일로 만들 필요 없이 익명(무명) 클래스로 사용하면 된다.
  
        ★익명(무명) 클래스★의 ★객체는★ 반드시 ★부모 클래스를 상속받는 클래스★ 이거나 ★인터페이스를 구현한 클래스★여야 한다.
        왜냐하면 클래스의 이름은 없지만 저장받는 타입은 존재해야 하기 때문이다.
        그래서 익명(무명) 클래스의 객체는 ★부모 클래스 또는 인터페이스★로 받게 되어있다.   
            
        익명(무명) 클래스를 사용하는 가장 큰 목적은 
        부모 클래스를 상속받는 자식 클래스를 생성하지 않고도 객체를 만들어서 ★부모 클래스에 정의된 메소드를 재정의★ 할 수 있다는 것이다. 
        익명(무명) 클래스는 일반적으로 Graphic 프로그래밍(GUI 프로그래밍)을 할 때 리스너 인터페이스를 만들 때 주로 사용한다.
         
        익명(무명) 클래스는 추상클래스와 인터페이스로부터 만든다.    
		// 이름이 있는 class는 import 해와서 쓸 수 있다. 그러나 import할 필요 없고, main에서만 딱 쓰고 싶을 때, class를 만들 필요가 없고, 무명 클래스를 만들어서
		   new 해서.. 
		// 웹에서는 잘 안쓰임. . . 
	*/
		
		InterArea areaObj = new InterArea() {			// {} 정의와 동시에 객체를 만듦. == 익명클래스

			@Override
			public double area(double x, double y) {	// 재정의된 메소드.!!
				return x*y;
			}
		};
		
		double areaSize3 = areaObj.area(10.5, 5.5);
		System.out.println("가로 10.5, 세로 5.5 인 면적은 : " + areaSize3);
		//가로 10.5, 세로 10.5 인 면적은 : 57.75

		
		
	}// end of main(String[] args)-------------------------

}
