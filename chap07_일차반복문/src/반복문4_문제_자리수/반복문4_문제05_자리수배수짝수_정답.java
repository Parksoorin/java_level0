package 반복문4_문제_자리수;

public class 반복문4_문제05_자리수배수짝수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [1] 1~50까지 반복한다.
	            [2] 각자리별로 3이나 6이나 9가 없는 수만 출력한다.
	            [3] 위조건을 만족한 짝수만 출력하시오.
	        [정답]
	            2, 4, 8, 10, 12, 14, 18, 20, 22, 24, 28, 40, 42, 44, 48, 50   
	    */
		
		int i = 1;
	    while(i <= 50) {
	        int a = i / 10;
	        int b = i % 10;
	        if(i % 2 == 0) {
	            if(a != 3 && a != 6 && a != 9 && b != 3 && b != 6 && b != 9) {
	            	System.out.print(i + " ");
	            }
	        }
	        i += 1;
	    }
		
	}
}
