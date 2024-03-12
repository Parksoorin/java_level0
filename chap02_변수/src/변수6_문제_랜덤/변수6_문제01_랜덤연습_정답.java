package 변수6_문제_랜덤;

import java.util.Random;

public class 변수6_문제01_랜덤연습_정답 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		 // 문제1) 100 ~ 200 사이의 랜덤출력 
		int rNum = ran.nextInt(101) + 100;		
		System.out.println(rNum);
		
		 // 문제2) -7 ~ 7 사이의 랜덤출력 
			
		rNum = ran.nextInt(15) -7;		
		System.out.println(rNum);
	}

}
