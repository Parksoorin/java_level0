package 이차반복문7_문제_종합응용;

import java.util.Arrays;

public class 이차반복문7_문제07_약수별개수_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            numberList 의 모든약수들의 개수를 출력하시오.
	        [해설]
	            아래 numberList 배열의 값들의 약수를 전부 divList 에 저장한다.
	            divList 배열의 숫자들을 중복없이 arrList 배열에 한개씩 저장하시오.
	        [정답]
	            약수=[1, 2, 3, 6, 9, 18, 27, 54, 1, 3, 1, 3, 9, 1, 2, 4, 8, 16, 32, 64]
					[1, 2, 3, 6, 9, 18, 27, 54, 4, 8, 16, 32, 64, 0, 0, 0, 0, 0, 0, 0]
	    */

	    int[] numberList = {54,3,9,64};
	    int[] divList = new int[20];
	    int[] arrList = new int[20];

	    int index = 0;
	    
	    for(int i = 0; i < numberList.length; i++) {
	    	for(int j = 1; j <= numberList[i]; j++) {
	    		if(numberList[i] % j == 0) {
	    			divList[index] = j;
	    			index++;
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(divList));
	    
		int index2 = 0;
		for(int i = 0; i < divList.length; i++) {
			int cnt = 0;
			for(int j = 0; j < arrList.length; j++) {
				if(divList[i] == arrList[j]) {
					cnt++;
				}
			}
			if(cnt == 0) {
				arrList[index2] = divList[i];
				index2++;
			}
		}
	    System.out.println(Arrays.toString(arrList));
	}
}
