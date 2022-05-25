package my.day18.c.generic;

public class Employee_Child_Plain_Child extends Employee_Child_Plain{
	
	int month; // 계약기간개월수

	public Employee_Child_Plain_Child() {}	// 기본생성자일 뿐임.!!
	
	public Employee_Child_Plain_Child(String userid, String passwd, String name, String jik, int salary, int month) {
		super(userid, passwd, name, jik, salary);	// 부모클래스에서 만든 파라미터에 있는 생성자 ▶ 호출해옴.!
		this.month = month;
	}
	
	@Override
	public String toString () {
		
		return "== 일반 직원 ==\n" +
				super.toString()+
				"6.계약개월수:"+month+"개월\n";
	}
}
