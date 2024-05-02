package 이차배열2_문제_게임;

import java.util.Arrays;

public class 이차배열2_문제02_연산자게임_정답 {

	public static void main(String[] args) {
		 /*
	         [문제]
	            game배열의 각 가로줄은 한게임을 뜻한다. 
	            첫 번째 숫자와 두 번째 숫자를 더하거나 빼거나 곱해서
	            그 결과를 total에 저장하면 된다.
	            
	          
	            위 내용을 한줄씩 내려오면 5번 반복하시오.
	        [예시]
	            [5,9,"+"] : 은 5 + 9 이다 total = [14]
	            [3,7,"-"] : 은 3 - 7 이다 total = [14, -4]
	            [8,4,"*"] : 는 8 * 4 이다 total = [14, -4, 32]
	            ...
	            나머지도같은방법으로한다.
	        [정답]
	            [14, -4, 32, 11, -2]    
    */
		String game[][] = {
			{"5", "9" , "+"},
			{"3", "7" , "-"},
	   		{"8", "4" , "*"},
			{"9", "2" , "+"},
			{"4", "6" , "-"},
		};
		int total[] = {0,0,0,0,0};

	    for(int i=0; i<game.length; i++) {
	        int result = 0;
	        int a = Integer.parseInt(game[i][0]);
	        int b = Integer.parseInt(game[i][1]);
	        if(game[i][2] == "+") {
	        	
	            result = a + b;
	        } else if(game[i][2] == "-") {
	            result = a - b;
	        } else if(game[i][2] == "*") {
	            result = a * b;
	        }

	        total[i] = result;
	    }

	    System.out.println(Arrays.toString(total));
		
		
	}

}
