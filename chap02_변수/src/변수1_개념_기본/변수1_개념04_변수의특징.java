package 변수1_개념_기본;

/*
	# 변수의 특징
		1. 변수는 값을 한 개만 저장할 수 있다.
		2. 그 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
		3. 같은 이름의 변수를 또다시 선언할 수 없다.
		   (= int를 같은 이름에 두 번 사용 못 한다.)
*/

public class 변수1_개념04_변수의특징 {
	public static void main(String[] args) {
		
		int num;
		num = 9;
		num = 3;
		System.out.println(num);
		
		// 주석을 지우면 에러가 난다.
		// Duplicate local variable num
		// int num = 4;
		
		// int b;
		// b = 10;
		int b = 10;
		
	}
}