package 반복문응용5_문제_종합응용;

import java.util.Random;

public class 반복문응용5_문제03_랜덤업다운_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            com은 1~20 사이의 숫자를 한 개 저장한다.
	            me는 com의 숫자를 모른다고 가정하고, 1~20 사이의 숫자를 제시한다.
	            com과 me를 비교해서 "크다", "작다", "같다"를 출력하시오.

	            com은 딱 한 번만 숫자를 정하고, 
	            me는 com의 숫자를 맞출 때까지 계속 숫자를 랜덤으로 뽑는다. 
	            숫자를 맞추면 게임은 종료된다.    
	    */
		
		Random ran = new Random();
		
	    int com = ran.nextInt(20) + 1;  
	    System.out.println("com = " + com);

	    boolean run = true;
	    while(run) {

	        int me = ran.nextInt(20) + 1;
	        System.out.println("me = " + me);

	        if(com < me) {
	            System.out.println("크다");
	        } else if(com > me) {
	            System.out.println("작다");
	        } else {
	            System.out.println("같다");
	            run = false;
	        }

	    }
		
	}
}
