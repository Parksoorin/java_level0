package 반복문4_문제_자리수;

public class 반복문4_문제03_자리수큰값찾기_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 10 부터 99까지 출력한다. 
	            [2] 일의 자리가 5보다크고 십의자리가 8보다큰수를 전부출력하시오.
				
	        [정답]
	            96
	            97
	            98
	            99
	    */
		
		int i = 10;
	    while(i <= 99) {
	        int a = i / 10;
	        int b = i % 10;
	        
	        boolean c = a > 8;
	        boolean d = b > 5;
	        if(c && d) {
	            System.out.println(i);
	        }
	        i += 1;
	    }
		
	}
}
