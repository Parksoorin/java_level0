package 일차배열3_개념_비교;

public class 배열3_개념01_배열비교 {

	public static void main(String[] args) {
		/*
	        [문제]
	            a 와 b 의 각각의 값을 비교해서 더 큰 값을 출력한다. 
	            서로 같으면 둘 다 출력한다.
	        [정답]
	            b :  54
	            a :  43
	            a :  23
	            a :  12, b : 12
	            a :  53    
	    */
	
	    int[] a = {10, 43, 23, 12, 53};
	    int[] b = {54, 6, 4, 12, 50};
	
	    for(int i=0; i<5; i++) {
	        if(a[i] > b[i]) {
	            System.out.println("a : " + a[i]);
	        } else if(a[i] < b[i]) {
	        	System.out.println("b : " + b[i]);
	        } else {
	        	System.out.println("a : " + a[i] + ", b : " + b[i]);
	        }
	    }

	}

}
