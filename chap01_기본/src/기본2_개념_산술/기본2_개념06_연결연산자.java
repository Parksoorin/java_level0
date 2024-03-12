
package 기본2_개념_산술;

public class 기본2_개념06_연결연산자 {
	public static void main(String[] args) {
		
		/*
			더하기 : +
			(1) 더하기 : 숫자 + 숫자 => 숫자
			(2) 연결 
					문자 + 숫자 => 문자
					숫자 + 문자 => 문자
					문자 + 문자 => 문자
		 */
				// 1. 덧하기 연산자
				System.out.println(10 + 3);
				
				// 2. 연결 연산자
				//	1) "문자" + "문자" = "문자"
				System.out.println("안녕" + "하세요");
				//	2) 숫자 + "문자" = "문자"
				System.out.println(10 + "3");
				//	3) "문자" + 숫자 = "문자"
				System.out.println("10" + 3);
			
				
				System.out.println("------------------------");
				System.out.println("더하기 = " + 10 + 3);
				
				/*
					"덧셈 = " + 10 + 3
					"덧셈 = 10" + 3
					"덧셈 = 103"
				 */
			
		
	}
}
