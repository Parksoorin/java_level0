package 일차배열1_문제_기본;

import java.util.Random;

public class 배열1_문제10_검색_랜덤_정답 {

	public static void main(String[] args) {
		  /*
	        [문제] 
	            numbers 배열은 학생들의 번호를 저장한 정보이고,
	            scores 배열은 학생들의 점수 정보이다.
	            랜덤으로 한 학생의 학번과 점수를 출력하시오.
	        [예시1] 
	            r = 0
	            1001, 87
	        [예시2]
	            r = 3
	            1004, 98    
	    */
	
		Random ran = new Random();
	    int[] numbers = {1001, 1002, 1003, 1004, 1005};
	    int[] scores  = {  87,   11,   45,   98,   23};
	
	    int r = ran.nextInt(numbers.length);
	    System.out.println(r);
	    System.out.println(numbers[r] + " " + scores[r]);
	

	}

}
