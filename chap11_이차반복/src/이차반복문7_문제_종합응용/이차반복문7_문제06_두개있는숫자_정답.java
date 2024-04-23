package 이차반복문7_문제_종합응용;

import java.util.Arrays;

public class 이차반복문7_문제06_두개있는숫자_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            arr배열에서 두개있는 숫자만 result 에 저장하시오.
	            단, 이미 저장되어있는 값이면 한개만저장하시오.
	        [정답]
	            [30, 40, 0, 0, 0, 0, 0, 0, 0]
	    */

	    int[] arr = {10, 20, 30, 40, 40, 10, 30, 10, 50};
	    int[] result = new int[arr.length];

	    int index = 0;
	    for(int i=0; i<arr.length; i++) {
	        
	        int count = 0;

	        for(int j=0; j < arr.length; j++) {
	            if(arr[i] == arr[j]) {
	                count += 1;
	            }
	        }
	        if(count == 2) {

	            //처음에는 무조건저장된다.
	            if(result.length == 0){
	            	result[index] = arr[i];
	            	index += 1;
	                continue;
	            }
	            
	            //여기는 두번째부터 실행된다.
	            int count2 = 0;
	            for(int j = 0; j < result.length; j++){
	                if(result[j] == arr[i]){
	                    count2 += 1;
	                }
	            }
	            if(count2 == 0){
	            	result[index] = arr[i];
	            	index += 1;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(result));

		
	}
}
