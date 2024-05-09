package 함수6_문제_리턴변수;

import java.util.Random;

public class 함수6_문제02_리턴약수_문제 {	
	
	public static int getDivsor(int a) {
		int cnt = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
  			랜덤숫자(10~30) 사이의 변수 두개를 저장한다.
	  		두숫자의 약수를 비교해서 약수의 개수가 더많은수를 출력하시오.
	  		서로 같으면 "같다" 를 출력하시오.
		*/	
		
		Random ran = new Random();
		int a = ran.nextInt(21) + 10;
		int b = ran.nextInt(21) + 10;
		
		int c = getDivsor(a);
		int d = getDivsor(b);
		System.out.println(a + " " + b);
		
		if(c > d) {
			System.out.println(a);
		} else if(c < d) {
			System.out.println(b);
		} else {
			System.out.println("같다");
		}
		
	}
}
