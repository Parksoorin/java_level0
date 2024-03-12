
package 기본2_개념_산술;

public class 기본2_개념07_연결연산자우선순위 {
	public static void main(String[] args) {
		
		
				
				System.out.println("더하기() = " + (10 + 3));				
				System.out.println("더하기 = " + 10 + 3);
				System.out.println("빼기() = " + (10 - 3));
				
				System.out.println("------------------------");
				
				System.out.println("곱하기 = " + 10 * 3);
				System.out.println("나누기(몫) = " + 10 / 3);
				System.out.println("나누기(나머지) = " + 10 % 3);
				System.out.println("나누기(소수점) = " + 10.0 / 3);
				System.out.println("------------------------");
				
				/*
				  	[문제 예시]
			  		현금이 1000원이 있다.
			  		200원짜리 과자 구입 후, 거스름돈을 출력하시오.
				 */
				System.out.println(1000 - 200);
				System.out.println("거스름 돈 = " + (1000 - 200) + "원");
				System.out.printf("거스름 돈 = %d원", (1000 - 200));
		
	}
}
