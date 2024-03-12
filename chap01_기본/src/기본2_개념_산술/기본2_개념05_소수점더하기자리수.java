
package 기본2_개념_산술;

public class 기본2_개념05_소수점더하기자리수 {
	public static void main(String[] args) {
		
		/*
		  	소수점 산술연산후 자리수를 구하기위해선 
		  	
		  	소수점 자리수 표현 
		  	String.format( 1번, 2번);
		  	
		  	[2번] 자리에 연산식을 적으면된다. 
		 
		 */
		System.out.println(String.format("%.0f", 3.3333  + 2.333));
		System.out.println(String.format("%.1f", 3.3333  + 2.333));
		System.out.println(String.format("%.2f", 3.3333  + 2.333));
		System.out.println(String.format("%.3f", 3.3333  + 2.333));
		
	}
}
