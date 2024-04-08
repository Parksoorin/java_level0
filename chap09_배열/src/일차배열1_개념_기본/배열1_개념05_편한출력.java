package 일차배열1_개념_기본;

import java.util.Arrays;

/*
	# 배열의 전체 값을 출력하기 쉬운방법
		예) 
			int[] arr = {1, 2, 3, 4};
		
			1단계 : import java.util.Arrays;
			2단계 : Arrays.toString(arr);
*/
public class 배열1_개념05_편한출력 {

	public static void main(String[] args) {
int[] arr = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------");

		// Arrays.toString() 의 실제 내부는 다음과 같다.
		/*
			[풀이]
				i = 0	0 < 3	true	1,
				i = 1	1 < 3	true	1, 2,
				i = 2	2 < 3	true	1, 2, 3,
				i = 3	3 < 3	false	1, 2, 3, 4
		 */
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i < arr.length-1) {	// 0, 1, 2
				System.out.print(arr[i] + ", ");
			}else {					// 3
				System.out.print(arr[i]);
			}			
		}
		System.out.print("]");	
		System.out.println();		
		

	}

}
