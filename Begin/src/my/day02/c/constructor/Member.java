package my.day02.c.constructor;

public class Member {

	// field = attribute = property = 속성
	String userid;  // 초기화값 null
	String passwd;  // 초기화값 null
	String name;    // 초기화값 null
	int age;		// 초기화값 0
	int point;		// 초기화값 0
	
	// >>> 생성자(constructor) ==> 인스턴스(객체)화 할 때, 사용되어지는 일종의 메소드라고 보면 된다.
	// 생성자의 () 안은 파라미터 == 인자 == 매개변수
	
	// 파라미터가 없는 생성자를 기본생성자(default constructor)라고 부른다.
	// 모든 클래스는 기본생성자(default constructor)가 없는 것이 아니라 생략되어져 있을 뿐이다. (눈에 안보일뿐이지 있는 것임... 아래와 같은 모양으로.)
	// 즉 없더라도 아래와 같이 나와 있는 거나 마찬가지. 그냥 눈에 안보일 뿐임.
	// 그러나 , 파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제되어져 버린다.!!!★★★★★★★
	// 모든 클래스는 아래와 같이 기본생성자(default constructor)를 명기하지 않으면 기본 생성자가 없는 것이 아니라 생략되어져 안 보일 뿐이다.
	public Member() {
		System.out.println(">>> 기본생성자 Member() 가 호출됨 <<<");
		
	}
	
	// >>> 파라미터가 있는 생성자의 주목적은 필드를 초기화시켜 주는 것이다.
	// !!! 파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제되어져 버린다.!!!★★★★★★★ 	
	public Member(String userid, String passwd, String name) {
		this.userid = userid;			// 이(this) class에 있는 field를 넣자.
		this.passwd = passwd; 			//파라미터 passwd가 String passwd로 들어갈 수 있도록 this를 사용함.
		this.name = name;
		
		// this는 자기자신 클래스인 Member 클래스를 뜻하는 것이다. 즉, this가 인스턴스임.
	}
	
	
	// >>> 파라미터가 있는 생성자
	// !!! 파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제되어져 버린다.!!!★★★★★★★ 
	public Member (String userid, String passwd, String name, int age, int point) {  //파란색이 아닌 주황색 글씨는 지역변수
			// (String userid, String passwd, String name, int age, int point)를 파라미터 (parameter) 또는 매개변수 또는 인자라고 부른다.
	/*	
		this.userid  = userid;
		// 지역변수명과 필드명이 동일할 경우, (주황글씨=파랑글씨) 지역변수명이 더 우선하므로 모두 지역변수명으로 되어져 버린다.
		// 텀블러, 볼펜, 핸드폰이 있다. 어떤 사물을 가리킬 때, 명사라고 부른다. 그 명사를 대신할 수 있는 것이 대명사임 (이것,저것 = 이름은 다 다르지만 세개를 다 동일하게 '이것'이라고 부를 수 있음.)
		// this는 자기자신 클래스인 Member 클래스를 뜻하는 것이다. 즉, this가 인스턴스임.
		// 지역변수명으로 대체되는 것을 막기 위해 this.를 사용한다. (지역변수가 전역변수랑 이름이 똑같은데 전역변수 쓰고자 할 때 쓸 수 있음)
		
		this.passwd = passwd; //파라미터 passwd가 String passwd로 들어갈 수 있도록 this를 사용함.
		this.name = name;
	*/
	// 또는 
		this(userid,passwd,name);				// this는 자기자신 class.는 위의 public Member를 가리킴. 호출하기만 하면 필드에 값을 넣어주고 있다. 
												// 괄호가 나오면 항상 컨트롤 키를 누르고 이동한다. (open declaration:정의를 보겠다), 
												// 생성자 속에서 또 다른 생성자를 호출한 것임. 위의 /**/ 부분과 this(userid,passwd,name);는 같음. 근데 웹에서는 안쓴다.
		
		this.age = age;							// 이(this) class에 있는 field를 넣자.
		this.point = point;						// 파라미터 point가 int point로 들어갈 수 있도록 this를 사용함.
		
		System.out.println(">>> 파라미터가 있는 생성자가 호출됨 <<<");
		
	}
	


	// behavior == method == 행위 == 기능 == operation == 함수★★★★★★★ // 대한민국 == 한국 == 코리아
	void showInfo() {
		
		System.out.println("=== " + name + "님의 회원정보 ===\n"
						  +"1. 아이디 : " + userid + "\n" 
						  +"2. 암호 : " + passwd + "\n"
						  +"3. 성명 : " + name + "\n"
						  +"4. 나이 : " + age + "\n"
						  +"5. 포인트 : " + point + "\n"
						  );
	}
	
	
	//  == return 타입이 void 인 메소드 생성하기 == //	
	// 암호를 변경하려는 기능
	// 메소드는 반드시 앞에 return타입이 있어야 한다. 어떤 값을 받아서 기능을 해주는것 : 파라미터가 있는 메소드
	void updatePasswd(String currentPassswd, String newPasswd) {	//메소드 생성시 void는 리턴타입이 없는 타입이다. static이 없기 때문에 instance 메소드이다.
		
		if(passwd != currentPassswd) { //현재 인스턴스의 암호인 passwd와 입력받은 currentPassswd 값이 서로 일치하지 않으면 
			System.out.println( ">> \""+name+"\" 님의 현재 사용중인 암호와 틀린 암호를 입력해서 암호 변경이 불가합니다.!! << \n" ); //name을 변수화 해주기 위해  "+name+" 를 입력한다.
		}
		else { //현재 인스턴스의 암호인 passwd와 입력받은 currentPassswd 값이 서로 일치하면 
			passwd = newPasswd;
			System.out.println(">> \""+name+"\" 님의 암호가 성공적으로 변경되었습니다!! <<");  // \(이스케이프) 모양을 통해서 본래의 기능을 잃게 함으로써 "를 문자열 외에 기능이 아닌 ""자체로 나타나도록 한다.
			showInfo();
			
		}
		
	}
	
	// == return 타입이 있는 메소드 생성하기 == // 	
	// 포인트로 결제 후 포인트를 차감해주는 기능(메소드)
	// return 값은 결제하고 남은 포인트 잔고를 돌려주는 것이다.
	int pointPayment(int point) {		// 포인트를 얼마나 쓸것인가? // 메소드를 돌린 후에 그 결과물을 int값으로 뭔가 돌려준다. //void는 리턴이 없음. (돌려주는게 없다.)
										// int 타입을 주려면 return을 써야함.
		int balancePoint = this.point; 	// 지역변수는 항상 초기화 꼭 할것.!!
		
		if(this.point == 0) {			//this = 현재 필드. (현재포인트 == 0)
			System.out.println(" >> \""+name+"\" 님의 현재 포인트가 0이므로 포인트 결제가 불가합니다.!! << ");
		}
		
		else if(this.point < point) {	//this (현재 포인트가) < 실제 필요한 포인트	
			System.out.println(" >> \""+name+"\" 님의 현재 포인트 잔고가 부족하므로 결제가 불가합니다.!! << ");
		}
		
		else { 							//차감되어진 값 만큼만 돌려주어야 함.
			System.out.println(" >> \""+name+"\" 님의 "+point+" 포인트 결제가 완료되었습니다.!! << "); //여기서는 point가 지역변수임 (this가 X)
			balancePoint -= point;		//내거에다가 쓴거만큼 빼서  balancePoint 에 넣어주는 것이다.
		}
		
		return balancePoint;			//잔고를 돌려주겠다.

	}// end of int pointPayment(int point)------------------------------------------
	
	
	String memberInfo(int n) {
		
		String title = "";
		
		//입력받은게 0인지 1인지에 따라서 결과값이 바뀌는 것임
		if(n==0) {						
			title = "=== "+ name +"님의 회원정보 수정 전 ===\n";
		}
		
		else if(n==1) {
			title = "=== "+ name +"님의 회원정보 수정 후 ===\n";
		}
		
		return title
				  +"1. 아이디 : " + userid + "\n" 
				  +"2. 암호 : " + passwd + "\n"
				  +"3. 성명 : " + name + "\n"
				  +"4. 나이 : " + age + "\n"
				  +"5. 포인트 : " + point;
		
	}// end of String memberInfo()------------------------------
	
	// 메소드 안에서 메소드를 불러올 수 있다.
	String changeInfo(String passwd, int age, int point) {
		
		String before_info = memberInfo(0); // String 변경전 정보
		
		this.passwd = passwd;
		this.age = age;
		this.point = point;
		
		String after_info = memberInfo(1); // String 변경후 정보
		
		return before_info + "\n\n" + after_info; //return 타입이 String 타입이다. 변경전 정보와 변경후 정보를 합친 값을 돌려주겠다 (return)
		
	} // end of String changeInfo(String passwd, int age, int point)
	
	
	
	//★★★★★★★메소드의 오버로딩(overloading)★★★★★★ 암기!!
	// 1. 메소드의 이름은 같더라도 파라미터의 갯수가 다르면 다른 메소드로 취급하므로 메소드 중복이 아니다.
	// 2. 메소드의 이름과 파라미터의 갯수도 같더라도 파라미터의 데이터타입의 순서가 다르면 다른 메소드로 취급!! / String int int / int String int ▶ 이렇게 순서가 바뀌어도 메소드 중복이 일어나지 않음.
	// 3. 메소드의 이름과 파라미터의 갯수도 같고, 파라미터의 데이터타입의 순서도 같을 때, 단 return 타입은 다를 경우라도 메소드 중복 이라고 본다.
	// 4. 그러므로 메소드의 이름이 같지만 메소드가 중복이 안되려면 리턴타입은 필요가 없고 오로지 파라미터가 달라야 한다. ★
	String changeInfo(String passwd, String name, int age, int point) { 	//★메소드의 이름은 위와 같으나, 파라미터의 형식(int,String 등)과 갯수가 달라짐 (String name이 추가됨) ▶ 메소드의 오버로딩
			
			String before_info = memberInfo(0); // String 변경전 정보
			
			this.passwd = passwd;
			this.name = name;
			this.age = age;
			this.point = point;
			
			String after_info = memberInfo(1); // String 변경후 정보
			
			return before_info + "\n\n" + after_info; //return 타입이 String 타입이다. 변경전 정보와 변경후 정보를 합친 값을 돌려주겠다 (return)
			
		} // end of String changeInfo(String passwd, String name, int age, int point)-----------

	
}
