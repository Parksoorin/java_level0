package 반복문응용1_개념_약수순서;

public class 반복문응용1_개념03_약수_순서_조건 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            200의 약수 중에서 작은 수부터 큰 수를 출력했을 때, 
	            숫자 30보다 큰수중에서 가장작은수를 출력하시오.
	            
	        [정답]
	            40    
	    */

	    int num = 200;
	    int count = 0;
	    int limit = 30;
	    int result = 0;
	    
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	        
	           // System.out.print(i + " "); // 여기서 출력하면 중간값이 전부 출력된다.
	           
	            if(i > limit) { // 제한보다 클때부터 개수를 센다.

	                count += 1;

	                if(count == 1){

	                    result = i;
	                }
	            }
	        }
	        i += 1;
	    }
	    /*
	        연속적으로 출력하는값이 아니라면, 
	        보통 반복문이 종료되고 결과를 적는것이 좋다.
	    */
	    System.out.println();
	    System.out.println(result);

	}
}
