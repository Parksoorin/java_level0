package 문자열2_문제_문자열함수;

public class 문자열2_문제09_사전순서_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래 단어들중에서 사전순서로 가장빠른글자를 출력하시오.
	        [정답] 
	            child
	            
	        
	    */

	    String[] arr = {"school", "teacher", "child","father", "love"};
	    String min = arr[0];
	    for(int i = 0; i < arr.length; i++) {
	    	String a = arr[i];
	    	if(a.compareTo(min) < 0) {
	    		min = a;
	    	}
	    }
	    System.out.println(min);

	}

}
