package 반복문2_개념_배수약수;

public class 반복문2_개념01_배수 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 10까지 출력한다. 
	            [2] 3의배수가 아니면 숫자대신 "x" 를 출력한다.
	            [3] else 를 사용하지마시오.
				
	        [정답]
	          	x
				x
				3
				x
				x
				6
				x
				x
				9
				x 
	    */
	   
		int i = 1;
		while(i <= 10) {
			
			if(i % 3 == 0) {
				System.out.println(i);
			}
			if(i % 3 > 0){
				System.out.println("x");
			}
			i += 1;
		}
		
	}
}
