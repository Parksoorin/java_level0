package 이차반복문1_문제_기본;

public class 이차반복문1_문제02_별두개삼각형_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]	
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            **
	            ****
	            ******
	            ********    
	    */
	
	    int size= 2;
	    for(int i=0; i < 4; i++) {
	       
	        for(int j = 0; j < size; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	        size += 2;
	    }

	}

}
