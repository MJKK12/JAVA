package my.day17.c.collection;

import java.util.*;

public class Set_main_5 {

	/*
	    == HashSet == 
	    1. 출력시 저장된 순서가 유지되지 않는다★.
	    2. 중복된 데이터를 저장할 수 없다.
	       그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
	              
	    == LinkedHashSet ==
	    1. 출력시 저장된 순서가 유지★된다.
	    2. 중복된 데이터를 저장할 수 없다.
	       그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
	 */

	public static void main(String[] args) {

		System.out.println("\n===== HashSet =====\n");		// 순서를 꼭 지키지 않아도 될 때 쓴다!
	      
	      // 1. Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 mbrHashSet 을 생성한다. 
	      Set<Member> mbrHashSet = new HashSet<>();
	      
	      // 2. Member 클래스의 객체 6개를 생성하여 mbrHashSet 에 저장한다.
	      mbrHashSet.add(new Member("youjs","qwer1234$","유재석"));
	      mbrHashSet.add(new Member("eom","qwer1234$","엄정화"));
	      mbrHashSet.add(new Member("kanghd","qwer1234$","강호동"));
	      mbrHashSet.add(new Member("leess","qwer1234$","이순신"));	// 밑의 이순신과 다름. ▶ ()안의 내용을 보는게 아님, *메모리주소*가 다름.
	      mbrHashSet.add(new Member("kimth","qwer1234$","김태희"));
	      mbrHashSet.add(new Member("kangkc","qwer1234$","강감찬"));
	      
	      mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
	      
	      Member mbr_suji = new Member("suji", "abcd1234$", "수지");
	      Member mbr_chaew = new Member("chaew", "abcd1234$", "차은우");
	      
	      mbr_suji = mbr_chaew; // mbr_chaew 가 참조하고 있던 메모리 주소를 mbr_suji 에게 주었으므로  mbr_suji 은 new Member("chaew", "abcd1234$", "차은우"); 의 메모리 주소를 참조한다. 
	      						// mbr_chaew 는 new Member("chaew", "abcd1234$", "차은우"); 의 메모리 주소를 참조한다. 
	      						// 둘다 동일한 주소(차은우 주소)를 가리키고 있음.
	      
	      mbrHashSet.add(mbr_suji);
	      mbrHashSet.add(mbr_chaew);
	      /*
		      mbr_suji 와 mbr_chaew 는 동일한 객체(차은우)를 가리키는 것이므로 
		      이미 mbr_suji 가 저장되었으므로 mbr_chaew 는 저장되지 않는다.
	       */
	      
	      // 3. mbrHashSet 에 저장되어진 모든 Member 들의 정보를 출력한다.
	      // Set 계열은 저장된 데이터(요소)에 접근해서 읽어오기 위해서는 Iterator 를 통해서만 가능하다. 
	      
	      Iterator<Member> it = mbrHashSet.iterator();		// set 하면 무조건 iterator!
	       
	      while(it.hasNext()) {
	    	  
	    	  // it.hasNext() 은 
	          // it 에서 현재 it가 가지고 있는 여러 Member 데이터중 
	          // 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	          // 존재하면 true, 존재하지 않으면 false.
	    	  
	    	  Member mbr = it.next();	// iterator에서 끄집어 낸다.
	    	  // 실제로 Member를 it 에서  끄집어낸다.
	          // 그러면 끄집어 낸 Member는 더이상 it 에는 남아있지 않게 된다.
	    	  
	    	  mbr.infoPrint();
	    	  
	      }// end of while---------------------------
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 4. mbrHashSet 에 저장된 회원(Member)들 중에 id가 "leess" 인 회원의 정보를 출력하세요.
	      it = mbrHashSet.iterator();
	      
	      while(it.hasNext()) {
	    	
	    	  Member mbr = it.next();
	    	  if("leess".equals(mbr.getId())) {	// 끄집어 내온 id가 "leess"과 같다면!
	    		  mbr.infoPrint();
	    	  }
	    	  
	      }// end of while----------------------------------------
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 5. mbrHashSet 에 저장된 회원(Member)들 중에 id가 "leess" 인 회원을 삭제하세요.
	      it = mbrHashSet.iterator();
	      
	      while(it.hasNext()) {
	    	
	    	  Member mbr = it.next();
	    	
	    	  if("leess".equals(mbr.getId())) {	// 끄집어 내온 id가 "leess"과 같다면!
	    		  it.remove();
	    		  // mbrHashSet 에 저장된 요소(Element)를 삭제하려면
	              // Iterator를 이용한 it.remove(); 을 사용하여 삭제한다.
	    	  }
	    	  
	      }// end of while----------------------------------------

	      System.out.println("\n~~~~~~~~~~~~~~~~~~ \"leess\" 회원을 삭제한 후 ~~~~~~~~~~~~~~\n");
	      
	      it = mbrHashSet.iterator();
	      
	      while(it.hasNext()) {

	    	  it.next().infoPrint();		// 바로 위에서 이순신을 it.remove(); 를 했기 때문에 아이디"leess"인 info의 결과는 삭제되어 나오지 않는다.
	    	  
	      }// end of while----------------------------------------
	
	      
	      //////////////////////////////////////////////////////////////////////////////////////////////////////////
	      
		  System.out.println("\n===== LinkedHashSet =====\n");		// 순서를 꼭 지켜야할 때 쓴다!
	      
	      // 1. Member 클래스의 객체만을 저장할 수 있는 LinkedHashSet 객체 mbrHashSet 을 생성한다. 
	      Set<Member> mbrLinkedHashSet = new LinkedHashSet<>();
	      
	      // 2. Member 클래스의 객체 6개를 생성하여 mbrLinkedHashSet 에 저장한다.
	      mbrLinkedHashSet.add(new Member("youjs","qwer1234$","유재석"));
	      mbrLinkedHashSet.add(new Member("eom","qwer1234$","엄정화"));
	      mbrLinkedHashSet.add(new Member("kanghd","qwer1234$","강호동"));
	      mbrLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));	// 밑의 이순신과 다름. ▶ ()안의 내용을 보는게 아님, *메모리주소*가 다름.
	      mbrLinkedHashSet.add(new Member("kimth","qwer1234$","김태희"));
	      mbrLinkedHashSet.add(new Member("kangkc","qwer1234$","강감찬"));
	      
	      mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
	      
	      Member mbr_suji_2 = new Member("suji", "abcd1234$", "수지");
	      Member mbr_chaew_2 = new Member("chaew", "abcd1234$", "차은우");
	      
	      mbr_suji = mbr_chaew; // mbr_chaew_2 가 참조하고 있던 메모리 주소를 mbr_suji_2 에게 주었으므로  mbr_suji_2 은 new Member("chaew", "abcd1234$", "차은우"); 의 메모리 주소를 참조한다. 
	      						// mbr_chaew_2 는 new Member("chaew", "abcd1234$", "차은우"); 의 메모리 주소를 참조한다. 
	      						// 둘다 동일한 주소(차은우 주소)를 가리키고 있음.
	      
	      mbrLinkedHashSet.add(mbr_suji);
	      mbrLinkedHashSet.add(mbr_chaew);
	      /*
		      mbr_suji_2 와 mbr_chaew_2 는 동일한 객체(차은우)를 가리키는 것이므로 
		      이미 mbr_suji_2 가 저장되었으므로 mbr_chaew_2 는 저장되지 않는다.
	       */
	      
	      // 3. mbrLinkedHashSet 에 저장되어진 모든 Member 들의 정보를 출력한다.
	      // Set 계열은 저장된 데이터(요소)에 접근해서 읽어오기 위해서는 Iterator 를 통해서만 가능하다. 
	      
	      Iterator<Member> it2 = mbrLinkedHashSet.iterator();		// set 하면 무조건 iterator!
	       
	      while(it2.hasNext()) {
	    	  
	    	  // it.hasNext() 은 
	          // it 에서 현재 it가 가지고 있는 여러 Member 데이터중 
	          // 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	          // 존재하면 true, 존재하지 않으면 false.
	    	  
	    	  Member mbr = it2.next();	// iterator에서 끄집어 낸다.
	    	  // 실제로 Member를 it 에서  끄집어낸다.
	          // 그러면 끄집어 낸 Member는 더이상 it 에는 남아있지 않게 된다.
	    	  
	    	  mbr.infoPrint();
	    	  
	      }// end of while---------------------------
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 4. mbrLinkedHashSet 에 저장된 회원(Member)들 중에 id가 "leess" 인 회원의 정보를 출력하세요.
	      it2 = mbrLinkedHashSet.iterator();
	      
	      while(it2.hasNext()) {
	    	
	    	  Member mbr = it2.next();
	    	  if("leess".equals(mbr.getId())) {	// 끄집어 내온 id가 "leess"과 같다면!
	    		  mbr.infoPrint();
	    	  }
	    	  
	      }// end of while----------------------------------------
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 5. mbrLinkedHashSet 에 저장된 회원(Member)들 중에 id가 "leess" 인 회원을 삭제하세요.
	      it2 = mbrLinkedHashSet.iterator();
	      
	      while(it2.hasNext()) {
	    	
	    	  Member mbr = it2.next();
	    	
	    	  if("leess".equals(mbr.getId())) {	// 끄집어 내온 id가 "leess"과 같다면!
	    		  it2.remove();
	    		  // mbrLinkedHashSet 에 저장된 요소(Element)를 삭제하려면
	              // Iterator를 이용한 it.remove(); 을 사용하여 삭제한다.
	    	  }
	    	  
	      }// end of while----------------------------------------

	      System.out.println("\n~~~~~~~~~~~~~~~~~~ \"leess\" 회원을 삭제한 후 ~~~~~~~~~~~~~~\n");
	      
	      it2 = mbrLinkedHashSet.iterator();
	      
	      while(it2.hasNext()) {

	    	  it2.next().infoPrint();		// 바로 위에서 이순신을 it.remove(); 를 했기 때문에 아이디"leess"인 info의 결과는 삭제되어 나오지 않는다.
	    	  
	      }// end of while----------------------------------------
	      

	      
		      
	}// end of main(String[] args)------------------------------------------------

}
