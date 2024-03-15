package 기타조건1_문제_else;

import java.util.Random;

public class 기타조건문1_문제05_장학생_정답 {
	public static void main(String[] args) {
		
		/*
			[문제] 
				철수네 학교에서는 이번시험 장학생을 뽑고있다. 
				시험과목은 국어와 수학이다. 
				두 과목중 한과목이라도 100점을 받거나,
				평균이 80점이상이면 장학생이다.
				랜덤(0~100)숫자 두개를 저장한후, 
				철수의 점수가 장학생대상이면 "장학생" 출력.
				아니면 "꽝" 을 출력하시오.
				단, else 를 사용하시오.
	
			[예시]
				100 
				0
				"장학생"
		*/
		Random ran = new Random();
		
		int a = 0;
		int b = 0;
		int c = 0;
		double d = 0;
		boolean e = false;
		boolean f = false;
		
		a = ran.nextInt(101);
		b = ran.nextInt(101);
		
		c = a + b;
		d = c / 2.0;
		
		e = a == 100 || b == 100;
		f = d >= 80;
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
		if(e || f){
			System.out.println("장학생");
		}
		else{
			System.out.println("꽝");
		}
		
	}
}








