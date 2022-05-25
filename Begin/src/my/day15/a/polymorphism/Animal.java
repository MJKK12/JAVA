package my.day15.a.polymorphism;
	/*
		   -------------------------------------------------------------------------------------------------------------------------
		   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
		   ------------------------------------------------------------------------------------------------------------------------- 
		   public                                    O                    O                         O                 O  
		   protected                                 O                    O                         O                 X
		   default                                   O                    O                         X                 X
		   private                                   O                    X                         X                 X
	 */

	public class Animal {
	
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
		
		
}
