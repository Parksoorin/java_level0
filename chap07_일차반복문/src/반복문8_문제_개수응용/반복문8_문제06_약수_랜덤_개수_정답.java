package 반복문8_문제_개수응용;

import java.util.Random;

public class 반복문8_문제06_약수_랜덤_개수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            랜덤으로 1~100을 저장 후, 
	            약수가 3개이면 "정답"을 
	            아니면 "오답"을 출력하시오.    
	    */
		
		Random ran = new Random();
		
	    int num = ran.nextInt(91) + 10;      
	    System.out.println("num = " + num);

	    int count = 0;
	    
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	            System.out.print(i + " ");
	            count += 1;
	        }
	        i += 1;
	    }
	    System.out.println();

	    if(count == 3) {
	        System.out.println("정답");
	    } else {
	        System.out.println("오답");
	    }
		
	}
}
