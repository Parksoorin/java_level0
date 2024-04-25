package 이차반복문4_문제_검색;

public class 이차반복문4_문제02_나빼고검색_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            배열의 각각의 값들 수만큼 반복하면서
	            배열전체를 출력하시오.
	            단, 내자리는 숫자대신 * 을출력하시오.
	        [정답]
	            * 20 30 40 30 10 50 60
	            10 * 30 40 30 10 50 60
	            10 20 * 40 30 10 50 60
	            10 20 30 * 30 10 50 60
	            10 20 30 40 * 10 50 60
	            10 20 30 40 30 * 50 60
	            10 20 30 40 30 10 * 60
	            10 20 30 40 30 10 50 *
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < arr.length; j++) {
	    		if(i == j) {
	    			System.out.print("*" + " ");
	    		} else {
	    			System.out.print(arr[j] + " ");	    			
	    		}
	    	}
	    	System.out.println();
	    }
	}
}
