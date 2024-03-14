package 비교3_문제_배수와약수;

public class 비교3_문제01_사각형_배수_정답 {

	public static void main(String[] args) {
		 /*
			[문제]
				가로가 3이고 세로가 6인 사각형 넓이가 3의 배수이면 true 가 나오는 식을 작성하시오.
			[정답]
				true
	    */
	
		int a = 3;
		int b = 6;
		int c = a * b;
		boolean d = c % 3 == 0;

	}

}
