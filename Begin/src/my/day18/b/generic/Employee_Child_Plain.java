package my.day18.b.generic;

public class Employee_Child_Plain extends Employee{
	
	int salary; // 연봉

	public Employee_Child_Plain() {}	// 기본생성자일 뿐임.!!
	
	public Employee_Child_Plain(String userid, String passwd, String name, String jik, int salary) {
		super(userid, passwd, name, jik);	// 부모클래스에서 만든 파라미터에 있는 생성자 ▶ 호출해옴.!
		this.salary = salary;
	}
	
	@Override
	public String toString () {
		
		return "== 일반 직원 ==\n" +
				super.toString()+
				"5.연봉:"+salary+"만원\n";
	}
}
