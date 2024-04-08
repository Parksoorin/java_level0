package 반복문응용6_문제_break;

public class 반복문응용6_문제01_무한반복_개수_문제 {
	public static void main(String[] args) {
		
	    /*
			[문제]
				28 의 배수중 500 이상에서 가장작은수를 출력하시오.
				단, break를 사용하시오.
			[정답]
				504
		*/
		
		int a = 500;
		
		while(true) {
			if(a % 28 == 0) {
				break;
			}
			a++;
		}
		System.out.println(a);
	}
}
