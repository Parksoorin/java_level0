package 함수3_문제_배열;


public class 함수3_문제04_전부짝수_정답 {

	public static void solution(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
			}
		}
		
		if(count == arr.length) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		/*
         	[문제]
				배열의 랜덤값이 모두 짝수면 true를 출력하고,
				하나라도 짝수가 아니면 false를 출력하는 함수를 만드시오.
				단, 0은 짝수이다.
			[정답]
				true
	    */
		
		int [] arr = {10, 0, 2, 6};
		solution(arr);
	}
}
