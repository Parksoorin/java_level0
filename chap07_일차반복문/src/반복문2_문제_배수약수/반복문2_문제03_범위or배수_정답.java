package 반복문2_문제_배수약수;

public class 반복문2_문제03_범위or배수_정답 {
	public static void main(String[] args) {
		
		 /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 15까지 출력한다. 
	            [2] 5보다작거나 10보다 크거나 3의 배수일때는 숫자 을 출력한다. 그외는 "x"를 출력한다.
	            [3] else 를 사용하지마시오.
				
	        [정답]
	         	1
				2
				3
				4
				x
				6
				x
				x
				9
				x
				11
				12
				13
				14
				15
	    */
		
		int i = 1;
		while(i <= 15) {

			if(i < 5 || 10 < i || i % 3 == 0) {
				System.out.println(i);
			}
			if(5 <= i && i <= 10 && i % 3 != 0) {
				System.out.println("x");
			}

			i = i + 1;
		}
		
	}
}
