package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제02_약수_백의자리_순서_정답 {
	public static void main(String[] args) {
		
		 /*
	        [문제]
	            1980의 약수 중에서 순서대로 약수를 출력했을 때, 
	            백의 자리가 3인 두 번째 약수를 출력하시오.
	        [정답]
	            396  
	    */
		
	    int num = 1980;
	    int count = 0;
	    int result = 0;
	    
	    int i = 1;
	    while(i <= num) {

	        int unit = i % 1000 / 100;
	        if(num % i == 0 && unit == 3) {
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
