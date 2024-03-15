package 반복문6_문제_누적응용;

public class 반복문6_문제02_누적자리수짝수홀수찾기_정답 {
	public static void main(String[] args) {
		
		/*
		    [문제]
		        아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
		        [1] 반복문을 사용하여 숫자를 10 부터 50까지 출력한다. 
		        [2] 각각의 숫자중에서 십의자리숫자가 짝수이고 , 일의자리숫자가 홀수인수만 출력한다.
		        [3] 위조건의 숫자들중 3의 배수들의 합을 출력하시오.
		        
		    [정답]
		        21
		        23
		        25
		        27
		        29
		        41
		        43
		        45
		        47
		        49
		        total=93
		*/
		int total = 0;
		
		int i = 10;
		while(i <= 50) {
		    int a = i / 10;
		    int b = i % 10;
		    boolean c = a % 2 == 0;
		    boolean d = b % 2 == 1;
		    if(c && d) {
		        if(i % 3 == 0){
		            total += i;
		        }
		        System.out.println(i);
		    }
		    i += 1;
		}
		System.out.println("total=" + total);
		
	}
}
