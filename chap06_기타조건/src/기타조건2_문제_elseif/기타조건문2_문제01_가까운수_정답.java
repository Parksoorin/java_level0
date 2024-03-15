package 기타조건2_문제_elseif;

import java.util.Random;

public class 기타조건문2_문제01_가까운수_정답 {
	public static void main(String[] args) {
		
	   /*
	        [문제]		  
	            a는 0  ~ 9  사이의 랜덤 숫자를 저장한다.
	            c는 11 ~ 20 사이의 랜덤 숫자를 저장한다. 
	            a 와 c 중 어떤 숫자가 b 와 더 가까운지 출력하시오.
	        
	            [1] a가 b보다 가까우면 "a가 가깝다."
	            [2] c가 a보다 가까우면 "c가 가깝다."
	            [3] 서로 거리가 같으면 "서로 같다."
	
	            단, else if 와 else 를 사용하시오.
	    */
		Random ran = new Random();
	
	    int b = 10;
	    int a = 0;
	    int c = 0;
	    int a1 = 0;
	    int c1 = 0;
	    
		a = ran.nextInt(10);
		c = ran.nextInt(10) + 11;

	    a1 = b - a;
	    c1 = c - a;

	    System.out.println("a차이 = " + a1);
	    System.out.println("c차이 = " + c1);

	    if(a1 < c1) {
	        System.out.println("a가 가깝다.");
	    } 
	    else if(a1 > c1) {
	        System.out.println("c가 가깝다.");
	    }
	    else {
	        System.out.println("서로 같다.");
	    }
	    
	}
}
