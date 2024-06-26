package 일차배열7_문제_인덱스활용;

import java.util.Arrays;

public class 배열7_문제05_상품별매출_정답 {

	public static void main(String[] args) {

	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            total은 각 상품별 매출을 저장할 배열이다.
	            item과 price와 total은 한세트이다.

	            order배열은 오늘 주문이 들어온 상품의 인덱스 번호이다. 
	            count배열은 order에서 주문한 상품들의 개수이다.
	            order 와 count는 한세트이다. 
	            
	            오늘상품별 매출을 각각 total에 저장하시오.

	       [설명]
	            [첫번째 계산]
	                order : 0은 상품 1001을 의미하는 것이고, 
	                orderCount : 3은 1001상품을 3개 구매한것이 된다. 
	                price 가 500원 이므로 1500원이 추가된다.
	            [두번째 계산]
	                order : 1은 상품번호 1002 를 의미하는 것이고, 
	                orderCount : 2는 1002상품을 2개 구매한것이 된다.
	                price 가 1200원 이므로 2400원이추가된다.
	            
	            나머지 계산도 같은방법으로 하면된다.
	        [정답]
	            1500,6000,30100,6900
	    */

	    int[] item = {1001, 1002, 1003, 1004};
	    int[] price = {500, 1200, 4300, 2300};
	    int[] total = {0, 0, 0, 0};

	    int[] order = {0, 1, 3, 3, 2, 2, 1};
	    int[] orderCount = {3, 2, 2, 1, 3, 4, 3};


	    for(int i =0; i < order.length; i++){
	        int index = order[i];
	        int count = orderCount[i];

	        total[index] += price[index] * count;
	    }
	    System.out.println(Arrays.toString(total));


	}

}
