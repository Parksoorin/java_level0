package 이차배열1_개념_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_개념04_미리값넣기 {

	public static void main(String[] args) {
		 /*
	        아래와같이 이차원으로미리 값을 넣어둘수있다. 자동으로 new[3][3] 이된것이다. 
	    */
		
		int[][] darr = {
				{1,2,3},
				{4,5,6},
				{5,6,7}
		};
	    
	    for(int i = 0; i < darr.length; i++) {
	    	System.out.println(Arrays.toString(darr[i]));
	    }
	    
	}

}
