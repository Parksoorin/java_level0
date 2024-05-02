package 이차배열5_개념_조인;

import java.util.Arrays;

public class 이차배열5_개념01_점수검색 {

	public static void main(String[] args) {
		/*
        student배열은 이번 학기 중간고사 성적이다.
        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
        각각 국어, 수학, 영어 점수이다. 
		*/
		
		int[][] student = {
		    {1001, 100, 20, 32},        
		    {1002,  40, 43, 12},         
		    {1003,  60, 21, 42},         
		    {1004,  76, 54, 55},        
		    {1005,  23, 11, 76}          
		};
		
		int[] search = {1002, 1004, 1003, 1001, 1005};
		/*
		 	[문제]
	        	search 배열은 학생들이 시험 결과가 궁금해서  검색한 번호들이다. 
	        	각 학생이 검색한 순서대로 학생정보를 출력하시오.
	    	[정답]
	        	1002,40,43,12
	        	1004,76,54,55
	        	1003,60,21,42
	        	1001,100,20,32
	        	1005,23,11,76
		 */
		 
		for(int i=0; i<search.length; i++) {
	        
	        for(int j=0; j< student.length; j++) {
	            
	            if(search[i] == student[j][0]) {
	            	System.out.println(Arrays.toString(student[j]));
	            }
	        }
	    }
		
	}

}
