package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제04_반복규칙찾기4_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 10회 반복해서 아래와 같이 출력하시오.
	        [예시]
	            0 0
	            1 0
	            2 1
	            3 1
	            4 2
	            5 2
	            6 3
	            7 3
	            8 4
	            9 4    
	    */
		
	    int a = 0;
	    int b = 0;

	    while(a < 10) {
	        System.out.println(a + " " + b);
	        
	        a += 1;
	        if(a % 2 == 0) {
	            b += 1;
	        }
	    }

	}
}
