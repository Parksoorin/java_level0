package 반복문응용9_개념_for;

public class 반복문응용9_개념02_for예제2 {
	public static void main(String[] args) {
		
	    /*
	         [for문 형태2]
	            [1] 변수는 밖에 선언하고, 식만 적는 방법으로 사용가능하다.
	            [2] 조건식은 반드시 ;(세미콜론)을 붙여야한다. 
	           
	    */

	    // 형태1
	    for(int i = 1; i <= 5;) {
	        System.out.print(i + " ");
	        i += 1;
	    }

	    System.out.println();
	    
	    // 형태2
	    int j;
	    for(j = 1; j <= 5;) {
	    	System.out.print(j + " ");
	        j += 1;
	    }

	}
}
