package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제02_합10_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            1~9 사이의 랜덤 숫자 2개를 저장하고
	            그 숫자의 합이 무조건 10이 되도록 출력하시오.
	        [예시]
	            x = 9
	            y = 1    
	    */
		
		Random ran = new Random();
		
	    for(boolean run = true; run == true;) {
	        int x = ran.nextInt(9) + 1;    
	        int y = ran.nextInt(9) + 1;    
	        int total = x + y;

	        if(total == 10) {
	            System.out.println("x = " + x);
	            System.out.println("y = " + y);
	            run = false;
	        }
	    }
		
	}
}
