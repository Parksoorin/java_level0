package 반복문5_문제_누적;

public class 반복문5_문제02_약수_누적_짝수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [조건1] 18의 약수 중 짝수들만 출력하고, 
	            [조건2] 총합을 출력하시오.
	        [정답]
	            2 6 18 
	            total = 26
	    */
		
	    int num = 18;

	    int total = 0;

	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0 && i % 2 == 0) {
	            System.out.print(i + " ");
	            total += i;
	        }

	        i += 1;
	    }
	    System.out.println();
	    System.out.println("total = " + total);
		
	}
}
