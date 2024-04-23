package 이차반복문5_개념_조인;

public class 이차반복문5_개념03_비교큰값b기준 {
	public static void main(String[] args) {
		
	    /*
	        아래와같이 b배열을 기준으로 하니 모양이 달라진다.
	        어떤기준으로 첫번째 for를 설정할지 주의해야한다. 
	    */
	    /*
	        [문제]
	            a배열과 b배열 전체를 비교하여 
	            b배열 의 값보다 a배열의 값들중 큰값들만 출력하시오.
	            단, 작거나 같은값은 0을 출력한다.
	            
	        [정답]
	            10 0 0 0 0 0 0
	            0 0 20 0 0 0 0
	            0 0 0 0 0 0 0
	            0 0 0 0 0 0 0
	            0 0 0 0 45 0 0
	    */

	    int[] a = {10, 20, 30, 40, 45, 68, 21};
	    int[] b = {10,  5, 20,  54, 45};

	    for(int i=0; i<b.length; i++) {
	        for(int j=0; j<a.length; j++) {
	            if(a[j] == b[i]) {
	                System.out.print(a[j] + " ");
	            }else{
	                System.out.print(0 + " ");
	            }
	        }
	        System.out.println();
	    }


	}
}
