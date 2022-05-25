package my.day15.b.abstractClass;

public class Cat extends Animal {

	// Cat 만 가지는 field 를 정의 (추상화)
	private String color;

	// Cat 만 가지는 method 를 정의 (추상화)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && color.trim().isEmpty())
			this.color = color;
	}
	@Override		// @로 되어진것을 "어노테이션" 이라고 부른다.
	public void cry() {			// Animal의 cry()와 껍데기가 생긴게 똑같음. Animal에 있는 cry를 쓰겠다. 
		
		System.out.println("고양이 "+this.getName()+"이 '야옹야옹' 하며 웁니다.");				// 부모것을 호출하지 않고, 재정의(오버라이딩) 되어진 것을 호출함.				
	}

	@Override							
	protected void showInfo() {			// 부모클래스에서 물려받은 showInfo를 재정의한다.!!
		System.out.println("=== 고양이 정보 ===\n"
				  +"1. 성명 : " +getName()+ "\n"			// 헷갈리면 ▶ super. // this.~~ 써도 된다.
				  +"2. 생년 : " +getBirthYear()+ "년 \n"
				  +"3. 피부색 : " +getColor()+ "\n");		// getColor() 또는 color 써도 가능
		}	

	@Override
	public void move() {
		System.out.println("고양이 "+getName()+"이 점프를 합니다.");
		
	}
	
	
}
