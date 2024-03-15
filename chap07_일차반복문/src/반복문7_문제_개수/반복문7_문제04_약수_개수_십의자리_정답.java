package 반복문7_문제_개수;

public class 반복문7_문제04_약수_개수_십의자리_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            200의 약수 중에서 순서대로 약수를 출력했을 때, 
	            [조건1] 십의자리가 4인 약수들만 출력하고, 
	            [조건2] 위 수의 개수를 출력하시오.
	        [정답]
	            40 
	            count = 1    
	    */
		
	    int num = 200;
	    int count = 0;

	    int i = 1;
	    while(i <= num) {

	        int unit = i % 100 / 10;
	        if(num % i == 0 && unit == 4) {
	            System.out.print(i + " ");
	            count += 1;
	        }

	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);
		
	}
}
