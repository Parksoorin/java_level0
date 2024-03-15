package 반복문8_문제_개수응용;

import java.util.Random;

public class 반복문8_문제07_약수_랜덤_개수_홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            어떤 수를 1부터 자기 숫자까지 나눠서 나눠지는 수를 약수라고 한다. 
	            랜덤으로 10~200을 저장 후, 
	            그 숫자의 약수중 홀수의 개수가 4개이면 "정답"을 
	            약수중 홀수의 개수가 4개가 아니면 "오답"을 출력하시오.    
	    */
		
		Random ran = new Random();
		
	    int num = ran.nextInt(191) + 10;      
	    System.out.println("num = " + num);

	    int count = 0;
	    
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	            
	            System.out.print(i + " ");
	            if(i % 2 == 1){
	                count += 1;
	            }
	        }
	        i += 1;
	    }
	    System.out.println();
	    
	    System.out.println("홀수의개수="+count);

	    if(count == 4) {
	        System.out.println("정답");
	    } else {
	        System.out.println("오답");
	    }
		
	}
}
