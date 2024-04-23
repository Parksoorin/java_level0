package 이차반복문4_개념_검색;

public class 이차반복문4_개념02_나와같은값검색_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 배열전체의 값들과 하나씩 비교해서 서로 같은값을 출력하시오.
	            단, 서로 같은값이 아닐때에는 0을 출력하시오.
	        [정답]
	            10 0 0 0 0 10 0 0
	            0 20 0 0 0 0 0 0
	            0 0 30 0 30 0 0 0
	            0 0 0 40 0 0 0 0
	            0 0 30 0 30 0 0 0
	            10 0 0 0 0 10 0 0
	            0 0 0 0 0 0 50 0
	            0 0 0 0 0 0 0 60
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {

	        int a = arr[i];
	        for(int j = 0; j < arr.length; j++){

	            int b = arr[j];
	            
	            if(a == b){
	                System.out.print(arr[j] + " ");
	            }else{
	                System.out.print(0 + " ") ;
	            }

	        }
	        System.out.println();
	    }

	}
}
