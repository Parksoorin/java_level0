package 반복문7_개념_개수;

public class 반복문7_개념02_약수_개수 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [조건1] 30의 약수를 출력하고, 
	            [조건2] 그 개수를 구하시오.
	        [정답]	
	            1 2 3 5 6 10 15 30 
	            개수 =  8    
	    */
	
	    int num = 30;
	    int count = 0;
	
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	            System.out.print(i + " ");
	
	            count += 1;
	        }
	
	        i += 1;
	    }
	
	    System.out.println();
	    System.out.println("개수 = " + count);
		
	}
}
