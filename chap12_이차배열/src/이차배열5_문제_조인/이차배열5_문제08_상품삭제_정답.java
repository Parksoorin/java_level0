package 이차배열5_문제_조인;

import java.util.Arrays;

public class 이차배열5_문제08_상품삭제_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            orderList는 오늘 주문 목록이다. 
	            차례대로 [번호,아이디,아이템이름,개수,주문취소여부확인] 이다.
	            cancelList는 주문취소번호 목록이다. 
	            orderList에서 주문취소한번호를 true를 false로 변경 후,
	            true인 것만 출력하시오.

	        [정답]
				[100003, testid, 바나나, 1, true]
				[100004, pythongood, 사과, 2, true]
				[100006, qwer1234, 사과, 1, true]
	    */

	    String[][] orderList = {
	        {"100001" , "qwer1234" , "사과" , "3", "true"},
	        {"100002" , "pythongood" , "딸기" , "6", "true"},
	        {"100003" , "testid" , "바나나" , "1", "true"},
	        {"100004" , "pythongood" , "사과" , "2", "true"},
	        {"100005" , "testid" , "바나나" , "7", "true"},
	        {"100006" , "qwer1234" , "사과" , "1", "true"}
        };

	    int[] cancelList = {100001 , 100002, 100005};
	    
	    for(int i=0; i<cancelList.length; i++) {
	        for(int j=0; j<orderList.length; j++) {
	        	int orderNumber = Integer.parseInt(orderList[j][0]);
	            if(cancelList[i]== orderNumber) {
	            	orderList[j][4] = "false";
	            }
	        }
	    }

	    for(int i = 0; i < orderList.length; i++){
	    	if(orderList[i][4] == "true") {
	    		System.out.println(Arrays.toString(orderList[i]));
	    	}
	    }

		
	}
}
