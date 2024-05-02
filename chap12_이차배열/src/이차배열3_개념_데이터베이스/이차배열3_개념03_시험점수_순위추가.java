package 이차배열3_개념_데이터베이스;

import java.util.Arrays;

public class 이차배열3_개념03_시험점수_순위추가 {

	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		        마지막 두자리는 총합과 순위의 자리이다.
		*/
		
		int[][] student = {
		    {1001, 100, 20, 32 ,0 ,0},         // 152
		    {1002,  40, 43, 12 ,0 ,0},         // 95
		    {1003,  60, 21, 42 ,0 ,0},         // 123
		    {1004,  76, 54, 55 ,0 ,0},         // 185
		    {1005,  23, 11, 76 ,0 ,0}          // 110
		};
		
		
		/*
		    [문제] 
		        각 학생별 점수 총합을 인덱스4자리에 추가하시오.
		        총합을 비교하여 랭크를 인덱스5자리에 추가하시오.
		    [정답] 
		        [1001, 100, 20, 32, 152, 2]
				[1002, 40, 43, 12, 95, 5]
				[1003, 60, 21, 42, 123, 3]
				[1004, 76, 54, 55, 185, 1]
				[1005, 23, 11, 76, 110, 4]
		*/
		
		for(int i=0; i<student.length; i++) {
			int total = student[i][1] + student[i][2] + student[i][3];
			student[i][4] = total;
		     
		}
		
		for(int i = 0; i<student.length; i++) {
	        int count = 1;
	        for(int j = 0; j < student.length; j++) {
	            if(student[i][4] < student[j][4]) {
	                count += 1;
	            }
	        }
	        student[i][5] = count;
	    }
		
		for(int i = 0; i < student.length; i++){
			System.out.println(Arrays.toString(student[i]));
		}

	}

}
