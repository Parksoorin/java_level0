package 반복문2_문제_배수약수;

public class 반복문2_문제01_홀수_정답 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 10까지 출력한다. 
	            [2] 숫자가 홀수가아닐때에는 숫자 대신 "x"를 출력한다.		
	            [3] else 를 사용하지마시오.
				
	        [정답]
				1
				x
				3
				x
				5
				x
				7
				x
				9
				x
	    */
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				System.out.println("x");
			} 
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i += 1;
		}
		
	}
}
