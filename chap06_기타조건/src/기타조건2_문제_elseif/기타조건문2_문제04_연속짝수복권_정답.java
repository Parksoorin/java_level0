package 기타조건2_문제_elseif;

import java.util.Random;

public class 기타조건문2_문제04_연속짝수복권_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
				철수는 아래와 같은 규칙을 가진 복권행사에 참가했다. 
				
			[규칙]
				[1] 100~900 사이의 랜덤숫자를 저장한다. 
				[2] 세 자리의 숫자를 전부 한 자리씩 분리한다.		
				[3] 세 자리 모두 짝수이면 "1등"을 출력한다.
				[4] 두 자리가 짝수이고, 짝수인 숫자가 연속이면 "2등"을 출력한다.
				[5] 연속이란 1번과 2번이 짝수이거나 , 2번과 3번이 짝수인걸 뜻한다. 
				[6] 그 외는 "꽝"을 출력한다.
				[7] 단, 0은 짝수이다.
				[8] 단, else if 와 else 를 사용하시오.
	
			[예시1]
				462 ==> 4,6,2 세 자리 모두 짝수이므로 ==> 1등
	
			[예시2]	
				245 ==> 2,4,5 두 자리가 짝수이고 2, 4연속이므로 ==> 2등
	
			[예시3]
				456 ==> 4,5,6 두 자리가 짝수이지만 연속이 아니므로 ==> 꽝
	
			[예시4]
				782 ==> 7,8,2 두 자리가 짝수이고 8, 2연속이므로 ==> 2등 	
		*/
		Random ran = new Random();

		int num = 0;
		
		num = ran.nextInt(101);
		System.out.println(num);

		int x = num / 100;
		int y = num % 100 / 10;
		int z = num % 10;
		System.out.println(x + ", " + y + ", " + z);

		boolean a = x % 2 == 0 && y % 2 == 0 && z % 2 == 0;
		boolean b = x % 2 == 0 && y % 2 == 0;
		boolean c = y % 2 == 0 && z % 2 == 0;
		
		int result = 0;

		if(a) {
			result = 1;
		} else if(!a && b) { 
			result = 2;
		} else if(!a && c) {
			result = 2;
		} else {
			result = 3;
		}
		
		if(result == 1) {
			System.out.println("1등");
		} else if(result == 2) {
			System.out.println("2등");
		} else {
			System.out.println("꽝");
		}
		
	}
}
