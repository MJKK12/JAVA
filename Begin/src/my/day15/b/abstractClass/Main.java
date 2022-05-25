package my.day15.b.abstractClass;

public class Main {
		
	public static void main(String[] args) {

		// >>> 다형성(Polymorphism) <<< 
		// ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
		// ★★★★★★★★ 자식클래스로 생성되어진 객체(new Dog();)를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다. ★★★★★★★★ (암기)!!

		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog();
	//	Animal ani1 = new Dog();	// 가능
	//	aniArr[0] = new Dog();
		dog.setName("뽀삐");			// 생성된 인스턴스에 필드를 넣자.
		dog.setBirthYear(2010);
		dog.setWeight(5);
		aniArr[0] = dog;
		
		Cat cat = new Cat();
	//	Animal ani2 = new Cat();	// 가능
	//	aniArr[0] = new Cat();
		cat.setName("톰");			// 생성된 인스턴스에 필드를 넣자.
		cat.setBirthYear(2017);
		cat.setColor("검정");
		aniArr[1] = cat;
					
		Duck duck = new Duck();
	//	Animal ani3 = new Duck();	// 가능
	//	aniArr[0] = new Duck();
		duck.setName("도널드");		// 생성된 인스턴스에 필드를 넣자.
		duck.setBirthYear(2018);
		duck.setPrice(5000);
		aniArr[2] = duck;
		
//		Animal ani = new Animal();	
		// Animal은 미완성 클래스(추상 클래스, abstract class) 이므로 객체생성(인스턴스화)이 불가하다.
	
//		Animal ani2 = new Animal();		
		// 그러나 자식클래스가 일반클래스(기본클래스)라면 자식클래스로 생성된 객체는 부모클래스가 미완성 클래스 이더라도
		// 자식클래스 객체를 받을 수 있다.
		// 그래서 일반적으로 미완성 클래스(추상 클래스, abstract class)의 용도는 자식클래스들의 저장소 역할을 한다.

		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null) {				// 0번째에 Dog, 1번째에 Cat, 2번째에 Duck 들어옴
				aniArr[i].showInfo();
			}
		}// end of for---------------------------------------------
							
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null) {				// 0번째에 Dog, 1번째에 Cat, 2번째에 Duck 들어옴
				aniArr[i].cry();				// 그러나 개,고양이,오리가 똑같은 소리를 낼 수 없음 ▶ 메소드를 재정의 하자.(재건축.!!)
			}
		}// end of for---------------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null) {					// 0번째에 Dog, 1번째에 Cat, 2번째에 Duck 들어옴
				aniArr[i].move(); 					// Abstract method (로고위에 A라고 작게 뜸)	, 부모클래스에서 미완성 method를 가져온다. (이름은 move로 하되, 알맹이는 맘대로 해라- 강아지/고양이/오리 각각!!)
			}
		
		}// end of for---------------------------------------------
		
	}// end of main---------------------------------------------

}
