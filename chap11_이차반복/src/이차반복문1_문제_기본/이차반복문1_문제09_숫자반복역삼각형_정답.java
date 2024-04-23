package 이차반복문1_문제_기본;

public class 이차반복문1_문제09_숫자반복역삼각형_정답 {

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
	
	    int size = 6;
	    for(int i = 0; i < 6; i++) {
	        int num = 1;
	        for(int j = 0; j < size; j++) {
	            System.out.print(num);
	            num += 1;
	
	            if(num == 4) {
	                num = 1;
	            }
	        }
	        System.out.println();
	        size -= 1;
	    }

	}

}
