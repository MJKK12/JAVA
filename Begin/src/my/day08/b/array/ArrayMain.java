package my.day08.b.array;

public class ArrayMain {
	
	// === 메소드 파라미터 가변인수 사용하기 ===
	public int hapgae(int ... point) {
	// point는 개수의 제한이 없다.	
		int total = 0;
		for(int i=0; i<point.length; i++) {
			total += point[i];
		}
		
		return total;										// 여기서 total의 초기값을 0이라고 설정했기 때문에 마지막에 오류가 났었음. 초기값 똑바로 해라 진짜 ㅜ
		
	}// end of public int hapgae(int ... point)----------------

	public static void main(String[] args) {

		/*
		    === 배열(array)이란 ? ===
		    동일한 데이터타입을 가지는 여러개의 데이터를 저장할 수 있는 데이터 타입을 말한다. (ex. 국영수 과목같은것을 한꺼번에 처리하고자 함.)
		    그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!  (인스턴스 객체로 올라간다.!!)
		 */
		
		// 1. == 배열의 선언 ==
		   int[] subjectArr; 								// 어떤 타입을 넣을래? int , 선언만 해두었고 안올라감. new를 해야 올라가는 것임.!!
		// 또는
		// int subjectArr[];
		   
		// 2. == 선언되어진 배열을 메모리에 할당 해준다.
		   subjectArr = new int[7];							// n개의 int 타입을 메모리상에 올려보낸다.(new), 7개가 있지만, 시작은 0부터이다.
		   
		/*
		 -----------------------------
		 | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
		 ----------------------------- 
		 배열은 0부터 나감. (0호실,1호실....6호실)
		 위의 숫자는 배열의 인덱스(index)를 가리키는 번호로써 0 부터 시작하여 1씩 증가한다.
		 배열의 인덱스(index)를 "배열의 방번호" 라고 흔히 부른다. (x 번째 방)
		 
		 배열에 저장된 데이터를 표현할 때는 아래와 같이 배열명[인덱스번호]으로 나타낸다.
		 
		 subjectArr[0] (위의 그림에서 0번째에 저장되어 있는 것임)
		 subjectArr[1] 
		 subjectArr[2] 
		 subjectArr[3] 
		 subjectArr[4] 
		 subjectArr[5] 
		 subjectArr[6] 
		 
		 subjectArr[7] ==> 존재하지 않으므로 오류이다. (Overflow, 넘쳐 흘렀다.!!)
		 
		 배열은 new를 해온 인스턴스(객체) 이다.!!
		 배열로 선언된 변수에는 자동적으로 초기값이 들어간다.
		 ★암기 : 정수는 0, 실수는 0.0, char는 ' '(''과 다름), String을 포함한 객체는 null이 자동적으로 초기값으로 들어간다.  
		 (바숏인롱은 초기값이 0, char는 초기값이 공백 / 스트링을 포함한 객체는 null이 초기값.)		 		 
		 */
			
		  // === 배열의 크기(길이)는 배열명.length 로 알아온다. ===
		   System.out.println("배열 subjectArr 의 길이(크기) : " + subjectArr.length);
		   //배열 subjectArr 의 길이(크기) : 7
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   for(int i = 0; i<subjectArr.length; i++) {
			   int val = subjectArr[i]; //0,1,2,3,4,5,6 까지 나갈 것임.!!
			   System.out.println("subjectArr["+i+"] => " + val); 	// int 이므로 값이 0이 나옴.
 		   }// end of for--------------------------
		   
			// 3. == 선언되어진 배열에 값을 넣어주기 == (몇번째 방인지를 다 써온 것임.)
		   	 subjectArr[0] = 100; //국어
			 subjectArr[1] = 90; //영어
			 subjectArr[2] = 98; //수학
			 subjectArr[3] = 88; //과학
			 subjectArr[4] = 100; //사회
			 subjectArr[5] = 65; //음악
			 subjectArr[6] = 70; //체육

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");			 
			 
		   for(int i = 0; i<subjectArr.length; i++) {
			   int val = subjectArr[i]; //0,1,2,3,4,5,6 까지 나갈 것임.!!
			   System.out.println("subjectArr["+i+"] => " + val); 	// int 이므로 값이 0이 나옴.
 		   }// end of for--------------------------

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   int sum = 0; // 누적시켜줘야 하니까 변수가 또 필요해서 생성.
		   for(int i=0; i<subjectArr.length; i++) {
			   sum+=subjectArr[i]; 										//sum에 차곡차곡 쌓아둔다.
		   } //end of for---------------------------------
		   System.out.println("총점 : " + sum);
		   //총점 : 611

		   double avg = Math.round((double)sum/subjectArr.length*10)/10.0 ; //나누기 10.0 반올림!
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 87.3

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   /*
		    위의 1. == 배열의 선언 == 과
		    	2. == 선언되어진 배열을 메모리에 할당 해준다.== 을 
		    각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.		    
		   */
		   int[] subjectArr2 = new int[7];	// 배열을 선언하면서 동시에 메모리 할당시킨다. 위의 1,2번에서는 각각 따로따로 했었지만 동시에 선언&할당 가능하다.
		   
		   // 3. == 선언되어진 배열에 값을 넣어주기 == (몇번째 방인지를 다 써온 것임.)
		   	 subjectArr2[0] = 100; //국어
			 subjectArr2[1] = 90; //영어
			 subjectArr2[2] = 98; //수학
			 subjectArr2[3] = 88; //과학
			 subjectArr2[4] = 100; //사회
			 subjectArr2[5] = 65; //음악
			 subjectArr2[6] = 70; //체육

		   System.out.println("\n===========================\n");			 
			 
		   for(int i = 0; i<subjectArr2.length; i++) {
			   int val = subjectArr2[i]; //0,1,2,3,4,5,6 까지 나갈 것임.!!
			   System.out.println("subjectArr["+i+"] => " + val); 	// int 이므로 값이 0이 나옴.
		   }// end of for--------------------------

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0; // 누적시켜줘야 하니까 변수가 또 필요해서 생성.
		   for(int i=0; i<subjectArr2.length; i++) {
			   sum+=subjectArr2[i]; 										//sum에 차곡차곡 쌓아둔다.
		   } //end of for---------------------------------
		   System.out.println("총점 : " + sum);
		   //총점 : 611

		   avg = Math.round((double)sum/subjectArr2.length*10)/10.0 ; //나누기 10.0 반올림!
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 87.3

		   System.out.println("\n============================\n");
		   
		   /*
		    위의 1. == 배열의 선언 == 과
		    	2. == 선언되어진 배열을 메모리에 할당 해준다.== 과
		    	3. == 선언되어진 배열에 값을 넣어주기 == 을
		    각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.		    
		   */
		   
		   int[] subjectArr3 = new int[] {100, 90, 98, 88, 100, 65, 70};	// 배열을 선언하면서 동시에 메모리 할당시킨다. 위의 1,2번에서는 각각 따로따로 했었지만 동시에 선언&할당 가능하다.		  
		   					 //▶ 이때 []안에 크기를 넣으면 안됨.	 
		   
		   System.out.println("\n===========================\n");			 
			 
		   for(int i = 0; i<subjectArr3.length; i++) {
			   int val = subjectArr3[i]; //0,1,2,3,4,5,6 까지 나갈 것임.!!
			   System.out.println("subjectArr["+i+"] => " + val); 	// int 이므로 값이 0이 나옴.
		   }// end of for--------------------------

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0; // 누적시켜줘야 하니까 변수가 또 필요해서 생성.
		   for(int i=0; i<subjectArr3.length; i++) {
			   sum+=subjectArr3[i]; 										//sum에 차곡차곡 쌓아둔다.
		   } //end of for---------------------------------
		   System.out.println("총점 : " + sum);
		   //총점 : 611

		   avg = Math.round((double)sum/subjectArr3.length*10)/10.0 ; //나누기 10.0 반올림!
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 87.3
		   
		   System.out.println("\n============================\n");
		   
		   /*
		    위의 1. == 배열의 선언 == 과
		    	2. == 선언되어진 배열을 메모리에 할당 해준다.== 과
		    	3. == 선언되어진 배열에 값을 넣어주기 == 을
		    각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.
		    ★ new int[] 은 생략 가능하다.!!!		    
		   */
		   
		   int[] subjectArr4 = {100, 90, 98, 88, 100, 65, 70};			// 배열을 선언하면서 동시에 메모리 할당시킨다. 위의 1,2번에서는 각각 따로따로 했었지만 동시에 선언&할당 가능하다.		  
		   					 	 		   
		   System.out.println("\n===========================\n");			 
			 
		   for(int i = 0; i<subjectArr4.length; i++) {
			   int val = subjectArr4[i]; //0,1,2,3,4,5,6 까지 나갈 것임.!!
			   System.out.println("subjectArr["+i+"] => " + val); 		// int 이므로 값이 0이 나옴.
		   }// end of for--------------------------

		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   sum = 0; // 누적시켜줘야 하니까 변수가 또 필요해서 생성.
		   for(int i=0; i<subjectArr4.length; i++) {
			   sum+=subjectArr4[i]; 									//sum에 차곡차곡 쌓아둔다.
		   } //end of for---------------------------------
		   System.out.println("총점 : " + sum);
		   //총점 : 611

		   avg = Math.round((double)sum/subjectArr4.length*10)/10.0 ; //나누기 10.0 반올림!
		   
		   System.out.println("평균 : " + avg);
		   // 평균 : 87.3
		   
		   System.out.println("\n============================\n");

		   // >>> 확장된 for문(== 개선된 for문, == for each 문) <<< //
		   int total = 0;
		   for(int subj : subjectArr4) { // 100, 90, 98, 88, 100, 65, 70 // 배열을 이루는 타입이 int 이다.
			   // subjectArr4 배열의 길이(지금은 7) 만큼 반복한다.
			   // 반복하면서 배열방에 들어있던 값을 (100, 90, 98, 88, 100, 65, 70) 을 차례차례 int subj 변수 속에 넣어준다.
			   System.out.println(subj);
			   total += subj;
		   }
		   
		   System.out.println("총점(total) : " + total);
		   // 총점(total) : 611
		   
		   System.out.println("\n ===== 메소드 파라미터 가변인수 사용하기 ===== ");
		   // 맨위의 hapgae 메소드를 쓰고싶을 때! 호출!
		   // 인스턴스 메소드이기 때문에, Arraymain에 대한 클래스를 만들어야함.  (main은 실행만 함) 
		   
		   ArrayMain am1 = new ArrayMain();
		   
		   System.out.println("총점(100, 90, 98, 88, 100, 65, 70) : " + am1.hapgae(100, 90, 98, 88, 100, 65, 70) );
		   //총점(100, 90, 98, 88, 100, 65, 70) : 611
		  
		   System.out.println("총점(90, 98, 88, 65, 70) : " + am1.hapgae(90, 98, 88, 65, 70) );
		   //총점(90, 98, 88, 65, 70) : 411
		   // point는 개수의 제한이 없다.	
		   
	} // end of main(String[] args)--------------------------

}
