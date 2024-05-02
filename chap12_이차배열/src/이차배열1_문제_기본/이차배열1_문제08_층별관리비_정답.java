package 이차배열1_문제_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_문제08_층별관리비_정답 {

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
	        [문제 1] 
	            각 층별 관리비 합을 출력하시오.
	        [정답 1] 
	            4400 7100 5400    
	    */
			
			 for(int i=0; i<pay.length; i++) {
		        int total = 0;    
		        for(int j=0; j<pay[i].length; j++) {
		            total += pay[i][j];
		        }
		        System.out.println(total);
		    }
	}

}
