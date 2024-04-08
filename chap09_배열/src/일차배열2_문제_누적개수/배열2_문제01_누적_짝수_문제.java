package 일차배열2_문제_누적개수;

public class 배열2_문제01_누적_짝수_문제 {

	public static void main(String[] args) {
		/*
			 [문제] 
	           아래 배열의 짝수들의 합을 출력하시오.
			 [정답] 
	           101
	   */
	
	   int[] arr = {14, 13, 36, 41, 52};
	
	   int total = 0;
	   
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i]%2 == 0) {
			   total += arr[i];
		   }
	   }
	   
	   System.out.println(total);
	   
	}

}
