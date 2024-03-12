package 기본3_문제_곱하기와나누기;

public class 기본3_문제05_사과무게_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				사과 4개의 무게는 32g 이다. 
				사과 3개의 무게는 얼마인지 구하시오.
				소수점 두자리까지 구하시오.
			[정답] 
				24
		*/
	
		/*
			[풀이]
				사과 1개 무게
				= 사과4개 / 4
				= 32 / 4
	
				사과 3개 무게
				= 사과1개무게 * 3
				= (32 / 4) * 3
		*/
		System.out.println(String.format("%.2f", 32.0 / 4 * 3));
	}

}
