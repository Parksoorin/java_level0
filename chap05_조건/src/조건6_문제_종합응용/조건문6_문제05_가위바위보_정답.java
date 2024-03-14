package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제05_가위바위보_정답 {

	public static void main(String[] args) {
	    /*
			[문제]
				[1] com은 0~2 사이의 숫자를 랜덤 저장한다. 
				[2] me는  0~2 사이의 숫자를 랜덤 저장한다. 
				[3] 가위, 바위, 보를 0, 1, 2 숫자로 대신 표현한다.
				[4] com과 me를 비교해서 me를 기준으로 "비김" "승리" "패배"를 출력하시오.
	    */
	    /*	
			이해를 돕기위해 com 은 상대편 me 는 자신을뜻한다. 
	    */
		
		int com = 0;
		int me = 0;
		
		Random ran = new Random();
		com = ran.nextInt(3);
		me = ran.nextInt(3);
		System.out.println(me + ", " + com);

		if(me == com) {
			System.out.println("비겼다.");
		}
		if(me == 0 && com == 2) {
			System.out.println("내가 이겼다.");
		} 
		if(me == 1 && com == 0) {
			System.out.println("내가 이겼다.");
		} 
		if(me == 2 && com == 1) {
			System.out.println("내가 이겼다.");
		} 
		if(me == 0 && com == 1) {
			System.out.println("내가 졌다.");
		}
		if(me == 1 && com == 2) {
			System.out.println("내가 졌다.");
		}
		if(me == 2 && com == 0) {
			System.out.println("내가 졌다.");
		}
		
	}

}
