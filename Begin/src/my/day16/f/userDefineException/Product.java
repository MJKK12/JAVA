package my.day16.f.userDefineException;

public class Product {

	// field
	private String prodName;	// 제품명("새우깡", "감자깡", "양파링")
	private int    jango;		// 재고 (   100,		50, 	150 ) 

	// method
	 public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getJango() {
		return jango;
	}

	public void setJango(int jango) {
		this.jango = jango;
	}
	
	// 제품의 정보를 보여주는 메소드 생성
	 public void info() {
		String info = "1.제품명 : " + prodName + "\n"
					 +"2.잔고량 : " + jango + "개\n";
		
		System.out.println(info);
	 }
	
	// 주문을 받는 메소드 생성 1
	 void order(int jumunSu) throws JangolackException {	// 재고가 -개 일 수는 없다. ex. 새우깡이 -100개? (X)
	// order (int jumunSu) 은 파라미터로 들어오는 jumunSu의 값에 따라서
	// 사용자(개발자)가 만든 Exception을 유발할 수 있다는 말이다.

		 if(jango < jumunSu) {
			 // 잔고량이 주문량보다 부족할 시 JangolackException 을 유발시켜야(throws) 한다.
			 throw new JangolackException();
		 }
		 else {
			 jango -= jumunSu;	// 잔고는 주문량만큼 감해야한다.
			 System.out.println(""+prodName+" 제품을 " +jumunSu+" 개를 주문하셨습니다.");
		 }
		 
	 }
	 
	 // 주문을 받는 메소드 생성 2		
	 void jumun(int jumunSu) throws JangolackException {	// 재고가 -개 일 수는 없다. ex. 새우깡이 -100개? (X)
		// order (int jumunSu) 은 파라미터로 들어오는 jumunSu의 값에 따라서
		// 사용자(개발자)가 만든 Exception을 유발할 수 있다는 말이다.

		 if(jango < jumunSu) {
			 // 잔고량이 주문량보다 부족할 시 JangolackException 을 유발시켜야(throws) 한다.
			 throw new JangolackException(">> "+prodName+"은 잔고가 "+jango+"개 인데 주문량이 "+jumunSu+"개 라서 잔고 부족으로 인해 주문이 불가합니다. <<");
		 }
		 else {
			 jango -= jumunSu;	// 잔고는 주문량만큼 감해야한다.
			 System.out.println(""+prodName+" 제품을 " +jumunSu+" 개를 주문하셨습니다.");
		 }
		 
	 }


}
