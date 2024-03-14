package 조건3_문제_추가계산;

public class 조건문3_문제03_오이_정답 {

	public static void main(String[] args) {

		/*
			[문제]	  	
				마트에서 오이를 3개씩 묶어서 1500원에 판매한다.
				오이가 14개 필요하다면,
				필요한 금액을 출력하시오.
				단, 오이는 묶음으로만 판매한다.
			[정답]
				7500
		*/
	
		int a = 3;
		int b = 1500;
		int c = 14;
		int result = 0;
		
		int d = c / a;
		if(c % a > 0) {
			d = d + 1;
		}
		
		result = d * b;
		System.out.println(result);

	}

}
