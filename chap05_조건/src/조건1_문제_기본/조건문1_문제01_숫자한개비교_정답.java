package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제01_숫자한개비교_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            랜덤숫자(1~10)을 b에 저장한다.
	            b 가 a 보다 크면 "크다" 를 출력 하시오.
	            b 가 a 보다 작으면 "작다" 를 출력 하시오.
	            b 가 a 와 같으면 "같다" 를 출력 하시오.
	        [예시]
	            7
	            크다
	    */
		
	    int a = 5;
	    int b = 0;
	    Random ran = new Random();
	    
	    b = ran.nextInt(10) + 1;
	    System.out.println(b);
	    if(b > a){
	    	 System.out.println("크다");
	    }
	    if(b == a){
	    	 System.out.println("같다");
	    }
	    if(b < a){
	    	 System.out.println("작다");
	    }
	    
	}

}
