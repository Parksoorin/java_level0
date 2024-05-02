package 이차배열6_문제_그룹바이;

import java.util.Arrays;

public class 이차배열6_문제04_데이터3_상품_정답 {
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
	    
	    for(int i = 0; i < itemList.length; i++){
	    	viewList[i][0] = itemList[i][0];
	    	viewList[i][1] = "0";
	    }

	    for(int i = 0; i < viewList.length; i++){
	        for(int j = 0; j < orderList.length; j++){
	            if(viewList[i][0] == orderList[j][1]){
	            	int count = Integer.parseInt(viewList[i][1]);
	            	int orderCount = Integer.parseInt(orderList[j][2]);
	            	count += orderCount;
	            	viewList[i][1] = count + "";
	            }
	        }
	    }

    	Arrays.sort(viewList, (a, b) -> {
	    	
	    	// 문자열에서 숫자는 앞글자를 기준으로 정렬하기 때문에
	    	// 다시 숫자로 변경해서 정렬해줘야 한다.
	    	int numA = Integer.parseInt(a[1]);
	    	int numB = Integer.parseInt(b[1]);
	    	
	    	if(numA < numB) {
	    		return 1;
	    	} else if(numA > numB) {
	    		return -1;
	    	} else {
    			return 0;
	    	}
	    	
	    });

	    for(int i = 0; i < viewList.length; i++){
	    	System.out.println(Arrays.toString(viewList[i]));
	    }

	}
}
