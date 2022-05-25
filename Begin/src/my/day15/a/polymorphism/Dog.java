package my.day15.a.polymorphism;

public class Dog extends Animal {
	// Animal이라는 instance를 만들지 않고, this.~~ 를 쓴다. (어차피 Animal은 부모클래스로서 Dog인 나는 상속받았기 때문에 이미 내꺼임. ▶ this 를 씀으로써 내꺼!로 하기.

	// Dog 만 가지는 field 를 정의 (추상화)
	private int weight;							// 몸무게는 양수에, 0보다 커야한다.!! ▶ getter setter 만들어서 써주기

	// Dog 만 가지는 method 를 정의 (추상화)			// - Main은 실행만 하기 때문에 Animal의 자식이 아니다. ▶Getter Setter 생성할때 접근제한자 public을 줌으로써 접근할 수 있도록 한다.
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	
	// === 메소드의 오버라이딩 (override) (메소드 재정의) === // 
	// 메소드 오버라이딩(메소드 재정의) 란?
	// ==> 부모클래스로 부터 상속받은 메소드를 내용물만 새롭게 바꾸어서 정의하는 것을 말한다. (재정의!!)
	// Animal 에서 준 method는 showInfo(), cry()임.
	// 메소드의 오버라이딩(override) 시 접근제한자는 부모클래스에서 주었던 접근제한자와 같거나 더 크게 허용하는 접근제한자만 가능하다. 
	//(ex: 부모클래스인 Animal 의 protected와 같던지 더 크게 허용하는 Public을 써야한다. ↔ Private 이나 Default는 안됨)
	//(protected를 줘도 괜찮지만, main에서 method를 써야 하기 때문에 대부분은 method의 오버라이딩이면 public을 준다. (main과 Dog는 부모-자식 관계도 아닌, 아무 관계도 아니기 때문이다!)
	// 반드시 겉모습은 똑같아야 하고, "내용물"만 바꾼다. (==재정의)
	// @Override 가 없이 cri()라는 메소드를 만들면, "재정의" 하는 것이 아니라, 그냥 새로 만드는 것임..(오버라이딩이 X)
	// @override 가 없어도, 껍데기인 cry()를 제대로 쓰면, method의 오버라이딩이 맞음. 오타를 검증하기 위해 @override가 필요한 것.
	@Override		// @로 되어진것을 "어노테이션" 이라고 부른다.
	public void cry() {			// Animal의 cry()와 껍데기가 생긴게 똑같음. Animal에 있는 cry를 쓰겠다. 
		
		System.out.println("강아지 "+this.getName()+"가 '멍멍' 하며 짖습니다.");				// 부모것을 호출하지 않고, 재정의(오버라이딩) 되어진 것을 호출함.		
		
	}

	@Override
	protected void showInfo() {
		super.showInfo();
		System.out.println("3. 체중 : "+weight+"Kg\n");			// 개,고양이,오리에서 공통항목인 성명, 생년에다가 & Dog만이 가지고 있는 weight 정보를 추가해주고 싶을 때, Override 사용!
		
	}
	
	public void run() {
		System.out.println("강아지 "+getName()+"가 빠르게 달립니다.");
	}
	
	
}
