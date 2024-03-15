package 반복문5_문제_누적;

public class 반복문5_문제03_약수_누적_백의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            2000의 약수 중에서 순서대로 약수를 출력했을 때, 
	            [조건1] 백의자리가 4인 약수들만 출력하고, 
	            [조건2] 그 전체 합을 출력하시오. 
	        [정답]
	            400 
	            total = 400
	    */	
		
	    int num = 2000;

	    int total = 0;

	    int i = 1;
	    while(i <= num) {

	        int unit = i % 1000 / 100;
	        if(num % i == 0 && unit == 4) {
	            System.out.print(i + " ");
	            total += i;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("total = " + total);

		
	}
}
