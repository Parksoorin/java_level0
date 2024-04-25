package 이차반복문4_문제_검색;

public class 이차반복문4_문제03_나빼고다른값검색_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 나머지값들과 비교해서 현재의 배열값보다 다른값만 출력하시오.
	            단, 값이 같은때에는 #을 출력하시오.
	            그리고, 내자리는 숫자대신 "*" 을출력하시오.
	        [정답]
				* 20 30 40 30 # 50 60
				10 * 30 40 30 10 50 60
				10 20 * 40 # 10 50 60
				10 20 30 * 30 10 50 60
				10 20 # 40 * 10 50 60
				# 20 30 40 30 * 50 60
				10 20 30 40 30 10 * 60
				10 20 30 40 30 10 50 *
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};
	  
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < arr.length; j++) {
	    		if(i == j) {
	    			System.out.print("*" + " ");
	    		} else if(arr[i] == arr[j]) {
	    			System.out.print("#" + " ");
	    		} else {
	    			System.out.print(arr[j] + " ");	    			
	    		}
	    	}
	    	System.out.println();
	    }
	}
}
