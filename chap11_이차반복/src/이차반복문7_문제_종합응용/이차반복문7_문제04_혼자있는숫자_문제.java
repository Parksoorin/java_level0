package 이차반복문7_문제_종합응용;

public class 이차반복문7_문제04_혼자있는숫자_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            arr배열에서 혼자있는 숫자만 출력하시오.
	        [정답]
	            20 50
	    */

	    int[] arr = {10, 20, 30, 40, 40, 10, 30, 10, 50};

	    for(int i = 0; i < arr.length; i++) {
	    	int cnt = 0;
	    	for(int j = 0; j < arr.length; j++) {
	    		if(arr[i] == arr[j]) {
	    			cnt++;
	    		}
	    	}
	    	if(cnt == 1) {
	    		System.out.println(arr[i]);
	    	}
	    }
	}
}
