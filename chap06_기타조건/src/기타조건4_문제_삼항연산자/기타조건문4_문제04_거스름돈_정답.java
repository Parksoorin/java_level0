package 기타조건4_문제_삼항연산자;

public class 기타조건문4_문제04_거스름돈_정답 {
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
				거스름돈이 충분하면 true 출력,
				거스름돈이 부족하면 false 출력하시오. 
				단, 삼항연산자 를 사용하시오.
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
		System.out.println(a1 + " " + b1 + " " + c1 + " " + d1);
		
		boolean f = a1 <= a && b1 <= b && c1 <= c && d1 <= d;

		boolean result = f ? true : false;
		System.out.println(result);
		
	}
}
