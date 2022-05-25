package my.day10.b.multiDimension;

public class TwoDimenssionArray_main2 {

	public static void main(String[] args) {

		int[][] numArr = new int[4][];	// 4행 null열

	/*
		// 열의 크기를 설정하지 않았으므로 NullPointerException 이 발생함. (반드시 열이 몇개인지도 꼭 넣어야 한다.!!)
		numArr[0][0] = 10;
		numArr[0][1] = 20;
		numArr[0][2] = 30;
		
		numArr[1][0] = 40;
		numArr[1][1] = 50;
		numArr[1][2] = 60;
	*/	
		
		numArr[0] = new int[3];	//0행은 3열로 설정
		numArr[1] = new int[2]; //1행은 2열로 설정
		numArr[2] = new int[4]; //2행은 4열로 설정 
		numArr[3] = new int[3]; //3행은 3열로 설정 

		
		numArr[0][0] = 10;
		numArr[0][1] = 20;
		numArr[0][2] = 30;
		
		numArr[1][0] = 40;
		numArr[1][1] = 50;
	//	numArr[1][2] = 60; // ▶ 위에 numArr[1] = new int[2];로 2개밖에 없므로, 3번째 열은 들어올 수 없음. java.lang.ArrayIndexOutOfBoundsException 발생함.
		
		numArr[2][0] = 70;
		numArr[2][2] = 90;	// [2][1]은 값을 안줬기 때문에 값이 0임.

		
		for(int i=0; i<numArr.length; i++) {			//행

			for(int j=0; j<numArr[i].length; j++) {		//열
				String str =(j<numArr[i].length-1)?",":"\n";			// 삼항연산자, 맨 마지막이 아니라면 ","를 맨마지막이라면 줄바꿈(\n)을!! length-1:꼴찌 앞잡이..
				System.out.printf("%2d%s", numArr[i][j], str);
			}//end of for------------------------
			
		}// end of for------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[][] numArr2 =  { {10,20,30},
							 {40,50},
							 {70,0,90,100},
							 {0,0,0}
						   };
		
		for(int i=0; i<numArr2.length; i++) {				//4행

			for(int j=0; j<numArr2[i].length; j++) {		//3열  2열  4열  3열
				String str =(j<numArr2[i].length-1)?",":"\n";			// 삼항연산자, 맨 마지막이 아니라면 ","를 맨마지막이라면 줄바꿈(\n)을!! length-1:꼴찌 앞잡이..
				System.out.printf("%2d%s", numArr2[i][j], str);
			}//end of for------------------------
			
		}// end of for------------------------------
		
		
		
	}// end of main(String[] args)------------------

}
