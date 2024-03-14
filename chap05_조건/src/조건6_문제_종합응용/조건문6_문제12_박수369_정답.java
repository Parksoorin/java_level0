package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제12_박수369_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				[1] 1~99 사이의 랜덤 숫자를 저장한다.
				
				랜덤 숫자 를 각자리별로 저장후, 3이나 6이나 9의 개수가
				[2-1] 2개이면, 짝짝을 출력한다.
				[2-2] 1개이면, 짝을 출력한다.
				[2-3] 0개이면, 해당 숫자를 출력하시오.
				
				[예]
					33	==> 짝짝
					16	==> 짝
					7	==> 7
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;
		
		Random ran = new Random();
		a = ran.nextInt(99) + 1;
		System.out.println(a);
		
		b = a / 10;
		c = a % 10;
		
		if(a == 3 || a == 6 || a == 9) {
			count = count + 1;
		}
		if(b == 3 || b == 6 || b == 9) {
			count = count + 1;
		}
		System.out.println("count = " + count);

		if(count == 2) {
			System.out.println("짝짝");
		}
		if(count == 1) {
			System.out.println("짝");
		}
		if(count == 0) {
			System.out.println(a);
		}

	}

}
