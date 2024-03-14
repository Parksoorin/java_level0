package 논리2_개념_배수약수;

public class 논리2_개념02_or_배수 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수 a의  값이 3의 배수이거나, 2의 배수인지 확인하시오.
			[정답]
				true
		*/
	
		int a = 12;
		boolean result = a % 3 == 0 || a % 2 == 0;

	}

}
