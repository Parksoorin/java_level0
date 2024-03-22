package 반복문응용5_개념_중요알고리즘;

import java.util.Random;

public class 반복문응용5_개념02_연속숫자 {
	public static void main(String[] args) {
		
	    /*
	        [연속숫자]
	            [1] 랜덤(1~3)숫자를 무한이 반복으로 출력한다.
	            [2] 숫자 1이 연속으로 3번나오면 종료.
	        [예시]
	            1 3 3 2 2 2 3 2 3 1 3 1 2 2 1 3 2 3 3 3 3 2 1 3 1 3 1 1 1
	    */

		Random ran = new Random();
		
		int count = 0;
	    
		boolean run = true;
	    while(run){
	        int r = ran.nextInt(3) + 1;
	        System.out.print(r + " ");
	        if(r == 1){
	            count += 1;
	        }
	        else if(r !=  1){
	            count = 0;
	        }
	        if(count == 3){
	            run = false;
	        }
	    }

	}
}
