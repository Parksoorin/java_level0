package 이차반복문1_문제_기본;

public class 이차반복문1_문제03_별두개역삼각형_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            ********
	            ******
	            ****
	            **   
	    */
	
		int cnt = 8;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			cnt -= 2;
		}
		
	}

}
