package 반복문8_개념_개수응용;

public class 반복문6_개념01_개수십의자리 {
	public static void main(String[] args) {
		
		 /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 100 부터 200까지 출력한다. 
	            [2] 각각의 숫자의 십의자리가 2인 숫자들만 출력하시오.
	            [3] 위조건의 숫자들중 짝수들의 개수를 출력하시오.
				
	        [정답]
	         	120
	            121
	            122
	            123
	            124
	            125
	            126
	            127
	            128
	            129    
	            count=5
	    */
	    
		int count = 0;
		
	    int i = 100;
	    while(i <= 200) {
	        int a = i % 100 / 10;
	        if(a == 2) {
	            if(i % 2 == 0){
	                count += 1;
	            }
	            System.out.println(i);
	        }
	        i += 1;
	    }
	    System.out.println("count=" + count);
		
	}
}
