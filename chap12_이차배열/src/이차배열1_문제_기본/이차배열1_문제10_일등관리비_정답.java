package 이차배열1_문제_기본;

public class 이차배열1_문제10_일등관리비_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	        apt배열은 아파트 1동의 각 세대를 의미한다.
	        pay배열은 이번달 관리비를 뜻한다.    
	        아래 문제를 잘 읽고 정답을 구하시오.
	
	
		  */
			int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
				
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
   
			/*
		        [문제] 
		            관리비가 가장 적게 나온 집을 출력하시오.
		        [정답]
		            가장 적게 나온 집 = 303 800     
			 */
			int min = pay[0][0];
			int m1 = 0;
			int m2 = 0;
			for(int i=0; i<pay.length; i++) {
		        for(int j=0; j<pay[i].length; j++) {
		        	if(min > pay[i][j]) {
		        		min = pay[i][j];
		        		m1 = i;
		        		m2 = j;
		        	}
		        }
		    }
			System.out.println(apt[m1][m2] + " " + pay[m1][m2]);
	}

}
