package 조건1_문제_기본;

import java.util.Random;

public class 조건문1_문제06_합격_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 학교에서 시험을 치뤘다. 
				시험점수가 60 이상이고, 100 이하이면 합격이다.
				랜덤숫자(0~100)를 한개 저장후 철수가 합격이면 "합격" ,
				불합격이면 "불합격" 을 출력하시오.
			[예시] 
				54
				불합격
		*/
		
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(101);
		System.out.println(a);
		
		if(60 <= a && a <= 100) {
			System.out.println("합격");
		}
		if(0 <= a && a < 60) {
			System.out.println("불합격");
		}
		
	}

}
