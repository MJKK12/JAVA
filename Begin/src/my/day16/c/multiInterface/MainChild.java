package my.day16.c.multiInterface;

public class MainChild {

	public static void main(String[] args) {

		Child cd1 = new Child();	// 모두 Child 것임.!!
		cd1.work();
		cd1.cook();
		cd1.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterChild inchild = new Child(); // 상속받은 work, cook && play는 자기 자신의 것 ▶ Interface로 많이 받음.
		inchild.work();
		inchild.cook();
		inchild.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterFather interfather = new Child();
		interfather.work();

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterMother intermother = new Child();
		intermother.cook();
		
		
		
	}

}
