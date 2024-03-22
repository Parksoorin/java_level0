package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제13_제한출력_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            무한반복문안에서 랜덤(1~10) 숫자 하나를 저장한다. 
	            숫자가 5이하이면 출력하고, 5초과이면 출력하지 않는다.
	            [조건1] 총 숫자가 10개 출력되면 종료한다.     
	            [조건2] 5초과의 숫자가 몇개인지 출력하시오.
	        [예시]
	            4 2 2 2 1 3 2 3 5 3
	            5초과의수=22
	    */
		
		Random ran = new Random();
		
	    int count = 0;
	    int count2 = 0;
	    for(boolean run = true; run == true;) {
	    	
	        int num = ran.nextInt(10) + 1;
	        if(num <= 5) {
	            System.out.print(num + " ");
	            count += 1;

	            if(count == 10) {
	                run = false;
	            }
	        } else{
	            count2 += 1;
	        }
	    }
	    System.out.println();
	    System.out.println("5초과의수="+count2);
		
	}
}
