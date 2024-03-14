package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제02_동전한개_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            동전의 앞과 뒤를 랜덤숫자 1 또는 2로 표현한다.
	            랜덤숫자(1~2)를 a에 저장후 아래와 같이 출력하시오.
	            숫자 1이 나오면 "앞" 을출력한다.
	            숫자 2이 나오면 "뒤" 를 출력한다.
	        [예시]
	            1
	            앞
	    */
		Random ran = new Random();
	    int a = 0;
	    a = ran.nextInt(2) + 1;
	    System.out.println(a);
	
	    if(a == 1){
	    	System.out.println("앞");
	    }
	    if(a == 2){
	    	System.out.println("뒤");
	    }
	}
}
