package my.day02.b.datatType;

public class MainSungjuk {

	public static void main(String[] args) {
		
		Sungjuk lssSj = new Sungjuk();  // lssSj //Sungjuk 설계도를 중심으로 물건을 만들자. new sungjuk을 가리킬때 나는 lssSj라는 이름으로 부를 것이다. 
										// lssSj는 참조형 타입(Reference Type)이다 , 객체인스턴스를 만들면 메모리에 lssSj 이름으로 올라간다.
		
		lssSj.hakbun = "091234";		// "091234"
		lssSj.name = "이순신";			// "이순신"
		lssSj.korPoint = 68;			// 68
		lssSj.eng_point = 95;			// 95
		lssSj.mathpoint = 100;			// 100

		Sungjuk eomSj = new Sungjuk();	// eomSj
		// eomSj는 참조형 타입(Reference Type)이다.
		
		eomSj.hakbun = "096178";		// 096178
		eomSj.name = "엄정화";			// 엄정화
		eomSj.korPoint = 100;			// 100
		eomSj.eng_point = 100;			// 100
		eomSj.mathpoint = 100;			// 100
		
		
		lssSj.showSungjuk();
		/*
			=== 이순신 성적결과 ===
			1. 학번 : 091234
			2. 성명 : 이순신
			3. 국어점수 : 68
			4. 영어점수 : 95
			5. 수학점수 : 100
			6. 총점 : 263
			7. 평균 : 87.66666666
		*/
		
		eomSj.showSungjuk();	
		/*
			=== 엄정화 성적결과 ===
			1. 학번 : 096178
			2. 성명 : 엄정화
			3. 국어점수 : 100
			4. 영어점수 : 100
			5. 수학점수 : 100
			6. 총점 : 261
			7. 평균 : 87
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
			
		System.out.println("lssSj => " + lssSj);
		// lssSj => my.day02.datatType.Sungjuk@2401f4c3 (@ 뒤가 메모리 상의 주소)
		System.out.println("eomSj => " + eomSj);
		// eomSj => my.day02.datatType.Sungjuk@7637f22 (@ 뒤가 메모리 상의 주소)
		
		Sungjuk kangSj = new Sungjuk();
		System.out.println("kangSj => " + kangSj);
		// kangSj => my.day02.datatType.Sungjuk@4926097b (@ 뒤가 메모리 상의 주소)
		
		kangSj = lssSj; 	//이순신의 메모리 주소를 kangSj에 넣은 것임. 
		System.out.println("kangSj => " + kangSj);
		// kangSj => my.day02.datatType.Sungjuk@2401f4c3
	
		System.out.println("lssSj => " + lssSj);
		//lssSj => my.day02.datatType.Sungjuk@2401f4c3   ==> kangSj와 lssSj가 같은 메모리상의 주소
		
		System.out.println("\n#############################\n");
		
		kangSj.name = "강감찬";
		kangSj.korPoint = 5;
		// 위에서 kangSj = lssSj; 를 씀으로써, korPoint 외의 점수에 나머지는 다 이순신의 data가 들어가 있는 것임.
		// kangSj에 lssSj을 집어넣으면서, 새로운 정보는 그대로 입력하고 기존의 이순신 성적이 그대로 출력되는 것임.
		
		lssSj.showSungjuk(); //kssSj와 똑같은 메모리주소를 같고 있기 때문에 (주소지를 넣어주는 것, reference 타입)
	/*
		=== 강감찬 성적결과 ===
		1. 학번 : 091234
		2. 성명 : 강감찬
		3. 국어 : 5
		4. 영어 : 95
		5. 수학 : 100
		6. 총점 : 200
		7. 평균1 : 66.66666666666667
		8. 평균2 : 66.666664
		9. 평균3 : 66.666664
		10. 학점1 : D
		11. 학점2(☆) : ☆☆
		12. 학점3(◆) : ◆◆
		소문자 k : k
		소문자 k : k
		소문자 m : m
		모래시계 : ⏳
		boolean 타입인 boo1 : false
		boolean 타입인 boo2 : false
		boolean 타입인 boo3 : true	
	 */
		
	}

}
// 변수는 형식을 항상 통일해야 한다.