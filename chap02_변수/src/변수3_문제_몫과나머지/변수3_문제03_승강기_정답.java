package 변수3_문제_몫과나머지;

public class 변수3_문제03_승강기_정답 {

	public static void main(String[] args) {
		 /*
			[문제] 
				한번에 500kg 까지 운반할 수 있는 승강기가 있다.
				몸무게가 80kg인 배달원이 이 승강기를 타고 
				하나의 무게가 30kg인 상자를 운반하려고 할 때,
				한번에 최대 몇 상자까지 운반할 수 있는지 구하시오.
			[정답]
				14
	 	*/
	
		/*
			[풀이]
				(500 - 배달원의 무게) / 30
		*/
		int a = 500;
		int b = 80;
		int c = 30;
	
		int d = a - b;
		int result = (d / c);

	}

}
