package my.day10.a.array;

public class SpaceDelete_main1 {

	public static void main(String[] args) {

		// === 입사문제 : 문자열 중 공백 제거하기 === //		

		String str ="  korea   seou l 쌍용 강북 교육센터  ";
		System.out.println(str);
		
		char[] chArr =  str.toCharArray();		// String이 주인장(문자열)에 toCharArray에 쓰면, char타입의 [] 배열이 나온다. 배열은 문자열 길이와 같다.
		
	/*
       --------------------------------------------------------------------------------------------------------------------------
       |' '|' '|'k'|'o'|'r'|'e'|'a'|' '|' '|' '|'s'|'e'|'o'|'u'|' '|'l'|' '|'쌍'|'용'|' '|'강'|'북'|' '|'교'|'육'|'센'|'터'|' '|' '|         
       --------------------------------------------------------------------------------------------------------------------------        
	*/
		str = "";
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] != ' ' ) {					// String 타입만 equals를 사용한다.
				str += chArr[i]; 					// 공백이 아니라면 str에 쌓아둔다.
			}
			System.out.println(str);
			System.out.println("글자길이 :" + str.length());
			// 
		}
		
		// "koreaseoul쌍용강북교육센터"
		
		
		
	}

}
