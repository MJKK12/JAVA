package my.day14.a.inheritance;

import java.util.Scanner;

public class GujikjaCtrl {

	// == 구직자 메뉴를 보여주는 메소드 생성하기 == //
	public void showMenu(Scanner sc, Gujikja[] guArr) {
										
		String str_menuNo = "";				// ★변수를 선언하는 위치 중요
		Gujikja login_gu = null;			// do~while 안에서 선언을 하면, 로그인 성공 후에 while에 걸려서 login_gu에 null 값이 들어갈 수도 있으니, do 바깥으로 빼준것임.
		String str_add = "";				// 로그인 후에, "oo님 로그인중" 이라고 띄우고 싶음.
		String str_login_logout = "";
		String str_menuno_3 = "";
		String str_menuno_4 = "";
		
		do {			
			
			if(login_gu != null) {			// 로그인 한 경우 (null이 아님)
				str_add = "["+login_gu.getName()+"님 로그인 중...]";	
				str_login_logout = "로그아웃";
				str_menuno_3 = "   3. 내정보 보기";
				if("admin".equals(login_gu.getId())) {			// 로그인을 했는데 ,그 아이디가 admin 입니까?
					// 관리자로 로그인 한 경우
					str_menuno_4 = "\n4. 관리자전용";
				}
			}
			else {							// 로그인을 하지 않은 경우
				str_add = "";
				str_login_logout = "로그인";	// null 이기 때문에 기본값을 가지고 있음
				str_menuno_3 = "";
				str_menuno_4 = "";
			}
			
			System.out.println(" \n=== *** 구직자메뉴 "+str_add +"*** === \n"					// 로그인, 로그아웃에 따라 변하게 하기 위에 do while 및 위의 if else 추가함.
	  			  			 + "1. 구직자 회원가입   2. "+str_login_logout+ str_menuno_3 			// 로그인하면 로그아웃으로 바뀌고 로그아웃하면 로그인으로 바뀌어야함 ==> 변수처리(변하는 수!!)
	  			  			 + str_menuno_4+"\n");
	
			System.out.print("▷ 메뉴번호 선택 => "); 
			str_menuNo = sc.nextLine();					// 10번 종료할때까지 계속 돌아야함. (뺑글뺑글 계~속!!) ▶ 한 set.!!

			switch (str_menuNo) {						// 입력받은게 무엇인지 보기 위해 switch 문을 사용.
			case "1":		// 구직자 회원가입
				register(sc, guArr);					// sc에 받아온것 & 넣어주어야 할 배열을 넘겨줌.
				break;

			case "2":		// 로그인 또는 로그아웃
				if("로그인".equals(str_login_logout))	{				// 로그인이면 로그인 처리해주기
					
					login_gu = login(sc, guArr);					// login 이라는 메소드를 만든다 (자판친거 입력받기-sc) // 리턴타입을 구직자로 주어야지만 그 사람의 정보를 다 볼 수 있음.
					// 로그인이 성공하면, login_gu 이 null 이 아닌 값을 가진다. 
					// 로그인이 실패하면, login_gu 이 null 값을 가진다.
					
					if(login_gu != null) {
						System.out.println(">> 로그인 성공!! <<\n");
					}
					else {
						System.out.println(">> 로그인 실패!! <<\n");
					}
				
				}
				else { // 로그아웃 처리해주기
					login_gu = null;
				}
				
				break;

			case "3":					// 내정보 보기
				if(login_gu != null) {	// 로그인 한 경우
					
					System.out.println("\n==== "+login_gu.getName()+"님의 회원 정보 ====\n");
					login_gu.showInfo();
					
				System.out.println("내정보보기 입니다.");
				}
				else {					// 로그인을 하지 않은 경우
					System.out.println(">> [경고] 메뉴에 없는 번호 입니다. << \n");	
				}
				break;

			case "4":					// 관리자전용
				if(login_gu != null && "admin".equals(login_gu.getId())) {	// 로그인 한 경우 - null도 아니면서 admin이랑 id가 같은지?
					// 관리자로 로그인 한 경우
					showAdminMenu(sc, guArr);	// 관리자 메뉴를 보여달라. ▶ 밑에 메소드로 넘길 때, 구직자 정보를 넘겨주어야 함.
				}
				else {					// 로그인을 하지 않거나 관리자가 아닌 일반 구직자로 로그인 한 경우
					System.out.println(">> [경고] 메뉴에 없는 번호 입니다. << \n");	
				}
				break;

			default:		// 메뉴에 없는 번호를 선택할 경우
				System.out.println(">> [경고] 메뉴에 없는 번호 입니다. << \n");
				break;
				
			}// end of switch--------------------------
		
		} while (!("2".equals(str_menuNo) && "로그아웃".equals(str_login_logout)));			// ▶ () 안이 참이면 빠져나온다.
		
	}// end of public void showMenu(Scanner sc, Gujikja[] guArr)----------------
	
	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == // 
	private void register(Scanner sc, Gujikja[] guArr) {		// 다른곳에서 접근할 수 없도록 private 을 사용 (캡슐화)
		
		if(Gujikja.count < guArr.length) { 						// 들어가려면 방이 있어야 함..

			System.out.println("\n>> === 구직자 신규회원 가입 === <<");
			
			String userid = null;
			for(;;) {
				System.out.print("1. 아이디 : ");				// 아이디는 고유해야 한다.!!
				userid = sc.nextLine();		
				
				boolean isDuplicate = false;				// true 인데, 중복되었냐고 묻는 것.
				
				for(int i=0; i<Gujikja.count; i++) {
					String stored_userid = guArr[i].getId();			// 저장된 정보들(이미 가입된)이 있는 guArr[i]
					if(stored_userid.equals(userid)) {
						System.out.println(">> [경고] "+userid+"는 이미 사용중입니다. 다른 아이디를 입력하세요!! << \n");
						isDuplicate = true;									
						break;												// 이미 아이디가 사용중이면 확인할 필요 X, break;로 안쪽 for문 빠져나가서 다시 바깥쪽 for문의 1. 아이디 : 가 뜨도록 한다.
					}
				}// end of for--------------------------
				
				if(!isDuplicate)	// isduplicate가 false여야 !와 합쳐졌을때, true임. 그러므로 true일 때 빠져나간다는 뜻 (!false=true) ▶ 아이디가 중복되지 않았다면, 빠져나가라.
					break;			// [경고] 문구가 나온다음에 여기서 또 break;가 나오면 안됨.  //판단기준은 깃발올려/내려(boolean)
						
			}// end of for------------------------------
			
			
			System.out.print("2. 비밀번호 : ");
			String passwd = sc.nextLine();
			
			System.out.print("3. 성명 : ");
			String name = sc.nextLine();
			
			System.out.print("4. 주민번호7자리[예: 9510092] : ");
			String jubun = sc.nextLine();
			
			Gujikja gu = new Gujikja();
			gu.setId(userid);				// 개발자가 의도한대로 userid가 조건대로 들어와야 하는 것.
			gu.setPasswd(passwd);
			gu.setName(name);
			gu.setJubun(jubun);
			
			if(gu.isUseGujikja()) {				// 올바른지 아닌지 판별
				guArr[Gujikja.count++] = gu;	// 0번째 넣어주고 하나 더 증가해야함.			
				System.out.println(">> 회원가입 성공!! <<\n");
			}
			else {								// 배열에 안들어오는 경우. == 실패
				System.out.println(">> 회원가입 실패!! <<\n");	
			}
		
		} 
		
		else {
			System.out.println(">> [경고] 정원 "+guArr.length+"명이 다 차서 더이상 구직자 신규가입이 불가합니다. <<");
		}
		
	} // end of public void register(Scanner sc, Gujikja[] guArr)------------------
	
	// 로그인 처리해주는 메소드 생성하기 //
	private Gujikja login(Scanner sc, Gujikja[] guArr) {
		
		System.out.println("\n==== 로그인 하기 ==== \n");
		
		System.out.print("▷ 아이디 : ");						// 저장소(배열)에 가야 아이디,비밀번호를 볼 수 있음. // 아이디 중복을 방지해야함.
		String userid = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd= sc.nextLine();
		
		Gujikja login_gu = null;
		
		for(int i=0; i<Gujikja.count; i++) {
			String stored_userid = guArr[i].getId();	// 직접 못나오기 때문에 get을 가져온다
			String stored_passwd = guArr[i].getPasswd();
			
			if(stored_userid.equals(userid)&& stored_passwd.equals(passwd)) {
				login_gu = guArr[i];						// 배열요소에 넣어준다.
			}
			
		}// end of for------------------------
		
		return login_gu;

		
	}// end of private Gujikja login(Scanner sc)----------------------
	
	// == 관리자 전용 메뉴를 보여주는 메소드 생성하기 == // 
	private void showAdminMenu(Scanner sc, Gujikja[] guArr) {			// 위에 showAdminMenu에도 sc를 입력
		
		String str_menuNo = "";
		do {
			System.out.println("\n====== >> 관리자 전용 메뉴 << ======\n"
					+ "1. 모든구직자 정보 조회   2. 연령대및성별 검색    3. 구직자메뉴로 돌아가기");
			System.out.println("▷ 메뉴번호 선택 => ");			
			
			str_menuNo = sc.nextLine();
			
			switch (str_menuNo) {
				case "1":		// 모든 구직자 정보 조회
					showAllGujikja_info(guArr);
					break;
					
				case "2":		// 연령대및성별 검색
					searchAgeLineGender(guArr, sc);
					break;
					
				default:		// 메인메뉴로 돌아가기
					break;			
			} // end of switch (str_menuNo)----------------------
				
		} while (!("3".equals(str_menuNo)));
		
	}// end of private void showAdminMenu()------------------------------

	// == 관리자를 제외한 모든 구직자 정보를 조회해주는 메소드 생성하기 == // 
	private void showAllGujikja_info(Gujikja[] guArr) {					// 저장장소인 배열을 넘겨준다. () 것을 받아온다. admin으로 로그인을 해야지만 볼 수 있기 때문에(최소 admin은 가입되어 있음) 배열에 아무도 없을 수가 없다.
		
		if(Gujikja.count == 1) {
			// guArr 배열에 저장되어진 객체정보가 관리자(admin)만 저장된 경우
			System.out.println(">> 등록된 구직자가 아무도 없습니다. << \n");
		}
		else {
			// guArr 배열에 저장되어진 객체정보가 관리자(admin) 이외에 일반 구직자도 저장된 경우
			System.out.println("-------------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("-------------------------------------------------------------");

			for(int i=0; i<Gujikja.count; i++) {
				
				if( !"admin".equals(guArr[i].getId())) {
					guArr[i].viewInfo();
				}
				
			}// end of for------------------------------------
				
		}

		
	}// end of private void showAllGujikja_info(Gujikja[] guArr)----------------------
	
	// == 연령대및성별을 검색해주는 메소드 생성하기 == //
	private void searchAgeLineGender(Gujikja[] guArr, Scanner sc) {
		
		if(Gujikja.count == 1) {
			// guArr 배열에 저장되어진 객체정보가 관리자(admin)만 저장된 경우
			System.out.println(">> 등록되어진 구직자가 아무도 없습니다. << \n");
		}
		else {
			
			int ageline = 0;
			String gender = "";
			
			do {
				try {					
					System.out.println("▷ 검색하고자 하는 연령대 => ");	
					String str_ageline = sc.nextLine();
					
						ageline = Integer.parseInt(str_ageline);						// return 타입을 String에서 int로 바꿈
						
						if( 0 <= ageline && ageline <=100 ) 
							break;
						
						else 
							System.out.println(">> [경고] 올바른 연령대를 입력하세요!! <<\n");
						
						
					} catch (NumberFormatException e) {
						System.out.println(">> [경고] 연령대는 숫자만 입력하세요!! <<\n");
					}
					
				} while (true);
				// end of do~while------------------------------
				
				do {
					System.out.println("▷ 검색하고자 하는 성별[남/여] =>");	
					gender = sc.nextLine();
					
					if (!"남".equals(gender) && !"여".equals(gender) ) {					
							System.out.println(">> [경고] 성별은 남 또는 여 만 입력하세요!! <<");	// 문자열만 받아오기 때문에 try~catch가 없다.
					}
					else {
						break;
					}
				} while (true);
				// end of do~while------------------------------
				
				StringBuilder sb = new StringBuilder();				// 현재는 우리가 배열이 5개밖에 없지만, "많다는 전제 下에 , 차곡차곡 쌓아두려고 Builder를 사용한다"!!
				
				for(int i=0; i<Gujikja.count; i++) {
					
					if(!"admin".equals(guArr[i].getId())) {		//admin이 아니라면 검사를 한다.
						if(	guArr[i].getAge()/10*10 == ageline &&
								guArr[i].getGender().equals(gender) ) {
								sb.append(guArr[i].getInfo()+"\n");		// ▶ 이것들을 sb에 계속 쌓자!!							
						}
						
					}
					
				}// end of for----------------------------------
				
				if( sb.length() > 0 ) {							//append(쌓인) 되어진 갯수가 0보다 크다면 (최소한 한명은 있다면), 
					System.out.println("-------------------------------------------------------------");
					System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
					System.out.println("-------------------------------------------------------------");				
					System.out.println(sb.toString()); // 원래는 sb.toString으로 하는게 원칙인데, 빼도 됨. 그러나 헷갈리기 때문에 쓰는것을 추천				    
				}
				
				else {
					System.out.println(">> [경고] 검색하신 "+ageline+"대인 "+gender+"자는 없습니다. <<");
				}			
			}
	
	}// end of private void searchAgeLineGender(Gujikja[] guArr)--------------------------
	
	
}
