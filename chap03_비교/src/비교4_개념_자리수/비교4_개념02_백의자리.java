package 비교4_개념_자리수;

public class 비교4_개념02_백의자리 {

	public static void main(String[] args) {
		/*
			[문제] 
				아래 변수 a의 값이 100의 자리가 3이면 true 가 나오는 식을 작성하시오.
	
		*/
	
		int a = 3340;
	
		int b = (a % 1000 / 100);
		boolean c = (b == 3);

	}

}
