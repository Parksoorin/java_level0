package 반복문응용2_문제_무한반복;

public class 반복문응용2_문제03_무한반복_개수_빼기_정답 {
	public static void main(String[] args) {
		
	    /*
			[문제] 
				다음 조건이 전부 맞는 수를 출력하시오.
				[조건1] 13의 배수를 전부 검사한다.
				[조건2] 그 중 6번째 배수에서 4번째 배수를 뺀 수를 구한다.
			[정답]
				26
		*/
		
		int count = 0;
		int result1 = 0;
		int result2 = 0;

		int i = 1;
		
		boolean run = true;
		while(run) {
			if(i % 13 == 0) {
				// System.out.print(i + " );
				count = count + 1;
				if(count == 4) {
					result1 = i;
				}
				if(count == 6) {
					result2 = i;
					run = false;
				}
			}
			if(run){
				i = i + 1;
			}
		}

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		int result3 = result2 - result1;
		System.out.println("result3 = " + result3);

		
	}
}
