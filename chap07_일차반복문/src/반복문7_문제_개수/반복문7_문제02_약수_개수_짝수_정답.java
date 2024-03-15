package 반복문7_문제_개수;

public class 반복문7_문제02_약수_개수_짝수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [조건1] 18의 약수 중 짝수들만 출력하고, 
	            [조건2] 개수를 구하시오.
	        [정답]
	            2 6 18 
	            count = 3    
	    */
		
	    int num = 18;
	    int count = 0;

	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0 && i % 2 == 0) {
	            System.out.print(i + " ");
	            count += 1;
	        }

	        i += 1;
	    }
	    
	    System.out.println();
	    System.out.println("count = " + count);
	    
	}
}
