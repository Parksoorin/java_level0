package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제08_가위바위보_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            철수와 민수는 계단에서 가위바위보를 한다. 	 	
	            철수와 민수는 각각 0 ~ 2 의 랜덤 값을 저장한다.
	            0 : 가위 , 1 : 바위 , 2 : 보를 뜻한다.	 
	            철수와 민수는 50번째 계단의 위치에서 시작한다.
	            룰은 다음과 같다.	
	            이기면 3칸 올라가기, 비기면 2칸 올라가기, 지면 1칸 내려가기.	 	
	            둘 중 아무나 100 이상 도착하거나 
	            둘 사이의 간격이 10 이상이면 게임은 종료된다. 
	            게임이 종료될 때까지 두 사람의 이동 경로를 출력하시오.    
	    */
		
		/*
		        이해를 돕기 위해 한글명으로 변수를 사용했다.
	   */
		
		Random ran = new Random();
	
	    int 철수_위치 = 50;
	    int 민수_위치 = 50;
	
	    for(boolean run = true; run == true;) {
	
	        int 철수 = ran.nextInt(3);
	        int 민수 = ran.nextInt(3);
	        System.out.println("철수 : " + 철수);
	        System.out.println("민수 : " + 민수);
	
	      
	        if(철수 == 민수) {
	            철수_위치 += 2;
	            민수_위치 += 2;
	            System.out.println("비겼다.");
	        } else if(철수 == 0 && 민수 == 2) {
	            철수_위치 += 3;
	            민수_위치 -= 1;
	            System.out.println("철수가 이겼다.");
	        } else if(철수 == 1 && 민수 == 0) {
	            철수_위치 += 3;
	            민수_위치 -= 1;
	            System.out.println("철수가 이겼다.");
	        } else if(철수 == 2 && 민수 == 1) {
	            철수_위치 += 3;
	            민수_위치 -= 1;
	            System.out.println("철수가 이겼다.");
	        } else {
	            민수_위치 += 3;
	            철수_위치 -= 1;
	            System.out.println("민수가 이겼다.");
	        }
	
	        System.out.println("철수_위치 = " + 철수_위치);
	        System.out.println("민수_위치 = " + 민수_위치);
	
	        int 차이 = 철수_위치 - 민수_위치;
	
	        if(철수_위치 >= 100) {
	            System.out.println("철수 승리!!!");
	            run = false;
	        } else if(민수_위치 >= 100) {
	            System.out.println("민수 승리!!!");
	            run = false;
	        } else if(차이 >= 10 || 차이 <= -10) {
	            System.out.println("둘 사이의 간격이 10이상으로 게임을 종료합니다.");
	            run = false;
	        }
    }

		
	}
}
