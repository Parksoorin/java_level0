package 반복문2_문제_배수약수;

public class 반복문2_문제06_거꾸로홀수_정답 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 10 부터 1까지 출력한다. 
	            [2] 숫자가 홀수가아닐때에는 숫자 대신 "x"를 출력한다.		
	            [3] else 를 사용하지마시오.
				
	        [정답]
				x
				9
				x
				7
				x
				5
				x
				3
				x
				1
	    */
		
		int i = 1;
		int num = 10;
		while(i <= 10) {
			
			if(num % 2 == 0) {
				System.out.println("x");
			} 
			if(num % 2 == 1) {
				System.out.println(num);
			}
			num -= 1;
			i += 1;
		}
		
	}
}
