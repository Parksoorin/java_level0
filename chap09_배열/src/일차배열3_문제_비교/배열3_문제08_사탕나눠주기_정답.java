package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제08_사탕나눠주기_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래 배열 candy는 각 병에 들어있는 사탕의 양이다. 
	            한 사람당 한 병에서 25개씩 나눠주려 한다. 
	            나눠줄 수 있는 사람 수를 count배열에 저장하시오.
	            나눠주고 남은 사탕은 remainder배열에 순차적으로 저장하시오.
	        [정답]
	            candy = 80,53,36,22
	            count = 3,2,1,0
	            remainder = 5,3,11,22
	    */
	
	    int[] candy = {80, 53, 36, 22};
	    int[] count = {0,0,0,0};
	    int[] remainder = {0,0,0,0};
	    
	    for(int i=0; i<candy.length; i++) {
	        int a = (candy[i] / 25);
	        int b = candy[i] % 25;
	        count[i] = a;
	        remainder[i] = b;
	
	      
	    }
	    System.out.println(Arrays.toString(candy));
	    System.out.println(Arrays.toString(count));
	    System.out.println(Arrays.toString(remainder));
	


	}

}
