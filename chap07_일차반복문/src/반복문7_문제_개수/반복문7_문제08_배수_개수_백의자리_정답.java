package 반복문7_문제_개수;

public class 반복문7_문제08_배수_개수_백의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            1000~2000 사이의 숫자 중에서 
	            [1] 16의 배수 중에서 백의 자리가 7인 수만 출력하고, 
	            [2] 개수를 구하시오.
	        [정답]
	            1712 1728 1744 1760 1776 1792 
	            count = 6    
	    */
		
	    int count = 0;

	    int i = 1000;
	    while(i <= 2000) {
	        int unit = i % 1000 / 100;
	        if(i % 16 == 0 && unit == 7) {
	            System.out.print(i + " ");
	            count += 1;
	        }
	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);

	}
}
