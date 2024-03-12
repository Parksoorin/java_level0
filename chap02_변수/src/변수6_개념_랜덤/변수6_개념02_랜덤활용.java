package 변수6_개념_랜덤;

import java.util.Random;

/*
	# 랜덤
		1. import java.util.Random;
		2. Random ran = new Random();
		3. int rNum = ran.nextInt(랜덤범위);
		4. (0 ~ 랜덤범위-1) 사이값이 나온다.
*/


public class 변수6_개념02_랜덤활용 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		/*
		  	ran.nextInt(원하는개수) + 시작하는 숫자 
		 
		 */
		
		// 문제1) 1 ~ 5 사이의 랜덤
		int rNum = ran.nextInt(5) + 1;		// [0 ~ 4] + 1
		System.out.println(rNum);
		
		// 문제2) -3 ~ 3 사이의 랜덤
		
		
		rNum = ran.nextInt(7) - 3;		// [0 ~ 6] - 3
		System.out.println(rNum);

		// 문제3) 150 ~ 250 사이의 랜덤
		rNum = ran.nextInt(250);	// [0 ~ 249]
		rNum = ran.nextInt(251);	// [0 ~ 250]
		rNum = ran.nextInt(251) + 150;	// [0 ~ 250] + 150
		rNum = ran.nextInt(101) + 150;  // [0 ~ 100] + 150
		
	}
}
