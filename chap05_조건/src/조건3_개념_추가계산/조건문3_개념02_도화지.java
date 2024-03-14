package 조건3_개념_추가계산;

public class 조건문3_개념02_도화지 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            민수네 반 학생은 26명이다.
	            민수네반 학생들에게 도화지를 두 장씩 나누어 주려고 한다.
	            도화지는 열장씩 묶음으로만 판매하고 열장에 1200원이다.
	            총 얼마가 필요한지 구하시오.
	        [정답]
	            7200
	    */
		
		int a = 26;
		int b = a * 2;
		
		int c = 10;
		int d = 1200;
		
		int e = b / c;
		if(b % c > 0) {
			e = e + 1;
		}
		
		int result = e * d;
		System.out.println(result);

	}

}
