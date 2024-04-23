package 이차반복문7_개념_중요알고리즘;

public class 이차반복문7_개념04_석차출력 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            scoreList는 학생시험점수배열이다. 
	            석차를 출력하시오.
	        [정답]
	            2 3 4 1 
	    */

	    int[] scoreList = {87,   42,   11,   98};

	    int size = scoreList.length;
	    for(int i=0; i<size; i++) {
	        int count = 1;
	        for(int j=0; j<size; j++) {
	            if(scoreList[i] < scoreList[j]) {
	                count += 1;
	            }
	        }
	        System.out.print(count + " ");
	    }

	}
}
