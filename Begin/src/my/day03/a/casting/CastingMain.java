package my.day03.a.casting;

//=== casting 연산자에 대해서 알아본다. ===

/*
	=== 데이터형 변환하기 ===
	1. 자동 형변환(묵시적 형변환)
	--> 데이터타입의 크기가 작은 것에서 크기가 큰쪽으로는 자동적으로 형변환이 발생된다. 
	
	 byte(1byte) --> short(2byte) --> int(4byte) --> long(8byte)
     	개미              병아리           강아지           사람   
        개미집           병아리집           강아지집          안방
	 
	 float(4byte) --> double(8byte) 
	 
	 --> 정수타입은 실수타입으로 자동형변환이 발생한다.
	 
	 char(2byte)
	 --> char타입은 int형으로 자동형변환이 발생한다.
	
	
	2. 강제 형변환(casting)
	--> 데이터타입의 크기가 큰것을 작은것으로 강제적으로 형변환 시키는 것을 말한다.
	              크기가작은타입 = (크기가작은타입)크기가큰타입
	             
		         실수를 정수로 강제적으로 형변환하는 것을 말한다.
		         소수부는 무조건 절삭을 해버리고 정수만 나온다.
		         정수 = (정수)실수         

*/

public class CastingMain {

	public static void main(String[] args) {

			byte no1 = 100;  //byte => 1byte   -128 ~ 127
			
			short sh = no1;	// short ==> 2byte -32768 ~ 32767
			// 위의 것은 	short sh = (short)no1;			

			System.out.println("sh => " + sh);
			// sh => 100
			
			int in = sh;	// int => 4byte	  -2,147,483,648 ~ 2,147,483,647  (대략 21억)
			// 위의 것은 int in = (int)sh;	
						
			System.out.println("in => " + in);
			// sh => 100
			
			long ln = sh;	// int => 4byte	  -2,147,483,648 ~ 2,147,483,647  (대략 21억)
			// 위의 것은 long ln = (long)in;		-9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807 
			
			System.out.println("ln => " + sh);
			// ln => 100
			
			float ft = 1.234F; //1.234가 float에 못들어감. F를 인위적으로 붙여준다
			System.out.println("ft => " + ft);	//float 단정밀도 소수점이하 7자리까지 표현됨.
			// ft => 1.234	
			
			double db = ft;	// double 배정밀도 소수점이하 15~16자리까지 표현됨.
			System.out.println("db => " + db);
			// 위의 것은 double db = (double)ft;
			// 크기가 작은것은 큰것으로 쏙 들어간다.
			// db => 1.2339999675750732
			
			System.out.println("\n ~~~~~~~~~ 강제형변환 ~~~~~~~~~\n"); //개발자가 강제로 바꿈.
			
			double db2 = 1.23456789;
			System.out.println("db2 =>" + db2);
			//db2 =>1.23456789
						
			float ft2 = (float)db2;
			System.out.println("ft2 =>" + ft2);
			//ft2 =>1.2345679
			
			//큰 것을 작은것으로 넣을 때, Casting(강제형변환) 이라고 함.
			
			int in2 = 30000;
			System.out.println("in2 => " + in2);
			//in2 => 30000
			
			short sh2 = (short)in2;
			System.out.println("sh2 => " + sh2);
			//sh2 => 30000
			
			in2 = 50000;
			sh2 = (short)in2;
			System.out.println("sh => " + sh2);
			//sh => -15536 (엉뚱한 값이 나옴 / short은 값이 32767까지만 산출되므로..)
			
			
			long ln2 = 3000000000L; // long 8byte ==> 30억이 되었다는 뜻.
			float ft3 = ln2;		// float 4byte
		// 위의 것은 float ft3 = (float)ln2; 자동형변환임 , 정수<실수 이므로.!!! 
		// --> byte로 따지는 것이 아니라, 정수타입은 실수타입으로 자동형변환이 발생한다.
			
			System.out.println("ln2 =>" + ln2);
			// ln2 => 3000000000

			System.out.println("ft3 =>" + ft3);
			// ft3 =>3.0E9 (3.0 * 10의 9승이므로 실수가 나옴)
			
			double db3 = 123.98765;
			int in3 = (int)db3;
			// 실수가 정수로 못들어가지만, int를 씀으로써 강제형변환을 실행함. (실수를 정수로 강제형변환)
			// 실수를 정수로 강제형변환하면 소수부를 잘라버리는 절삭의 효과를 가진다. (=정수부만 나온다.)
			System.out.println("db3 => " + db3);
			//db3 => 123.98765

			System.out.println("in3 => " + in3);
			//in3 => 123
			
	}

}
