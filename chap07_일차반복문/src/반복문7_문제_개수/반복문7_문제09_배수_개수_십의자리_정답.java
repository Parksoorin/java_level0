package 반복문7_문제_개수;

public class 반복문7_문제09_배수_개수_십의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100~200 사이의 숫자 중에서
	            [조건1] 9의 배수 중에서 십의 자리가 7인 수만 출력하고, 
	            [조건2] 개수를 구하시오.
	        [정답] 
	            171 
	            count = 1   
	    */
		
	    int count = 0;

	    int i = 100;
	    while(i <= 200) {
	        int unit = i % 100 / 10;
	        if(i % 9 == 0 && unit == 7) {
	            System.out.print(i + " ");
	            count += 1;
	        }
	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);

		
	}
}
