package 이차배열2_개념_게임;

import java.util.Arrays;

public class 이차배열2_개념02_문자열이차원 {

	public static void main(String[] args) {
		/*
        	자바에서는 한가지 자료형으로 배열을 만들수밖에 없다.
        	그래서 숫자와 문자가 같이 있으면 전부 문자열로 표현한후 숫자는 형변환을 통해 표현해야한다.
        	[문제]
         		data 의 왼쪽은 학생이름 오른쪽은 점수라고 할때,
        		합격한 학생의 이름과 점수를 출력하시오. 합격점수는 60점이다.
        	[정답]
        		이수영 70
				최정식 90
		 */

		String data [][] = {
				{"김철수" , "50"},	
				{"이수영" , "70"},	
				{"조희민" , "30"},	
				{"최정식" , "90"},	
		};
		
	    for(int i = 0; i < data.length; i++) {
	    	int b = Integer.parseInt(data[i][1]);
	    	if(b >= 60) {
	    		System.out.println(data[i][0] + " " + data[i][1]);
	    	}
	    }
	    
	}

}
