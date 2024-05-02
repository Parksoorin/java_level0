package 이차배열6_문제_그룹바이;

import java.util.Arrays;

public class 이차배열6_문제03_데이터3_회원_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            memberList는 회원 목록 데이터이다.
	            순서대로 회원번호와 회원아이디이다.

	            itemList은 쇼핑몰 판매 상품 데이터이다.
	            순서대로 상품이름과 가격이다.
	            
	            orderList는 오늘 주문 목록이다. 
	            순서대로 주문아이디 , 상품 , 개수 이다. 

	            회원별 구입총합을 출력하시오.
	            [번호, 아이디 , 총합 ] 을 출력하시오.
	            단, 금액이 높은순으로 출력하시오.

	        [정답]
				[1002, pythongood, 28000]
				[1003, testid, 16000]
				[1001, qwer1234, 4400]
	    */
	    String[][] memberList = {
	        {"1001" , "qwer1234" },
	        {"1002" , "pythongood" },
	        {"1003" , "testid" },
	    };

	    String[][] itemList = {
	            {"사과", "1100"},
	            {"바나나", "2000"},
	            {"딸기", "4300"},
	    };

	    String[][] orderList = {
	        {"qwer1234" , "사과" , "3"},
	        {"pythongood" , "딸기" , "6"},
	        {"testid" , "바나나" , "1"},
	        {"pythongood" , "사과" , "2"},
	        {"testid" , "바나나" , "7"},
	        {"qwer1234" , "사과" , "1"},
	    };

	    String[][] viewList = new String[memberList.length][3];
	    
	  

	}
}
