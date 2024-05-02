package 이차배열3_개념_데이터베이스;

public class 이차배열3_개념01_시험점수_총합 {

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
		        모든 점수의 총합을 출력하시오.
		    [정답] 
		        665    
		*/
		
		int total = 0;
		for(int i=0; i<student.length; i++) {
		    for(int j = 1; j<student[i].length; j++) {
		        total += student[i][j];
		    }
		}
		System.out.println(total);

	}

}
