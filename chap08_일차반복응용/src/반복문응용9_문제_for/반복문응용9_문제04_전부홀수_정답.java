package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제04_전부홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            1 ~ 9 사이의 랜덤 값을 4개 출력한다. 
	            랜덤 값이 모두 홀수이면 "1등"을 출력한다.
	            랜덤 값이 모두 짝수이면 "2등"을 출력한다.
	            둘다 아니면 "꽝" 을 출력한다.
	            
	        [예시1] 
	            3 1 5 1 : 1등
	        [예시2]
	            5 2 1 4 : 꽝    
	        [예시3]
	            4 6 8 2 : 2등
	    */
		
		Random ran = new Random();
		
	    int count = 0;
	    for(int i=0; i < 4; i++) {
	        int num = ran.nextInt(9) + 1;
	        System.out.print(num + " ");

	        if(num % 2 != 0) {
	            count += 1;
	        }
	    }

	    if(count == 4) {
	        System.out.println(" : 1등");

	    }else if(count == 0) {
	        System.out.println(" : 2등");
	        
	    }else{
	        System.out.println(" : 꽝");
	    }
		
	}
}
