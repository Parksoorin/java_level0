package 이차반복문4_문제_검색;

public class 이차반복문4_문제05_큰값개수검색_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각가의 배열의 값들이 나머지값들과 비교해서 현재의 배열값과 같은값의 개수를 출력하시오.
	            단, 같거나 작을때에는 0을 출력하시오.
	        [정답]
	            10:6
	            20:5
	            30:3
	            40:2
	            30:3
	            10:6
	            50:1
	            60:0
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {
	        int a = arr[i];
	        int count = 0;
	        for(int j = 0; j < arr.length; j++){
	                  
	            int b = arr[j];
	            if(a < b){
	                count += 1;
	            }
	        }
	        System.out.println(a+":"+count);
	    }
		
	}
}
