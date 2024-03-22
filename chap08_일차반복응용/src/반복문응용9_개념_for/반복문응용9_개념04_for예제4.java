package 반복문응용9_개념_for;

import java.util.Random;

public class 반복문응용9_개념04_for예제4 {
	public static void main(String[] args) {
		
	    /*
	        [for 무한반복]
	            보통 무한반복은 while 을 사용하지만,
	            for도 불가능한건아니다.
	            아래와 같은 모양으로 사용하면된다.
	    */

	    /*
	        [문제]
	            랜덤숫자(1~10)을 무한출력한다.
	            짝수가 3번 나오면 종료.
	    */
	    
		Random ran = new Random();
		
	    int count = 0;
	    for(boolean run = true; run == true;){
	        int a = ran.nextInt(10) + 1;
	        System.out.println(a + " ");
	        
	        if(a % 2 == 0){
	            count += 1;
	        }
	        if(count == 3){
	            run = false;
	        }
	    }
	    System.out.println("종료.");

	}
}
