package 기본2_개념_산술;

public class 기본2_개념02_연산자우선순위 {
	public static void main(String[] args) {
			/*
		
			[2] 연산자 우선순위
				1순위) ()
				2순위) *  /   %
				3순위) +  -
		 */
	
		/*
			[주의]
			곱하기와 나누기는 더하기 빼기 보다 우선순위가 높다.
			그래서 더하기나 빼기를 곱하기나 나누기 보다 먼저 하고 싶으면
			() 소괄호를 이용해야 한다.
			
			10 + 3 * 3		=	19
			(10 + 3) * 3	=	39
		 */
		
		System.out.println(10 - 3 * 2);
		System.out.println((10 - 3) * 2);
		
	}
}




