package my.day18.b.generic;

public class Employee_Child_Executive extends Employee {
	// 임원(Executive) 화면
	
	String cardNo; // 법인카드번호

	public Employee_Child_Executive() {}	// 기본생성자일 뿐임.!!
	
	public Employee_Child_Executive(String userid, String passwd, String name, String jik, String cardNo) {
		super(userid, passwd, name, jik);	// 부모클래스에서 만든 파라미터에 있는 생성자 ▶ 호출해옴.!
		this.cardNo = cardNo;
	}
	
	@Override
	public String toString () {
		
		return "== 임직원 ==\n" +
				super.toString()+
				"5.법인카드번호:"+cardNo+"\n";
	}
	
}
