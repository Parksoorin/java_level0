package 이차반복문7_문제_종합응용;

public class 이차반복문7_문제08_석차별번호출력_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            석차와 번호를 출력하시오.
	        [정답]
	            1001 2
	            1002 3
	            1003 4
	            1004 1
	    */

	    int[] numList   = {1001, 1002, 1003, 1004};
	    int[] scoreList = {  87,   42,   11,   98};

	    for(int i = 0; i < scoreList.length; i++) {
	    	int cnt = 1;
	    	for(int j = 0; j < scoreList.length; j++) {
	    		if(scoreList[i] < scoreList[j]) {
	    			cnt++;
	    		}
	    	}
	    	System.out.println(numList[i] + " " + cnt);
	    }
	   
	}
}
