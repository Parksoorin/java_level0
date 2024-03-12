
package 기본2_개념_산술;

public class 기본2_개념04_소수점자리수 {
	public static void main(String[] args) {
		
		/*
		  	소수점 자리수 표현 
		  	String.format( 1번, 2번);
		  	
		  	[1번자리] 
		  		자리수 표현을 위한 문자를 적는다. 
			[예시]
				"%.0f" 은 소수점0자리까지..
				"%.1f" 은 소수점1자리까지..
				"%.2f" 은 소수점2자리까지..
			
			[2번자리]
				숫자를 넣는다. 
		 
		 */
		System.out.println(String.format("%.0f", 3.3333));
		System.out.println(String.format("%.1f", 3.3333));
		System.out.println(String.format("%.2f", 3.3333));
		System.out.println(String.format("%.3f", 3.3333));
		
	}
}
