package 문자열2_개념_문자열함수;

public class 문자열2_개념05_구분자_split {

	public static void main(String[] args) {
		/*
	        [개념] 문자열 자르기2
	            let 변수 = "문자열";
	            변수 = 변수.split(구분자);
	
	            문자열을 구분자를 기준으로 잘라서 배열로 만들어준다.
	    */
	
	    String text = "One,Two,Three,Four,Five";
	    String[] arr = text.split(",");
	    
	    for(int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i]);
	    }
	    System.out.println();
	    System.out.println("----------------------");
	    /*
	        [문제]
	            input에 저장된 암호를 글자의 길이만큼
	            password배열에 한 글자씩 저장 후 출력하시오.
	        [정답]
	            password = q,w,e,r,1,2,3,4
	    */
	
	    String input = "qwer1234";
	
	    String[] passwrod = input.split("");
	    for(int i=0; i<arr.length; i++) {
	    	System.out.print(passwrod[i]);
	    }
	}

}
