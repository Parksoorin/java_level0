package 반복문1_문제_기본;

public class 반복문1_문제02_숫자두배_정답 {
	public static void main(String[] args) {
		
		/*
			[문제] 
				아래 조건을 참고해서  정답과 똑같이 출력하시오.
				
				[조건1] 1~5까지 반복문을 실행하여 숫자를 출력한다.
				[조건2] 바로옆에는 위숫자의 두배를 출력하시오.
				[조건3] 숫자사이는 공백을 한칸 출력하시오.
	
			[정답]			
				1 2
				2 4
				3 6
				4 8
				5 10
		 */
		
		int i = 1;
		while (i <= 5){
			System.out.println(i + " " + i * 2);
			i += 1;
		}
		
	}
}
