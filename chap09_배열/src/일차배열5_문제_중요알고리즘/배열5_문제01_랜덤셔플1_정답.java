package 일차배열5_문제_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_문제01_랜덤셔플1_정답 {

	public static void main(String[] args) {
		  /*
	        [문제]
	            다음은 학생 번호와 점수의 한 셋트이다.
	            랜덤으로 셔플후 출력하시오.
	            단, 번호와 점수가 같이 셔플되야한다.
	        [예시]
	            1004,1001,1003,1002,1005
	            98,87,45,11,23
	    */
	
	    int[] numberList = {1001, 1002, 1003, 1004, 1005};
	    int[] scoreList  = {  87,   11,   45,   98,   23};
	    Random ran = new Random();
	    int size = numberList.length;
	    for(int i = 0; i < 100; i++){
	        int a = ran.nextInt(size);
	        int b = ran.nextInt(size);
	        
	        int c = numberList[a];
	        numberList[a] = numberList[b];
	        numberList[b] = c;
	
	        int d = scoreList[a];
	        scoreList[a] = scoreList[b];
	        scoreList[b] = d;
	
	    }
	    System.out.println(Arrays.toString(numberList));
	    System.out.println(Arrays.toString(scoreList));
	}

}
