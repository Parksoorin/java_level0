package 변수1_문제_기본;

public class 변수1_문제06_키차이_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				민수는 키가 184.4cm이고,
				철수는 키가 165.5cm이고,
				영희는 키가 160.8cm이다.
				
				가장키가큰학생에서 가징키가 작은학생의 키를 뺀값은 얼마인가?
				소수점 1자리까지 구하시오.
	
			[정답] 
				23.6
		*/
		
			double a = 184.4;
			double b = 160.8;
			double result = a - b;
			System.out.println(String.format("%.1f" , result));

	}

}
