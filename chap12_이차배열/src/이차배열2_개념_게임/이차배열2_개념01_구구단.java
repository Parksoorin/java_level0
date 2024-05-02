package 이차배열2_개념_게임;

import java.util.Arrays;

public class 이차배열2_개념01_구구단 {

	public static void main(String[] args) {
		/*
        [문제]
            game배열의 가로 한 줄은 구구단 앞의 숫자와 뒤의 숫자를 의미한다.
             앞의 숫자와 뒤의 숫자의 곱을 result배열에 추가하시오.
        [예시]
            4 * 6 : result = [24]
            3 * 6 : result = [24, 18]
            ...
        [정답]
            result = [24, 18, 24, 81, 6, 42]    
    */

	    int game [][] = {
	        {4,6},
	        {3,6},
	        {8,3},
	        {9,9},
	        {2,3},
	        {6,7}
	       };
	    int result[] = new int[6];
	    for(int i=0; i<game.length; i++) {
	        int a = game[i][0] * game[i][1];
	        result[i] = a;
	    }
	    System.out.println(Arrays.toString(result));
	}

}
