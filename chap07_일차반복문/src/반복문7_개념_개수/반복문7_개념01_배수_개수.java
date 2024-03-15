package 반복문7_개념_개수;

public class 반복문7_개념01_배수_개수 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            5~15 사이의 숫자 중에서 
	            [조건1] 4의 배수를 출력하고, 
	            [조건2] 그 개수를 출력하시오.
	        [정답]
	            8 12 
	            개수 = 2    
	    */
	
	    int count = 0;
	
	    int i = 5;
	    while(i <= 15) {
	        if(i % 4 == 0) {
	        	System.out.print(i + " ");
	            count += 1;
	        }
	        i += 1;
	    }
	
	    System.out.println();
	    System.out.println("개수 = " + count);
		
	}
}
