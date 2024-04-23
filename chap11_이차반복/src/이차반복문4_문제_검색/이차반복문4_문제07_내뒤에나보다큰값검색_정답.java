package 이차반복문4_문제_검색;

public class 이차반복문4_문제07_내뒤에나보다큰값검색_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 배열전체의 값들과 비교하면서 현재값의 뒤에 위치한 값들만 출력하시오.
	            단, 내뒤의 값둘중 나보다 큰값들만 출력하시오.
	        [정답]
	            20 30 40 30 50 60 =10
	            30 40 30 50 60 =20
	            40 50 60 =30
	            50 60 =40
	            50 60 =30
	            50 60 =10
	            60 =50
	            =60
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {
	        int a = arr[i];
	        
	        for(int j = i + 1; j < arr.length; j++){

	            int b = arr[j];

	            if(a < b){
	                System.out.print(arr[j] + " ");
	            }       
	        }
	        System.out.println("="+arr[i]);
	    }
		
	}
}
