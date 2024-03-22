package 반복문응용6_문제_break;

public class 반복문응용6_문제01_무한반복_개수_정답 {
	public static void main(String[] args) {
		
	    /*
			[문제]
				28 의 배수중 500 이상에서 가장작은수를 출력하시오.
				단, break를 사용하시오.
			[정답]
				504
		*/
		
		int result = 0;
		int count = 0;
		int i = 1; 

		while(true) {
			if(i % 28 == 0) {

				if(i >= 500){
				
					count += 1;
					if(count == 1){
						result = i;
						break;
					}
				}
			}
			
			i = i + 1;
			
		}

		System.out.println(result);

		
	}
}
