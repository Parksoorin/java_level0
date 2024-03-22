package 반복문응용1_문제_약수순서;

public class 반복문응용1_문제06_약수_순서_거꾸로_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            852의 약수 중에서 큰 수부터 작은 수를 거꾸로 출력했을 때,
	            다섯 번째 약수만 출력하시오.
	        [정답]
	            142    
	    */
		
	    int num = 852;
	    int count = 0;
	    int result = 0;

	    int i = 1;
	    int i2 = num;
	    while(i <= num) {
	        if(num % i2 == 0) {
	            count += 1;
	            if(count == 5) {
	                result = i2;
	            }
	        }
	        i2 -= 1;
	        i += 1;
	    }
	    System.out.println(result);
		
	}
}
