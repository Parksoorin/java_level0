package 변수1_개념_기본;

/*
	# 변수(variable)
		1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
		2. 변수의 선언		: int a;	( 메모리 공간 할당 )
		3. 변수의 초기화 	: a = 10;	( 값 저장)
*/

public class 변수1_개념01_변수 {
	public static void main(String[] args) {
		
		// 자료형(Data Type)
		// int, double, char, String, boolean
		
		// 1. 정수 : integer
		int num;
		num = 10;
		System.out.println("[정수]");
		System.out.println(num);
		
		// 2. 실수 : double
		double dNum = 3.14;
		System.out.println("[실수]");
		System.out.println(dNum);
		
		// 3. 문자 한 개 : character
		char c1 = 'a';
		char c2 = '가';
		System.out.println("[한글자(char)]");
		System.out.println(c1);
		System.out.println(c2);
		
		// 4. 문자 여러개 : String
		// String만 특이하게 색상도 검정색이고, 첫글자도 대문자로 시작한다.(그 이유는 뒤에 나옴)
		String str = "java";
		System.out.println("[여러글자(String)]");
		System.out.println(str);
		
		// 5. 참과 거짓 : boolean
		boolean result1 = true;
		boolean result2 = false;
		System.out.println("[참과거짓]");
		System.out.println(result1);
		System.out.println(result2);
		
	}
}