package 기타조건1_개념_else;

/*
	[조건문 옵션 else]
	    [1] 조건문 if 의 옵션이며, 단독으로 사용할 수 없다. 
	    [2] if 조건이 거짓일 때 동작한다.
*/

public class 기타조건문1_개념01_엘스 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            변수 a의 값이 홀수이면 "홀수", 짝수이면 "짝수"를 출력하시오. 
	    */
		
		int a = 11;
		
	    if(a % 2 == 0) {
	        System.out.println("짝수");
	    }
	    if(a % 2 == 1) {
	        System.out.println("홀수");
	    }

	    System.out.println("-------------");

	    if(a % 2 == 0) {
	        System.out.println("홀수");
	    } else {
	        System.out.println("홀수");
	    }
		
	}
}
