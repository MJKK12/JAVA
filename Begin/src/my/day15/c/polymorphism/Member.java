package my.day15.c.polymorphism;

import my.util.MyUtil;

public abstract class Member {		// 부모클래스. 미완성 클래스(추상 클래스 ,abstract class)

	// field(속성) 생성 (추상화)
	private String id;		// 아이디
	private String passwd;	// 비밀번호
							// 물려주기 위해 private 대신 default 를 쓴다.	
	
	public static int count;		// public도 쓸 수 있다. (private만 아니면 됨)
	
	// Method 생성 (==> field(속성)를 어떤 방식으로 처리하고자 할 때 메소드를 통해서 처리한다.) ▶ private 접근제한자를 사용하기 위해서 만든 것임.
	protected String getId() {	// getId()를 쓰면 id를 (return id;) 받아올 수 있다. (다른 클래스에서)
		return id;
	}
	
	protected void setId(String id) {					// 어떤 id를 받아서, 이 필드에 넣을래?
		// 아이디 (글자수가 2글자 이상 10글자 이하) 
		
		if( !(id == null || id.trim().isEmpty()) )	{ 	// .trim().isEmpty() : 오로지 공백으로만 된 것
					
			  int len = id.length();
			  
			  if ( 2 <= len && len <= 10)
				  this.id = id;
		  	  else 
		  		System.out.println(">> [경고] 아이디는 2글자 이상 10글자 이하이어야 합니다. << ");  		  	  			  
		}
		else {
			System.out.println(">> [경고] 아이디는 null 또는 공백만으로 될 수 없습니다. <<\n ");	
		}

	
	}
	
	protected String getPasswd() {
		return passwd;
	}
	
	protected void setPasswd(String passwd) {		// passwd를 받아서 아래의 필드에 넣을래? 맞으면 넣고, 아니면 안넣는다.

		if (MyUtil.isCheckPasswd(passwd)) 
			this.passwd = passwd;		
		
		else 
			System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자 및 숫자, 특수기호가 혼합되어야만 합니다. <<\n");	}
		
	////////////////////////////////////////////////////////////////////////////////
	
	public abstract void showInfo();		// 미완성 메소드(추상 메소드) ▶ 해당 클래스를 미완성 class로 만들어야 한다(추상클래스, abstract class)
	
	public abstract void viewInfo();		// 미완성 메소드(추상 메소드) ▶ 해당 클래스를 미완성 class로 만들어야 한다(추상클래스, abstract class)
											// 자식클래스는 이런식으로 재정의 해야함.
	public abstract String getInfo();		// 미완성 메소드(추상 메소드) ▶ 해당 클래스를 미완성 class로 만들어야 한다(추상클래스, abstract class)

	protected abstract String getJobtype();
	
}

