package 반복문응용1_개념_약수순서;

public class 반복문응용1_개념02_약수_순서_두개 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            45의 약수 중에서 작은 수부터 큰 수를 출력했을 때, 
	            첫번째 약수와 세번째 약수를 출력하시오.
	        [정답]
	            1
	            5    
	    */

	    int num = 45;
	    int count = 0;
	    int result1 = 0;
	    int result2 = 0;
	    
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	            // System.out.print(i + " ");
	            count += 1;
	            if(count == 1){
	                result1 = i;
	            }
	            if(count == 3) {
	                result2 = i;
	            }
	        }
	        i += 1;
	    }
	    /*
	        연속적으로 출력하는값이 아니라면, 
	        보통 반복문이 종료되고 결과를 적는것이 좋다.
	    */
	    System.out.println();
	    System.out.println(result1);
	    System.out.println(result2);
		
	}
}
