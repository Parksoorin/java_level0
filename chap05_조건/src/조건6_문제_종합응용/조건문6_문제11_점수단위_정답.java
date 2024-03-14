package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제11_점수단위_정답 {

	public static void main(String[] args) {
	    /*
	   		[문제] 
				시험점수가 60 이상이고, 100 이하이면 합격이다.
				랜덤숫자(0~100)를 한개 저장후 철수가 합격이면 "합격" ,
				불합격이면 "불합격" 을 출력하시오.
	            단, 시험점수는 5점단위이다. 
			[예시] 
				55
				불합격
	    */
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(21);
		System.out.println(a);
		
		b = a * 5;
		System.out.println(b);
		
		if(60 <= b && b <= 100) {
			System.out.println("합격");
		}
		if(0 <= b && b < 60) {
			System.out.println("불합격");
		}

	}

}
