
package 기본2_개념_산술;

public class 기본2_개념08_나누기zero {
	public static void main(String[] args) {
		
		 /*
			[나누기 주의점]
			나누기는 0으로 나눌수는 없다.
			당연히 나머지도 0으로 나눠서 구할수없다.
			에러가 발생하므로 주의해야한다. 
			
			아래 주석을 하나씩 해제후에 실행해보자.
		  */
				
	
	//	System.out.println(10/0);	
	//	System.out.println(10%0);	
		
		
		/*
			반대는 에러가 나오지는 않으나 결과는 0이다. 
		 */
		
		System.out.println(0/10);	
		System.out.println(0%10);	
		
	}
}
