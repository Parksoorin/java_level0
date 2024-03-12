package 변수2_문제_곱하기나누기;

public class 변수2_문제03_야근수당_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				철수는 하루 8시간 아르바이트를 하고있다.
				아르바이트 수당은 한 시간에 9400원 이다. 
				
				오늘 철수는 4시간 추가 근무를 하여 총 12시간 근무를 하였다.
				오늘 추가 근무한 4시간은 야근 수당을 받게 되었다.
				오늘 철수가 받을 총 수당은 얼마인지 구하시오.
				단, 야근수당은 일반 수당의 1.5배이다.
			[정답] 
				131600
		*/
    
		/*
			[풀이]
				일반시간 = 8
				야근시간 = 4
	
				일반시급 = 9400
				야근시급 = 9400 * 1.5
	
				총 금액 = 일반시간 * 일반시급 + 야근시간 * 야근시급
		*/
			double a = 9400;
			double b = 8;
			double c = a * b;
			
			double d = 9400 * 1.5;
			double e = 4;
			double f = d * e;
			double result = c + f;
			
			System.out.println(String.format("%.0f", result));
		

	}

}
