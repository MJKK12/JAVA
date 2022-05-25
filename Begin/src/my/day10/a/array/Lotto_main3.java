package my.day10.a.array;

import java.util.Random;

public class Lotto_main3 {

	public static void main(String[] args) {

		//	 1 부터  45 까지의 숫자중 랜덤하게 6개의 숫자를 추출하도록 한다.
		// 101 부터 145 까지의 숫자중 랜덤하게 6개의 숫자를 추출하도록 한다.
		
		/*
			int ball ==>   1   2   3 .... 45
			int ball ==> 101 102 103 .... 145
		
			int[] ballArr = new int[45];  (전부 int 타입이므로 배열이 필요함.)
	
			---------------------------
	데이터값	| 1 | 2 | 3 |........| 45 |	
			---------------------------
	index	  0	  1	  2	 ........  44		
			
			----------------------------------
	데이터값	| 101 | 102 | 103 |........| 145 |	
			----------------------------------	
	index	   0	 1	   2	.......  44	
	
		*/
	
		int[] ballArr = new int[45];
		int[] tempArr = new int[5];	// 기존에 뽑았던 방번호를 기억시켜두는 저장소 (로또 번호가 나중에 중복으로 저장되지 않게 ..)
	/*	
				tempArr 
				------------------------------									 ------------------------
	데이터값 =>	| -1 || -1 || -1 || -1 || -1 |		▶ 뽑은 숫자들을 저장해두는 곳.	 | 0 | 20 | 35 | 18 | 3 |
				------------------------------									 ------------------------
	*/
	
		
		for(int i=0; i<ballArr.length; i++) {
			ballArr[i] = i+1;		 		// i번째, 1부터 넣겠다. 배열의 방마다 데이터값 입력하기!	
											// 데이터값은 1 ~ 45
		}
		
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1;
		}

		/*
		 	공을 꺼내어 오면 공의 방번호(index 번호)를 기억하는 곳으로 사용되는데 
		 	꺼내온 공의 방번호(index 번호)가 0(실제값은 1번공)이 들어올 수 있으므로
		 	데이터값은 방번호(index 번호)로 사용하지 않는 -1로 모두(5개) 초기화 한다. ▶ 처음부터 0번 뽑았다라고 하면 안되고, 비교를 해야하기 때문이다.
		*/
		
		// 공의 방번호(ballArr 배열의 index)를 꺼내는 작업을 6번 반복 (로또 프로그램 !!)
		// 0번 방 부터 44번 방까지 랜덤하게 6번 뽑아야 한다.
		// 즉, 0 ~ 44 까지의 난수를 발생시켜야 한다. (index) 0~44중에 6번을 뽑는다.!!
		
		Random rnd = new Random();
		
		String result = "";
		
		outer:
		for(int i=0; i<6; i++) {
			
			int idx = rnd.nextInt(44 - 0 + 1) + 0;	// 0 ~ 44
			
			for(int j=0; j<tempArr.length; j++)	{	// 지금까지 뽑아온 것과 비교해야 한다.
				if( idx == tempArr[j] ) {
					// 새로 뽑아온 방번호(idx)가 기존에 뽑은것(tempArr[j])과 같다면 다시 새로 뽑아야 한다.
					i--; 						// 한개를 뺐다가 올라가서 증가 (감소 후 증가 --> 그대로 머물러있음.) ▶ 중복된 숫자가 나올 경우 한번 더 기회를 주어야함.
					continue outer;				// 바로 위 for문의 j++ 가는것이 아니라, 맨위 for문에 라벨을 단다.
					
				} // end of if------------------
				
			} // end of for---------------------
			
			if(i<5)	{					// i는 5까지 갈 것이므로, (for문) 5보다 작아야함.
				tempArr[i] = idx;			// 	
				// 뽑은 방번호(index 번호)를 저장시켜둔다.
					
			}
			String str_add= (i<5)?",":"";
			result += ballArr[idx]+str_add;  // 뽑은 번호를 쌓아라!!
		}// end of for------------------------
		
		System.out.println("\n로또 1등 당첨번호 : " + result);
		// 로또 1등 당첨번호 : 9 9 12 7 34 20 (내가 뽑았던 번호가 또 나올 수 있는데, 그렇게 되면 안됨 . 똑같은 것이 또 나왔으면 다시 뽑아야됨..)
		
		
	} //end of main(String[] args)--------------------

}
