package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제05_반복규칙찾기8_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 10회 반복해서 아래와 같이 출력하시오.
	            
	        [예시]
	            0 3
	            1 2
	            2 1
	            3 3
	            4 2
	            5 1
	            6 3
	            7 2
	            8 1
	            9 3    
	    */
		
	    int a = 0;
	    int b = 3;

	    while(a < 10) {
	        System.out.println(a + " " + b);

	        a += 1;
	        b -= 1;
	        if(b == 0) {
	            b = 3;
	        }
	    }
		
	}
}
