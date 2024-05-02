package 이차배열5_문제_조인;

import java.util.Arrays;

public class 이차배열5_문제09_학생관리석차정렬_정답 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
			학생번호 , 이름 , 점수두개를 출력하시오. 
			단, 총점이 높은순으로 내리차순정렬하시오. 
			단, 점수가 같을경우 번호 내림차순으로 정렬하시오.
		[정답]
			[1005, 오만석, 49, 80]
			[1003, 김민정, 64, 65]
			[1006, 최이슬, 14, 90]
			[1004, 이철민, 13, 87]
			[1002, 이영희, 70, 30]
			[1001, 이만수, 10, 20]
		*/
	
		String[][] student = {	
			{"1001", "이만수", "남"},
			{"1002", "이영희", "여"},
			{"1003", "김민정", "여"},
			{"1004", "이철민", "남"},
			{"1005", "오만석", "남"},
			{"1006", "최이슬", "여"}
		};
		
		int[][] score = {		
			{1001 , 10, 20},
			{1002 , 70, 30},
			{1003 , 64, 65},
			{1004 , 13, 87},
			{1005 , 49, 80},
			{1006 , 14, 90}
		};
		
		String viewList[][] = new String[student.length][4]; // 정렬하기위해 새로 배열을 만들어서 담는것이 좋다. 

		for(int i = 0; i < student.length; i++){
			viewList[i][0] = student[i][0];
			viewList[i][1] = student[i][1];
			viewList[i][2] = score[i][1] + "";
			viewList[i][3] = score[i][2] + "";
			
		}
		Arrays.sort(viewList , (a , b)->{
			int t1 = Integer.parseInt(a[2]) + Integer.parseInt(a[3]);
			int t2 = Integer.parseInt(b[2]) + Integer.parseInt(b[3]);

			if(t1 > t2){
				return -1;
			}else if(t1 < t2){
				return 1;
			}else{
				
				
				if(a[0].compareTo(b[0]) < 0){
					return 1;
				}else if(a[0].compareTo(b[0]) > 0){
					return -1;
				}else{
					return 0;
				}
			}
		});
		
		

		for(int i = 0; i < viewList.length; i++){
			System.out.println(Arrays.toString(viewList[i]));
		}

	}

}
