package 이차배열3_문제_데이터베이스;

public class 이차배열3_문제05_상품목록_문제 {

	public static void main(String[] args) {

	    /*
	            itemData는 이번달 과일판매목록이다. 
	            데이터 순서는 번호,이름,가격,판매개수 이다.
	    */

	    String[][] itemData = {
	        {"1001", "사과" , "3000", "32"},         
	        {"1002", "배"  , "2000", "12"},        
	        {"1003", "딸기" , "4000", "42"},         
	        {"1004", "바나나", "1500", "55"},      
	    };


	    /*
	        [문제] 
	            전체 총매출액을 출력하시오.
	        [정답] 
	            total=370500
	    */
	    
	    int total = 0;
	    
	    for(int i = 0; i < itemData.length; i++) {
	    	total += Integer.parseInt(itemData[i][2]) * Integer.parseInt(itemData[i][3]); 
	    }
	    
	    System.out.println(total);

	}

}
