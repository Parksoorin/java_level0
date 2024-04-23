package 이차반복문1_문제_기본;

public class 이차반복문1_문제05_숫자두개역삼각형_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            1 2 3 4 5 6 7 8
	            1 2 3 4 5 6
	            1 2 3 4
	            1 2    
	    */
	
	    int size = 8;
	    for(int i=0; i<4; i++) {
	        
	        for(int j=0; j<size; j++) {
	            System.out.print(j + 1);
	        }
	        System.out.println();
	        size -= 2;
	    }


	}

}
