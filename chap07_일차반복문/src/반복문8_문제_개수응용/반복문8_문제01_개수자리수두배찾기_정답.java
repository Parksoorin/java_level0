package 반복문8_문제_개수응용;

public class 반복문8_문제01_개수자리수두배찾기_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 10 부터 99까지 출력한다. 
	            [2] 일의자리가 십의 자리의 두배인수만 출력하시오.
	            [3] 위 숫자들중 십의자리가 홀수인수의 개수를 출력하시오.
				
	        [정답]
	            12
	            24
	            36
	            48
	            count=2
	    */
		int count = 0;
		
	    int i = 10;
	    while(i <= 99) {
	        int a = i / 10;
	        int b = i % 10;
	        int c = a * 2;
	        if(b == c) {
	            if(a % 2 == 1){
	                count += 1;
	            }
	            System.out.println(i);
	        }
	        i += 1;
	    }
	    System.out.println("count="+count);
		
	}
}
