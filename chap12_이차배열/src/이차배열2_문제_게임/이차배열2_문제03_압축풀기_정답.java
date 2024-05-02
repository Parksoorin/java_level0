package 이차배열2_문제_게임;

public class 이차배열2_문제03_압축풀기_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            a배열은 원래 한 줄로 있던 데이터를 압축한 데이터이다.
	            가로를 기준으로 왼쪽 숫자는 저장할 문자이고 
	            오른쪽 숫자는 저장할 문자의 개수이다.
	            예를 들어 첫 번째 줄의 ["a",5] 는 "aaaaa" 을 뜻한다. 
	            아래 a배열의 모든 압축을 풀어 b문자열에 저장하시오.
	        [정답] 
	           b = aaaaacccccchkkk
	    */
	
	    String[][] a = {
	    	{"a", "5"},
			{"c", "6"},
			{"h", "1"},
			{"k", "3"}
	    };
	
	    String b = "";
	
	    for(int i=0; i<a.length; i++) {
	    	String str = a[i][0];
	        int size = Integer.parseInt(a[i][1]);
	        for(int j=0; j < size; j++) {
	            b += str;
	        }
	    }
	    System.out.println("b = " + b);

	}

}
