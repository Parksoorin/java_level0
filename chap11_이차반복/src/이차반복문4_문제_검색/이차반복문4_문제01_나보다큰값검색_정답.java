package 이차반복문4_문제_검색;

public class 이차반복문4_문제01_나보다큰값검색_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각가의 배열의 값들이 나머지값들과 비교해서 현재의 배열값보다 큰값들만 출력하시오.
	            단, 같거나 작을때에는 0을 출력하시오.
	        [정답]
	            0 20 30 40 30 0 50 60
	            0 0 30 40 30 0 50 60
	            0 0 0 40 0 0 50 60
	            0 0 0 0 0 0 50 60
	            0 0 0 40 0 0 50 60
	            0 20 30 40 30 0 50 60
	            0 0 0 0 0 0 0 60
	            0 0 0 0 0 0 0 0
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {

	        int a = arr[i];
	        for(int j = 0; j < arr.length; j++){

	            int b = arr[j];
	            if(a < b){
	                System.out.print(arr[j] + " ");
	            }else{
	                System.out.print(0 + " ") ;
	            }

	        }
	        System.out.println();
	    }

	}
}
