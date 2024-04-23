package 이차반복문5_개념_조인;

public class 이차반복문5_개념02_비교큰값a기준 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            a배열과 b배열 전체를 비교하여 
	            a배열 의 값보다 b배열의 큰값들만 출력하시오.
	            단, 작거나 같은값은 0을 출력한다.
	        [정답]
	            0 0 20 54 45 
				10 5 20 54 45 
				0 0 0 54 45 
				0 0 20 54 45 
				0 0 0 54 0 
				0 0 0 0 0 
				0 0 0 54 45 
	    */

	    int[] a = {10, 2, 34, 13, 45, 68, 21};
	    int[] b = {10, 5, 20, 54, 45};

	    for(int i=0; i<a.length; i++) {
	        for(int j=0; j<b.length; j++) {
	            if(a[i] < b[j]) {
	                System.out.print(b[j] + " ");
	            }else{
	                System.out.print(0 + " ");
	            }
	        }
	        System.out.println();
	    }


	}
}
