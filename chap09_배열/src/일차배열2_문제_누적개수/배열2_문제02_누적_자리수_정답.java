package 일차배열2_문제_누적개수;

public class 배열2_문제02_누적_자리수_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 십의 자리가 2인 수의 합을 출력하시오.
	        [정답]
	            692  
	    */
	    
	    int[] arr = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    int total = 0;
	    
	    for(int i=0; i<arr.length; i++) {
	        int a = (arr[i] % 100 / 10);
	
	        if(a == 2){
	            total += arr[i];
	        }
	    }
	    System.out.println(total);

	}

}
