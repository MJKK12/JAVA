package my.day16.c.multiInterface;

public interface InterChild extends InterFather, InterMother {		// Interface가 두 개의 인터페이스를 상속받음. (child가 엄마아빠 불러옴)
	// class는 다중상속이 불가하지만, Interface는 다중상속이 가능하다.
	// 자바는 인터페이스가 여러 인터페이스를 다중상속 하는 것이 가능하다.!!
	
	void play();

}
