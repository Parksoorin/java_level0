package 이차배열5_문제_조인;

public class 이차배열5_문제05_학생관리일등_정답 {

	public static void main(String[] args) {
		/*
			student 배열은 순서대로 ["번호", "이름", "성별"] 의 데이터 이고, 
			score 배열은 순서대로 ["번호", "국어", "수학"] 의 데이터이다.
		*/
		/*
			[문제] 
				평균이 60점이상이면 합격이다.
				합격생들의 번호, 이름, 점수를 출력하시오.
			[정답]
				1003 김민정 64.5
				1005 오만석 64.5
		
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
		
		int[] totalList = new int[score.length];
		for(int i = 0; i < score.length; i++){
			totalList[i] = score[i][1] + score[i][2];
		}

		int mx = totalList[0];

		for(int i = 0; i < totalList.length; i++){
			if(mx < totalList[i]){
				mx = totalList[i];
			}
		}
		System.out.println(mx);

		
		for(int i = 0; i < score.length; i++){
			int total = score[i][1] + score[i][2];
			for(int j = 0; j < student.length; j++){
				if(mx == total){
					int a = Integer.parseInt(student[j][0]);
					if(score[i][0] == a){
						System.out.println(score[i][0] + " " + student[j][1] + " " + total);
					}	
				}	
			}
		}


	}

}
