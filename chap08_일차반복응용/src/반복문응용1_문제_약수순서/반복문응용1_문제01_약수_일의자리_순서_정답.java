package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제01_약수_일의자리_순서_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            120의 약수 중에서 순서대로 약수를 출력했을 때, 
	            일의자리가 4인 두 번째 약수를 출력하시오.
	        [정답]
	            24  
	    */

		int num = 120;
	    int count = 0;
	    int result = 0;

	    int i = 1;
	    while(i <= num) {
	    	
	        int unit = i % 10;
	        if(num % i == 0 && unit == 4) {
	            count += 1;

	            if(count == 2) {
	                result = i;
	            }
	        }
	        i += 1;
	    }
	    
	    System.out.println(result);
		
	}
}
