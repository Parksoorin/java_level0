package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제01_철수마블_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 마블게임을 하고있다.
				철수는 현재 0의 위치에 있고, 변수x로 표시한다. 
				주사위두개를 던저 나온숫자의 합만큼 현재위치에서 이동한다. 
				주사위는 1~6만큼의 눈금을 가지고있다. 
				단, 주사위 숫자가 똑같으면, 추가이동기회가 주어진다.
				추가이동기회란 한번더 주사위를 던저서 한번더 이동할수있고, 두번째는 주사위 숫자가 같아도 추가이동은 불가하다.
			[예시]
				a = 4
				b = 4
	
				추가이동기회발생
				a = 5
				b = 5
	
				x = 18
		*/
		
		int x = 0;
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(6) + 1;
		b = ran.nextInt(6) + 1;
		x = a + b;
		System.out.println(x + " " + a + " " + b);
		
		if(a == b) {
			System.out.println("추가 이동 기회발생");
			a = ran.nextInt(6) + 1;
			b = ran.nextInt(6) + 1;
			x = x + a + b;
			System.out.println(x + " " + a + " " + b);
		}

	}

}
