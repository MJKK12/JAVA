package my.day15.a.polymorphism;

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
		
		Animal ani = new Animal();
		aniArr[3] = ani;
		
		
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
				
				if(aniArr[i] instanceof Dog) {		// i번째에 있는 것은 객체가 무엇인가? 
					// aniArr[i] 저장소에 들어있는 instance(객체)가 Dog라는 클래스로 만든 instance(객체)입니까?
					
					((Dog) aniArr[i]).run(); 				// Dog로 바꾸어준다.(강제형변환,Casting!) ▶ 그래야 .run이 나오게 됨.				
				}
				else if(aniArr[i] instanceof Cat) {		// i번째에 있는 것은 객체가 무엇인가? 
					// aniArr[i] 저장소에 들어있는 instance(객체)가 Dog라는 클래스로 만든 instance(객체)입니까?
					
					((Cat) aniArr[i]).jump(); 				// Dog로 바꾸어준다.(강제형변환,Casting!) ▶ 그래야 .run이 나오게 됨.				
				
			}
				else if(aniArr[i] instanceof Duck) {		// i번째에 있는 것은 객체가 무엇인가? 
					// aniArr[i] 저장소에 들어있는 instance(객체)가 Dog라는 클래스로 만든 instance(객체)입니까?
					
					((Duck) aniArr[i]).swim(); 				// Dog로 바꾸어준다.(강제형변환,Casting!) ▶ 그래야 .run이 나오게 됨.				
				
				}

			}
		
		}// end of for---------------------------------------------
		
	}// end of main---------------------------------------------

}
