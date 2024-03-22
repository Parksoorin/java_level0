package 반복문응용1_개념_약수순서;

public class 반복문응용1_개념05_약수_거꾸로_순서_비교 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            75의 약수 중에서 큰수 부터 작은수를 출력했을 때, 
	            숫자 20보다 작은수중에서 가장큰수 한개를 출력하시오.
	            
	        [정답]
	            15    
	    */

	    int num = 75;
	    int count = 0;
	    int limit = 20;
	    int result = 0;
	    
	    int i = 1;
	    int i2 = num;
	    while(i <= num) {
	        if(num % i2 == 0) {
	            // System.out.print(i2 + " ");
	            if(i2 < limit) {

	                count += 1;

	                if(count == 1){
	                    result = i2;
	                }
	               
	            }
	        }
	        i2 -= 1;
	        i += 1;
	    }
	  
	    System.out.println();
	    System.out.println(result);

	}
}
