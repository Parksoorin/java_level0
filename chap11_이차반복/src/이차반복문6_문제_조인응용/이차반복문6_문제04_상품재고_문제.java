package 이차반복문6_문제_조인응용;

import java.util.Arrays;

public class 이차반복문6_문제04_상품재고_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            count배열은 상품의 재고 개수이다.
	            item과 price, count는 한 세트이다.

	            order배열은 오늘 주문이 들어온 상품의 번호이다. 	
	            단, 주문할 때마다 count 재고에서 하나씩 감소하고, 
	            재고가 0이면 주문할 수 없다.
	            주문할 수 없을 때는 "주문 불가"를 출력하시오.
	            order의 주문을 토대로 오늘 매출을 구하시오.
	            count 리스트도 출력하시오.
	        [정답]
	            order = 0, count = 2,1,2,1
	            order = 1, count = 2,0,2,1
	            order = 3, count = 2,0,2,0
	            order = 3, 주문불가
	            order = 2, count = 2,0,1,0
	            order = 2, count = 2,0,0,0
	            order = 1, 주문불가
	            매출 = 12600
	    */

	    int[] item  = {1001, 1002, 1003, 1004};
	    int[] price = {500, 1200, 4300, 2300};
	    int[] count = {3, 1, 2, 1};

	    int[] order = {1001, 1002, 1004, 1004, 1003, 1003, 1002};

	    int total = 0;
	    
	    for(int i = 0; i < order.length; i++) {
	    	for(int j = 0; j < item.length; j++) {
	    		if(order[i] == item[j]) {
	    			if(count[j] > 0) {
	    				total += price[j];
	    				count[j] = count[j] -1;
	    				System.out.println("order = " + (j + 1) + ", count = " + Arrays.toString(count));
	    			} else {
	    				System.out.println("order = " + (j + 1) + ", 주문불가");
	    			}
	    		}
	    	}
	    }
	    System.out.println("매출 = " + total);
	}
}
