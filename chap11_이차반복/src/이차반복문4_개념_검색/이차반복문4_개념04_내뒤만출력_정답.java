package 이차반복문4_개념_검색;

public class 이차반복문4_개념04_내뒤만출력_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 배열전체의 값들과 비교하면서 현재값의 뒤에 위치한 값들만 출력하시오.
	        [정답]

	            10=20 30 40 30 10 50 60
	            20=30 40 30 10 50 60
	            30=40 30 10 50 60
	            40=30 10 50 60
	            30=10 50 60
	            10=50 60
	            50=60
	            60=

	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {

	        System.out.print(arr[i]+"=");
	        for(int j = i + 1; j < arr.length; j++){
	            
	            System.out.print(arr[j] + " ");
	            
	        }
	        System.out.println();
	    }

	}
}
