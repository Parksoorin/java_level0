package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제07_약수_순서_거꾸로_빼기_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            100의 약수 중에서 큰수에서 작은수로 출력했을때,
	            2번째 약수에서 5번째 약수를 뺀 값을 구하시오.
	        [정답]
	            40 
	    */
		
		int num = 100;

	    int count = 0;
	    int result1 = 0;
	    int result2 = 0;

	    int i = 1;
	    int i2 = num;
	    while(i <= num) {
	        if(num % i2 == 0) {
	            count += 1;

	            if(count == 2) {
	                result1 = i2;
	            } else if(count == 5) {
	                result2 = i2;
	            }
	        }
	        i2 -= 1;
	        i += 1;
	    }

	    int result3 = result1 - result2;

	    System.out.println("result1 = " + result1 + ", result2 = " + result2);
	    System.out.println("result3 = " + result3);
		
	}
}
