package 이차배열5_문제_조인;

import java.util.Arrays;

public class 이차배열5_문제07_포인트_문제 {
	public static void main(String[] args) {

	    /*
	        [문제]
	            userList는 회원들의 정보이다. 
	            첫번째값은 회원번호이고, 두번째 값은 이름이다.
	            
	            pointList는 회원들의 점수 기록표이다. 
	            첫번째 값은 회원번호이고, 두번째 값은 포인트이다.
	            여러번 누적된 회원들도있다. 

	            회원별로 포인트를 전부 더해서           
	            포인트 점수가 가장높은 회원의 점수와 이름을 구하시오.

	        [정답]
	            5 김철수    
	    */

	    String[][] userList = { 
	        {"1001","김철수"},
	        {"1002","이만수"},
	        {"1003","이영희"}
	    };
	    int[][] pointList = {
	        {1001, 1},
	        {1002, 3},
	        {1001, 4},
	        {1003, 2},
	        {1003, 2}
	    };

	    int[] total = new int[3];

	 

	}
}
