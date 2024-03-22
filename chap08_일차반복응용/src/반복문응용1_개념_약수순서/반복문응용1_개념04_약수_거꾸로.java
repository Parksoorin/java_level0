package 반복문응용1_개념_약수순서;

public class 반복문응용1_개념04_약수_거꾸로 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            75의 약수 중에서 큰수부터 작은수순서대로 출력했을때,
	            다섯 번째 약수를 출력하시오.
	        [정답]
	            3   
	    */

	    int num = 75;
	    int count = 0;
	    int result = 0;

	    int i = 1;
	    int i2 = num; // i는 건들지말고 i2를 활용하면된다. 
	    while(i <= num) {
	        if(num % i2 == 0) {
	            // System.out.print(i2 + " ");	// 정답확인용
	            count += 1;
	            if(count == 5) {
	                result = i2;
	            }
	        }
	        i += 1;
	        i2 -= 1;
	    }
	    /*
	        연속적으로 출력하는값이 아니라면, 
	        보통 반복문이 종료되고 결과를 적는것이 좋다.
	    */
	    System.out.println();
	    System.out.println(result);

		
	}
}
