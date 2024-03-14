package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제03_과락_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				[1] 0에서 100 사이의 랜덤 점수 2개를 저장해 평균을 구한다.
				[2] 평균이 60점 이상이면 "합격", 60점 미만이면 "불합격"이다.
				[3] 단, 평균이 60 이상이라도, 한 과목이라도 50 미만이면 "과락"을 출력하시오.
		*/
		
		int a = 0;
		int b = 0;
		int total = 0;
		double avg = 0;
		
		Random ran = new Random();
		a = ran.nextInt(101);
		b = ran.nextInt(101);
		
		a= 90;
		b =49;
		
		System.out.println(a + " / " + b);
		
		total = a + b;
		avg = total / 2.0;
		System.out.println(avg);
		
		if(avg >= 60 ) {
			if(a < 50 || b < 50) {
				System.out.println("과락");
			}
			if(a >= 50 && b >= 50) {
				System.out.println("합격");
			}
		}
		if(avg < 60) {
			System.out.println("불합격");
		}
		

	}

}
