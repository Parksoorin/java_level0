package 논리2_개념_배수약수;

public class 논리2_개념03_and_약수 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수 a의  값이 45의 약수이면서, 20의 약수인지 구하시오.
			[정답]
				true
		*/
	
		int a = 5;
		boolean result = 45 % a == 0 || 20 % a == 0;

	}

}
