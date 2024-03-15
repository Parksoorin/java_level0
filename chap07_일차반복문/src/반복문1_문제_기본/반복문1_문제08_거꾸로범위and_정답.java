package 반복문1_문제_기본;

public class 반복문1_문제08_거꾸로범위and_정답 {
	public static void main(String[] args) {
		
		/*
			[문제] 
				아래조건을 참고하여 정답과 똑같이 출력하시오.  
				[조건1] 20~10까지 반복문을 실행하여 숫자를 출력한다.
				[조건2] 15~12 사이는 원래숫자대신 원래숫자의 두배를 출력한다.
				단, else 를 사용하지마시오.
	
			[정답]			
				20
				19
				18
				17
				16
				30
				28
				26
				24
				11
				10
		 */
		int num = 20;
		
		int i = 1;
		while(i <= 11){
			if(12 <= num && num <= 15){
				System.out.println(num * 2);
				
			}
			if(num < 12 || 15 < num){
				System.out.println(num);
			}
			num -= 1;
			i += 1;
		}
		
	}
}
