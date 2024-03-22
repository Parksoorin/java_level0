package 반복문응용6_개념_break;

import java.util.Random;

public class 반복문6_개념01_break {
	public static void main(String[] args) {
		
	    /*
	        [반복문 옵션 break]
	            반복문 안에서 즉시 종료하고 싶을 때 사용한다.
	            기존엔 변수를 사용해서 제어했는데, break를 사용하면 쉽게 종료 가능하다.
	            break 를 사용하면 break가 속해있는 반복문 한개를 즉시 빠져나온다.
	        
	    */
	    /*
	        [문제]
	            무한반복문안에서 랜덤(1~10) 숫자 하나를 저장한다. 
	            숫자가 5가 나오면 반복문을 종료한다.    
	    */

		Random ran = new Random();
		
	    // 기존 방법
	    boolean run = true;
	    while(run) {
	        int num = ran.nextInt(10) + 1;
	        
	        if(num == 5) {
	            run = false;
	        }
	    }

	    // break 사용시
	    while(true) {
	        int num = ran.nextInt(10) + 1;
	        
	        if(num == 5) {
	            break;
	        }
	    }

	}
}
