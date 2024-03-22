package 반복문응용2_문제_무한반복;

public class 반복문응용2_문제01_무한반복_개수_정답 {
	public static void main(String[] args) {
		
	    /*
			[문제]
				28 의 배수중 500 이상에서 가장작은수를 출력하시오.
			[정답]
				504
		*/
		
		int result = 0;
		int count = 0;
		int i = 1; 

		boolean run = true;
		while(run) {
			if(i % 28 == 0) {

				if(i >= 500){
				
					count += 1;
					if(count == 1){
						result = i;
						run = false;
					}
				}
			}
			if(run){
				i = i + 1;
			}
		}

		System.out.println(result);
		
	}
}
