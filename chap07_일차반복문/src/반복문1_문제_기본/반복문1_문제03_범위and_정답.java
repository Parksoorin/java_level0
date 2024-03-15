package 반복문1_문제_기본;

public class 반복문1_문제03_범위and_정답 {
	public static void main(String[] args) {
		
		/*
			[문제] 
				아래 조건을 참고해서  정답과 똑같이 출력하시오.
				
				[조건1] 1~5까지 반복문을 실행하여 숫자를 출력한다.
				[조건2] 2~4사이는 원래숫자대신 원래숫자의 두배를 출력하시오.
	
			[정답]			
				1
				4
				6
				8
				5
		 */
		
		int i = 1;
		while(i <= 5){
			if(2 <= i && i <= 4){
				System.out.println(i * 2);
				
			}
			if(i < 2 || 4 < i){
				System.out.println(i);
			}
			i += 1;
		}
		
	}
}
