package 일차배열2_문제_누적개수;

public class 배열2_문제04_개수_자리수_홀수_문제 {

	public static void main(String[] args) {

	     /*
	        [문제]
	            arr배열에서 각각의 값의 자리수별로 분리하여 그 곱을 구한후
	            그곱이 홀수인수의 개수를 구하시오.
	        
	        [정답]
	            2
	    */
	   
	    int[] arr = {10, 33, 23, 13, 52};
	    int count = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	    	int a = arr[i] / 10;
	    	int b = arr[i] % 10;
	    	
	    	if((a*b)%2 == 1) {
	    		count++;
	    	}
	    }
	    
	    System.out.println(count);
	   
	}

}
