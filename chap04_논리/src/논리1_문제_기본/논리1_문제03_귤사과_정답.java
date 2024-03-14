package 논리1_문제_기본;

public class 논리1_문제03_귤사과_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				귤 6개의 무게는 840g, 사과 3개의 무게는 750g이다.
				귤 5개의 무게가 사과 2개의 무게보다 무겁고,
				귤 7개의 무게가 사과 4개의 무게보다 무거우면,
				true를 출력하시오.
			[정답]
				false
		*/
	
		double a1 = 840;
		double a2 = 750;
		double b1 = a1 / 6;
		double b2 = a2 / 3;
	
		double c1 = b1 * 5;
		double c2 = b2 * 2;
	
		double d1 = b1 * 7;
		double d2 = b2 * 4;
	
		boolean result = c1 > c2 && d1 > d2;


	}

}
