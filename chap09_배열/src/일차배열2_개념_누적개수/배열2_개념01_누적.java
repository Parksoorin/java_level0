package 일차배열2_개념_누적개수;

public class 배열2_개념01_누적 {

	public static void main(String[] args) {
		  /*
				[문제] 
		            아래 배열의 전체 합을 출력하시오. 
				[정답] 
		            150    
		    */

		    int[] arr = {10, 20, 30, 40, 50};

		    int total = 0;
		    for(int i=0; i<arr.length; i++) {
		        total += arr[i];
		    }
		    System.out.println(total);

	}

}
