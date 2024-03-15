package 기타조건1_문제_else;

public class 기타조건문1_문제07_거스름돈_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]  
				철수는 편의점에서 아르바이트를 하고있다.
				현재 편의점에 준비된 잔돈은 아래와 같다.  
				각각 순서대로 a b c d 변수로 표현한다. 
				5000원권 3매
				1000원권 4매
				500원권 3개
				100원권 7개 
	
				현재 거스름돈을 8900원 거슬러줘야할때, 
				거스름돈이 충분하면 "8900원입니다" 출력,
				거스름돈이 부족하면 "거스름돈이부족합니다" 출력하시오. 
				단, else 를 사용하시오.
			[정답]
				8900원입니다
			
		*/
		
		int a = 3;
		int b=  4;
		int c = 3;
		int d = 7;

		int e = 8900;
		
		int a1 = e / 5000;
		int b1 = e % 5000 / 1000;
		int c1 = e % 1000 / 500;
		int d1 = e % 500 / 100;

		System.out.println(a1 + " " + b1 + " " + c1 + " " + d1 + "<br/>");


		if(a1 <= a && b1 <= b && c1 <= c && d1 <= d){
			System.out.println("8900원입니다");
		}
		else{
			System.out.println("거스름돈이부족합니다");
		}
		
	}
}
