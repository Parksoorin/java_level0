package 반복문응용9_개념_for;

public class 반복문응용9_개념01_for예제1 {
	public static void main(String[] args) {
		
	    /*
	        [반복문for]
	            while 문과 조금 형태가 다르고, 여러가지 형태로 사용가능하다.
	            천천히 하나씩 알아보자.
	            반복문은 일반적으로 (1)초기식 (2) 조건식 (3) 증감식 으로 구성되어있다.

	        [for문 형태1]
	            [1] 초기식 과 조건식이 한줄에 들어간다. 
	            [2] 조건식은 반드시 ;(세미콜론)을 붙여야한다. 
	    */

	   

	    // while문
	    int i = 1; // 초기식
	    while(i <= 5) { // 조건식
	        System.out.println(i + " ");
	        i += 1; // 증감식
	    }
	    System.out.println();

	    for(int j= 1; j <= 5;) {
	        System.out.println(j + " ");
	        j += 1;
	    }
		
	}
}
