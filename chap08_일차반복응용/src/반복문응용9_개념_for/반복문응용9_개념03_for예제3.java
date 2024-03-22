package 반복문응용9_개념_for;

public class 반복문응용9_개념03_for예제3 {
	public static void main(String[] args) {
		
	    /*
	         [for문 형태3]
	            [1] 초기식 , 조건식 , 증감식 전부 한줄로 적는것이 가능하다.
	           
	           
	        [for문 형태4]
	            [1] 증감식을  a += 1 대신 a++ 로 표현한다.
	            [2] 보통 [형태4] 를 일반적으로 가장많이 사용한다. 
	            [3] 보통 [형태1] 또는 [형태2] 를 사용시 for 대신 while 을 사용한다. 

	        [while 과 for 사용 연습하는법]
	            다음단원부터 문제들을 while로한번 for로한번 두번씩 풀어보면, 
	            적절히 더어울리는 식을 찾아갈수있다. 
	       
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
	    System.out.println();

	    //형태3
	    for(int k = 1; k <= 5; k += 1){

	    }

	    //형태4
	    for(int m = 1; m <= 5; m++){
	    }

	}
}
