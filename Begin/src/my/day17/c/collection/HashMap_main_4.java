package my.day17.c.collection;

import java.util.*;

public class HashMap_main_4 {

/*
	   === Map 계열 ===
	   1. HashMap(웹용) 과 Hashtable(게임용) 이 있다.
	   2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	      Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
          데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
          이때 ★ key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다. ★
	   3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	   4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	      value 값의 추출은 get(String key) 메소드를 사용한다. 
	   // Key 값은 기억해야 하기 때문에 반드시 String!! (숫자는 잘 기억 못하지만 문자열은 기억을 잘한다.)
*/
	
	public static void main(String[] args) {
	// 사람의 주민번호, 학교에서는 학번, 회사에서는 사번 Key 값
	//	HashMap<String, Member> mbrMap = new HashMap<String, Member>();
	//	또는	
	//	HashMap<String, Member> mbrMap = new HashMap<>();
	//	또는
		Map<String, Member> mbrMap = new HashMap<>();
	//  Map<K, V>	--> 대부분 id가 Key로 쓰임. ▶ex. ID만(key값) 기억하면 된다~~
	
		mbrMap.put("youjs", new Member("youjs","qwer1234$","유재석")); 
		// mbrMap 이라는 HashMap 저장소에 new Member("youjs","qwer1234$","유재석")을 저장하는데 
	    // 저장된 new Member("youjs","qwer1234$","유재석")을 찾고자 할때는 
	    // "youjs" 만 넣어주면 new Member("youjs","qwer1234$","유재석") 이 나오도록 저장하겠다는 말이다. 	
		
		mbrMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		mbrMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		mbrMap.put("leess", new Member("leess","qwer1234$","이순신"));
		mbrMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		mbrMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
	
		// == mbrMap 에 저장되어진 Member 객체들중에 key 가 "leess" 인 value값(지금은 Member)을 추출해서
	    //    추출된 회원(Member)의 정보를 출력하세요.
		String id = "leess";
	//	String id = "superman";
	
		Member mbr = mbrMap.get(id);			// Map 에서 끄집어(get) 내자! // 저장시키자(put)!	// add get put get
		
		if(mbr != null)
			mbr.infoPrint();
		else
			System.out.println(">> 검색하신 "+id+"에 해당하는 회원은 없습니다.");
		
		/* ==이순신님의 회원정보 ==
		1. 아이디 : leess
		2. 비밀번호 : qwer1234$
		3. 성명 : 이순신
		*/
		
		//////////////////////////////////////////////////////////////////////////////
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				
		Member seolh_mbr_1 = new Member("seolh","qwer1234$","설현");	// 설현 객체를 가리키는 메모리주소
		Member seolh_mbr_2 = seolh_mbr_1; // 그 주소를 _2에게 넘김 _1이나 _2는 메모리상에 있는 같은 객체를 가리키는 주소.
		//▼ 서로 다른 key 이지만 같은 것(value)를 가리키고 있음.
		//★ key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다. ★
		mbrMap.put("seolh_1", seolh_mbr_1);
		mbrMap.put("seolh_2", seolh_mbr_1);

		Member seolh_1 = mbrMap.get("seolh_1");
		if(seolh_1 != null) {
			seolh_1.infoPrint();
		}
		
		Member seolh_2 = mbrMap.get("seolh_2");
		if(seolh_2 != null) {
			seolh_2.infoPrint();
		}

		//////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member suji_mbr = new Member("suji","qwer1234$","배수지");	// 수지 객체를 가리키는 메모리주소
		mbrMap.put("seolh_1", suji_mbr);	//★ key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다. ★
											// 똑같은 key가 수지도 쓸 수 있고, 설현도 쓸 수 있는게 XXXXX
		seolh_1 = mbrMap.get("seolh_1");	// 위에서 쓰였다고 해서 중복된 것이 아니라 "덮어 쓴 것"임.(위에것이 삭제가 되고 밑에서 덮어쓴다는 것임)
		if(seolh_1 != null) {
			seolh_1.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다. <<");	// 유저가 잘못 입력한다는 것을 염두에 둠.
		}
		
		seolh_2 = mbrMap.get("seolh_2");
		if(seolh_2 != null) {
			seolh_2.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다. <<");
		}
		
		System.out.println("\n==================================================================\n");
		
		// === mbrMap 에 저장된 모든 회원들의 정보를 출력해보세요 === //
		// Map에 저장된 Key 값을 알아야 불러올 수 있다. 회원이 몇만명이면 key값을 알기가 쉽지 않은데, key값만 불러오는 기능이 있다!
		
		// 1. mbrMap 에 저장된 모든 key들을 읽어오는 첫번째 방법
		Set<String> keySets = mbrMap.keySet();	// key를 몽땅 다 읽어옴. (숫자는 암기 어렵다! 위에서 key를 String으로 고정, key 뭉치가 String 타입으로 나옴.)
		
		for(String key : keySets) {				// List는 넣었을 때 순서와 꺼냈을 때 순서가 같으나, Map은 저장순서와 출력순서가 다르다. 
			System.out.println(key);
		}				
		/*
		eom
		youjs
		kimth
		kangkc
		seolh_2
		kanghd
		leess
		seolh_1
		*/
		
		System.out.println("");

		for(String key : keySets) {				// List는 넣었을 때 순서와 꺼냈을 때 순서가 같으나, Map은 저장순서와 출력순서가 다르다. 
		//	System.out.println(key);
			mbrMap.get(key).infoPrint();		// key만 알면 다 나옴. ▶ info가 나온다.
		}				
	
		System.out.println("\n==================================================================\n");
	
		// 2. mbrMap 에 저장된 모든 key들을 읽어오는 두번째 방법
		Set<String> keySets2 = mbrMap.keySet();	// key를 몽땅 다 읽어옴. (숫자는 암기 어렵다! 위에서 key를 String으로 고정, key 뭉치가 String 타입으로 나옴.)
		
		// Iterator 는 저장소가 아니라 Collection 에 저장된 요소(Element)를 반복해서 읽어오는 용도로 쓰인다.
		// 그래서 Iterator 를 반복자 라고도 부른다.	(뺑뺑이 돌리게 하는 것!)
		
		Iterator<String> iterator_key = keySets2.iterator();
		
		while(iterator_key.hasNext()) {	// boolean 타입 : 있으면 true, 없으면 false 임. (key 값을 가지고(has) 있으면!!)
			
			/*
			 iterator_key.hasNext() 는
			 iterator_key 에서 현재 iterator_key 가 가지고 있는 여러 String 데이터 中 하나를 끄집어 내서 존재 하는지를 알아보는 것이다.
			 존재하면 True, 존재하지 않으면 False를 return 해준다.
			 그러므로 현재는 key의 개수가 8개 이므로, 8번 반복 할 것이다.		 
			*/
			
			String key = iterator_key.next();	// .next(); ==> 끄집어 내는 것.
			
			 /*
				실제로 키값인 String 값을 iterator_key 에서 끄집어 낸다.
			 	끄집어 낸 String 값은 더이상 iterator_key 에 남아있지 않게 된다.
			 	
			 */
			
			System.out.println(key);
		}// end of while----------------------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~또 한번 더~~~~~~~~~~~~~\n");
		
		while(iterator_key.hasNext()) {	// boolean 타입 : 있으면 true, 없으면 false 임. (key 값을 가지고(has) 있으면!!)			
			String key = iterator_key.next();	// .next(); ==> 끄집어 내는 것.
			System.out.println(key);			// 위에서 한번 꺼낸 key는 더이상 담겨있지 않게 됨 ▶ 출력(print) 안됨. // 한번 끄집어 냈으면 이미 다쓴것이기 때문에 없음 XX
		}// end of while----------------------------------------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~다시 처음부터 해본다. ~~~~~~~~~~~~~\n");	// ▶Iterator : 끄집어내는(읽어오는) 용도
		
		iterator_key = keySets2.iterator();		// 위에서 다 뺀 것을 다시 한 번 넣어준다. (ex. 텀블러에 물을 다시 한 번 채우는 것과 비슷)

		while(iterator_key.hasNext()) {			// boolean 타입 : 있으면 true, 없으면 false 임. (key 값을 가지고(has) 있으면!!)			
			String key = iterator_key.next();	// .next(); ==> 끄집어 내는 것.
			System.out.println(key);			// 위에서 한번 꺼낸 key는 더이상 담겨있지 않게 됨 ▶ 출력(print) 안됨. // 한번 끄집어 냈으면 이미 다쓴것이기 때문에 없음 XX
		}// end of while----------------------------------------------------
	
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		iterator_key = keySets2.iterator();		

		while(iterator_key.hasNext()) {			// boolean 타입 : 있으면 true, 없으면 false 임. (key 값을 가지고(has) 있으면!!)			
			String key = iterator_key.next();	// .next(); ==> 끄집어 내는 것.
			mbrMap.get(key).infoPrint();		// key만 넣어주면 Member(Value)가 나올 것이다.
												// Map에 저장된 데이터를 끄집어 내려면 key값을 알아야 한다. 
		}// end of while----------------------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~key 값이 \"leess\" 인 데이터(Member)를 삭제 한 후 ~~~~~~~~~~~~~~~~~\n");
		
		// == mbrMap 에 저장된 데이터 중 key 값이 "leess" 인 데이터(Member)를 삭제하세요 == //		
		mbrMap.remove("leess");

		for(String key : keySets) {				// List는 넣었을 때 순서와 꺼냈을 때 순서가 같으나, Map은 저장순서와 출력순서가 다르다. 
		//	System.out.println(key);
			mbrMap.get(key).infoPrint();		// key만 알면 다 나옴. ▶ info가 나온다.
		}				
	

		// == mbrMap 에 저장된 모든 데이터(Member)를 삭제하세요 == //		
		System.out.println("\n~~~~~~~~~~~~~~~~~모든 데이터(Member)를 삭제 한 후 ~~~~~~~~~~~~~~~~~\n");

		mbrMap.clear();

		for(String key : keySets) {				// List는 넣었을 때 순서와 꺼냈을 때 순서가 같으나, Map은 저장순서와 출력순서가 다르다. 
		//	System.out.println(key);
			mbrMap.get(key).infoPrint();		// key만 알면 다 나옴. ▶ info가 나온다.
		}				
		
		System.out.println("mbrMap.isEmpty() => " + mbrMap.isEmpty());
		// mbrMap.isEmpty() => true

		
	}// end of main-------------------------------------------------------

}
