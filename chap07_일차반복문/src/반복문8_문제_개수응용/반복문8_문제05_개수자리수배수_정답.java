package 반복문8_문제_개수응용;

public class 반복문8_문제05_개수자리수배수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 100 부터 900까지 출력한다. 
	            [2] 백의자리는 3의배수이고 십의자리는 4의 배수이고 일의자리는 5의배수인수만 출력하시오.
	            [3] 단 위조건에서 0은 모든수의 배수이므로 제외해준다.
	            [4] 위 조건의 숫자들의 중 3의 배수들의 개수를 출력하시오.
	            
	        [정답]
	            345
	            385
	            645
	            685
	            count=2
	    */
		int count = 0;
		
	    int i = 100;
	    while(i <= 900) {
	        int a = i/100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        
	        boolean a1 = a % 3 == 0 && a != 0;
	        boolean b1 = b % 4 == 0 && b != 0;
	        boolean c1 = c % 5 == 0 && c != 0;
	        if(a1 && b1 && c1) {
	            if(i % 3 == 0){
	                count += 1;
	            }
	            System.out.println(i);
	        }
	        i += 1;
	    }
	    System.out.println("count="+ count);
		
	}
}
