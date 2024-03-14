package 논리2_개념_배수약수;

public class 논리2_개념06_or_자리수 {

	public static void main(String[] args) {
		/*
			[문제] 
				아래 변수a의 백의 자리가 5이거나 , 십의 자리가 4이면 true를 출력하게 만드시오.
			[정답]
				true
		*/
	
		int a = 3340;
	
		int b = (a % 1000 / 100);
		int c = (a % 100 / 10);
	
		boolean result = b == 5 || c == 4;

	}

}
