package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제04_동전두개_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            동전의 앞과 뒤를 랜덤숫자 1 또는 2로 표현한다.
	            동전 두개를 던저서 동전이 둘다 앞이면 "1등" 출력
	            동전 두개를 던저서 동전이 둘다 뒤면   "2등" 출력
	            그외는 "꽝" 출력     
	        [예시]
	            1
	            2
	            꽝
	    */
		
			Random ran = new Random();
		    int a = ran.nextInt(2) + 1;
		    int b = ran.nextInt(2) + 1;
		    System.out.println(a);
		    System.out.println(b);
		    if(a == 1 && b == 1){
		    	System.out.println("1등");
		    }
		    if(a == 2 && b == 2){
		    	System.out.println("2등");
		    }
		    if(a != b){
		    	System.out.println("꽝");
		    }	    
	}

}
