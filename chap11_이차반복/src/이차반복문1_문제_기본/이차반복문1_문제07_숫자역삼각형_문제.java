package 이차반복문1_문제_기본;

public class 이차반복문1_문제07_숫자역삼각형_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            12345
	            1234
	            123
	            12
	            1    
	    */
	
		int cnt = 5;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= cnt; j++){
				System.out.print(j + " ");
			}
			System.out.println();
			cnt -= 1;
		}

	}

}
