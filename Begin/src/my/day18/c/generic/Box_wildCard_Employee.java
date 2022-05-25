package my.day18.c.generic;

import java.util.*;

// wildCard는 ?라는 뜻.

// ===  필드 생성시 타입에 제한이 있거나 또는 필드 생성시 제한이 없는 클래스 생성하기 === //

public class Box_wildCard_Employee { 
	
	private List<Box_Anything<?>> anything_list = new ArrayList<>();	// <?>와 <Object>는 같다.!!! (아무거나를 말하는구나.)
	//						 <?> 은 아무거나 ==> 이 필드에는 어떤 것이든지 다 들어온다.!!
	
	public void register_anything(Box_Anything<?> item) {
		anything_list.add(item);
		
	}
	
	public List<Box_Anything<?>> get_anything(){
		return anything_list;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	private List<Box_Anything<? super Employee_Child_Executive>> executive_list = new ArrayList<>();	// <?>와 <Object>는 같다.!!! (아무거나를 말하는구나.)
	//		*하한제한* : Employee_Child_Executive 까지가 끝이고, 더이상 아래로 못내려감.
	// 		? super Employee_Child_Executive 은
	// 		Employee_Child_Executive 부터 Employee_Child_Executive 의 조상클래스 (부모의 부모의 부모....) 클래스 까지만 타입으로 들어올 수 있다.
	//		임원진과 Employee인 부모만 온다.!! *하한*을 걸어두는 것!!
	
	public void register_executive(Box_Anything<? super Employee_Child_Executive> item) {
		executive_list.add(item);

	}
	
	public List<Box_Anything<? super Employee_Child_Executive>> get_executive() {
		return executive_list;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	private List<Box_Anything<? extends Employee_Child_Plain>> plain_list = new ArrayList<>();	// <?>와 <Object>는 같다.!!! (아무거나를 말하는구나.)
	// 		*상한제한* : Employee_Child_Plain 까지가 끝이고, 더이상 위로 못올라감.
	// 		? super Employee_Child_Executive 은
	// 		Employee_Child_Plain 을 포함한 Employee_Child_Plain의 자식클래스까지만(child의 child) 타입으로 들어올 수 있다. (조상은 들어올 수 없음!!)
	
	public void register_plain(Box_Anything<? extends Employee_Child_Plain> item) {
		plain_list.add(item);
	}
	
	public List<Box_Anything<? extends Employee_Child_Plain>> get_plain() {
		return plain_list;
	}
	
	
}

//오버로딩(Overloading)은 기존에 없던 새로운 메서드를 정의하는 것이고, 오버라이딩(Overriding)은 상속 받은 메서드의 내용만 변경 하는 것