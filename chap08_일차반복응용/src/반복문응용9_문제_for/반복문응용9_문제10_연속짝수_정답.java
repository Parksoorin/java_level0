package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제10_연속짝수_정답 {
	public static void main(String[] args) {
		
	    /* 
	        [문제]
	            [1] 랜덤(1~10)을 무한이 출력한다.
	            [2] 짝수가 연속으로 3번나오면 종료한다.
	        [예시]
	            10 3 6 6 1 1 10 1 10 6 3 3 4 8 2
	    */

		Random ran = new Random();
		
	    int count = 0;
	    for(boolean run = true; run == true;){
	        int r = ran.nextInt(10) + 1;
	        System.out.print(r + " ");
	        
	        if(r % 2 == 0){
	            count += 1;
	        }
	        if(r % 2 == 1){
	            count = 0;
	        }
	        if(count == 3){
	            run = false;
	        }
	    }

		
	}
}
