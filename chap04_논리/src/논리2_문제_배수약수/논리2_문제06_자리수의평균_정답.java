package 논리2_문제_배수약수;

public class 논리2_문제06_자리수의평균_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수a의 각자리수별로 나눠서 전부 더한후, 자리수의 개수로 나눈 평균을 구한다. 
				그 평균이 5보다 크면 true 를 출력하는 식을 작성하시오.
			[정답]
				2.5
				false	
		*/
	
		int a = 3340;
		int b = (a / 1000);
		int c = (a % 1000 / 100);
		int d = (a % 100 / 10);
		int e = a % 10;
		int f = b + c + d + e;
		int g = f / 4;
		
		boolean h = (g > 5);

	}

}
