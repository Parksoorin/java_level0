package 반복문5_문제_누적;

public class 반복문5_문제01_약수_누적_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 30의 약수만출력한다.
	            [2] 30의약수들의 누적을 출력하시오.
	            [3] 누적앞에는 total=을 붙이시오
	        [정답]
	            1
	            2
	            3
	            5
	            6
	            10
	            15
	            30
	            total=72
	    */
		
		int num = 30;
		int total = 0;

		int i = 1;
	    while(i <= num) {

	        if(num % i == 0) {
	            System.out.println(i);
	            total += i;
	        }

	        i += 1;
	    }
	    System.out.println("total=" + total);
		
	}
}
