package 문자열1_문제_기본;

public class 문자열1_문제04_문자수정_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래 번호 뒷자리를 **** 으로 변경하시오.
	        [결과]
	            Hong's number is 010-1234-****
	
	    */
	    String text = "Hong's number is 010-1234-5678";
	  
	    String temp = "";
	    
	    for(int i = 0; i < text.length(); i++) {
	    	if(i < text.length() - 4) {
	    		temp += text.charAt(i);
	    	} else {
	    		temp += "*";
	    	}
	    }

	    System.out.println(temp);
	}

}
