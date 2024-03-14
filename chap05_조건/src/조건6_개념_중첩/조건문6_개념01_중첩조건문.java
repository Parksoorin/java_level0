package 조건6_개념_중첩;

import java.util.Random;

public class 조건문6_개념01_중첩조건문 {

	public static void main(String[] args) {
		/*	
			철수는 시험을 치뤘다. 시험은 60점이상이면 합격이다.
			랜덤숫자(0~100)숫자 한개를 저장후 "합격" 과 "불합격" 을 출력하시오.
		*/
		
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(101);
		System.out.println(a);
		
		if(60 <= a && a <= 100) {
			System.out.println("합격(논리 연산자)");
		}
		if(0 <= a && a < 60) {
			System.out.println("불합격(논리 연산자)");
		}
		System.out.println();
		
		/*
			경우에 따라서는 중첩조건문이 식이 보기좋고 작성하기 편리할때가있다.
		*/
		if(a >= 60) {
			if(a <= 100) {
				System.out.println("합격(중첩 if문)");
			}
		}
		
		if(a >= 0) {
			if(a < 60) {
				System.out.println("불합격(중첩 if문)");
			}
		}

	}

}
