package 반복문2_문제_배수약수;

public class 반복문2_문제07_거꾸로범위and배수_정답 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 15 부터 1까지 출력한다. 
	            [2] 5보다 크고 10보다 작으면서 3의 배수일때는 숫자를 출력하시오. 그외는 "x" 를출력하시오.
	            [3] else 를 사용하지마시오.
				
	        [정답]
				x
				x
				x
				x
				x
				x
				9
				x
				x
				6
				x
				x
				x
				x
				x
	    */
		
		int i = 1;
		int num = 15;
		while(i <= 15) {

			if(5 < num && num < 10 && num % 3 == 0) {
				System.out.println(num);
			}
			if(10 <= num || num <= 5 || num % 3 != 0) {
				System.out.println("x");
			}
			num -= 1;
			i = i + 1;
		}
		
	}
}
