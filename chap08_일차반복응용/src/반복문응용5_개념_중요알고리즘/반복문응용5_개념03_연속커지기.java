package 반복문응용5_개념_중요알고리즘;

import java.util.Random;

public class 반복문응용5_개념03_연속커지기 {
	public static void main(String[] args) {
		
	    /* 
	        [문제]
	            [1] 랜덤(1~100)숫자를 무한히 출력한다. 
	            [2] 처음숫자는 1부터 시작한다.
	            [2] 다음 숫자가 그전숫자보다 작거나 같으면 종료한다. 
	        
	        [예시1]
	            1 23 32 80 1
	        
	        [예시2]
	            1 69 84 67
	    */
		
		Random ran = new Random();

	    int num = 1;
	    
	    boolean run = true;
	    while(run){
	        int next = ran.nextInt(100) + 1;
	        System.out.print(next + " ");
	        
	        if(next <= num){
	            run = false;
	        }else{
	            num = next;
	        }
	    }
		
	}
}
