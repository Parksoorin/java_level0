package 문자열1_문제_기본;

public class 문자열1_문제01_거꾸로_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            문자열 hello를 olleh로 출력하시오.
	        [정답]
	            olleh
	    */
	
	    String text = "hello";
	
	    int index = text.length() - 1;
	    for(int i=0; i<text.length(); i++) {
	    	System.out.print(text.charAt(index));
	        index -= 1;
	    }
	}

}
