package 변수4_문제_누적;

public class 변수4_문제03_계단위치_정답 {

	public static void main(String[] args) {
		/*
		[문제]
			철수와 영희는 가위바위보 게임을 하고 있다. 
			규칙은 아래와 같다.	
			
			이기면 계단을 3칸 올라간다.
			비기면 계단을 1칸 올라간다. 
			지면   계단을 2칸 내려간다.
			
			50번째 계단에서 게임을 시작한다.
			
			철수는 4번 이기고 3번 비기고 2번 졌다.
			철수의 현재 위치를 구하시오.		
		[정답] 
			61
	*/

		int total = 50;
		
		int b1 = 3;
		int b2 = 1;
		int b3 = 2;

		int c1 = 4;
		int c2 = 3;
		int c3 = 2;
	
		total = total + b1 * c1;
	
		total = total + b2 * c2;
	
		total = total - b3 * c3;


	}

}
