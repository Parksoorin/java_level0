package 일차배열6_개념_규칙찾기;

public class 배열6_개념01_거꾸로출력 {

	public static void main(String[] args) {
		/*
	        [문제]	
	            arr배열의 값들을 거꾸로 출력하시오.
	        [정답]
	            60 54 12 44 21     
	    */
	
	    int[] arr = {21, 44, 12, 54, 60};
	
	
	    // 아래 반복문처럼 뒤집어서 거꾸로 출력하는것은 권장하지않는다.
	    int size = arr.length - 1;
	    for(int i = size; i >= 0; i--) {
	    	System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	    
	    //이와 같이 변수를 추가로 사용해서 해결하는것을 권장한다. 
	    int index = arr.length - 1;
	    for(int i=0; i <arr.length; i++) {
	    	System.out.print(arr[index] + " ");
	        index -= 1;
	    }

	}

}
