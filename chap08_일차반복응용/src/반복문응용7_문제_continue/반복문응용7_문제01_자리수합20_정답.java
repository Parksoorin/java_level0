package 반복문응용7_문제_continue;

import java.util.Random;

public class 반복문응용7_문제01_자리수합20_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            랜덤숫자(1~10) 3개를 각각의 변수에저장한다. 
	            숫자3개의 합이 20이면종료한다.
	            단, 숫자3개의 각각의 값은 서로 같으면안된다.
	            단, continue를 사용하시오.

	        [예시1] 아래는 정상종료된다.
	            9 6 5
	        
	        [예시2] 아래는 합은20이지만 숫자3개가 전부 다르지않으므로 종료되지않는다. 
	            6 8 6 

	    */
		
		Random ran = new Random();
		
	    boolean run = true;
	    while(run){
	        int a = ran.nextInt(10) + 1;
	        int b = ran.nextInt(10) + 1;
	        int c = ran.nextInt(10) + 1;
	        System.out.println(a + " " + b + " " + c);
	        
	        int total = a + b + c;
	        if(total != 20){
	            continue;
	        }
	        
	        if(a != b && b != c && c != a){
	            System.out.println("종료");
	            run = false;
	        }
	    }
		
	}
}
