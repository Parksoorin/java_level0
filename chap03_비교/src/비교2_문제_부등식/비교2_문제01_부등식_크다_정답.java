package 비교2_문제_부등식;

public class 비교2_문제01_부등식_크다_정답 {

	public static void main(String[] args) {
		/*
		[문제]
			5 * a > 2 * 2 - 9 ;
			위식의 답이 true 가 나오도록 a의 값을 구하시오. 
			단, 부등식이므로 정답에 가장가까운 정수를 구하시오. 
		[정답]
			0
	*/

		int a = 0;
	
		a = (2 * 2 - 9) / 5 + 1; // 부등식이므로 1을 더한다.
	
		boolean result = 5 * a > 2 * 2 - 9 ;
	}

}
