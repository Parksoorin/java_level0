package 반복문8_문제_개수응용;

public class 반복문8_문제04_개수자리수5찾기_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 100 부터 150까지 출력한다. 
	            [2] 각각의 자리중에서 숫자 5가들어간숫자는 전부 출력한다.
	            [3] 위 조건의 숫자들의 중 6의 배수들의 개수를 출력하시오.
	            
	        [정답]
	            105
	            115
	            125
	            135
	            145
	            150
	            count=1
	    */
		int count = 0;
		
		int i = 100;
	    while(i <= 150) {
	        int a = i/100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        if(a == 5 || b == 5 || c == 5) {
	            if(i % 6 == 0){
	                count += 1;
	            }
	            System.out.println(i);
	        }
	        i += 1;
	    }
	    System.out.println("count="+ count);
		
	}
}
