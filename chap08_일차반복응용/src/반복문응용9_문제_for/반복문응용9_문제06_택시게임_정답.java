package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제06_택시게임_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            철수의 위치는 y = 0 , x = 0 이다.
	            랜덤 숫자(1~4)를 5번 뽑는다. 
	            랜덤 숫자는 방향을 뜻한다. 
	            1은 북쪽 2는 동쪽 3은 남쪽 4는 서쪽을 뜻한다.
	    
	            방향만큼 1씩 이동하며, 
	            5번 이동 후 철수의 위치를 출력하시오.
	    
	            [예시] 랜덤으로 1 4 3 2 1 이 나왔다고 했을 때
	            1은 북이므로 y += 1
	            4는 서이므로 x -= 1
	            3은 남이므로 y -= 1
	            2는 동이므로 x += 1
	            1은 북이므로 y += 1    
	    */

		Random ran = new Random();
		
	    int y = 0;
	    int x = 0;

	    for(int i = 0; i < 5; i++) {
	        int dir = ran.nextInt(4) + 1;
	        System.out.println(dir);

	        if(dir == 1) {
	            y += 1;
	        } else if(dir == 2) {
	            x += 1;
	        } else if(dir == 3) {
	            y -= 1;
	        } else if(dir == 4) {
	            x -= 1;
	        }

	    }

	    System.out.println("y = " + y + ", x = " + x);

	}
}
