package 반복문5_개념_누적;

public class 반복문5_개념03_범위or누적 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 15까지 출력한다. 
	            [2] 5보다는 작거나 10보다는 큰 값의 누적을 구하시오.
	            [3] 누적앞에는 total=을 붙이시오
	        [정답]
	           1
	           2
	           3
	           4
	           5
	           6
	           7
	           8
	           9
	           10
	           11
	           12
	           13
	           14
	           15
	           total=75
	    */
	    int total = 0;
	
	    int i = 1;
	    while(i <= 15) {
	        if( i < 5 || 10 < i){
	            total += i;
	        }
	        System.out.println(i);
	        i += 1;
	    }
	
	    System.out.println("total="+total);
		
	}
}
