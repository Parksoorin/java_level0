package 반복문1_문제_기본;

public class 반복문1_문제06_거꾸로문자_정답 {
	public static void main(String[] args) {
		
		 /*
			[문제] 
				아래조건을 참고하여 정답과 똑같이 출력하시오.  
				[조건1] 20~10까지 반복문을 실행하여 숫자를 출력한다.
				[조건2] 20~15까지는 "hello"을 함께 출력한다. 
				[조건3] 14~10까지는 "bye"를 함께 출력한다.
				[조건4] 숫자와 글자사이는 공백을 한칸출력한다. 
				단, else 를 사용하지마시오.
			[정답]			
				20 hello
				19 hello
				18 hello
				17 hello
				16 hello
				15 hello
				14 bye
				13 bye
				12 bye
				11 bye
				10 bye
		  */
		int num = 20;
		
		int i = 1;
		while(i <= 11) {

			if(15 <= num && num <= 20) {
				System.out.println(num + " hello");
			}
			if(10 <= num && num <= 14) {
				System.out.println(num + " bye");
			}
			num -= 1;
			i += 1;
		}
		
	}
}
