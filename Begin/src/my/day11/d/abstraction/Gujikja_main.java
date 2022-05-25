package my.day11.d.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class Gujikja_main {

	public static void main(String[] args) {

		Gujikja[] guArr = new Gujikja[5];	// 메모리에 5개만 쓰겠다.
		
		Gujikja gu1 = new Gujikja();		// 기본 생성자
		gu1.userid = "eomjh";
		gu1.passwd = "qwEr1234$A";
		gu1.name = "엄정화";
		
	//	String jubun = null;		//==> false		// 문자열이지만 fsdf 이런거 입력하면 X, 숫자를 입력해야함. ▶ 맞는지 ""검사""를 해야함.
	//	String jubun = "951220";	//==> false		
	//	String jubun = "95122012";	//==> false
	//	String jubun = "9512401";  	//==> false
	//	String jubun = "9513201";   //==> false (13월은 없음) ▶ 정규표현식으로 해결.. 13월은 없는데 true라고 나옴. (좀 더 세밀하게 정규표현식을 작성해야함.▶ 구글 多)
	//	String jubun = "9512t01";	//==> false
	//	String jubun = "9512207";	//==> false (성별을 나타낼 때 7은 없음)
		
		String jubun = "9512202";	//==> true!! (7자리, 각자리 숫자 충족)
		
		boolean bool = MyUtil.isCheckJubun(jubun);			// return 타입은 boolean 타입.		
	//	System.out.println(bool);
		
		if(bool) {
			gu1.jubun = jubun;
			guArr[Gujikja.count++] = gu1;		// 배열 0번방에 들어감. 1명이 들어왔다.
			
												// 1개를 만들어 왔다.
		}// end of if------------------------
		
		Gujikja gu2 = new Gujikja();
	      gu2.userid = "leess";
	      gu2.passwd = "qwer1234$B";
	      gu2.name = "이순신";
	      gu2.jubun = "9710201";
	      
	      guArr[Gujikja.count++] = gu2;			// 배열 1번방에 들어감. 후위연산자.!!
	      
	      
	      
	      Gujikja gu3 = new Gujikja();
	      gu3.userid = "youks";
	      gu3.passwd = "qwer1234$C";
	      gu3.name = "유관순";
	      gu3.jubun = "8510202";
	      
	      guArr[Gujikja.count++] = gu3;			// 배열 2번방에 들어감. 2에 들어오고 1증가 = 3
	      
	      
	      //////////////////////////////////////////////////////////
	      GujikjaCtrl ctrl = new GujikjaCtrl();		// 구직자 Ctrl에 대한 인스턴스 만듦.
	      
	      Scanner sc = new Scanner(System.in);		// 객체의 메모리 주소만 넘겨주면 다 쓴다.
	     
	      String smenuNo = ""; 	// 지역변수라서 밖으로 뺐음 , "" 은 null 이 아님. 안전빵으로 ""를 쓴다. 
	      do {
			
	    	  System.out.println(" === 메인메뉴 === \n"
                      			 + "1.구직자 회원가입   2.구직자 모두 보기  3.검색   4.프로그램 종료 \n");
       
	    	  System.out.print("▷ 메뉴번호 선택 => "); 
	    	  smenuNo = sc.nextLine();				// menuNo가 어떤 타입인지 헷갈리지 않기 위해 s또는 str_(String)를 붙임
	    	  
	    	  switch (smenuNo) {
			case "1":	// 구직자 회원가입
					if(Gujikja.count < guArr.length) {			// 배열의 크기보다 생성되는 회원수가 더 적어야 함. (빈 방이 없다!)
						Gujikja gu = ctrl.register(sc, guArr);	// id 중복확인 때문에 guArr을 넘겼다.
						guArr[Gujikja.count++] = gu; 			// 객체의 메모리 주소만 넘겨주면 다 쓴다. return 받을 값을 배열에 넣어준다. 배열의 방번호는 가입한 사람 수 많큼.!! []번째 가입 했다.
						System.out.println(">> 회원가입 성공!! << \n");
					}
					
					else {	// 정원이 꽉 찼다면..
						System.out.println(">> [경고] 정원 "+guArr.length+"명이 다차서 더이상 회원가입은 불가합니다.!! <<");
					}
					
				break;
				
			case "2":	// 구직자 모두 보기
				ctrl.showAll(guArr);				// 저장된 사람만 보여줘야 함. (저장된 사람은 배열에 있음!)
				break;
				
			case "3":	// 검색메뉴를 보여주도록 호출
				searchMenu(sc, guArr, ctrl);						// searchMenu 메소드를 호출시켜 주겠다. main 메소드이기 내에 있기 때문에, main 메소드 밖에 있는 void searchMenu를 호출해온다.
				break;
													// 같은 클래스이기 때문에 guJikja_main.searchMenu(); 에서 guJikja_main은 생략해도 됨
			case "4":	// 프로그램 종료
				
				break;

			default:	// 메뉴번호에 없는 값 (기타)
				System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. <<");
				break;
				
			} // end of switch(key)---------------------------------------------
	    	  
	    	  
	      } while ( !("4".equals(smenuNo) ));		// "smenuNo".equals("4") 일 경우 nullPointerException 이 뜰 수 있음. ( 단, 초기치가 null 값 일때!!)
	      											// "4"를 입력하면 빠져나간다.!!
	      // end of do~while------------------------------------
	      
	      sc.close();	      
		
    	  System.out.println("\n~~~~ 프로그램 종료 ~~~~\n");
	      
	}// end of main(String[] args)------------------------

	////////////////////////////////////////////////////////////////
	
	static void searchMenu(Scanner sc, Gujikja[] guArr, GujikjaCtrl ctrl) {						// 위의 case 3 은 메인메소드가 있는 클래스 내에 있음. (static을 추가함으로써 메인메소드 내에 case 3 에서 빨간줄이 뜨지 않도록 함.)
																				// 위의 Gujikja[]를 받아와야, search메뉴 메소드에서 쓸 수 있다.
	  String sMenuNo = "";		
	  
	  do {
	  	  System.out.println(" === 검색메뉴 === \n"
	   			 + "1.연령대검색	2.성별검색	3.연령대및성별 검색		4.메인메뉴로 돌아가기 \n");
	
	  	  System.out.print("▷ 검색메뉴번호 선택 => "); 
		  sMenuNo = sc.nextLine();
	
		  switch (sMenuNo) {
			case "1":		// 연령대검색
				int ageline = 0;
				
				for(;;) {
					System.out.print("▷ 검색할 연령대[예: 20] => ");
					String sAgeline = sc.nextLine();	// "20" 또는 "30" // 숫자외에 문자를 입력했을 경우 경고 메세지를 보내야 한다.
				
						try {
							ageline = Integer.parseInt(sAgeline);
							break;
					} catch (NumberFormatException e) {				// 입력한 숫자가 맞지 않으면 경고를 보내주어야 한다.
						System.out.println(">> [경고] 숫자만 입력하세요!! <<\n");
					}	
				}// end of for---------------------------------

				ctrl.showByAgeline(guArr,ageline);					// 여기서 받아야만 호출이 되어 진다. // 넘겨주어야만 메인 메소드에 있는 배열guArr을 쓸 수 있기 때문에, 메인의 case 3에 넘겨준다. - 넘겨준것을 받는 과정 필요 ( static void searchMenu(Scanner sc, Gujikja[] guArr)
				
				break;

			case "2":		// 성별검색
				
				for(;;) {
					System.out.print("▷ 검색할 성별[남/여] => ");
					String gender = sc.nextLine();	// "남" 또는 "여" (O) "10" 또는 "똘똘이" (X) // ▶ 남,여라는 글자를 제외하고 다른 글자를 넣으면 안됨.!!
					
					if (!"남".equals(gender) && !"여".equals(gender)) {
						System.out.println(">> [경고] 남 또는 여 만 입력하세요.!! <<");			// 남 or 여만 찾겠다.
					}
					
					else {
						ctrl.showByGender(guArr,gender);
					
						break;						// 검색을 해주고 빠져나오겠다.
					}
					
				}// end of for---------------------------------
				
				break;

			case "3":		// 연령대및성별 검색			// 연령대(성별 무관에 나이대만 체크) , 성별(연령대 무시에 성별만 체크)

				String gender = "";
				
				for(;;) {

					try {
						System.out.print("▷ 검색할 연령대[예: 20] => ");
						String sAgeline = sc.nextLine();		// "20" 또는 "30" // 숫자외에 문자를 입력했을 경우 경고 메세지를 보내야 한다.
						ageline = Integer.parseInt(sAgeline);	// Spring을 int로 바꿔주는 것
						
					} catch (NumberFormatException e) {							// "강아지"를 입력하면 [경고] 창이 뜬다.
						System.out.println(">> [경고] 숫자만 입력하세요.!! <<");		// 남 or 여만 찾겠다.			
						continue;												// 위에 끝낸 후에, 바로 밑에 "검색할 성별" 문구가 뜨지 않도록 continue를 씀으로써 밑으로 떨어지지 않고 위로 올려보냄.
					}
					
					System.out.print("▷ 검색할 성별[남/여] => ");
					gender = sc.nextLine();			// "남" 또는 "여" (O) "10" 또는 "똘똘이" (X) // ▶ 남,여라는 글자를 제외하고 다른 글자를 넣으면 안됨.!!
				
					if (!"남".equals(gender) && !"여".equals(gender)) {
						System.out.println(">> [경고] 남 또는 여 만 입력하세요.!! <<");			// 남 or 여만 찾겠다.
					}
					
					else {
						break;
					}
					
				} // end of for--------------------------------------------
				
				// 특정 연령대에 속하는 특정 성별을 가지는 구직자들만 조회가 되도록 한다.
				ctrl.showByAgelineGender(guArr, ageline, gender);
				
				break;

			case "4":		// 메인메뉴로 돌아가기
				
				break;
	
			default:		// 메뉴에 없는 번호를 입력할 경우
				System.out.println(">> [경고] 검색메뉴에 없는 번호입니다. <<\n");
				break;
		} // end of switch()--------------------------------------------
		  
	  } while( !("4".equals(sMenuNo)) );					// 4번이라면 메소드가 끝난다. (종결). 끝나면 break; (위의 case3 참고)

	  
	}// end of void searchMenu()-----------------------------------------------
	
	
}
