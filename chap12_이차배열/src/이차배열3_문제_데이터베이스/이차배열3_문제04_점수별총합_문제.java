package 이차배열3_문제_데이터베이스;

import java.util.Arrays;

public class 이차배열3_문제04_점수별총합_문제 {

	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		*/
		
		int[][] student = {
		    {1001, 100, 20, 32},         // 152
		    {1002,  40, 43, 12},         // 95
		    {1003,  60, 21, 42},         // 123
		    {1004,  76, 54, 55},         // 185
		    {1005,  23, 11, 76}          // 110
		};
		/*
	        [문제] 
	            각각 점수별총합을 아래 total배열에 추가하시오.
	            순서대로 국어 , 수학 , 영어 점수이다.
	        [정답]
	            299,149,217
	    */   
	    int[] total = {0,0,0};
	
	    for(int i = 0; i < student.length; i++) {
    		total[0] += student[i][1];
    		total[1] += student[i][2];
    		total[2] += student[i][3];
	    }
	    
	    System.out.println(Arrays.toString(total));
	}

}
