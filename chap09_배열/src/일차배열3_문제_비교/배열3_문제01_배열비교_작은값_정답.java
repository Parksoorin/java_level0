package 일차배열3_문제_비교;

public class 배열3_문제01_배열비교_작은값_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            a 와 b 를 각각의 값을 비교해서 더 작은 값을 출력한다. 
	            단, 서로 같으면 둘 다 출력한다.
	        [정답]
	            10
	            6
	            4
	            12 12
	            50    
	    */
	
	    int[] a = {10, 43, 23, 12, 53};
	    int[] b = {54,  6,  4, 12, 50};
	
	    int size = a.length;
	
	    for(int i=0; i<size; i++) {
	        if(a[i] > b[i]) {
	        	System.out.println(b[i]);
	        } else if(a[i] < b[i]) {
	        	System.out.println(a[i]);
	        } else {
	        	System.out.println(a[i] + " " + b[i] );
	        }
	    }
	}

}
