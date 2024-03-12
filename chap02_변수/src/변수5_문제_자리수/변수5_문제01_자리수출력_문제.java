package 변수5_문제_자리수;

public class 변수5_문제01_자리수출력_문제 {

	public static void main(String[] args) {
		/*
	        [문제] 
	            아래 a의 값의 백의 자리숫자를 출력하시오.
	        [정답]
	            3
	            
	            
	    */
		 	int a = 54321;
		
		    int c = (a % 1000 / 100);
		    
		    System.out.println(c);
	}

}
