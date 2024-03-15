package 반복문5_개념_누적;

public class 반복문5_개념01_누적 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            1~5까지의 모든수의 합의 누적을 출력하시오.  
	            1 + 2 + 3 + 4 + 5
	        [정답] 
	            15
	    */
	
	    int total = 0;
	
	    int i = 1;
	    while(i <= 5) {
	
	        System.out.println("total = " + total + " + " + i);        
	        total += i;
	        /*
	            total = 0 + 1           1
	            total = 1 + 2           3
	            total = 3 + 3           6
	            total = 6 + 4           10
	            total = 10 + 5          15
	        */
	
	        i += 1;
	    }
	
	    System.out.println(total);
		
	}
}
