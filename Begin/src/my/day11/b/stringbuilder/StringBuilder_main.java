package my.day11.b.stringbuilder;

public class StringBuilder_main {

	public static void main(String[] args) {

		String name = "일순신";    // 메모리상에  name 1개 소모
	           name += ",이순신";  // 메모리상에  name 1개 소모
	           name += ",삼순신";  // 메모리상에  name 1개 소모
	           name += ",사순신";  // 메모리상에  name 1개 소모
	           name += ",오순신";  // 메모리상에  name 1개 소모
	           name += ",육순신";  // 메모리상에  name 1개 소모
	           name += ",칠순신";  // 메모리상에  name 1개 소모
	           name += ",팔순신";  // 메모리상에  name 1개 소모 
	           name += ",구순신";  // 메모리상에  name 1개 소모
         
	           					  // 누적(+=)되어진 메모리상의 name은 9개 소모된다고 한다. 
	           
       System.out.println(name);
       // 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신

       name = "초기화";
       System.out.println(name);
       // 초기화
       
       System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
       StringBuilder sb = new StringBuilder();	
       // StringBuilder 가 StringBuffer 보다 가볍고 빠르다.       
       // StringBuilder 는 단일 쓰레드에서만 사용가능하다.	
       // 단일 쓰레드 => 웹용
       
       // StringBuffer sbf = new StringBuffer();	
       // StringBuffer 가 StringBuilder 보다 무겁고 다소 느리다.
       // StringBuffer 는 단일 쓰레드 및 다중 쓰레드 모두 사용 가능하다.
       // 다중 쓰레드 => 게임용
       
       // 위 처럼 +=를 한다면, 메모리 낭비가 너무 심함. 그러므로 StringBuilder를 통해 메모리 낭비를 방지한다.
       
       sb.append("일순신");
       sb.append(",이순신");
       sb.append(",삼순신");
       sb.append(",사순신");
       sb.append(",오순신");
       sb.append(",육순신");
       sb.append(",칠순신");
       sb.append(",팔순신");
       sb.append(",구순신");
       
       System.out.println(sb.toString());
       // 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
       
       // StringBuilder 의 초기화 방법 ①
       sb.setLength(0);			// 길이를 0 으로 하면 된다.
       sb.append("초기화1");
       
       System.out.println(sb.toString());
       //초기화
       
    // StringBuilder 의 초기화 방법 ②
       sb = new StringBuilder();
       sb.append("초기화2");
       
       System.out.println(sb.toString());
       //초기화2
       
       System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
     
       StringBuilder sb1 = new StringBuilder("Programming");	// 처음부터 append가 되어지고 있는 것.
       
       System.out.println("sb1.toString() => "+  sb1.toString());
       // sb1.toString() => Programming

       System.out.println("sb1 => "+  sb1);
       // sb1 => Programming
 
       System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      
       StringBuilder sb2 = sb1.replace(2, 6, "AAA");
       // sb1 인 "Programming"에서 2 번째 index 인 "o" 부터 6 번째 index 인 "m" 앞까지를 지우고 
       // 즉, "ogra" 를 지우고 그 자리에 "AAA"로 바꾸어라. (replace) 해라!
       // 그래서 sb1 은 "PrAAAmming" 으로 변경된다.
       
       System.out.println("sb1 => "+  sb1);
       // sb1 => PrAAAmming

       System.out.println("sb2 => "+  sb1);
       // sb2 => PrAAAmming
       
       System.out.println("sb1.toString() => "+  sb1.toString());
       // sb1.toString() => PrAAAmming							// 객체는 전부다 메모리주소를 가리키고 있다.

       System.out.println("sb2.toString() => "+  sb1.toString());
       // sb2.toString() => PrAAAmming

       
	}

}

// append 누적, setLength, new
// 너무 많으면 += 보다 append가 낫다. ▶ 이후에 toString 하면 됨.