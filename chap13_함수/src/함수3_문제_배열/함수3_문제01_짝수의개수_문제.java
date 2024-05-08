package 함수3_문제_배열;


public class 함수3_문제01_짝수의개수_문제 {

	public static void solution(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {2, 45, 1, 12};
		
		/*
         	[문제] 
         		int [] arr = {2, 45, 1, 12};
	            arr배열 안의 값들을 체크하여 
	            짝수의 개수를 출력하는 함수를 만드시오.
	        [정답]
	            2
	    */
		
		solution(arr);
		
	}
}
