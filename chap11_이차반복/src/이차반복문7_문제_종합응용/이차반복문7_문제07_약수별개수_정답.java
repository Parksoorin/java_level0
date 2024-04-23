package 이차반복문7_문제_종합응용;

import java.util.Arrays;

public class 이차반복문7_문제07_약수별개수_정답 {
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
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];

	        for(int j = 1; j <= a; j++){
	            if(a % j == 0){
	                divList[index] = j;
	                index += 1;
	            }
	        }
	    }
	    System.out.println("약수="+Arrays.toString(divList));

	    index = 0;
	    for(int i = 0; i < divList.length; i++){
	        if(arrList.length == 0){
	        	arrList[index] = divList[i];
	        	index += 1;
	            continue;
	        }
	        int a = divList[i];
	        int count = 0;
	        for(int j = 0; j < arrList.length; j++){
	            if(arrList[j] == a){
	                count += 1;
	            }
	        }
	        if(count == 0){
	        	arrList[index] = divList[i];
	        	index += 1;
	        }
	    }

	    System.out.println(Arrays.toString(arrList));

	    
		
	}
}
