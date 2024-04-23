package 문자열1_문제_기본;

public class 문자열1_문제03_인덱싱개수_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래 문자열을 한글자씩 순서대로 서로 비교하여, 같은글자수와 틀린글자수를 출력하시오.
	        [정답]
	            같은글자수=4
	            틀린글자수=1
	    */
		String text = "abcde";
	    String text2 = "abdde";
	    
	    int cnt = 0;
	    int nCnt = 0;
	    
	    for(int i = 0; i < text.length(); i++) {
	    	if(text.charAt(i) == text2.charAt(i)) {
	    		cnt++;
	    	} else {
	    		nCnt++;
	    	}
	    }
	    
	    System.out.println("같은 글자 수 = " + cnt);
	    System.out.println("틀린 글자 수 = " + nCnt);
	}

}
