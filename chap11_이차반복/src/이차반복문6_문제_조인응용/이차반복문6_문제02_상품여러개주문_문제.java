package 이차반복문6_문제_조인응용;

public class 이차반복문6_문제02_상품여러개주문_문제 {
	public static void main(String[] args) {

	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            item과 price는 한세트이다.
	    
	            order배열은 오늘 주문이 들어온 상품의 번호이다. 
	            orderCount 는 order에서 주문한 상품들의 개수이다.
	            order 와 orderCount 한세트이다. 
	            오늘의 총매출을 출력하시오.

	        [설명]
	            [첫번째 계산]
	                order : 1001 번이다.
	                orderCount : 3은 1001상품을 3개 구매한것이 된다. 
	                price 가 500원 이므로 1500원이 된다.
	            [두번째 계산]
	                order : 1002번이다.
	                orderCount : 2는 1002상품을 2개 구매한것이 된다.
	                price 가 1200원 이므로 2400원이추가된다.
	            
	            나머지 계산도 같은방법으로 하면된다.
	            
	        [정답]
	            1001 500 3
	            1002 1200 2
	            1004 2300 2
	            1004 2300 1
	            1003 4300 3
	            1003 4300 4
	            1002 1200 3
	            44500
	    */

	    int[] item = {1001, 1002, 1003, 1004};
	    int[] price = {500, 1200, 4300, 2300};

	    int[] order = {1001, 1002, 1004, 1004, 1003, 1003, 1002};
	    int[] orderCount = {3, 2, 2, 1, 3, 4, 3};
	    
	    int total = 0;

	    for(int i = 0; i < order.length; i++) {
	    	for(int j = 0; j < item.length; j++) {
	    		if(order[i] == item[j]) {
	    			System.out.println(order[i] + " " + price[j] + " " + orderCount[i]);
	    			total += price[j] * orderCount[i];
	    		}
	    	}
	    }
	    System.out.println(total);

	}
}
