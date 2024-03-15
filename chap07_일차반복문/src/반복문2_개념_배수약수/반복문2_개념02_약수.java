package 반복문2_개념_배수약수;

public class 반복문2_개념02_약수 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 30까지 출력한다. 
	            [2]  210의 약수가 아닐때에는 숫자대신 "x" 를 출력한다.   
	            [3] else 를 사용하지마시오.
				
	        [정답]
	          	1
				2
				3
				x
				5
				6
				7
				x
				x
				10
	    */
	
		int i = 1;
		while(i <= 10) {
			if(210 % i == 0 ) {
				System.out.println(i);
			}
			if(210 % i != 0){
				System.out.println("x");
			}
			i += 1;
		}
		
	}
}
