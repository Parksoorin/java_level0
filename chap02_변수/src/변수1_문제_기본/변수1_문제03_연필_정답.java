package 변수1_문제_기본;

public class 변수1_문제03_연필_정답 {

	public static void main(String[] args) {
		/*
		[문제]	  	
			철수는 학용품을 정리하고 있다.
			가지고 있는 지우개와 볼펜과 연필을 모두 합치니 27개였다.
			지우개는 12개이고 볼펜이 7개라고 하면, 
			연필은 모두 몇 개인지 구하시오.
		[정답] 
			8
	*/

	/*
		[풀이]
			지우개 + 볼펜 + 연필 = 27개
			12     +  7  +  n   = 27
			n = 27 - 12 - 7
	*/
		int a = 27;
		int b = 12;
		int c = 7;
		int d = b + c;
		int result = a - d;
		System.out.println(result);

	}

}
