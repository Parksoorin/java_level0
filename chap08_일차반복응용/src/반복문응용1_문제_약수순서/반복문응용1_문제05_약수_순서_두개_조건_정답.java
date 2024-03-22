package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제05_약수_순서_두개_조건_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            100의 약수 중에서 
	            20보다 큰수중에서 1번째 약수와 2번째약수의 합을 출력하시오.
	        [정답]
	            75  
	    */
		
	    int num = 100;
	    int count = 0;
	    int result1 = 0;
	    int result2 = 0;
	    
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	        	// System.out.print(i + " ");
	            if(i > 20){
	                count += 1;
	                if(count == 1){
	                    result1 = i;
	                }
	                if(count == 2) {
	                    result2 = i;
	                }
	            }
	        }
	        i += 1;
	    }
	    /*
	        System.out.println();
	        System.out.println(result1);
	        System.out.println(result2);
	    */
	    System.out.println(result1 + result2);
		
	}
}
