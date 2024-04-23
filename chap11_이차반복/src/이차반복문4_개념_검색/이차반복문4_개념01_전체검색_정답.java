package 이차반복문4_개념_검색;

public class 이차반복문4_개념01_전체검색_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            배열의 각각의 값들 수만큼 반복하면서
	            배열전체를 출력하시오.
	        [정답]
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	            10 20 30 40 30 10 50 60
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {

	        for(int j = 0; j < arr.length; j++){
	            System.out.print(arr[j] + " ");
	        }
	        System.out.println();
	    }

	}
}
