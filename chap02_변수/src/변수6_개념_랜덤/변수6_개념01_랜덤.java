package 변수6_개념_랜덤;

import java.util.Random;

/*
	# 랜덤
		1. import java.util.Random;
		2. Random ran = new Random();
		3. int rNum = ran.nextInt(랜덤범위);
		4. (0 ~ 랜덤범위-1) 사이값이 나온다.
*/


public class 변수6_개념01_랜덤 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		// 0~9 사이의 랜덤
		rNum = ran.nextInt(10);
		System.out.println(rNum);
		
	}
}
