package my.day16.f.userDefineException;

public class UserException_main {

	public static void main(String[] args) {

		Product[] prodArr = new Product[3];
		
		prodArr[0] = new Product();
		prodArr[0].setProdName("새우깡");
		prodArr[0].setJango(100);
				
		prodArr[1] = new Product();
		prodArr[1].setProdName("감자깡");
		prodArr[0].setJango(50);

		prodArr[2] = new Product();
		prodArr[2].setProdName("양파링");
		prodArr[2].setJango(150);

		for(Product prod : prodArr) {
			
			try {
				prod.order(80);		// 80개 주문
			} catch (JangolackException e) {	// 감자깡은 재고가 50개 뿐인데, order가 80개 들어와서 "오류"!! (재고가 없으니 주문할 수 없음.)
			//	e.printStackTrace();
				System.out.println("오류메시지 : " + e.getMessage() +"");	// 빨간글씨 오류가 아니라 sysout으로 처리하기 위함.!!
			} finally {
				prod.info();	// 제품명 & 잔고량 불러오기
			}
			
		}// end of for------------------------------

		System.out.println("\n==========================================\n");
		
		prodArr[0].setJango(100);
		prodArr[1].setJango(50);
		prodArr[2].setJango(150);

		for(Product prod : prodArr) {
			
			try {
				prod.jumun(80);		// 80개 주문
			} catch (JangolackException e) {	// 감자깡은 재고가 50개 뿐인데, order가 80개 들어와서 "오류"!! (재고가 없으니 주문할 수 없음.)
			//	e.printStackTrace();
				System.out.println("오류메시지 : " + e.getMessage() +"");	// 빨간글씨 오류가 아니라 sysout으로 처리하기 위함.!!
			} finally {
				prod.info();	// 제품명 & 잔고량 불러오기
			}
			
		}// end of for------------------------------
		
	}// end of main------------------------

}
