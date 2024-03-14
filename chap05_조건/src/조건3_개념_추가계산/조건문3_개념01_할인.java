package 조건3_개념_추가계산;

import java.util.Random;

public class 조건문3_개념01_할인 {

	public static void main(String[] args) {
	    /*
			[문제]
				철수는 볼펜을 10~30개를 구입해야 한다. 
				
				볼펜 하나의 가격은 1200원이다. 	
				볼펜은 20개 이상 구매 시 구입수 전체에 대해 볼펜 한 개당 100원을 할인해주고 있다. 
					
				볼펜 수를 랜덤으로 저장하고,
				철수가 지급해야 하는 금액을 출력하시오.
			[예시1]
				볼펜 수 = 22
				지급 금액 = 22 * 1100 = 24200
			[예시2]
				볼펜 수 = 1
				지급 금액 = 1 * 1200 = 1200
	    */
		
		int a = 1200;
		int b = 0;
		int result = 0;
		
		Random ran = new Random();
		b = ran.nextInt(21) + 10;
		
		if(b >= 20) {
			a = a - 100;
		}
		
		result = a * b;
		
		System.out.println("볼펜 수 = " + b);
		System.out.println("지급 금액 = " + result);

	}

}
