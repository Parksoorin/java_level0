package 반복문4_개념_자리수;

public class 반복문4_개념02_자리별비교 {
	public static void main(String[] args) {
		
		/*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 100 부터 300까지 출력한다. 
	            [2] 각각의 숫자의 십의 자리의 숫자가 3이고 일의 자리의 숫자가 7인 숫자만 출력한다.
				
	        [정답]
	         	137
	            237
	    */
	   
	
	    int i = 100;
	    while(i <= 300) {
	        int a = i % 100 / 10;
	        int b = i % 10;
	
	        if(a == 3 && b == 7) {
	        	System.out.println(i);
	        }
	
	        i += 1;
	    }
		
	}
}
