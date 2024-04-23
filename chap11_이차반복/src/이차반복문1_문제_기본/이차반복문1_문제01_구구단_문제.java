package 이차반복문1_문제_기본;

public class 이차반복문1_문제01_구구단_문제 {

	public static void main(String[] args) {
			/*
	        [문제]
	            아래와 같이 2단부터 9단까지 구구단을 출력해보시오. 
	            단, 이차 반복문을 사용한다. 
	        [정답]
	            2 X 1 = 2
	            2 X 2 = 4
	            2 X 3 = 6
	            2 X 4 = 8
	            2 X 5 = 10
	            2 X 6 = 12
	            2 X 7 = 14
	            2 X 8 = 16
	            2 X 9 = 18
	    
	            3 X 1 = 3
	            3 X 2 = 6
	            3 X 3 = 9
	            3 X 4 = 12
	            ...
	            ...
	
	            9 X 8 = 72
	            9 X 9 = 81    
	    */
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (j * i));
			}
			System.out.println(" ");
		}
	    
	}
}
