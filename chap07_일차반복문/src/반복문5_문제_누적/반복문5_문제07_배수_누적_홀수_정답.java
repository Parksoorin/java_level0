package 반복문5_문제_누적;

public class 반복문5_문제07_배수_누적_홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100 ~ 300 사이의 숫자 중에서 
	            [조건1] 9의 배수이면서 홀수인 수를 출력하고, 
	            [조건2] 그 총합을 구하시오.
	        [정답]
	            117 135 153 171 189 207 225 243 261 279 297 
	            total = 2277
	    */
		
	    int total = 0;

	    int i = 100;
	    while(i <= 300) {
	        if(i % 9 == 0 && i % 2 != 0) {
	        	System.out.print(i + " ");
	            total += i;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("total = " + total);
		
	}
}
