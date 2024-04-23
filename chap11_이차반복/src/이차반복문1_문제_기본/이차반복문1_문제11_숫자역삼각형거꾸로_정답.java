package 이차반복문1_문제_기본;

public class 이차반복문1_문제11_숫자역삼각형거꾸로_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래와 같이 삼각형을 출력하시오.
	        [정답]
	            1 2 3 4 5 6 7
	            2 3 4 5 6 7
	            3 4 5 6 7
	            4 5 6 7
	            5 6 7
	            6 7
	            7    
	    */
	
	    int size = 7;
	    for(int i=0; i < 7; i++) {
	
	        int num = i + 1;
	
	        for(int j= 0; j < size; j++) {
	        	System.out.print(num + " ");
	            num += 1;
	        }
	        
	        size -= 1;
	        System.out.println();
	    }


	}

}
