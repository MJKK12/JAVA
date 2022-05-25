package my.day11.d.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == // 
	Gujikja register (Scanner sc, Gujikja[] guArr) {				  // return 타입은 Gujikja, 호출은 main에서 불러옴 // Scanner를 main에서 불러온다.

		boolean isUserIdDuplicate;		  // 선언만 해두고 값은 안줌. userid가 중복되었니?  , default는 false다.
		String userid = null;			  // null 을 주지 않아도 됨. 헷갈릴 경우에 사용해라.
		String passwd = null;
		String name = null;
		String jubun = null;
		
		do {			
			isUserIdDuplicate = false;	  // 뺑뺑이 돌 때마다 false
			
			System.out.print("1.아이디 : ");
			userid = sc.nextLine();			  		  // userid 는 고유해야 한다. (중복 XX) ▶ 고유한지 중복인지를 확인해야함. "eomjh" "leess" "youks"
													  // 1. 저장되어진 값과 비교해야 함. 2. 중복이 없을때까지 반복되어야 함.(반복문 do~while)!!
													  // 3. 아이디에 공백이 있으면 안됨. (공백만 입력했는데 가입이 되면 안됨)
			// == 중복아이디 검사하기 == //
			for (int i=0; i<Gujikja.count; i++) {	  // static 변수만큼 돈다.				
				if(userid.equals(guArr[i].userid))	{		  // [i]번째가 이순신,엄정화, 유관순임. (이미 가입된 것들) ▶ 이미 가입된 것들과 비교하는 과정 (중복 확인)
					System.out.println(">> [경고] 이미 사용중인 아이디 입니다. << \n");
					isUserIdDuplicate = true;		  // id가 중복이면 계속 do~while 반복 (for문 못빠져나감.) 다시 한 번 아이디 입력을 물어봐야함. (맞을때까지 계속!)
					break;
				}	

			}// end of for--------------------------------
			
			// == 아이디는 반드시 공백만이 아닌 글자를 입력했는지 검사한다. == (공백만 입력하면 안된다.)
			if(userid.trim().isEmpty()) {										// 공백이면, 아래와 같은 문구를 띄워라.
				System.out.println(">> [경고] 아이디는 필수 입력사항 입니다. <<\n");
				isUserIdDuplicate = true;
			}
		
		} while(isUserIdDuplicate);					  // id가 중복이면 계속 do~while 반복해야 하는데, id가 중복이 아니라면 빠져나와서 다음 단계로 넘어가야함.
		
		//////////////////////////////////////////////////////////////
		
		do {
			System.out.print("2.비밀번호 : ");
			passwd = sc.nextLine();
			
			if (!MyUtil.isCheckPasswd(passwd)) 				  // boolean이 return 타입. 
				System.out.println(" >> [경고] 암호는 8글자 이상 15글자 이하의 대,소문자 및 숫자, 특수문자가 혼합되어야 합니다.<< \n" );
			
			else 
				break;
			
		} while(true);
		
		//////////////////////////////////////////////////////////////
		
		do {
			System.out.println("3. 성명 : ");
			name = sc.nextLine();				
			
			if(!name.trim().isEmpty() && name.trim().isEmpty()) 			// 성명이 텅 비었다면 ▶ break. 아니라면 나간다.
				System.out.println(">> [경고] 성명은 필수입력 사항입니다. <<");
			
			else
				break;
		} while (true);
			
		//////////////////////////////////////////////////////////////
		
		do {
			System.out.print("4.주민번호 앞의 7자리 : ");
			jubun = sc.nextLine();
			
			if (!MyUtil.isCheckJubun(jubun)) 				  // String이 return 타입. 
				System.out.println(" >> [경고] 주민번호 7자리를 올바르게 입력하세요.!! << \n" );
			
			else 
				break;
			
		} while(true);
		
		//////////////////////////////////////////////////////////////

		
		System.out.println("");
		
		Gujikja gu = new Gujikja();			// 인스턴스변수 모두 필드가 null 값을 가지고 있음.
		gu.userid = userid;
		gu.passwd = passwd;
		gu.name = name;
		gu.jubun = jubun;
		
		return gu;							// 올바르게 되면 넘겨준다.
	}// end of register()------------------------
	
	
	// == 모든 구직자의 정보를 보여주는 메소드 생성하기 == //
	void showAll(Gujikja[] guArr) {				// ★★★nullpointerException 뜨기 때문에, 배열 길이로 하면 안됨. count 값(가입한 사람)만 돌려야 한다. (디폴트값 외에 가입 안된 2명은 null 값으로 설정되어 있기 때문.)
		
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다. <<\n");
		}
		
		else {
			System.out.println("-------------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("-------------------------------------------------------------");
			
			for(int i=0; i<Gujikja.count; i++) {
			//	guArr[i].showInfo();			// showinfo는 인스턴스객체 (공유하는 것이 아니라, 각각의 정보이기 때문이다.)
				guArr[i].viewInfo();			// 옆으로 보여주는 메소드를 만들고자 한다.
				
			}// end of for--------------------------
			
			System.out.println("\n");
		}	
		
	}// end of showAll(Gujikja[] guArr)------------------------------------------
	
	// == 연령대를 입력받아 해당 연령대에 속하는 구직자 정보를 출력해주는 메소드 생성하기 == //
	
	void showByAgeline(Gujikja[] guArr, int ageline) {	// 저장소와 연령대만 알려주면 찾아주겟다.
		
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다. <<\n");
		}
		
		else {
			System.out.println("-------------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("-------------------------------------------------------------");

		    boolean isFind = false;		// 있냐고 묻는 것 (깃발올려, 깃발내려!)
		    
			for(int i=0; i<Gujikja.count; i++) {

				int stored_ageline = guArr[i].getAge()/10*10;				//저장된 갯수만큼 도는데, 한명을 끄집어 옴. 한 사람에 대한 '연령대'를 알아야 함.
								// 27 27/10 몫:2*10 ==> 20					// 2x 살이든 상관 없이 모두 20대임.
								// 25 25/10 몫:2*10 ==> 20
								// 23 23/10 몫:2*10 ==> 20

				if(stored_ageline == ageline) {
					isFind = true;
					guArr[i].viewInfo();			// 옆으로 보여주는 메소드를 만들고자 한다.
				}
				
			}// end of for--------------------------
			
			if(!isFind)	{							// !isFind == isFind가 false여야 전체가 참임.
				System.out.println(">> 검색하신 "+ageline+"대는 없습니다. <<");				// 깃발 - boolean 타입 (있다, 없다 두가지 경우의 수!!)
			}
				System.out.println("\n");
		}	
		
	}// end of showByAgeline(Gujikja[] guArr, int ageline)------------------------------------------
	
	// == 성별(남 또는 여) 입력받아 해당 성별에 속하는 구직자 정보를 출력해주는 메소드 생성하기 == //
	
	void showByGender(Gujikja[] guArr, String gender) { // gender <== "남" 또는 "여"
	
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다. <<\n");
		}
		
		else {
			System.out.println("-------------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("-------------------------------------------------------------");

			for(int i=0; i<Gujikja.count; i++) {

				if (gender.equals(guArr[i].getGender())) {			// guArr[i]가 원래 가입했던 구직자임.		// 입력한 gender와 (main에 sc.nextline으로 되어있음) 원래 가입된 guArr[i]의 구직자와 성별이 같은지?
					guArr[i].viewInfo();							// 옆으로 보여주는 메소드를 만들고자 한다.	// 성별이 같으면, 보여줘라!

				}
			}// end of for--------------------------
			

				System.out.println("\n");
		}	
	
	}// end of showByGender(Gujikja[] guArr, String gender)
	
	// == 특정 연령대에 속하는 특정 성별을 가지는 구직자들만 조회해주는 메소드 생성하기 == //
	
	void showByAgelineGender(Gujikja[] guArr, int ageline, String gender) {
		
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다. <<\n");
		}
		
		else {
			System.out.println("-------------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("-------------------------------------------------------------");

		    boolean isFind = false;					// 연령대를 검색했는데, 아무것도 없으면 없다고 창이 떠야함.
		    
			for(int i=0; i<Gujikja.count; i++) {

				int stored_ageline = guArr[i].getAge()/10*10; // 연령대
				String stored_gender = guArr[i].getGender();
				
				if(stored_ageline == ageline && stored_gender.equals(gender)) {			// int는 ==로 비교하고, gender는 String 이므로 equals로 비교한다.
					isFind = true;
					guArr[i].viewInfo();					
				}
				
				
			}// end of for--------------------------
			
			if(!isFind) {
				System.out.println(">> 검색하신 연령 "+ageline+" 대에 속하는 "+gender+"자는 없습니다. <<\n");
			}
			
				System.out.println("\n");
		}		
		
	}// end of showByAgelineGender(Gujikja[] guArr, int ageline, String gender)
	
}
