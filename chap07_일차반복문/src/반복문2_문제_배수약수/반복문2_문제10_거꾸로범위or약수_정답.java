package 반복문2_문제_배수약수;

public class 반복문2_문제10_거꾸로범위or약수_정답 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 15 부터 1까지 출력한다. 
	            [2] 34의 약수이거나 20의 약수일때는 숫자를 출력한다. 그이외는 "x"를 출력한다.
	            [3] else 를 사용하지마시오.
				
	        [정답]
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
				5
				4
				x
				2
				1
	    */
		
		int i = 1;
		int num = 15;
		while(i <= 15) {

			if(34 % num == 0 || 20 % num == 0) {
				System.out.println(num);
			}
			if(34 % num != 0 && 20 % num != 0) {
				System.out.println("x");
			}
			num -= 1;
			i = i + 1;
		}
		
	}
}
