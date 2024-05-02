package 이차배열5_문제_조인;

import java.util.Random;

public class 이차배열5_문제01_학생관리검색_정답 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
				랜덤숫자(0~5)를 저장하고 해당인덱스의 학생의 번호 이름 점수두개 를 출력하시오.
			[예시]
				3
				1004 이철민 13 87
				
			[정답]
				[1001, 이만수, 10, 20]
				[1002, 이영희, 70, 30]
				[1003, 김민정, 64, 65]
				[1004, 이철민, 13, 87]
				[1005, 오만석, 49, 80]
				[1006, 최이슬, 14, 90]
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
		Random ran = new Random();
		int a = ran.nextInt(student.length);
		System.out.println(a);
		
		int number = Integer.parseInt( student[a][0]);
		
		for(int i = 0; i < score.length; i++) {
			if(number == score[i][0]) {
				System.out.println(student[a][0] + " " + student[a][1] + " " + score[i][1] + " " + score[i][2]);
			}
		}
	
	}

}
