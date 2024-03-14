package 논리2_개념_배수약수;

public class 논리2_개념01_and_배수 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수a의 값이 3의 배수이면서, 2의 배수인지 구하시오.
			[정답]
				true
		*/
	
		int a = 12;
		boolean result = a % 3 == 0 && a % 2 == 0;
	}

}
