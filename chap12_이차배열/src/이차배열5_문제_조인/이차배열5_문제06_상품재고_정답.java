package 이차배열5_문제_조인;

import java.util.Arrays;

public class 이차배열5_문제06_상품재고_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            itemData 는상품의 정보이다.
	            데이터는 순서대로 번호 , 가격 , 재고 수량이다. 

	            order배열은 오늘 주문이 들어온 상품의 번호이다. 	
	            단, 주문할 때마다 itemData 재고에서 하나씩 감소하고, 
	            재고가 0이면 주문할 수 없다.
	           
	            order의 주문을 토대로 오늘 매출을 구하시오.
	            재고가 변경된 itemData 도 함께 출력하시오.
	            
	        [정답]
	            1001,500,2
	            1002,1200,0
	            1003,4300,0
	            1004,2300,0
	            total=12600
	    */

	    int[][] itemData = {
	        {1001,500,3},
	        {1002,1200,1},
	        {1003,4300,2},
	        {1004,2300,1}
	    };

	    int[] order = {1001, 1002, 1004, 1004, 1003, 1003, 1002};

	    int total = 0;

	    for(int i = 0; i < order.length; i++){

	        for(int j = 0; j < itemData.length; j++){
	            if(order[i] == itemData[j][0]){
	                if(itemData[j][2] > 0){
	                    total += itemData[j][1];
	                    itemData[j][2] -= 1;
	                }
	            }
	        }
	    }

	    for(int i = 0; i < itemData.length; i++){
	        System.out.println(Arrays.toString(itemData[i]));
	    }

	    System.out.println("total=" + total);
		
	}
}
