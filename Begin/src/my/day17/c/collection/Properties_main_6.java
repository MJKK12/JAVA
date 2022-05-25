package my.day17.c.collection;

import java.util.*;

public class Properties_main_6 {


	/*
	    Properties 는 HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로,
	    Hashtable 은 키와 값(Object, Object)의 형태로 저장하는데 비해서
	    ★Properties 는 (String 키, String 밸류값)의 형태로 저장하는 단순화된 컬렉션 클래스이다.	★k,V 모두 String 타입만!!★
        키는 고유해야 한다. 즉, 중복을 허락하지 않는다. 중복된 값을 넣으면 마지막에 넣은 값으로 덮어씌운다.
        주로 어플리케이션의 환경설정과 관련된 속성(property)을 저장하는데 사용되며, 
        데이터를 파일로 부터 읽고 쓰는 편리한 기능을 제공한다.    
	*/
		
	public static void main(String[] args) {

		Properties prop = new Properties();
	
		  prop.setProperty("jdk", "http://www.oracle.com/technetwork/java/javase/downloads/index.html");
	      prop.setProperty("eclipse", "http://www.sist.co.kr");
	      prop.setProperty("eclipse", "http://www.eclipse.org/downloads/eclipse-packages/");
	      prop.setProperty("oracle", "http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html");
	      
	      String url = prop.getProperty("eclipse");	// key만 넣어주면 value 값이 나온다.!!
	      System.out.println(url);
	      // http://www.eclipse.org/downloads/eclipse-packages/

	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");	
	      
	      
	      // === prop (저장소!) 에 저장된 모든 value 값들을 출력하고자 한다. ===
	      // 먼저 prop 에 저장된 key 목록을 알아봐야 한다.
	      // key 목록은 아래와 같이 하면 된다.
	      
	      // Enumeration<?> en = prop.propertyNames();		// return 타입이 Enumeration<?> :: <?>의 뜻은 아무거나! ▶ 아무거나 다 받는다는 뜻.!!
	      // <?> 는 아무거나 라는 뜻이기 때문에 == <Object> 이다. (다형성 / 모든 클래스의 최상의 부모는 Object다.)
	      // 제네릭에서 <?> 의 뜻은 ?는 아무거나를 뜻하는 것이므로 Object와 같은 의미이다.
	
	      @SuppressWarnings("unchecked")	// 소스에 노란줄이 뜨면 뜨게하지 말라는 뜻..!
	      Enumeration<String> en = (Enumeration<String>) prop.propertyNames();	// 똑같이 Enumeration<String>로 Casting 해주어야 한다.
	      // Properties prop 에서 키목록은 Enumeration<String> 형태로 반환 시켜준다.
	      
	      while(en.hasMoreElements()) {	//Enumeration 는 콜렉션이 아니고, 끄집어낼 때 사용한다.
	      
	    	  String key = en.nextElement();			// key 값을 끄집어내는 것!
	    	  String value = prop.getProperty(key);
	    	  
	    	  System.out.println(key+" = "+value);
	    	  
	      }// end of while------------------------------------------
	      
	      
	}

}
