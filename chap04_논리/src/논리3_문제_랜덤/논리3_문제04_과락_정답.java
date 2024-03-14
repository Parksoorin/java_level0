package 논리3_문제_랜덤;

import java.util.Random;

public class 논리3_문제04_과락_정답 {

	public static void main(String[] args) {

		/*
			[문제]
				3과목의 평균이 60점 이상이면 합격이다.
				단, 평균이 합격일지라도, 어느 한 과목이 50점 미만이면 불합격이다.
				변수 a , b , c 에 랜덤으로 0~100 사이의 점수를 저장하고 합겨이면 true 를 출력하는식을 작성하시오.
			[정답]
				89 99 49
				false
		*/
		Random ran = new Random();
		
		int a = ran.nextInt(101) ;
		int b = ran.nextInt(101) ;
		int c = ran.nextInt(101) ;


		int total = a + b + c;
		double avg = total / 3.0;

		boolean result = avg >= 60 && a >= 50 && b >= 50 && c >= 50;

	}

}
