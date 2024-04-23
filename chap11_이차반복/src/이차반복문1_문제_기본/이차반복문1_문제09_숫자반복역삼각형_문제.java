package 이차반복문1_문제_기본;

public class 이차반복문1_문제09_숫자반복역삼각형_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            123123
	            12312
	            1231
	            123
	            12
	            1    
	    */
	
		int cnt = 6;
		for(int i = 0; i < 10; i++) {
			int a = 1;
			for(int j = 0; j < cnt; j++) {
				System.out.print(a + " ");
				if(a < 3) {
					a++;
				} else {
					a = 1;
				}
			}
			cnt--;
			System.out.println();
		}
	}

}
