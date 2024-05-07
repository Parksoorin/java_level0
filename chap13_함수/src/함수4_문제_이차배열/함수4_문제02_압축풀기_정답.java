package 함수4_문제_이차배열;


public class 함수4_문제02_압축풀기_정답 {

	public static void solution(String[][] arr) {
		String temp = "";
		
		for(int i = 0; i < arr.length; i++) {
			String[] line = arr[i];
			int count = Integer.parseInt(line[1]);
			for(int j = 0; j < count; j++) {
				temp += line[0];
			}
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		/*
         	 [문제]
	            a배열은 원래 한 줄로 있던 데이터를 압축한 데이터이다.
	            가로를 기준으로 왼쪽 숫자는 저장할 문자이고 
	            오른쪽 숫자는 저장할 문자의 개수이다.
	            예를 들어 첫 번째 줄의 ["a",5] 는 "aaaaa" 을 뜻한다. 
	            아래 a배열의 모든 압축을 풀어 b문자열에 저장후 출력하시오.
	            함수로 만드시오.
	        [정답] 
	           b = aaaaacccccchkkk
	    */
		
		String[][] game = {
				{"a" , "5" },
				{"c" , "6" },
				{"h" , "1" },
				{"k" , "3" },
		};
		solution(game);
	}
}
