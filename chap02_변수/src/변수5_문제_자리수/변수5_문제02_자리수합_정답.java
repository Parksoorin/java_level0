package 변수5_문제_자리수;

public class 변수5_문제02_자리수합_정답 {

	public static void main(String[] args) {
		  /*
	        [문제] 
	            a의 값을 각자리별로 나눠서 저장후 각 숫자들의 합을 구하시오.
	        [정답]
	            15
            
		   */
	    int a = 54321;
	
	    int b = (a / 10000);
	    int c = (a % 10000 / 1000);
	    int d = (a % 1000 / 100);
	    int e = (a % 100 / 10);
	    int f = a % 10;
	
	    int result = b + c + d + e + f;
	    
	    System.out.println(result);
	}

}
