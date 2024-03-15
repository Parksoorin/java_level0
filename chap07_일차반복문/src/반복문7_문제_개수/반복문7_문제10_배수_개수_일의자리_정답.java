package 반복문7_문제_개수;

public class 반복문7_문제10_배수_개수_일의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100~200 사이의 숫자 중에서 
	            [조건1] 6의 배수 중에서 일의 자리가 2인 수만 출력하고, 
	            [조건2] 그 개수를 구하시오.
	        [정답]
	            102 132 162 192 
	            count = 4    
	    */
		
	    int count = 0;

	    int i = 100;
	    while(i <= 200) {
	        int unit = i % 10;
	        if(i % 6 == 0 && unit == 2) {
	            System.out.print(i + " ");
	            count += 1;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);
		
	}
}
