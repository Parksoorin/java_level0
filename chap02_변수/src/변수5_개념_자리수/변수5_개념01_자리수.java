package 변수5_개념_자리수;

public class 변수5_개념01_자리수 {

	public static void main(String[] args) {
		/*
        	[개념] 자리수 구하기
            
		 */
		int a = 54321;
		
		// a의 만의 자리수를 구하시오.(5)
		int b = a / 10000;
		System.out.println(b);
		
		// a의 천의 자리수를 구하시오.(4)
		int c = a % 10000 / 1000;
		System.out.println(c);
		
		// a의 백의자리수를 구하시오. (3);
		int d = a % 1000/ 100;
		System.out.println(d);
		
		// a의 십의자리수를 구하시오. (2);
		int e = a % 100/ 10;
		System.out.println(e);
		
		// a의 일의자리수를 구하시오. (1);
		int f = a % 10;
		System.out.println(f);
	}

}
