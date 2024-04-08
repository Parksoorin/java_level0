package 일차배열5_문제_중요알고리즘;

public class 배열5_문제05_평균_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            다음은 학생 번호와 점수의 한 셋트이다.
	            전체 점수의 평균을 출력한다.
	            단, 일등의점수와 꼴등의 점수는 제외하고 평균을 구한다. 
	            위 조건에 해당하는 번호와 점수 , 그리고 평균을 출력한다. 
	        [정답]  
	            1001 87
				1003 45
				1005 23
				51.67

	    */
	
	    int[] numberList = {1001, 1002, 1003, 1004, 1005};
	    int[] scoreList  = {  87,   11,   45,   98,   23};
	
	    int maxScore = scoreList[0];
	    int minScore = scoreList[0];
	
	    int maxIndex = 0;
	    int minIndex = 0;
	
	    int size = numberList.length;
	    for(int i=0; i<size; i++) {
	        if(maxScore < scoreList[i]) {
	            maxScore = scoreList[i];
	            maxIndex = i;
	        }
	        if(minScore > scoreList[i]) {
	            minScore = scoreList[i];
	            minIndex = i;
	        }
	    }
	    double total = 0;
	    double avg = 0;
	    for(int i = 0; i < size; i++) {
	    	if(scoreList[i] != maxScore && scoreList[i] != minScore) {
	    		System.out.println(numberList[i] + " " + scoreList[i]);
	    		total += scoreList[i];
	    	}
	    }
	    avg = total/3;
	    System.out.println(String.format("%.2f", avg));



	}

}
