package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제11_연속작아지기_정답 {
	public static void main(String[] args) {
		
	    /* 
	        [문제]
	            [1] 랜덤(1~100)숫자를 무한히 출력한다. 
	            [2] 처음숫자는 100부터시작한다.
	            [3] 다음 숫자가 그전숫자보다 크거나 같으면 종료한다. 
	        
	        [예시1]
	            100 96 2 45
	        
	        [예시2]
	            100 34 16 53
	    */
		
		Random ran = new Random();
		
		int num = 100;
		
	    for(boolean run = true; run == true;){
	        int num2 = ran.nextInt(100) + 1;
	        System.out.print(num2 + " ");
	        
	        if(num2 >= num){
	            run = false;
	        }else{
	            num = num2;
	        }
	    }
		
	}
}
