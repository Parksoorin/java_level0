package 이차반복문6_문제_조인응용;

public class 이차반복문6_문제01_상품주문_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            order배열은 오늘 주문이 들어온 상품의 번호이다.
	            오늘의 매출을 출력하시오.
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

	    int total = 0;
	    
	    for(int i=0; i<order.length; i++) {

	        int number = order[i];
	        for(int j = 0; j < item.length; j++){
	            if(number == item[j]){
	                System.out.print(item[j] + " " + price[j]);
	                total += price[j];
	            }            
	        }
	        System.out.println();
	    }

	    System.out.println("total="+total);

	}
}
