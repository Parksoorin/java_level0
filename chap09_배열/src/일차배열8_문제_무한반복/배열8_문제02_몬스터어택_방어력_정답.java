package 일차배열8_문제_무한반복;

import java.util.Arrays;
import java.util.Random;

public class 배열8_문제02_몬스터어택_방어력_정답 {

	public static void main(String[] args) {
		/*
        [문제]
            철수는 게임을 하고 있다. 
            monster배열은 게임의 적 4마리를 의미하고 
            숫자는 몬스터의 체력을 의미한다.
            
            철수의 공격력은 5이다.    
            총 다섯번을 반복하면서 
            랜덤으로 몬스터 중 하나를 선택해서 공격한다.
            모든 몬스터들을 공격한 후 몬스터들의 체력을 출력하시오.
            단, 몬스터 체력은 0이 되면 더 이상 내려가지 않고,
            공격횟수로 인정하지 않는다.
            
            armor 는 몬스터의 방어력을 의미한다.
            피격시 방어력만큼 감소된 대미지를 입는다. 
        [예시]
            20,6,18,6
            2번째 몬스터 공격! : 20,6,15,6
            1번째 몬스터 공격! : 20,2,15,6
            1번째 몬스터 공격! : 20,0,15,6
            2번째 몬스터 공격! : 20,0,12,6
            1번째 몬스터 공격! : 체력이 0인 몬스터입니다. 다시 선택해주세요.
            1번째 몬스터 공격! : 체력이 0인 몬스터입니다. 다시 선택해주세요.
            3번째 몬스터 공격! : 20,0,12,4
    */

    int[] monster = {20, 6, 18, 6};
    int[] armor = {1,1,2,3};
    int power = 5;
    int count = 0;   
    System.out.println(Arrays.toString(monster));
    Random ran = new Random();
    while(true) {
    	int index = ran.nextInt(monster.length);
    	System.out.print(index + "번째 몬스터 공격! : ");

        if(monster[index] > 0) {

            int updatePower = power - armor[index];

            monster[index] -= updatePower;

            if(monster[index] < 0) {
                monster[index] = 0;
            } 

            count += 1;
            System.out.println(Arrays.toString(monster));
        } else {
        	 System.out.println("체력이 0인 몬스터입니다. 다시 선택해주세요.<br>");
        }
        

        if(count == 5) {
            break;
        }
    }

	}

}
