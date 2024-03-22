package 반복문응용5_개념_중요알고리즘;

import java.util.Random;

public class 반복문응용5_개념01_맥스 {
	public static void main(String[] args) {
		
	    /*
	        [맥스]
	            [1] 랜덤(1~10)숫자를 10번 반복해서 출력한다.
	            [2] 반복문이 종료후 가장큰수를 출력한다. 
	    */
		
		Random ran = new Random();
		
		int max = 0;

		int i = 1;
	    while(i <= 10){
	        int r = ran.nextInt(10) + 1;
	        System.out.print(r + " ");
	        if(max < r){
	            max = r;
	        }
	        i += 1;
	    }
	    System.out.println();
	    System.out.println(max);
		
	}
}
