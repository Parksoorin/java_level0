package 기본3_문제_곱하기와나누기;

public class 기본3_문제10_키차이_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				민수는 키가 184cm이고,
				철수는 키가 165cm이고,
				영희는 키가 160cm이다.
				세 학생의 키의 평균에서 키가 가장 작은 학생의 차이를 구하시오.
				단, 소수점 두자리까지 구하시오.
			[정답] 
				9.67
		*/
	
		/*
			[풀이]
				평균 키
				= (민수 + 철수 + 영희) / 3
		*/
		System.out.println(String.format("%.2f", (184 + 165 + 160) / 3.0 - 160));
	}

}
