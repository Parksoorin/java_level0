package 이차반복문4_문제_검색;

public class 이차반복문4_문제06_내앞에큰값검색_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 배열전체의 값들과 비교하면서 현재값의 앞에 위치한 값들만 출력하시오.
	            단, 내앞의 값둘중 나보다 큰값들만 출력하시오.
	        [정답]
	            =10
	            =20
	            =30
	            =40
	            40 =30
	            20 30 40 30 =10
	            =50
	            =60
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < i + 1; j++) {
	    		if(i == 0) {
	    			continue;
	    		} else if(arr[j] > arr[i]){
	    			System.out.print(arr[j] + " ");
	    		}
	    	}
	    	System.out.println(" = " + arr[i]);
	    }
		
	}
}
