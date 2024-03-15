package 반복문2_문제_배수약수;

public class 반복문2_문제04_범위and약수_정답 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 15까지 출력한다. 
	            [2] 짝수이면서 20의 약수일때는 숫자를 출력한다. 그이외는 "x"를 출력한다.
	            [3] else 를 사용하지마시오.
				
	        [정답]
	         	x
				2
				x
				4
				x
				x
				x
				x
				x
				10
				x
				x
				x
				x
				x
	    */
		
		int i = 1;
		while(i <= 15) {

			if(i % 2 == 0 && 20 % i == 0) {
				System.out.println(i);
			}
			if(i % 2 != 0 || 20 % i != 0) {
				System.out.println("x");
			}

			i = i + 1;
		}
		
	}
}
