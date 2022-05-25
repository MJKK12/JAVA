package my.day10.b.multiDimension;

public class TwoDimensionArray_main1 {

	public static void main(String[] args) {
		
		// === 1차원 배열 ===
		int[] subjectArr = new int[5];		// 1행 5열
	/*
			 ---------------------
	index==> | 0 | 1 | 2 | 3 | 4 |	
			 ---------------------
	 */
		
		// === 2차원 배열 ===
		int[][] pointArr = new int[4][3];	// 4행 3열
	/*
		index =>
				-------------------------------
				| [0][0] || [0][1] | | [0][2] | 
				-------------------------------
				| [1][0] || [1][1] | | [1][2] | 
				------------------------------- 
				| [2][0] || [2][1] | | [2][2] | 
				-------------------------------
				| [3][0] || [3][1] | | [3][2] | 
				-------------------------------
	*/
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
	//	pointArr[1][1] = 50;	==> 주석처리하면 [][]에 따라서 값이 0으로 바뀜.
		pointArr[1][2] = 60;
	
	/*
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
	*/	
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;
		
		System.out.println("pointArr.length => " + pointArr.length );
		// pointArr.length => 4
		// 이차원배열명.length => 행의 길이가 나온다.
		
		System.out.println("pointArr[0].length => " + pointArr[0].length );
		// pointArr[0].length => 3
		// 이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다. //[]번째 행에 있는 열
		
		System.out.println("pointArr[1].length => " + pointArr[1].length );
		// pointArr[1].length => 3
		// 이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
				
		System.out.println("pointArr[3].length => " + pointArr[3].length );
		// pointArr[3].length => 3
		// 이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<pointArr.length; i++) {	//행의 길이
	
			for(int j=0; j<pointArr[i].length; j++) {
				String str_add = (j<pointArr[i].length-1)?",":"\n";			// 콤마가 맨 마지막에는 찍으면 안되니까, 맨 마지막 '앞'까지만 콤마를 찍어주도록 입력.!! 마지막이라면 줄바꿈을 해준다.
				System.out.printf("%3d%s", pointArr[i][j], str_add );		// %3뒤에pointArr 오고, 콤마가 그 뒤에 온다.
			}// end of for--------------------------------

		} // end of for-----------------------------------
		
		System.out.println("\n======== 성적결과 ========\n");
						
						  // 국어 영어 수학
		int[][] jumsuArr = { {90,80,70},		// 이순신
							 {80,85,76},		// 엄정화
							 {85,70,90},		// 서강준
							 {60,80,50}			// 이혜리
							};
		int[] totalArr = new int[jumsuArr.length]; 	// 4명 = 행의 갯수		
		// 각 학생들의 총점을 저장시켜두는 곳이다.
		
		// 1. 각 학생별로 총점을 나타내어 보자.
		for(int i=0; i<jumsuArr.length; i++) {
			
			int sum = 0;
			for(int j=0; j<jumsuArr[i].length; j++) {
				sum += jumsuArr[i][j]; 			//i번째 행에 있는 j열 = 각각의 값				
			}
			
			totalArr[i] = sum;					//전체 배열 갯수 = 뺑뺑이 갯수
			
		} // end of for------------------------
		
		for(int total : totalArr) {		// 총점이 total에 하나하나 다 꺼내서 찍어줌.
			System.out.println(total);
		}
		
		/*
		 	240
		 	241
		 	245
		 	190
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[] subjectTotalArr = new int[jumsuArr[0].length];
		// 각 과목별 총점을 저장시켜두는 곳이다.
		
		// 2. 각 과목별로 총점을 나타내어 보자.
		for(int i=0; i<jumsuArr[0].length; i++) {
			
			int sum = 0;
			for(int j=0; j<jumsuArr.length; j++) {
				sum += jumsuArr[j][i];				
			}// end of for--------------------------------
			
			subjectTotalArr[i] = sum;			// 각 과목별 총점
			
		} //end of for------------------------------------
		
		System.out.println(">> 과목별 총점 <<");
		for(int total : subjectTotalArr ) {
			System.out.println(total);			//과목별 총점임.
		}
		/*
			>> 과목별 총점 <<
			315
			315
			286

		*/
		
		String[] nameArr = {"이순신","엄정화","서강준","이혜리"};		// {} 앞에 new String 생략됨.
		String[] subjectnameArr = {"국어","영어","수학"};
		
		/*
			=== 학생별 총점 ===
			이순신 : 240
			엄정화 : 241
			서강준 : 245
			이혜리 : 190
		*/
		
		System.out.println("\n======= 학생별 점수 집계 =======\n"
						 + "------------------------------\n"
						 + "학생명  국어  영어  수학  총점  평균\n"
						 + "------------------------------");
		
		// 1. 각 학생별로 총점을 나타내어 보자.
		String result = "";
		
		for(int i=0; i<jumsuArr.length; i++) {
				
				String guamokJumsu = "";
				int sum = 0;
				for(int j=0; j<jumsuArr[i].length; j++) {
					guamokJumsu += "  "+jumsuArr[i][j];
					sum += jumsuArr[i][j]; 			//i번째 행에 있는 j열 = 각각의 값				
				}// end of for---------------------------
				
				result += nameArr[i] + guamokJumsu +"  " +sum + "  " + Math.round((double)sum/3*10)/10.0 + "\n";		//(sum/3)+10 이 아니라 (double)sum/3*10)임.
				
			} // end of for------------------------
		
				System.out.println(result);
				
				/*
				------------------------------
				학생명  국어  영어  수학  총점  평균
				------------------------------
				이순신  90  80  70  240  80.0
				엄정화  80  85  76  241  80.3
				서강준  85  70  90  245  81.7
				이혜리  60  80  50  190  63.3 
				*/

				
				System.out.print("\n==== 과목별 평균 ====\n"
								   + "----------------\n");
				
				result = "";
				for(String subject : subjectnameArr) {
					result += subject + " ";
				}
				
				System.out.println(result+"\n----------------");
				
				
				
				result = "";
			
				for(int i=0; i<jumsuArr[0].length; i++) {
					
					int guamokSum = 0;
					for(int j=0; j<jumsuArr.length; j++) {
						guamokSum += jumsuArr[j][i];

					}// end of for---------------------------
					
					result += Math.round((double)guamokSum/jumsuArr.length*10)/10.0+"  "; // 행수 == 사람수 (jumsuArr.length)
					// 여기서 =만 쓰고 +를 덧붙이지 않아서 맨 마지막 과목의 평균 하나만 나오는 참사가 있었음 . . 부호를 신경쓰자!!!
					
				}// end of for---------------------------
				
				System.out.println(result);			// for 문을 빠져나간뒤에 찍어라 !
				
	}// end of main(String[] args)------------------------

}
