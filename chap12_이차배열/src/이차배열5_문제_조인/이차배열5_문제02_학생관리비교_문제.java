package 이차배열5_문제_조인;

import java.util.Random;

public class 이차배열5_문제02_학생관리비교_문제 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
				국어점수가 수학점수 보다 큰 학생들의
				번호, 이름을 출력하시오.
			[정답]
				1002 이영희
			
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
		
	}
}
