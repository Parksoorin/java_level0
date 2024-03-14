package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제03_숫자두개비교_정답 {

	public static void main(String[] args) {
		/*
        [문제]
            1부터 100 사이의 숫자 두 개를 랜덤으로 저장한다.
            두 숫자 중 더 큰 숫자를 출력하시오.
            단, 서로 같으면 "같다"를 출력하시오.
        [예시]
            76
            5
            76
	    */
		Random ran = new Random();
		int a = ran.nextInt(100) + 1;
		int b = ran.nextInt(100) + 1;
		System.out.println("a" + a);
		System.out.println("b" + b);

	    if(a > b) {
	    	System.out.println("a" + a);
	    }
	    if(a < b) {
	    	System.out.println("b" + b);
	    }
	    if(a == b) {
	        System.out.println("같다");
	    }

	}

}
