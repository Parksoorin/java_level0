package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제08_약수_순서_거꾸로_비교_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            75의 약수 중에서 큰수 부터 작은수를 출력했을 때, 
	            숫자 20보다 작은수중에서 두번째로 큰수 한개를 출력하시오.
	            
	        [정답]
	            5  
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

	                if(count == 2){
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
