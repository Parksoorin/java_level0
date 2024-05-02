package 이차배열5_문제_조인;

public class 이차배열5_문제03_학생관리총합_정답 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
				여학생들 점수 총합과 남학생들의 점수 총합을 출력하시오.		
			[정답]
				259 333
		
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
		int total1 = 0;
		int total2 = 0;
		for(int i = 0; i < student.length; i++){
			for(int j = 0; j < score.length; j++){
				int a = Integer.parseInt(student[i][0]);
				if(a == score[j][0] && student[i][2] == "남"){
					total1 += (score[j][1] + score[j][2]);
				}	
				if(a == score[j][0] && student[i][2] == "여"){
					total2 += (score[j][1] + score[j][2]);
				}	
			}
		}
		
		System.out.println(total1 + " " + total2);
	}

}
