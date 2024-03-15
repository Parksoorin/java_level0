package 기타조건3_문제_switch;

import java.util.Random;

public class 기타조건문3_문제04_동서남북_문제 {
	public static void main(String[] args) {
		
		/*
			[문제]
              철수는 지금 게임을 하고있다. 
              게임의 캐릭터는 동서남북 네방향으로 이동가능하다. 
              철수는 지금 y = 5 x = 5 의 위치하고있다. 
              랜덤숫자(1~4)를 a에 저장한다.
              랜덤숫자(1~10)을 b에 저장한다.
              a가 1이면 동쪽,
              a가 2면 서쪽,
              a가 3이면 남쪽,
              a가 4이면 북쪽을 뜻한다. 

              b는 게임케릭터의 이동거리를뜻한다. 
              위 행동을 두번반복하고, 게임케릭터의 이동한위치를 출력하시오.
	
			[예시]
              a = 2
              b = 3

              a는 서쪽이고, 3칸이동하면, 현재위치는 x = 2 , y = 5 이다. 

              한번더 반복해서

              a = 4
              b = 7

              a는 북쪽이고, 7칸이동하면, 현재위치는 x= 2 , y = 12 이다.
		*/
		Random ran = new Random();
	
		int x = 5;
		int y = 5;
		
	    int a = 0;
		int b = 0;
		
		a = ran.nextInt(4) + 1;
		b = ran.nextInt(10) + 1;

	    switch(a){
	        case 1 :
	            x = x + b;
	            break;
	        case 2 :
	            x = x - b;
	            break;
	        case 3 :
	            y = y - b;
	            break;
	        case 4 :
	            y = y + b;
	            break;
	    }
	    System.out.println(a + " " + b + " " + x + " " + y);

	    a = ran.nextInt(4) + 1;
		b = ran.nextInt(10) + 1;

	    switch(a){
	        case 1 :
	            x = x + b;
	            break;
	        case 2 :
	            x = x - b;
	            break;
	        case 3 :
	            y = y - b;
	            break;
	        case 4 :
	            y = y + b;
	            break;
	    }
	    System.out.println(a + " " + b + " " + x + " " + y);

	}
}
