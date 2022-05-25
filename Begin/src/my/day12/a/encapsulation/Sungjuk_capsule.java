package my.day12.a.encapsulation;

public class Sungjuk_capsule {
	
/*
   -------------------------------------------------------------------------------------------------------------------------
   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
   ------------------------------------------------------------------------------------------------------------------------- 
   public                                    O                    O                         O                 O  
   protected                                 O                    O                         O                 X
   default                                   O                    O                         X                 X
   private                                   O                    X                         X                 X
*/

	private String name;			// 아무것도 쓰지 않게되면 defalut 값임.
	private int kor = -1;			// 웹 같은곳에서 클래스 만들때 전부 private 임. "개발자가 의도한 대로만 넣어야 한다." 메소드를 통해서만.!!
	private int eng = -1;			// 점수를 잘못넣어서 0점인지, 제대로 넣어서 0점인지를 파악할 수가 없음. ▶ dafault를 -1로 설정한다.
	private int math = -1;			// Private 으로 필드를 다 막아버리고 있음. (은닉화). 필드를 private 안하면 밖에서 막 치고 들어옴.
									// private 으로 필드 해놓은 다음에, public으로 메소드 만들고 if 넣음. 이것을 제어하는 컨트롤로 또 만들어서 어떻게 하라고 하는 개념. 
	static int count;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if(name == null || name.trim().isEmpty()) {		// null 이든지 텅 비어있다.
			System.out.println(">> [경고] 입력하신 성명이 null 또는 공백만으로 이루어지면 안되며, 성명은 null 로 되어집니다. <<\n");
		
		}
		
		else {
			this.name = name;			
		}
		
	}
	
	public int getKor() {					// 게터라고 부름
		return kor;
	}
	
	public void setKor(int kor) {			// 세터라고 부름
		
		if ( 0 <= kor && kor <= 100 ) {
			this.kor = kor;
		}		
		
		else {
			System.out.println(">> [경고] 입력하신 국어점수 "+kor+" 은  0 이상 100 이하가 아니므로 국어점수는 -1 로 되어집니다. <<\n");
		}
	}

	
	public boolean isPass() {
		
		if ( name == null || kor == -1 || eng == -1 || math == -1 )	// 네개 중에 한개라도 dafault 값이라면, 
			return false;
		
		else 
			return true;
		
	}

	public void showSungjuk() {						// 메소드를 public으로!
		System.out.println("1. 성명 : " +name+ "\n"
						  + "2. 국어 : " +kor+ "\n" 
						  + "3. 영어 : " +eng+ "\n"
						  + "4. 수학 : " +math+ "\n");
	} // end of void shoSungjuk()----------------------


	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		
		if ( 0 <= eng && eng <= 100 ) {
			this.eng = eng;
		}		
		else {
			System.out.println(">> [경고] 입력하신 영어점수 "+eng+" 은 0 이상 100 이하가 아니므로 영어점수는 -1 로 되어집니다. <<\n");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if ( 0 <= math && math <= 100 ) {
			this.math = math;
		}		
		else {
			System.out.println(">> [경고] 입력하신 수학점수 "+math+" 은 0 이상 100 이하가 아니므로 수학점수는 -1 로 되어집니다. <<\n");
		}
	}	
 
	
}

