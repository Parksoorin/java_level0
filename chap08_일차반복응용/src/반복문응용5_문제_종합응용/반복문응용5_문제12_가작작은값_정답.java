package 반복문응용5_문제_종합응용;

import java.util.Random;

public class 반복문응용5_문제12_가작작은값_정답 {
	public static void main(String[] args) {
		
	    /*
	        [민]
	            [1] 랜덤(1~10)숫자를 10번 반복해서 출력한다.
	            [2] 반복문이 종료후 가장작은수를 출력한다. 
	    */
		
		Random ran = new Random();
		
		int min = 10;

		int i = 1;
	    while(i <= 10){
	        int r = ran.nextInt(10) + 1;
	        System.out.print(r + " ");
	        if(min > r){
	            min = r;
	        }
	        i += 1;
	    }
	    
	    System.out.println();
	    System.out.println(min);
		
	}
}
