package 반복문응용7_개념_continue;

import java.util.Random;

public class 반복문응용7_개념01_continue예제 {
	public static void main(String[] args) {
		
	    /*
	        [반복문 옵션 continue]
	            반복문은 내부의 모든 식을 실행하고 다시 조건으로 올라가서,
	            조건이 사실이면 또 반복하는 방법으로 사용된다.
	            continue는 반복문의 내부식을 실행하는 도중에 조건으로 바로 올라갈 때 사용한다.
	            
	            break와 마찬가지로 continue도 옵션이기 때문에 
	            사용하지않고도 식을 작성하는데 크게 문제없다.    
	    */

	    /*
	        [continue 연습방법]
	            continue를 사용할만 식은 아직은 많지 않기때문에,
	            추후에 예제안에서 자연스럽게 나오니 그때 추가로 공부한다.
	    */

	    /*
	        [문제]
	            1~9 사이의 랜덤 숫자 2개를 저장하고
	            그 숫자의 합이 무조건 10이 되도록 출력하시오.
	        [예시]
	            x = 9
	            y = 1    
	    */

	    /*
	        기존방식
	    */
		Random ran = new Random();
		
	    boolean run = true;
	    while(run) {
	        int x = ran.nextInt(9) + 1;    
	        int y = ran.nextInt(9) + 1;    
	        int total = x + y;

	        if(total == 10) {
	            System.out.println("x = " + x);
	            System.out.println("y = " + y);
	            run = false;
	        }
	    }

	    /*
	        continue 를 사용후
	    */
	    run = true;
	    while(run) {
	        int x = ran.nextInt(9) + 1;    
	        int y = ran.nextInt(9) + 1;    
	        int total = x + y;

	        if(total != 10){
	            continue; // 여기서 바로 위로 올라가니 아래가 실행되지않는다.
	        }
	        
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	        run = false;
	    }

	}
}
