package my.day14.a.inheritance;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends Member {	// Member의 자식클래스 // Member 클래스가 내 부모에요! 라는 뜻. Company는 자식클래스 라는 뜻. (Member - Company:부모-자식 관계) ▶ Member 클래스에 있는거 쓸 수 있음.

	// field(속성) 생성 (추상화)

	private String comname; 	// 회사명	
	private String combunho;    // 사업자등록번호
	private String jobtype;	    // 업종명 (예: 제조업, it, 서비스업...)
	private long seedmoney;	// 자본금
	
	static int count;	// Company Gujikja 객체(인스턴스)의 개수를 알아보려는 용도.

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {// 회사는 영어이름도 많으니, name과 다르게 영어한글여부는 검사 안하고, 글자수만 검사한다.
		
		if( !(comname == null || comname.trim().isEmpty()) )	{ 	// .trim().isEmpty() : 오로지 공백으로만 된 것
			
			  int len = comname.length();
			  
			  if ( 2 <= len && len <= 10)
				  this.comname = comname;
		  	  else 
		  		System.out.println(">> [경고] 회사명은 2글자 이상 10글자 이하이어야 합니다. << ");  		  	  			  
		}
		else {
			System.out.println(">> [경고] 회사명은 null 또는 공백만으로 될 수 없습니다. <<\n ");	
		}
	
	}

	public String getCombunho() {
		return combunho;
	}

	public void setCombunho(String combunho) {	
		// 사업자등록번호는 12-345 라는 형식을 취한다 라고 하자.
		// 그런데 첫번째 오는 글자는 0은 올 수 없다라고 하자. (02-345는 X)
	
		Pattern p = Pattern.compile("^[1-9][0-9]-[0-9]{3}$");			// [0-9]{3} [0-9]가 연속으로 3번 들어온다.
		Matcher m = p.matcher(combunho);
		boolean bool = m.matches();
		
		if(bool) {
			this.combunho = combunho;			
		}
		else {
			System.out.println(">> [경고] 사업자등록번호가 올바르지 않습니다. <<\n ");	
			
		}
		
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {						// 공백이나 null 값만 아니면 된다.
		
		if( jobtype != null || !jobtype.trim().isEmpty() )	 	// .trim().isEmpty() : 오로지 공백으로만 된 것
			this.jobtype = jobtype;  		  	  			  
		
		else 
			System.out.println(">> [경고] 직종타입은 null 또는 공백만으로 될 수 없습니다. <<\n ");	
	}

	public long getSeedmoney() {					
		return seedmoney;
	}

	public void setSeedmoney(long seedmoney) {	// 0원인 회사는 받지않겠다.
		
		if(seedmoney > 0) {
			this.seedmoney = seedmoney;
		}
		else {
			System.out.println(">> [경고] 자본금은 0보다 커야합니다. <<\n ");	
		}
	}
	
	// id, passwd, name, jubun 필드의 값이 모두 null 아니라면, 
	// 올바르게 데이터를 입력한 경우이므로 true를 리턴해주고,
	// 적어도 1개 이상이 null 이라면, 잘못 입력된 데이터이므로 false 를 리턴해주는 메소드를 생성한다. (판별 ▶ 다른클래스에서 호출해와야함.)
	public boolean isUseCompany() {

		
		if ( super.getId() != null &&			// 부모클래스에서 private 으로 막아버렸기 때문에 (다른데서 이상한거 들어오는 것 방지) getId로 부모클래스에 있는 것을 불러옴. ▶ 부모것임을 보이기 위해 super.를 쓰는데 써도그만 안써도 그만임.(헷갈리면 써라)
			 super.getPasswd() != null &&		// 부모클래스에서 private 으로 막아버렸기 때문에 (다른데서 이상한거 들어오는 것 방지) getPasswd로 부모클래스에 있는 것을 불러옴.
			 comname != null &&
			 combunho != null
			 ) 
			return true;
		
		else
			return false;
		
	}
	// == 구인회사 1개의 정보를 보여주는 메소드 생성하기 == //
	public void showInfo() {
		
		DecimalFormat df = new DecimalFormat("#,###");
				
		System.out.println("1.아이디 : "+super.getId()+"\n" + 
						   "2.비밀번호 : "+super.getPasswd()+"\n" + 
						   "3.회사명 : "+comname+"\n" + 
						   "4.사업자등록번호 : "+ combunho +"\n" + 
						   "5.업종 : "+ jobtype +"\n" +
						   "6.자본금 : "+ df.format(seedmoney) +"만원\n"
				          );
		
	}// end of void showInfo()---------------------------------------
		
	
	public void viewInfo() {
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.printf("%-10s\t%-15s\t%-10s\t%8s\t%-10s\t%-10s\n",getId(),getPasswd(),comname,combunho,jobtype,df.format(seedmoney)+"만원"); 
	}  
	
	
	public String getInfo() {
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		return getId()+"   "+getPasswd()+"   "+comname+"   "+combunho+"   "+jobtype+"   "+df.format(seedmoney)+"만원";
	}
	
	
}
