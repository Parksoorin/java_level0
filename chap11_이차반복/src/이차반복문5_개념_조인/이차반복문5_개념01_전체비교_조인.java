package 이차반복문5_개념_조인;

import java.util.Arrays;

public class 이차반복문5_개념01_전체비교_조인 {
	public static void main(String[] args) {
		
	    /*
	        [개념] 일차원 비교 방법
	            a배열과 b배열을 비교하고 서로 값이 같으면 숫자 0으로 변경하시오.
	            아래 배열을 보면 값 10만 같다.     
	    */

	    int[] a = {10, 20, 30, 40};
	    int[] b = {10,  5, 20,  9};

	    int size = a.length;
	    for(int i=0; i<size; i++) {
	        if(a[i] == b[i]) {
	            a[i] = 0;
	            b[i] = 0;
	        }
	    }
	    System.out.println("a = " + Arrays.toString(a));
	    System.out.println("b = " + Arrays.toString(b));

	    /*
		    [개념] 이차원 비교 방법
	            c배열의 값이 d배열 안에 있다면 둘 다 0으로 변경하시오.
	            이번엔 자리별로 검사하는 것이 아니라, 
	            c배열의 값 10이 d배열 안에 자리에 상관없이 포함되어있다면 0으로 변경해야 한다. 
	            마찬가지로 c배열의 값 20도 d에 포함되어있기 때문에, 0으로 변경해야 한다. 
	            
	            c배열 하나마다 d전체를 전부 비교해야 하므로, 총 16번 반복해야 한다.    
	            
	        [조인]
	            이와 같이 한배열의 각각의 값이 다른모든 배열을 검사하는것을 조인이라고한다. 
	    */

	    int[] c = {10, 20, 30, 40};
	    int[] d = { 7,  5, 20, 10};

	    size = c.length;
	    for(int i=0; i<size; i++) {
	        for(int j=0; j<size; j++) {
	            if(c[i] == d[j]) {
	                c[i] = 0;
	                d[j] = 0;
	            }
	        }
	    }
	    System.out.println("c = " + Arrays.toString(c));
	    System.out.println("d = " + Arrays.toString(d));

	}
}
