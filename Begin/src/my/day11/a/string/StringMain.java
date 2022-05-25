package my.day11.a.string;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class StringMain {

	public static void main(String[] args) {

		// === 1. "문자열".charAt(int index) ===
	    //        "안녕하세요".charAt(2) ==> '하' (index 값에 대한 char 타입을 뽑아온다.)
	    // index =>  01234 
		
		char ch = "안녕하세요".charAt(2);
		System.out.println("ch =>" + ch);
		// ch => 하
		
		String str = "안녕하세요";
		//	  index => 01234	 
		
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}// end of for
		
		System.out.println(result);
		// 요세하녕안
		
		// === 2. "문자열".toCharArray() ===
	    // "안녕하세요".toCharArray()  ==> char 타입의 배열로 만들어준다.
	    // ------------------------
	    // |'안'|'녕'|'하'|'세'|'요'|
	    // ------------------------
	    //   0    1    2   3    4   <== index 
		
		char[] chArr = "안녕하세요".toCharArray();
		result = "";
		
		for(int i=chArr.length-1; i>=0; i--) {	// 길이는 5이므로 -1을 해주는 것.
			result += chArr[i];
		}
		
		System.out.println(result);
		//요세하녕안
		
		// === 3. "문자열".substring(int 시작인덱스, int 끝인덱스) === ★★★★★★★★★ 매우 자주쓰임 ★★★★★★★★★
        // "안녕하세요".substring(1, 4); ==> 1번 인덱스인 "녕" 부터 4번 인덱스 앞에까지인 "세" 까지만 뽑아온다.  // 문자열에서 해당 문자만 추출해온다.     
        //  01234		
		str = "안녕하세요".substring(1, 4);
		System.out.println(str);
		
		int len = "안녕하세요".length();			// 문자열의 길이(length) = 5 / 인덱스는 0~4
		str = "안녕하세요".substring(2, len);		// 길이는 5이고, 인덱스는 4까지니까, '하'부터 끝까지 가라는 뜻
		System.out.println(str);
		//하세요
		
		// === 4. "문자열".substring(int 시작인덱스) === // 시작인덱스만 적으면, 끝까지 나온다. (어디까지 갈래?를 쓰지 않으면 끝까지 간다.)
	    // "안녕하세요".substring(2); ==> 2번 인덱스인 "하" 부터 끝까지 뽑아온다.          
	    //  01234
		str = "안녕하세요".substring(2);		// 길이는 5이고, 인덱스는 4까지니까, '하'부터 끝까지 가라는 뜻
		System.out.println(str);
		//하세요
		
		
		// === 5. "문자열".indexOf("찾을문자열") === ★★★★★★★★★ 매우 자주쓰임 ★★★★★★★★★
	    //        "문자열" 에서 최초로 나오는  "찾을문자열"의 인덱스(int)를 알려준다. // 문자열이 최초로 나오는 위치값을 돌려준다.
		int index = "시작하라 안녕하세요 건강하세요".indexOf("하");
					// 012
		System.out.println(index);	// 2
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("하세요");
					// 01234567
		System.out.println(index);	// 7
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("A");
		// 01234567
		System.out.println(index);	// 찾고자 하는 문자열이 없으면 -1이 나온다. ★★★★★★★★★
		
		// ==== [퀴즈] ==== //
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");
	      
	      String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
	                                  "D:/mymusic.mp3",
	                                  "C:/photo/내얼굴.jpg"};
	      
	      for (int i=0; i<pathFileNameArr.length; i++) {
	    	  System.out.println(pathFileNameArr[i]);
	      } // end of for
	      /*
	      C:/mydocument/resume/나의이력서.hwp
	      D:/mymusic.mp3
		  C:/photo/내얼굴.jpg
	      */
	      
	      System.out.println("\n==== 파일명만 뽑아온 결과물 ====");
	      
	      for (int i=0; i<pathFileNameArr.length; i++) {
	    	  char[] chrArr = pathFileNameArr[i].toCharArray();
	    	  
	    	  String strReverse = "";
	    	  for(int j=chrArr.length-1; j>=0; j--) {	//chrArr.length-1 배열을 거꾸로 하나하나 읽어오겠다.
	    		  strReverse += chrArr[j];	    		  
	    	  } // end of for------------------
	    	  
	    	//  System.out.println(strReverse);
	    	  
	    	// "/"가 최초로 나오는 인덱스값(=위치)
	    	  int idxSlash = strReverse.indexOf(("/"));
	    	  
	    	//  strReverse.substring(0, "/"가 최초로 나오는 위치);// 문자열의 일부분만 추려낸다.
	    	  strReverse = strReverse.substring(0,idxSlash);
	    	  
	    	//  System.out.println(strReverse);
	    	  
	    	  chrArr = strReverse.toCharArray();	//return 타입은 char타입의 배열
	    	  System.out.println();
	    	  
	    	  String fileName = "";
	    	  for(int j=chrArr.length-1; j>=0; j--) {	//chrArr.length-1 배열을 거꾸로 하나하나 읽어오겠다.
	    		  fileName += chrArr[j];	    	
	    	 	    	  
	      } // end of for------------------ 	  
	    	  System.out.println(fileName);	      
	      } // end of for------------------
	      
	      /*
	       경로 이름은 필요 없고, 파일 이름만 뽑아올 것.
	       나의이력서.hwp
	       mymusic.mp3
	       내얼굴.jpg
	       */
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
		   // === 6. "문자열".lastIndexOf("찾을문자열") ===
		   //        "문자열" 에서 마지막으로 나오는  "찾을문자열"의 인덱스(int)를 알려준다.
	      
			index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하");	//마지막으로 '하'가 나오는 곳
					// 012
			System.out.println(index);	//13
			
			index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세요");
					// 01234567
			System.out.println(index);	//13
			
			index = "시작하라 안녕하세요 건강하세요".lastIndexOf("A");
			System.out.println(index);	// 찾고자 하는 문자열이 없으면 -1이 나온다. ★★★★★★

			
			// ==== [퀴즈] ==== //
	        System.out.println("\n==== 파일명만 뽑아온 결과물 ====");

	        for(int i=0; i<pathFileNameArr.length; i++) {
	        	
	        	int idx = pathFileNameArr[i].lastIndexOf("/"); 
	        	// 마지막으로 나오는 "/"의 인덱스 값
	        	
		        System.out.println(pathFileNameArr[i].substring(idx+1));
		        // 마지막으로 나오는 슬래시의 위치값
	        	
	        }// end of for------------------------
		      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
		  // ==== [퀴즈] ==== // indexof 와 substring을 사용해서 ,을 제거한다.
	      
	      String money = "2,000,000";	//"2000,000"	"2000000"	      
	      
	      // 콤마가 있는 상태에서는 integer.parseInt를 할 수 없다. 콤마를 제거 해야 integer.parseInt가 가능하다.
	      do {
	    	  
	    	  int commaIndex = money.indexOf(",");	// ","가 나오는 위치값을 찾는다. 콤마가 있는가 없는가?
	    	  
	    	  if(commaIndex == -1)		// 만약에 콤마가 없으면 -1로 출력됨. ▶ 그냥 while문 빠져나가면 됨.▶ 입력한 그대로 출력
	    	  	  break;	    	  	  
	    	  // "2" , "000,000"	"2000" , "000"
	    	  
	    	  	  
	    	 money = money.substring(0, commaIndex) + money.substring(commaIndex+1);	// 두번째꺼 ; 콤마가 나오는 바로 뒤에것
	    	 // "2,000,000".substring(0, 1) == "2";
	    	 // "2,000,000".substring(commaIndex+1) ==> "000,000"
	    	 // "2" + "000,000" ==> "2000,000"
	    	  
	    	 // "2000000"
	    	  
	      } while (true);
	      // end of do~while------------------------------
	      
	      System.out.println(money);
	      //2000000
	      
	     // int sum = MyUtil.delComma("2,000,000") + MyUtil.delComma("5,000") + MyUtil.delComma("100");
	      int sum = MyUtil.delComma("2,000,000") + MyUtil.delComma("5,000") +  MyUtil.delComma("100"); 
	      //			2000000 + 5000 + 100 , 리턴값은 int.
	      
	      DecimalFormat df = new DecimalFormat("#,###");	// 세자리마다 ,를 찍어라.
	      System.out.println(df.format(sum));
	      // "2,005,100"
	      
	      // === 7. "문자열".split("구분자") ===	★★★★★★★★★ 매우 자주쓰임 ★★★★★★★★★ (특히 ,를 자주 쓴다.)
	      //        "문자열"을 "구분자"로 잘라서 String 타입의 배열로 돌려주는 것이다. (split, 쪼갠다!)
	      
	      System.out.println("\n1.===================\n");
	      
	      String food = "파스타,국밥,볶음밥,고구마,계란말이";			// 구분자가 "," 콤마로 되어있음.
	      
	      String[] foodArr = food.split(",");					// 위 문자열이 String 타입의 배열로 나오는 것.
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n2.===================\n");
	      
	      food = "파스타	국밥	볶음밥	고구마	계란말이";			
	      
	      foodArr = food.split("\t");							// 위 문자열이 String 타입의 배열로 나오는 것.
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n3.==== split 사용시 구분자로 . | / 등 특수문자를 사용하려고 하는 경우  ===== \n"); //","나 tap말고
	      
	      food = "파스타.국밥.볶음밥.고구마.계란말이";
	      foodArr = food.split(".");
	      System.out.println("foodArr.length => " + foodArr.length);	// 0이 나오면, 쪼개지 못한다(=인식을 못한다)라는 뜻.!!
	      // foodArr.length => 0
	      // ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
	      // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
	      // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다. 즉, [구분자] 이렇게 말이다.
	      
	      foodArr = food.split("\\.");
	      System.out.println("foodArr.length => " + foodArr.length);	// 0이 나오면, 쪼개지 못한다(=인식을 못한다)라는 뜻.!!
	      // foodArr.length => 5

	      foodArr = food.split("[.]");
	      System.out.println("foodArr.length => " + foodArr.length);	// 0이 나오면, 쪼개지 못한다(=인식을 못한다)라는 뜻.!!
	      // foodArr.length => 5
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n4.===================\n");
	      
	      food = "파스타|국밥|볶음밥|고구마|계란말이";			
	      
	      foodArr = food.split("\\|");							
	  //  또는
	  //  foodArr = food.split("[|]");
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */

	      System.out.println("\n5.===================\n");
	      
	      food = "파스타,국밥,볶음밥,고구마,계란말이";			
	      
	      foodArr = food.split("\\,");							// 왠만하면 , 앞에도 \\를 써라!! (원래 안써도 되는 거지만)
	  //  또는
	  //  foodArr = food.split("[|]");
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n6.===================\n");
	      
	      food = "파스타,국밥.볶음밥	고구마,계란말이";					// ,.	이 혼합되어짐(콤마,반점,tab)	
	      
	  //    foodArr = food.split("\\,|\\.|\\t");					// \t 앞에는 \를 하나만 붙이면 됨. ("," or "." or "tab")
	  //  또는
	      	foodArr = food.split("[,.\t]");							// [] 안에서는 위처럼 | 표시 안쓰고 연속 표현 가능
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n7.===================\n");
	      
	      food = "파스타1국밥2볶음밥3고구마4계란말이";			// 구분자가 숫자	
	      
	      foodArr = food.split("\\d");					// \\d에서 d는 정규표현식의 하나로써 숫자를 의미한다.
	      												// 즉, 숫자가 구분자가 되는 것이다.
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
	      파스타
		  국밥
		  볶음밥
		  고구마
		  계란말이
	      */
	      
	      System.out.println("\n8.===================\n");		// 잘 쓰이지 않음. 주로 ,를 많이 쓴다.
	      
	      food = "파스타1국밥2볶음밥3고구마4계란말이";			// 구분자가 숫자	
	      
	      foodArr = food.split("\\D");					// \\D에서 D는 정규표현식의 하나로서 숫자가 아닌것을 의미한다.
	      												// 즉, 숫자가 아닌것이 구분자가 되는 것이다.
	      // {"1","2","3","4"}
	      
	      for (int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
		      1
		      2
		      3
		      4
	      */
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // == 참고 : \ 를 escape 문자 라고 부른다. ==
	      System.out.println("나의 이름은 \"이순신\" 입니다.");	// 문자열 안에서 ""를 또 써주고 싶을때!
	      //  나의 이름은 "이순신" 입니다.
	      
	      System.out.println("C:\\movie\\koreamovie\\경이로운소문.mp4"); // 문자열 안에서 \문자열\를 또 써주고 싶을때!
	      //  C:\movie\koreamovie\경이로운소문.mp4 
	      
	      System.out.println("나의 이름은 '엄정화' 입니다.");		// ''는 따로 쓰지 않아도 됨
	      //  나의 이름은 '엄정화' 입니다.

	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");

	      
		   // === 8. String.join("구분자", 문자열배열명) ===	★잘 기억할 것!★
		   //        문자열배열을 "구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
		   String[] nameArr = {"한석규","두석규","세석규","네석규","오석규"};
		   String names = String.join("-", nameArr);   // "-"로 이어주는 것임. return 타입은 String 타입이 나온다.
		   System.out.println(names);
		   // "한석규-두석규-세석규-네석규-오석규"
		   
		   
		   // === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") === 
	       //        "문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환.
		   names = names.replaceAll("석규", "SK");
		   System.out.println(names);	   
		   // "한Sk-두Sk-세Sk-네Sk-오Sk"
		   
		   
//?????    // === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") === 
//저렇게X	   //       "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환.
		   names = names.replaceFirst("SK", "석규");
		   System.out.println(names);	   
		   //한석규-두Sk-세Sk-네Sk-오Sk
		   
		   
		   // === 퀴즈 === //
	      // replaceFirst 를 사용하여 첫번째, 두번째, 세번째 "SK"를 "석규" 변환하세요.
	      names = "한SK-두SK-세SK-네SK-오SK";

	      System.out.println(names);
     	  //한석규-두석규-세석규-네Sk-오Sk
	      
	      for(int i=0; i<3; i++) {
	    	 names = names.replaceFirst("SK", "석규");
	     	  //한석규-두Sk-세Sk-네Sk-오Sk
	     	  //한석규-두석규-세Sk-네Sk-오Sk
	     	  //한석규-두석규-세석규-네Sk-오Sk

	      }

	      System.out.println(names);
     	  //한석규-두석규-세석규-네Sk-오Sk

	      
	      System.out.println("\n ===== 퀴즈 ===== \n");
	      
	      String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 
	       
	       // "건강" 이라는 단어가 포함된것을 출력하세요.
	      for (int i=0; i<contents.length; i++) {
	    	  int idx = contents[i].indexOf("건강");		//i번째 요소
	    	  if(idx != -1) 							// 뭘 찾을때 != -1 을 쓴다.
	    		  System.out.println(contents[i]);		// -1이 아니면 출력해라.
	      }
	      
	      /*
	       "건강하세요"
	       "즐겁고 건강한 하루되세요"
	      */
	      
	      System.out.println("====================");

	      // "건강" 이라는 단어로 시작하는것만 출력하세요.
	      for (int i=0; i<contents.length; i++) {
	    	  int idx = contents[i].indexOf("건강");	//i번째 요소
	    	  if(idx == 0) 
	    		  System.out.println(contents[i]);		// -1이 아니면 출력해라.	      
	      }
	      
	       /*
	        "건강하세요"
	        */

	      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	      
		   // 또는 아래와 같이 할수도 있습니다.
		   // === 11. "문자열".startsWith("찾고자하는문자열")  ===
		   //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
		   //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환.
		   
		   // "건강" 이라는 단어로 시작하는 것만 출력하세요.
	      for (int i=0; i<contents.length; i++) {
	    	  if(contents[i].startsWith("건강"))			//각 열마다 "건강"으로 start --> 맞으면 T, 틀리면 F 
	    		  System.out.println(contents[i]);			      
	      }
	      
	      // === 12. "문자열".endsWith("찾고자하는문자열")  ===
	      //         "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환.
	      //         "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false 를 반환.
	       
	       // "하세요" 라는 단어로 끝나는 것만 출력하세요.		// 끝날때는 ends.
	      for(int i=0; i<contents.length; i++) {
	          if(contents[i].endsWith("하세요"))			// "하세요"로 끝난다. 참이면 걔만 찍어라.
	             System.out.println(contents[i]);
	       }
	      /*
	           호호안녕하세요
	             건강하세요 
	      */
	      
	      // === 13. "문자열".trim()  === 
	      //         "문자열".trim() 은 "문자열"의  좌,우에 공백이 있으면 공백을 모두 제거하고서 반환.	(가운데는 못지움)
	      String insa = "          수고        많으셨습니다                ";
	      
	      System.out.println("하하하"+insa+"내일 뵐께요~~");
	      // 하하하          수고        많으셨습니다                내일 뵐께요~~
	      
	      System.out.println("하하하"+insa.trim()+"내일 뵐께요~~");
	      // 하하하수고        많으셨습니다내일 뵐께요~~
	
	      // === 14. "문자열".isEmpty()  === 		//empty : 텅 비어있다!
	      //         "문자열" 이 아무것도 없으면  true 를 반환해주고,
          //         "문자열" 이 뭔가 있으면  false 를 반환해준다.
	      String str1="", str2="abc", str3="        ";
	      
	      System.out.println(str1.isEmpty());  // true   (텅 비었니? =true)
	      System.out.println(str2.isEmpty());  // false  (텅 비었니? =false)
	      System.out.println(str3.isEmpty());  // false  (텅 비었니? =false)
	      System.out.println(str3.trim().isEmpty());  // (텅 비었니? =true)★★★ 많이 쓰임 (공백이지만 trim을 하고 빈문자열로 만듦)
	      //                 "".isEmpty();
	      
	      // === 15. "문자열".toUpperCase()  ===
	      //         "문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환.
	      String words = "My Name is Tom 입니다.";
	      System.out.println(words.toUpperCase());
	      // MY NAME IS TOM 입니다. 
	      
	      
	      // === 16. "문자열".toLowerCase()  ===
	      //       "문자열"에서 대문자가 있으면 모두 소문자로 변경해서 반환.
	      words = "My Name is Tom 입니다.";
	      System.out.println(words.toLowerCase());
	      // my name is tom 입니다.
	      
	      // === 17. "문자열".equals("비교대상문자열")  ===
	      //     대문자와 소문자를 구분하면서
	      //     "문자열" 과 "비교대상문자열" 의 값이 일치하면  true 를 반환.
	      //     "문자열" 과 "비교대상문자열" 의 값이 일치하지 않으면  false 를 반환. 
	      
	      
	      // === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
	      //     대문자와 소문자를 구분하지 않으면서 
	      //     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하면  true 를 반환.
	      //     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하지 않으면  false 를 반환. 
	      String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null}; 
	      
	      // 검색어를 "korea" 
	      for(int i=0; i<strArr.length; i++) {
	    	  if ("korea".equals(strArr[i])) // ★★★★★★★★ null 값이 포함되어 있을때는 strArr[i].equals("korea") 에서("korea".equals(strArr[i]))로 바꾼다 
	    		  							 // 변수에 null이 오면 안되기 때문에 (nullPointer 오류 방지!!)
	    		  							 // "korea".equals(null) (O) / null.equals(strArr[i]) (X)
	    		  System.out.println(strArr[i]);		// 문자열이 같으면 출력해라. null은 객체가 아니기 때문에 null.을 쓸 수 없다.
	      } // end of for------
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 검색어를 "korea", "KOREA", "kOReA" 와 같이 3개중에 아무거나 입력하면  
	      // "korea"," KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세" 이 출력되도록 하자.
	      
	      
	      String search = "KOREA"; // "korea", "kOReA" (셋중에 하나, 대소문자 관계없이!)
	    		  
	      for(String s: strArr) {
	    	  
	    	  search = search.toLowerCase();
	    	  //"korea" ▶ 다시 search에 넣어줌.
	    	  
	    	  if( s != null && s.toLowerCase().indexOf(search)!= -1 ) {		//전부 다 소문자로 바꿈
	    		  //s.toLowerCase() 은 "korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세"로 되어진 상태이다.
	    		  System.out.println(s);
	    	  }
	    		  
	      }//end of for---------------------------
	      /*
			korea
			KOREA seoul
			Korea 대한민국
			서울 kOrEA 만세
	       */
	      
	} // end of main(String[] args)

}
