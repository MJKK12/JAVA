package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner1Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	// System.in  은 입력장치(키보드)를 말한다.
	// System.out 은 출력장치(모니터)를 말한다.
	
	// Scanner 는 키보드에서 입력된 문자열을 읽어들이는 객체이다.
	
	System.out.print("첫번째 문장을 입력하세요 => ");
	String inputStr = sc.nextLine(); // 글자를 써준 후, 엔터를 쓰면 abcd엔터 만큼을 inputStr에 넣어주는 것임.
	/*
		sc.nextLine(); 은 키보드로 부터 입력받은 문장을 읽어들이는 것인데 
		엔터(종결신호)까지 모두 읽어들인 후 스캐너 버퍼에 아무것도 남기지 않는다. //★엔터를 사용하면 다 썼구나 하고 인식함. // sc.nextLine만 종결자가 삭제됨.!!!
	 */
	
	System.out.println("첫번째 입력한 문장 => " + inputStr + "\n"); // println+\n = 두줄띄움
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.print("정수를 입력하세요 => ");
	int inputNum = sc.nextInt(); // 2021엔터 를 입력하면 inputNum에 들어가게 됨. ★이건 삭제되는 것이 아니고 그대로 남아있음.
	/*
	    sc.nextInt(); 는 정수를 읽어들이는 것인데 
	       종결자가 공백 또는 엔터 이다. (20 21 30을 입력해도 20까지만 입력됨.)
	       종결자(공백 또는 엔터) 앞까지의 입력해준 정수를 읽어온다.
	    sc.nextInt(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
	 */
	sc.nextLine(); //엔터까지 읽어들인 후, 스캐너 버퍼에 아무것도 남기지 않는다. (스캐너 버퍼에 남아있던 찌꺼기를 싹 비우는 것이 목적이다.)
	System.out.println("입력한 정수 : " + inputNum);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.print("두번째 문장을 입력하세요 => ");
	inputStr = sc.nextLine(); // 엔터가 남아있는 상태 //글자를 써준 후, 엔터를 쓰면 abcd엔터 만큼을 inputStr에 넣어주는 것임.	
	
	System.out.println("두번째 입력한 문장 => " + inputStr + "\n"); // println+\n = 두줄띄움
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.print("실수를 입력하세요 => ");
	double inputDbl = sc.nextDouble();	//리턴타입이 double 타입
	/*
	    sc.nextDouble(); 는 실수를 읽어들이는 것인데 
	       종결자가 공백 또는 엔터 이다. 
	       종결자(공백 또는 엔터) 앞까지의 입력해준 실수를 읽어온다.
	    sc.nextDouble(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
	 */

	sc.nextLine(); //엔터까지 읽어들인 후, 스캐너 버퍼에 아무것도 남기지 않는다. (스캐너 버퍼에 남아있던 찌꺼기를 싹 비우는 것이 목적이다.)
	
	System.out.println("입력한 실수 : " + inputDbl);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	
	System.out.print("단어를 입력하세요 => ");
	String inputWord = sc.next(); // 안녕 하세요 호호호
	/*
	    sc.next(); 는 단어를 읽어들이는 것인데 
	       종결자가 공백 또는 엔터 이다. 
	       종결자(공백 또는 엔터) 앞까지의 입력해준 문자열을 읽어온다.
	    sc.next(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
	 */
	sc.nextLine(); //엔터까지 읽어들인 후, 스캐너 버퍼에 아무것도 남기지 않는다. (스캐너 버퍼에 남아있던 찌꺼기를 싹 비우는 것이 목적이다.)
	
	System.out.println("입력한 단어 : " + inputWord);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.print("세번째 문장을 입력하세요 => ");
	inputStr = sc.nextLine(); // 엔터가 남아있는 상태 //글자를 써준 후, 엔터를 쓰면 abcd엔터 만큼을 inputStr에 넣어주는 것임.	
	
	System.out.println("세번째 입력한 문장 => " + inputStr + "\n"); // println+\n = 두줄띄움
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	sc.close();		//다 썼다고 알림.. 안써도 오류는 아니지만, 써주지 않으면 Resource leak라고 경고문구가 뜸. 따라서, sc.close()를 씀으로써 깔끔하게 마무리 한다.
	
	}

}
