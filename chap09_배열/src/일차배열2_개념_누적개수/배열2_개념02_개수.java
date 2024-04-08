package 일차배열2_개념_누적개수;

public class 배열2_개념02_개수 {

	public static void main(String[] args) {
		/*
			[문제] 
	            아래 배열의 홀수의개수를 출력하시오.
			[정답]
	            3   
	    */
	
	    int[] arr = {16, 24, 31, 45, 53};
	
	    int count = 0;
	    for(int i=0; i<arr.length; i++) {
	        if(arr[i] % 2 == 1){
	            count += 1;
	        }
	    }
	    System.out.println(count);
	}

}
