package my.day14.a.inheritance;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Gujikja extends Member {		// 자식클래스

	
	// field(속성) 생성 (추상화)
	private String name;   // 성명	
	private String jubun;  // 주민번호 앞에 7자리 까지만 쓸 것
				   // 예: "951220 1" 남자		"011220 3"남자
				   // 예: "951220 2" 여자		"011220 4"여자
	
	static int count;	// Gujikja 객체(인스턴스)의 개수를 알아보려는 용도.
	
	// private 필드에 대한 게터,세터가 반드시 들어가야함.	
	
	// Method 생성 (==> field(속성)를 어떤 방식으로 처리하고자 할 때 메소드를 통해서 처리한다.)
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		// name에는 한글만 허용하겠다. (영문X) 글자수는 2글자 이상 5글자 이하까지만 허용. 이름에 공백이 없어야 함.
		
		// 정규표현식(Regular Expression)이란?
        // ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
		
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");		// ^: 처음 , $: 끝
		
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(name);
		
		// == 3. 판별하도록 한다. == //
        // 주어진 정규식 패턴과 일치하면  true, 일치하지 않으면 false 를 리턴시켜준다.
		if( m.matches() ) {
			this.name = name;		// 값이 일치하면(if), 필드에 넣어주겠다.
		}
		else {
			System.out.println(">> [경고] 성명은 공백없이 한글로만 2글자 부터 5글자 까지만 가능합니다. <<\n");
		}
		
		
	}
	
	public String getJubun() {
		return jubun;
	}
	
	public void setJubun(String jubun) {
		
		if( MyUtil.isCheckJubun(jubun)) 			// boolean 값 // 주민등록번호 유효성검사 복붙해서 가져오기. ( 복잡하다.. )
			this.jubun = jubun;			
		
		else 
			System.out.println(">> [경고] 주민등록번호 앞의 7자리가 올바르지 않습니다. << \n");
		
	}
	
	// id, passwd, name, jubun 필드의 값이 모두 null 아니라면, 
	// 올바르게 데이터를 입력한 경우이므로 true를 리턴해주고,
	// 적어도 1개 이상이 null 이라면, 잘못 입력된 데이터이므로 false 를 리턴해주는 메소드를 생성한다. (판별 ▶ 다른클래스에서 호출해와야함.)
	public boolean isUseGujikja() {

		
		if ( this.getId() != null &&			// 부모클래스에서 private 으로 막아버렸기 때문에 (다른데서 이상한거 들어오는 것 방지) getId로 부모클래스에 있는 것을 불러옴. ▶ 부모것임을 보이기 위해 super.를 쓰는데 써도그만 안써도 그만임.(헷갈리면 써라)
			 super.getPasswd() != null &&		// 부모클래스에서 private 으로 막아버렸기 때문에 (다른데서 이상한거 들어오는 것 방지) getPasswd로 부모클래스에 있는 것을 불러옴.
			 name != null &&
			 jubun != null) 
			return true;
		
		else
			return false;
		
	}
	
	
	
	// == 구직자의 현재 나이를 알려주는 메소드 생성하기 == //
	
	public int getAge() {
		// "951220 1" 남자		"011220 3"남자
		// "951220 2" 여자		"011220 4"여자
	
	   // 현재나이 = 현재년도 - 태어난년도 + 1
		
	   Calendar currentDate = Calendar.getInstance(); 
	   // 현재날짜와 시간을 얻어온다.
	   
	   int currentYear = currentDate.get(Calendar.YEAR);
	   
	   String sGender = jubun.substring(jubun.length()-1);				// 성별을 나타냄 (주민번호 두번째에서 첫째자리는 성별을 나타냄 (1 or 2 or 3 or 4)
	  
	   int birthYear = 0;	   
	   if("1".equals( sGender ) || "2".equals( sGender )) {			// 성별이 " " 입니까? jubun의 길이는 7인데, 여기서 -1을 하면 6임. 즉, 맨끝에 있는 숫자임.!!
		   birthYear = Integer.parseInt(jubun.substring(0, 2)) + 1900;	// 1 또는 2라면 주민번호가 1900 대
		   //									95 + 1900 ==> 1995
	   }
	   else {
		   birthYear = Integer.parseInt(jubun.substring(0, 2)) + 2000;	   	 
		   							//     			
	   }

	   				//   95    	  1  +  1900 또는 2000
	   				// 1995	   2001	
	   
	   return currentYear-birthYear+1;
		   
	}// end of int getAge()------------------------------------
	
	// == 구직자의 성별을 알려주는 메소드 생성하기 == //


	public String getGender() {
		
		   String sGender = jubun.substring(jubun.length()-1);				// 성별을 나타냄 (주민번호 두번째에서 첫째자리는 성별을 나타냄 (1 or 2 or 3 or 4)

		   if("1".equals( sGender ) || "3".equals( sGender )) 			// 성별이 " " 입니까? jubun의 길이는 7인데, 여기서 -1을 하면 6임. 즉, 맨끝에 있는 숫자임.!!
			   return "남";
		   		   
		   else 
			   return "여";		   								
		   

	}// end of String getGender()------------------------------------
		
	
	// == 구직자 1명의 정보를 보여주는 메소드 생성하기 == //
	
	public void showInfo() {
		
		System.out.println("1. 아이디 : "+super.getId()+"\n" + 				// 여기는 부모클래스에서 가져온 getId 이기 때문에 super. 를 붙여준다. (아래의 getAge,getGender는 내가 만든것. super를 써줌으로써 구분짓자)
						   "2. 비밀번호 : "+super.getPasswd()+"\n" + 
						   "3. 성명 : "+name+"\n" + 
						   "4. 현재나이 : "+ getAge() +"\n" + //getAge() : 현재 나이를 알려주는 '메소드' . 빨간줄이 그어질텐데, 우리는 메소드를 새로 만들어야함!	// 내가만든 getAge
						   "5. 성별 : "+getGender()+"\n" 	//getGender() : 성별을 알려주는 '메소드'.
							);

	}// end of void showInfo------------------------------------
	
	public void viewInfo() {
	      System.out.printf("%-10s\t%-15s\t%-8s\t%3d\t%-2s\n",super.getId(),super.getPasswd(),name,getAge(),getGender());
	   }
	
	public String getInfo() {
		return super.getId()+"  "+super.getPasswd()+"   "+name+"  "+getAge()+"  "+getGender();
	}
	
}
