package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제05_큰숫자먼저_정답 {

	public static void main(String[] args) {

		/*
			[문제] 
				랜덤숫자(1~10) 두개를 각각 저장한다.
				두숫자중 큰숫자를 먼저 출력하고 작은숫자를 뒤에 출력한다. 
				만약에 두숫자가 같으면 "같다" 를 출력한다.
			[예시1] 
				a = 4
				b = 5
				5 4
			[예시2]
				a = 3
				b = 3
				같다
		*/
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		b = ran.nextInt(10) + 1;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if(a > b) {
			System.out.println(a + " " + b);
		}
		if(a < b) {
			System.out.println(b + " " + a);
		}
		if(a == b) {
			System.out.println("같다");
		}
		
	}

}
