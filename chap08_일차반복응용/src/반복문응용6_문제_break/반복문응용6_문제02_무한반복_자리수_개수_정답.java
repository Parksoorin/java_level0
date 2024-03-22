package 반복문응용6_문제_break;

public class 반복문응용6_문제02_무한반복_자리수_개수_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
				9의 배수 중에서  10의 자리가 6인 첫번째 배수를 출력하시오.
				단, break를 사용하시오.
			[정답]
				63
		 */
		
		int i = 1;
		int count = 0;
		int result = 0;
		
		while(true) {

			int unit = i % 100 / 10;
			
			if(i % 9 == 0 && unit == 6) {
				count += 1;
				if(count == 1){
					result = i;
					break;
				}
			}
			
			i = i + 1;
			
		}
		System.out.println(result);

		
	}
}
