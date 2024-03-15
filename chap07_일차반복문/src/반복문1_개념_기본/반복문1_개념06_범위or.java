package 반복문1_개념_기본;

public class 반복문1_개념06_범위or {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 10까지 출력한다. 
	            [2] 3보다 작거나 8보다 크면 숫자대신 "x" 를출력한다.
	            [3] else 를 사용하지마시오.
	
	        [정답]
	            x
	            x
	            3
	            4
	            5
	            6
	            7
	            8
	            x
	            x
	    */
	  
	    int i = 1;
	    while(i <= 10){
	        if(i < 3 || 8 < i) {
	            System.out.println("x");
	        }
	        if(3 <= i && i <= 8) {
	            System.out.println(i);
	        }
	        i += 1;
	    }
		
	}
}
