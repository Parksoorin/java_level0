package 이차배열4_문제_정렬;

import java.util.Arrays;

public class 이차배열4_문제01_시험점수순위_문제 {

	public static void main(String[] args) {
		/*
	        student배열은 이번 학기 중간고사 성적이다.
	        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
	        각각 국어, 수학, 영어 점수이다. 
	        나머지 두개는 각가 총점과 등수이다.
		*/
		
		int[][] student = {
		    {1001, 100, 20, 32 , 0 , 0},        
		    {1002,  40, 43, 12 , 0 , 0},         
		    {1003,  60, 21, 42 , 0 , 0},         
		    {1004,  76, 54, 55 , 0 , 0},        
		    {1005,  23, 58, 42 , 0 , 0}          
		};
		
			
		 /*
		  	[문제]
		    	[1] 각학생별 총점과 등수를 저장하시오.
		    	[2] 등수순으로 오름차순 출력하시오.
		    	[3] 등수가 같으면 번호가 큰순서대로 내림차순하시오.
			[정답]
				[1004, 76, 54, 55, 185, 1]
				[1001, 100, 20, 32, 152, 2]
				[1005, 23, 58, 42, 123, 3]
				[1003, 60, 21, 42, 123, 3]
				[1002, 40, 43, 12, 95, 5]
		
		*/
		
		for(int i = 0; i < student.length; i++) {
			student[i][4] = student[i][1] + student[i][2] + student[i][3];
		}
		
		for(int i = 0; i < student.length; i++) {
			int cnt = 1;
			for(int j = 0; j < student.length; j++) {
				if(student[i][4] < student[j][4]) {
					cnt++;
				}
			}
			student[i][5] = cnt;
			System.out.println(Arrays.toString(student[i]));
		}
		
		System.out.println();
		
		Arrays.sort(student, (a, b) -> {
			if(a[5] < b[5]) {
				return -1;
			} else if(a[5] > b[5]) {
				return 1;
			} else {
				if(a[0] < b[0]) {
					return 1;
				}else if(a[0] > b[0]) {
					return -1;
				}else {
					return 0;									
				}
			}
		});
		
		for(int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}

	}

}
