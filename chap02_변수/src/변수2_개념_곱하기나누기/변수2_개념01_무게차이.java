package 변수2_개념_곱하기나누기;

public class 변수2_개념01_무게차이 {

	public static void main(String[] args) {
		/*
		[문제]
			철수는 자전거를 타고 2300m 떨어진 학교에 갔다. 
			철수는 운동장을 3바퀴 반을 돌고 집에 왔다. 
			운동장 1바퀴는 283m 일때,
			철수는 오늘 몇 미터를 다녀왔는지 구하시오.
			단, 소수점 두 자리까지 구하시오.
		[정답] 
			5590.50
	*/

		double a = 2300;
		double b = a * 2;
		double c = 283;
		double d = c * 3.5;
		
		double result = b+d;
		System.out.println(String.format("%.2f", result));

	}

}
