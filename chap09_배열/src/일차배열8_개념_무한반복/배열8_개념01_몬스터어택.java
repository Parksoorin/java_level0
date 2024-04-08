package 일차배열8_개념_무한반복;

import java.util.Arrays;
import java.util.Random;

public class 배열8_개념01_몬스터어택 {

	public static void main(String[] args) {
		/*
	        [문제]
	            철수는 게임을 하고 있다. 
	            monster배열은 게임의 적 4마리를 의미하고 
	            숫자는 몬스터의 체력을 의미한다.
	            
	            철수의 공격력은 5이다.    
	            총 다섯번을 반복하면서 
	            랜덤으로 몬스터 중 하나를 선택해서 공격한다.
	            전체 과정을 출력하시오.
	            
	        [예시]
	            20,6,18,6
	            3번째 몬스터 공격! : 20,6,18,1
	            2번째 몬스터 공격! : 20,6,13,1
	            1번째 몬스터 공격! : 20,1,13,1
	            1번째 몬스터 공격! : 20,-4,13,1
	            2번째 몬스터 공격! : 20,-4,8,1
	                        
	    */
	
	    int[] monster = {20, 6, 18, 6};
	    int power = 5;
	    System.out.println(Arrays.toString(monster));
	    int count = 0;
	    Random ran = new Random();
	    while(true) {
	        int index = ran.nextInt(monster.length);
	        System.out.print(index + "번째 몬스터 공격! : ");
	        monster[index] -= power;
	        System.out.println(Arrays.toString(monster));
	        count += 1;
	
	        if(count == 5) {
	            break;
	        }
	    }


	}

}
