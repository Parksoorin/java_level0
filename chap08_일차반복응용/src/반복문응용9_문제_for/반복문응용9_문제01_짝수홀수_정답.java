package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제01_짝수홀수_정답 {
	public static void main(String[] args) {
		
	    /* 
	        [문제]
	            [1] 랜덤(1~10)을 무한이 출력한다.
	            [2] 짝수가 3번 나오면종료 종료한다. 
	            [3] 종료후 종료될때까지 홀수가 몇번나왔는지 출력하시오.
	        [예시]
	            4 1 3 4 1 10
	            홀수=3
	    */
		
		Random ran = new Random();
		
	    int count1 = 0;
	    int count2 = 0;
	    
	    for(boolean run = true; run == true;){
	        int r = ran.nextInt(10) + 1;
	        System.out.print(r + " ");
	        
	        if(r % 2 == 0){
	            count1 += 1;
	        }
	        if(r % 2 == 1){
	            count2 += 1;
	        }

	        if(count1 == 3){
	            run = false;
	        }
	    }
	    
	    System.out.println();
	    System.out.println("홀수="+count2);
		
	}
}
