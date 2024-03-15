package 기타조건1_문제_else;

import java.util.Random;

public class 기타조건문1_문제03_과락_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
				[1] 0에서 100 사이의 랜덤 점수 2개를 저장해 평균을 구한다.
				[2] 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
				[3] 단, 평균이 60 이상이라도, 한 과목이라도 50 미만이면 불합격을 출력하시오.
				[4] 단, else 를 사용하시오.
		*/
		Random ran = new Random();
		
		int score1 = 0;
		int score2 = 0;
		int total = 0;
		double avg = 0;
		
		score1 = ran.nextInt(101);
		score2 = ran.nextInt(101);
		System.out.println(score1 + ", " + score2);
		
		total = score1 + score2;
		avg = total / 2.0;
		System.out.println(avg);
		
		if(avg >= 60 && score1 >= 50 && score2 >= 50) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
}
