package 반복문5_문제_누적;

public class 반복문5_문제10_배수_누적_일의자리_정답 {
	public static void main(String[] args) {
		
		   /*
	        [문제]
	            100~200 사이의 숫자 중에서 
	            [조건1] 6의 배수 중에서 일의 자리가 2인 수만 출력하고, 
	            [조건2] 그 합을 구하시오.
	        [정답]
	            102 132 162 192 
	            total = 588
	    */
		
	    int total = 0;

	    int i = 100;
	    while(i <= 200) {
	        int unit = i % 10;
	        if(i % 6 == 0 && unit == 2) {
	            System.out.print(i + " ");
	            total += i;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("total = " + total);
		
	}
}
