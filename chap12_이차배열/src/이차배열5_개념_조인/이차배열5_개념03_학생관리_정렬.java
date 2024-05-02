package 이차배열5_개념_조인;

import java.util.Arrays;

public class 이차배열5_개념03_학생관리_정렬 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
				학생번호 , 이름 , 점수 두개를 출력하시오. 
				단, 국어 점수가 높은순으로 내림차순 정렬하시오.
				국어 점수가 같으면 수학점수가 높은순으로 내림차순정렬하시오.
				
			[정답]
				[1002, 이영희, 70, 30]
				[1005, 오만석, 64, 80]
				[1004, 이철민, 64, 87]
				[1003, 김민정, 64, 65]
				[1006, 최이슬, 14, 90]
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
			{1004 , 64, 87},
			{1005 , 64, 80},
			{1006 , 14, 90}
		};
	
		/*
		  	위와 같이 배열이 두개가 데이터를 나눠서 가지고있다면,
		  	하나의 새로운 배열에 저장하는것이 좋다. 
		 
		 */
		
		String[][] viewList = new String[student.length][4];
	
		for(int i = 0; i < student.length; i++){
			viewList[i][0] = student[i][0];
			viewList[i][1] = student[i][1];
			viewList[i][2] = score[i][1] + "";
			viewList[i][3] = score[i][2] + "";
			
		}
		
		Arrays.sort(viewList , (a , b)->{
			if(a[2].compareTo(b[2]) < 0) {
				return 1;
			}
			else if(a[2].compareTo(b[2]) > 0) {
				return -1;
			}else {
				if(a[1].compareTo(b[3]) < 0) {
					return 1;
				}
				else if(a[1].compareTo(b[3]) > 0) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		
	
		for(int i = 0; i < viewList.length; i++){
			System.out.println(Arrays.toString(viewList[i]));
		}
	
	}

}
