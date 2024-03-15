package 반복문1_문제_기본;

public class 반복문1_문제05_거꾸로_정답 {
	public static void main(String[] args) {
		
		/*
			 [문제] 
			 	16~12 까지 거꾸로 출력하시오. 단, 반복문을 사용하시오.
				
			 [정답] 
			 	16
				15
				14
				13
				12
		 */
		
		int i = 1;
	    int num = 16;
	    while(i <= 5) {
	        System.out.println(num);
	        num = num - 1;
	        i = i + 1;
	    }
		
	}
}
