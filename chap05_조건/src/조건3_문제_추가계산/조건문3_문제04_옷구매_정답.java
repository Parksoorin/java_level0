package 조건3_문제_추가계산;

public class 조건문3_문제04_옷구매_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 상점에서 24600원짜리 옷을 구매했다.
				500원짜리 동전으로만 옷값을 낸다면,
				동전이 몇 개 필요한지 구하시오.
			[정답]
				50
		*/
	
		int a = 24600;
		int b = 500;
		
		int c = a / b;
		if(a % b > 0) {
			c = c + 1;
		}
		System.out.println(c);

	}

}
