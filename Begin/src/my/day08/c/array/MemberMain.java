package my.day08.c.array;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain {

	public static void main(String[] args) {

	/*
		Member mbr1 = new Member();	// 회원 한명만 들어옴
		Member mbr2 = new Member(); // 2명째
		Member mbr3 = new Member(); // 3명째
		Member mbr4 = new Member();
	*/
		Member[] mbrArr = new Member[4]; //메모리에 [n]개 올린다. 위에 줄줄 나열할 필요 없이 배열을 사용. 배열도 객체이다.
	
	
		/*for(int i=0; i<mbrArr.length; i++) {	 //배열이 int 타입이라면, 초기치가 0. char라면 공백. double이라면 0.0, String 이라면 null.
			System.out.println(mbrArr[i]);
		}
	*/		
		/*
			null ▶ 이 자리에 이순신
			null ▶ 엄정화
			null ▶ 그외 1사람
			null
		*/

		Member mbr1 = new Member();	// 회원 한명만 들어옴
		mbr1.id = "leess";
		mbr1.passwd = "qwer1234%";
		mbr1.name = "이순신";
		
				
		Member mbr2 = new Member(); // 2명째
		mbr2.id = "eomjh";
		mbr2.passwd = "qwer1234@";
		mbr2.name = "엄정화";
		
		mbrArr[0] = mbr1;
		mbrArr[1] = mbr2;
		
		
		Scanner sc = new Scanner(System.in);
		int menuNo =0;
		
		Member loginMbr = null; // null 이라면 로그인을 안한상태임. 객체를 없애야 로그아웃이 되는 것임.
		
		
		do {																		// do~while문 후 속한 것들 들여쓰기 필수
			
			//String loginMsg = (loginMbr != null)?"["+loginMbr.name+"님 로그인중]":"";	// null이 아니라면, 첫번째()가 들어오지만, 그게 아니라면 ()인 아무것도 안들어오게됨.
			//String login_logout = (loginMbr == null)?"로그인":"로그아웃";				// null 인 상태면 로그아웃 되어진 상태니까, 이제 로그인을 해야함. "로그인" ↔ 그반대~!
			//4. 내정보조회
			
			String loginMsg = ""; 		// if안에 있었던것을 지역변수 때문에 밖으로 빼낸것임.
			String login_logout = "";
			String myInfoSearch = "";
			String myInfoUpdate= "";
			
			if(loginMbr == null) {		// 만약에 로그인을 안했으면,
				login_logout = "로그인";
			}
			else { // 로그인을 했으면
				loginMsg = "["+loginMbr.name+"님 로그인중]";
				login_logout = "로그아웃";
				myInfoSearch = "4. 내정보조회   ";
				myInfoUpdate = "5. 내정보수정   ";
			}
			
			System.out.println("\n==================== >> 메뉴"+loginMsg+" << ====================\n"
							 +"1.회원가입	2."+login_logout+"\n"
							 +"3.모든회원조회	"+myInfoSearch+myInfoUpdate+"6.프로그램종료 \n"			// 이때 4를 입력하게되면 nullPointException 오류가 뜨게됨.
							 +"====================================================");
			
			System.out.print("▷ 선택하세요 => ");									// 위에 메뉴~선택하세요 부분이 한 set가 되어서 뺑글뺑글 돌아야함. 회원가입 후, 회원조회를 하고,(그 전에 반복 * n) 프로그램을 종료한다.
						
			try {
				menuNo = Integer.parseInt(sc.nextLine()); 						//string 타입을 int로 바꾼다.
				//1,2,3번 외에 "똘똘이" (한글) or 5,6,7(더 큰수) 과 같은 숫자는 안됨.		// 5는 int 이긴 하지만, 1 2 3에 속하는 숫자는 아님. 
				
				if( !(1<= menuNo && menuNo <=6) ) {
					System.out.println(">> [경고] 메뉴에 없는 번호 입니다. << \n");
					continue;
				}
				
				switch (menuNo) {			//menuNo가 무엇입니까? (int 타입, 정수)
					case 1:	//회원가입
						
						// 배열 mbrArr 에 빈방(아무것도 안넣어준 것/비어있는 null)이 있는지 없는지를 확인한 후 
						// 빈방이 있으면 회원가입을 진행하고, 빈방이 없으면 정원마감 이라는 메세지를 출력하도록 한다.
						if(Member.count < mbrArr.length) { 			//멤버수가 배열보다 작아야함. (0,1,2 中 하나여야 한다.)
						
						
							Member mbr = new Member(); //멤버 클래스의 기본생성자. 클래스에 생성자가 없으면, 기본생성자가 눈에 안보이지만 이미 있는 것임. 아이디,암호,이름이 뭔지 .
														
							
							for(;;) {
								System.out.print("\n1.아이디 : ");
								String id = sc.nextLine(); 		//정상적으로 입력할 때 까지 뺑글뺑글 돌아야됨 ▶ 이게 그럼 한 세트구나! (무한루프)
																//int id_length = id.length();	// 입력받은 아이디의 길이를 id_length에 넣어준 것임.)
								
								boolean isIdDuplicate = false;
								
								// 입력받은 id 가 기존회원이 저장된 배열 mbrArr 에 가서 동일한 id가 있는지 없는지를 검사해야 한다.
								for(int i=0; i<Member.count; i++) {					// nullpointException이 나올 수 있으므로 조건식에 mbrArr.length를 쓰면 안된다. 그러므로 static 변수를 사용해야함. (맨 처음에 아무도 회원가입 안했을 때를 고려)
									if(mbrArr[i].id.equals(id)){					// 리턴타입이 boolean, 같으면 T 다르면 F  //멤버는 동일한 타입만 들어온다.	// 최초가입이면 id 중복검사 할 필요 없고, 그 이후에 검사를 해야함.
										// 입력받은 id가 기존회원이 사용중인 id인 경우, 즉 중복된 id인 경우이다.
										isIdDuplicate = true; 						//true인 경우, 그 다음사람은 검사할 필요가 없음. (for문을 빠져나오자.)
										break;
									}	
								}// end of for--------------------------
								
								if(isIdDuplicate || id.length()==0) {			// 여기서 ①id 입력만 하면 통과 뿐만 아니라, 중복검사까지 해야함 (입력 & 중복체크 모두 검사 필요) ② id를 하나도 입력하지 않았을 때 검사
									System.out.println(">> [경고] 아이디가 중복되었거나 아이디는 입력하지 않으셨습니다. 새로운 아이디를 입력하세요.!! << \n");		// id가 없는 엔터가 들어오면 안됨.(중복도 안되고, id를 입력하지 않아도 안됨.) 입력을 받아야만 무엇을 준다.
								}							
								else {
									mbr.id = id;//mbr 인스턴스에 있는 필드에 mbr.id를 에 입력받은 id를 넣어주면서 반복문을 빠져나온다.
									break;
								}
							} // end of for--------------------------
						
							for(;;) {
								System.out.print("2.비밀번호 : ");
								String passwd = sc.nextLine(); 		//정상적으로 입력할 때 까지 뺑글뺑글 돌아야됨 ▶ 이게 그럼 한 세트구나! (무한루프)
	
								if( !(MyUtil.isCheckPasswd(passwd)) ) {
									System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하에 대,소문자,숫자,특수문자가 혼합되어져야만 합니다. << \n");
								}							
								else {
									mbr.passwd = passwd;//mbr 인스턴스에 있는 필드에 mbr.id를 에 입력받은 id를 넣어주면서 반복문을 빠져나온다.
									break;
								}
							} // end of for--------------------------
	
							for(;;) {
								System.out.print("3.성명 : ");
								String name = sc.nextLine(); 		//정상적으로 입력할 때 까지 뺑글뺑글 돌아야됨 ▶ 이게 그럼 한 세트구나! (무한루프)
	
								if(name.length() == 0 ) {
									System.out.println(">> [경고] 성명은 필수입력 사항입니다. << \n");
								}							
								else {
									mbr.name = name;//mbr 인스턴스에 있는 필드에 mbr.id를 에 입력받은 id를 넣어주면서 반복문을 빠져나온다.
									break;
								}
							} // end of for--------------------------
	
						// 배열 속에 넣어주어야 한다.
							for(int i=0; i<mbrArr.length; i++) {
								if ( mbrArr[i] == null ) { // ▶ 이 방의 i번째에 null로 텅 비었는지 물어보는 것.
									mbrArr[i] = mbr;
									break;			 // 몇번째가 null 인지 모르기 때문에 뺑뻉이를 돌리고 있음. (null에 넣었으니까 break로 빠져나온다.)
								}
							}// end of for----------------------------
							/*
								mbrArr[0] <== "이순신" 이라는 객체(인스턴스)가 들어옴.
								mbrArr[1] <== "엄정화" 객체는 그 다음방에 들어옴.
								mbrArr[2] <== null (아직 객체 생성한 것이 없음)
							 */
							//▼ 배열에 넣은 후 회원가입 성공한 것임//
							
							System.out.println("\n>> 회원가입 성공!! [ "+(++Member.count) +" 번째 가입/정원: "+mbrArr.length+" 명]<<\n"); //Member.count초기값이 0이었다가 전위연산자로 1씩 증가
						 } // end of if----------
						else {
							System.out.println(">> [경고] 정원마감으로 인해 더이상 회원가입이 불가합니다.<<");
						}
						
						break; //switch의 break; 이다.			▶ 이순신이 (1번째) id 만든다음에 엄정화가 만들면, 2번째 가입. (static은 공유할 수 있음. -- static int count는 서로 공유할 수 있기 때문에 다같이 씀.)
																//	▶ 그러나 point는 공유할 수 없음. (static이 아니기 때문에.!!)
																// 이때, 회원가입 전에 가입할 수 있는 공간이 있는지 확인을 해야함. (빈자리 있는지!? = 없으면 "마감"!!)
						
						case 2://로그인 또는 로그아웃
							
							if(loginMbr == null) { //null 된 상태이므로 로그인 '시도'를 해야한다. ( null 상태에서 !=null 상태로 만들기)
						
								System.out.print("▷ID: ");
								String id = sc.nextLine();
								
								System.out.print("▷암호: ");
								String passwd = sc.nextLine();
								
								boolean isLoginSuccess = false; // 지역변수이기 때문에 for안에 쓸 수 없어서 for문 밖으로 뺀다.
								
								for(int i=0; i<Member.count; i++) {
									if(mbrArr[i].id.equals(id) && mbrArr[i].passwd.equals(passwd)) {		//저장소 mbrArr[i]에 저장된 아이디/비번과 내가 입력한 아이디/비번이 맞는지 비교해야 한다. equals는 boolean 타입임.
										//로그인시 입력해준 id와 passwd가 배열속의 Member 객체에 존재하는 경우			//모든 회원을 다 검사했는데, 같은 아이디가 없을 때.
								
										isLoginSuccess = true;			// id 와 passwd 모두 맞았을 때 break함.
										loginMbr =	mbrArr[i];			// 로그인이 성공될 때 null이 아니게 됨.
										// 로그인을 하면 point를 10점씩 올려주고자 한다.▼
										
										
										loginMbr.point += 10;			// default 값이 0인데, 로그인 할때마다 포인트를 10점씩 누적(올리고자 한다.) (할당연산자)
										
										break; //for 문의 break; 이다.	// id 값은 항상 고유함. 성공시 그 다음번은 검사할 필요가 없음.
									}
										
								} //end of for----------------------------
								
								if(isLoginSuccess) {					   
									System.out.println(">> 로그인 성공!! <<\n"); //성공,실패 판가름 할 수 있는 잣대(if)가 필요함.
									//로그인 한 사람이 누구인지 보기 위함.
								}
								else {
									System.out.println(">> 로그인 실패!! <<");
								}
							}
							
							else {						 //로그아웃 시도를 해야한다. (=!null 상태에서 ==null 상태로 만들어야 한다.)
								loginMbr = null;		 //객체(인스턴스)를 메모리상에서 없앨때(null) 로그아웃 처리됨. 
								System.out.println(">> 로그아웃 되었습니다. <<");
							}
							
							break; //switch의 break; 이다.
						

						case 3: //모든회원조회 (회원정보를 모두 다 나타내고자 함)					// id 중복 체크를 해야함 : id 중복 체크 완료될때까지 뺑뻉이 돌려야함.
						
							if (loginMbr != null) {
							System.out.println("----------------------------------------");
							System.out.println("아이디\t성명\t포인트");
							System.out.println("----------------------------------------");

							String str_allMember_info = "";
							for(int i=0; i<Member.count; i++) { 						//회원가입 할 때마다 static 변수 증가. 배열의 길이가 아니라 가입되어진 회원수 만큼 하면된다.
								str_allMember_info += mbrArr[i].showInfo()+"\n"; 		//str_allMember_info에 계속 쌓아두겠다.//return 타입이 스트링 타입 //멤버객체. Member에 이순신, 엄정화를 넣은 것임.
								
																						// null. // null은 존재하지 않기 때문에 객체가 아님. (아예 메모리에 안올라옴) ('.'은 객체가 되었을때만 사용 가능 . 필드와 메소드!!)								
							} // end of for------------------------------
							
							System.out.println(str_allMember_info);
							} // end of if
																									
							else {
								System.out.println(">> [경고] 먼저 로그인 하세요 !!< \n");
							}
							break; //switch의 break;이다.
							
						case 4: // 내정보조회
							
							if (loginMbr != null) {				// 유저가 로그인 안한상태로 메뉴에 없는 번호를 누를때.
								System.out.println(loginMbr.showMyInfo()+"\n");
							}
							else {
								System.out.println(">> [경고] 메뉴에 없는 번호입니다. << \n");
							}
							
							break;//switch의 break;이다.
	
						case 5: // 내정보수정 (이것도 로그인 했을때만 나옴!) // 이때 ID는 바꿀 수 없다.
							
							if (loginMbr != null) {								
								System.out.println("== "+loginMbr.name+"님 회원정보 변경하기 ==");

								String passwd = "";
								String name = "";	
								
								for(;;)	{										  
									System.out.print("1. 비밀번호 : " );			
									passwd = sc.nextLine();						// 비밀번호 입력을 받아와야함.
									if (!MyUtil.isCheckPasswd(passwd)) {		// MyUtil에 저장해놓은 비밀번호 조건과 새로 입력한 정보가 맞는지 검증하는 과정
										System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하에 대,소문자,숫자,특수문자가 혼합되어져야만 합니다. <<\n");										
									}									
									else {
										break;
									} 
								}// end of for------------------------
								
								for(;;) {									
									System.out.print("2. 성명 : " );		
									name = sc.nextLine();
									if(name.length() == 0)	{
										System.out.println(">> [경고] 성명을 입력하세요!! <<\n");
									}
									else {
										break;
									}
								} // end of for------------------------
								
								loginMbr.passwd = passwd;
								loginMbr.name = name;
				                 
				                 System.out.println(">> 비밀번호 및 성명이 변경완료 되었습니다. <<\n");
								
								
							}
							else {
								System.out.println(">> [경고] 메뉴에 없는 번호입니다.!!< \n");
							}
							break;//switch의 break;이다.

							
						case 6: // 프로그램 종료
							
							break;//switch의 break;이다.
												
				} // end of switch------------------------------
			
			} catch(NumberFormatException e) {
				System.out.println(">> [경고] 정수만 입력하세요.!! << \n");
			}
		
		
		} while(!(menuNo == 6));	//프로그램 종료가 아니라면 올라가서 메뉴를 보여준다.
		// end of do~while---------------------------------
		
		sc.close();							//while문 빠져나오고 sc.close();
		System.out.println("\n=== 프로그램 종료 ===");
		
	}// end of main(String[] args)--------------------------

}
