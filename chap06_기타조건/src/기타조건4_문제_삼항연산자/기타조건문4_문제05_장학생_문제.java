package 기타조건4_문제_삼항연산자;

import java.util.Random;

public class 기타조건문4_문제05_장학생_문제 {
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
				단, 삼항연산자 를 사용하시오.
	
			[예시]
				100 
				0
				"장학생"
		*/
		
		Random ran = new Random();
		int a = ran.nextInt(100) + 1;
		int b = ran.nextInt(100) + 1;
		
		System.out.println(a);
		System.out.println(b);
		
		boolean c = a == 100 || b == 100;
		boolean d = (a + b) / 2 >= 80;
		
		String result = (c == true || d == true) ? "장학생" : "꽝";
		System.out.println(result);
	}
}
