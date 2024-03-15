package 반복문5_문제_누적;

public class 반복문5_문제09_배수_누적_십의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100~200 사이의 숫자 중에서
	            [조건1] 9의 배수 중에서 십의 자리가 7인 수만 출력하고, 
	            [조건2] 그 합을 구하시오.
	        [정답] 
	            171 
	            total = 171
	    */
		
	    int total = 0;

	    int i = 100;
	    while(i <= 200) {
	        int unit = i % 100 / 10;
	        if(i % 9 == 0 && unit == 7) {
	        	System.out.println(i + " ");
	            total += i;
	        }
	        i += 1;
	    }

	    System.out.println();
	    System.out.println("total = " + total);
		
	}
}
