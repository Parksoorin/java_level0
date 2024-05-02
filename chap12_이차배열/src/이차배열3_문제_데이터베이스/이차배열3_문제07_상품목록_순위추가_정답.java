package 이차배열3_문제_데이터베이스;

import java.util.Arrays;

public class 이차배열3_문제07_상품목록_순위추가_정답 {

	public static void main(String[] args) {
		/*
		        itemData는 이번달 과일판매목록이다. 
		        데이터 순서는 번호,이름,가격,판매개수 이다.
		        마지막 두개의 "0" 은 각 아이템별 총매출과 순위이다. 
		*/
		
		String[][] itemData = {
		    {"1001", "사과" , "3000", "32" , "0" , "0"},         
		    {"1002", "배"  , "2000", "12" , "0" , "0"},        
		    {"1003", "딸기" , "4000", "42" , "0" , "0"},         
		    {"1004", "바나나", "1500", "55" , "0" , "0"},      
		};
		
		/*
		[문제] 
		    각 상품별 매출 총합을 각가 인덱스4에  추가하시오.
		    각 상품별 매출 총합을 기준으로 순위를 인덱스5에 추가하시오.
		[정답] 
		    [1001, 사과, 3000, 32, 96000, 2]
			[1002, 배, 2000, 12, 24000, 4]
			[1003, 딸기, 4000, 42, 168000, 1]
			[1004, 바나나, 1500, 55, 82500, 3]

		*/
		
		int total = 0;
		for(int i = 0; i < itemData.length; i++){
		    int a = Integer.parseInt(itemData[i][2]);
		    int b = Integer.parseInt(itemData[i][3]);
		    int result = a * b;
		    itemData[i][4] = result + ""; 
		}
		
		for(int i = 0; i < itemData.length; i++){
	        int count = 1;
	        for(int j = 0; j < itemData.length; j++){
	        	int a = Integer.parseInt(itemData[i][4]);
	        	int b = Integer.parseInt(itemData[j][4]);
	        	if(a < b) {
	        		count += 1;
	        	}
	        	
	        }
	        itemData[i][5] = count + "";

	    }
		
		
		for(int i = 0; i < itemData.length; i++){
			System.out.println(Arrays.toString(itemData[i]));
		}

	}

}
