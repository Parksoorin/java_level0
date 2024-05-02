package 이차배열6_문제_그룹바이;

import java.util.Arrays;

public class 이차배열6_문제04_데이터3_상품_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            memberList는 회원 목록 데이터이다.
	            순서대로 회원번호와 회원아이디이다.

	            itemList은 쇼핑몰 판매 상품 데이터이다.
	            순서대로 상품이름과 가격이다.
	            
	            orderList는 오늘 주문 목록이다. 
	            순서대로 주문아이디 , 상품 , 개수 이다. 

	            상품별 판매개수를 출력하시오.
	            단, 판매개수가 높은순으로 출력하시오.

	        [정답]
				[바나나, 24]
				[사과, 6]
				[딸기, 6]
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
	        {"testid" , "바나나" , "17"},
	        {"pythongood" , "사과" , "2"},
	        {"testid" , "바나나" , "7"},
	        {"qwer1234" , "사과" , "1"},
	    };

	    String[][] viewList = new String[itemList.length][2];
	  
	}
}
