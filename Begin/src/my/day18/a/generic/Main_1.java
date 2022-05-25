package my.day18.a.generic;

import java.util.*;

public class Main_1 {

	public static void main(String[] args) {

		// Employee 만 저장할 수 있는 객체(Box_Anything)를 생성하자.
		Box_Anything<Employee> box_employee = new Box_Anything<>();
		box_employee.register(new Employee("leess","qwer","이순신","이사"));
		box_employee.register(new Employee("eomjh","qwer","엄정화","부장"));
		box_employee.register(new Employee("hongkd","qwer","홍길동","대리"));

		List<Employee> empList = box_employee.getList();
		
		for(Employee emp : empList) {
			System.out.println(emp);	//emp.toString 인데 생략가능.
		}
		
		/*
		1.아이디:leess
		2.비밀번호:qwer
		3.성명: 이순신
		4.직급: 이사
		
		1.아이디:eomjh
		2.비밀번호:qwer
		3.성명: 엄정화
		4.직급: 부장
		
		1.아이디:hongkd
		2.비밀번호:qwer
		3.성명: 홍길동
		4.직급: 대리 
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// String 만 저장할 수 있는 객체(Box_Anything)를 생성하자.
		Box_Anything<String> box_string = new Box_Anything<>();
		box_string.register("한석규");
		box_string.register("두석규");
		box_string.register("세석규");
		
		List<String> strList = box_string.getList();
			
		for(String str : strList) {
			System.out.println(str);
		}
		
		/*
		 한석규
		 두석규
		 세석규
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				
		// Integer 만 저장할 수 있는 객체(Box_Anything)를 생성하자.	// Integer이지 int가 아니다. class명을 써야 한다!!
		Box_Anything<Integer> box_int = new Box_Anything<>();
		box_int.register(10);
		box_int.register(20);
		box_int.register(30);

		List<Integer> intList = box_int.getList();
		
		for(Integer intg : intList) {
			System.out.println(intg);
		}

		/*
		 10
		 20
		 30 
		*/
	
	
	}// end of main(String[] args)----------------------------

}
