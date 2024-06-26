package 이차반복문6_문제_조인응용;

public class 이차반복문6_문제03_상품취소_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            total 은 오늘 의 매출이다. 
	            단, cancel 은 오늘 주문취소한 주문번호이다. 
	            [1] 주문을 취소한 번호와 가격을 전부 출력하시오.
	            [2] 오늘의 매출에서 취소한 주문가격을 제외한 매출을 출력하시오.
	        [정답]
	            주문취소
	            1002번1200원
	            1004번2300원
	            1003번4300원
	            오늘의최종매출=8300
	    */

	    int[] item  = {1001, 1002, 1003, 1004};
	    int[] price = { 500, 1200, 4300, 2300};
	    int total = 16100;

	    int[] cancel = {1002,1004,1003};
	    
	    for(int i = 0; i < cancel.length; i++) {
	    	for(int j = 0; j < item.length; j++) {
	    		if(cancel[i] == item[j]) {
	    			System.out.println(cancel[i] + "번 " + price[j] + "원");
	    			total -= price[j];
	    		}
	    	}
	    }
		System.out.println("오늘의 최종 매출 = " + total);
	}
}
