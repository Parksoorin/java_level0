package 반복문응용2_문제_무한반복;

public class 반복문응용2_문제02_무한반복_자리수_개수_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
				9의 배수 중에서  10의 자리가 6인 첫번째 배수를 출력하시오.
			[정답]
				63
		 */
		
		int i = 1;
		int count = 0;
		int result = 0;
		
		boolean run = true;
		while(run) {

			int unit = i % 100 / 10;
			
			if(i % 9 == 0 && unit == 6) {
				count += 1;
				if(count == 1){
					result = i;
					run = false;
				}
			}
			
			if(run){
				i = i + 1;
			}
		}
		
		System.out.println(result);
		
	}
}
