package 함수6_문제_리턴변수;

import java.util.Random;

public class 함수6_문제05_상품주문_정답 {	
	
	public static int getTotal(int[] item, int[] price , int[] order) {
		int total = 0;
		for(int i = 0; i < order.length; i++) {
			for(int j = 0; j < item.length; j++) {
				if(order[i] == item[j]) {
					total += price[j];
				}
			}
		}
		return total;
	}
	public static void main(String[] args) {	
		/*
		   [문제]
            item배열은 상품의 번호이다.
            price배열은 상품의 가격이다.
            order배열은 오늘 주문이 들어온 상품의 번호이다.
            오늘의 매출을 리턴하는 함수를 만드시오.
        [정답]
            1003 4300
            1001 500
            1003 4300
            1003 4300
            1004 2300
            1002 1200
            1001 500
            total=17400
		 */		
 		int[] item  = {1001, 1002, 1003, 1004};
	    int[] price = { 500, 1200, 4300, 2300};

	    int[] order = {1003, 1001, 1003, 1003, 1004, 1002, 1001};
	    int total = getTotal(item, price, order);
	    System.out.println(total);
	}
}
