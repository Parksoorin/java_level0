package 이차배열3_문제_데이터베이스;

public class 이차배열3_문제02_전체1등_정답 {

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
	            전체 1등 번호를 출력하시오.
	        [정답]  
	            1004  
	    */
	    int maxScore = 0;
	    int maxIndex = 0;
	    for(int i=0; i<student.length; i++) {
	        int total = student[i][1] + student[i][2] + student[i][3];
	
	        if(maxScore < total) {
	            maxScore = total;
	            maxIndex = i;
	        }
	    }
	    System.out.println(student[maxIndex][0]);
	}

}
