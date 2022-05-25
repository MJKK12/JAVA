package my.day15.b.abstractClass;
	/*
		   -------------------------------------------------------------------------------------------------------------------------
		   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
		   ------------------------------------------------------------------------------------------------------------------------- 
		   public                                    O                    O                         O                 O  
		   protected                                 O                    O                         O                 X
		   default                                   O                    O                         X                 X
		   private                                   O                    X                         X                 X
	 */

//	abstract public class Animal {	// 미완성 클래스 (==추상 클래스, abstract class)
//	또는
	public abstract class Animal {	// 미완성 클래스 (==추상 클래스, abstract class)

/*
    미완성 메소드(== 추상메소드, abstract method)가 있는 클래스는 
    반드시 미완성 클래스(== 추상 클래스, abstract class)로 만들어야 한다.  
    왜 미완성 메소드(== 추상메소드, abstract method)를 만들까요?
    왜냐하면 자식클래스에서 메소드를 오버라이딩(==재정의)를 하기 때문에 
    부모클래스에서는 메소드를 정의할 필요가 없으므로 미완성 메소드로 만들어 버린다.
    
    일반적으로 부모클래스를 미완성 클래스(== 추상 클래스, abstract class)로 만든다.
    
    미완성 클래스(== 추상 클래스, abstract class)를 사용하여 객체(인스턴스)를 생성할 수 없다.    // **추상 메소드는 강제화이다.       
 */
		
		// Dog, Cat, Duck 의 공통 field (추상화)
		private String name; 
		private int birthYear;			// ▼ getter, setter는 private인 상태일 때, 다른데서 끌어다 쓸 수 있도록 하기 위해 생성하는 것을 뜻함.

		// Dog, Cat, Duck 의 공통 method(기능) (추상화)
		protected String getName() {
			return name;
		}
		
		protected void setName(String name) {
			if(name != null && !name.trim().isEmpty())
				this.name = name;
		}
		
		protected int getBirthYear() {
			return birthYear;
		}
		
		protected void setBirthYear(int birthYear) {
			if(birthYear > 0)							// 출생년도가 0보다 클때만 넣어주겠다.
				this.birthYear = birthYear;
		}
		
		// ==== 동물들(강아지, 고양이, 오리)의 정보를 출력해주는 메소드 ==== //
		protected void showInfo() {			// 자식만 허용해 주겠다.
			
			System.out.println("=== 동물정보 ===\n"
							  +"1. 성명 : " +name+ "\n"
							  +"2. 생년 : " +birthYear+ "년");
		}// end of protected void showInfo()------------------------------

		protected void cry() {
			System.out.println(">>> 동물들이 소리를 냅니다. <<<");
		}
		
		//////////////////////////////////////////////////////////////////
		
	//	abstract public void move();	// 미완성 method 이다.(== 추상 메소드, abstract method) ↔ 객체지향에서의 추상화와는 다른 것. (필요한 것만 뽑아온다)// move에 대한 재정의 필요
	//	또는	
		public abstract void move();	// 미완성 method 이다.(== 추상 메소드, abstract method) : (); 뒤에 {}가 없기 때문에 미완성 class임, 아예 main class에서 abstract을 붙임으로써 전체를 미완성으로 만듦.
	// 	너네 메소드 이름을 move로 만들어! <<강제화>>	
		
}
