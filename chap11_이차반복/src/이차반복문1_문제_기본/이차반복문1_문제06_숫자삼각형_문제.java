package 이차반복문1_문제_기본;

public class 이차반복문1_문제06_숫자삼각형_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            1
	            1 2
	            1 2 3
	            1 2 3 4
	            1 2 3 4 5	    
	    */
	
		int cnt = 2;
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= cnt; j++){
				System.out.print(j + " ");
			}
			System.out.println();
			cnt += 1;
		}

	}

}
