package 반복문7_문제_개수;

public class 반복문7_문제07_배수_개수_홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100 ~ 300 사이의 숫자 중에서 
	            [조건1] 9의 배수이면서 홀수인 수를 출력하고, 
	            [조건2] 위 수의 개수를 구하시오.
	        [정답]
	            117 135 153 171 189 207 225 243 261 279 297 
	            count = 11    
	     */
		
	    int count = 0;

	    int i = 100;
	    while(i <= 300) {
	        if(i % 9 == 0 && i % 2 != 0) {
	            System.out.print(i + " ");
	            count += 1;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);
		
	}
}
