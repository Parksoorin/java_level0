package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제09_처음사탕수_정답 {

	public static void main(String[] args) {
		 /*
			[문제]
				사탕 나눠주기 행사하고 있다. 
				병은 총 4병이고, 각 사탕의 개수는 각기 다르다.
				사탕은 한 사람당 25개씩 나눠주고 있다.
				count 배열은 오늘 사탕을 나눠준 사람 수다.
				remainder 배열은 사탕을 나눠주고 난 나머지이다.
				오늘 처음 가져온 사탕 수를 구하시오.
			[정답]
				candy = [80, 53, 36, 22]
			
				(1) count는 3으로 25를 곱하면 75 이고 나머지는 5이므로 원래는 80개이다.
					candy = [80]
				(2) count는 2로 25를 곱하면 50 이고 나머지는 3이므로 원래는 53개이다.
					candy = [80, 53]
				(3) count는 1로 25를 곱하면 25 이고 나머지는 11 이므로 원래는 36개이다.
					candy = [80, 53, 36]
				(4) count는 0으로 25를 곱하면 0 이고 나머지는 22이므로 원래는 22개이다.
					candy = [80, 53, 36, 22]    
	    */
	
		int[] count =	{3, 2, 1, 0};
		int[] remainder = {5, 3, 11, 22};
		
		int[] candy = {0,0,0,0};
	
		int size = count.length;
		for(int i=0; i<size; i++) {
			candy[i] = count[i] * 25 + remainder[i];
		}
		System.out.println(Arrays.toString(candy));
	

	}

}
