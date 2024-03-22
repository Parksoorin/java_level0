package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제05_반복규칙찾기5_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 10회 반복해서 아래와 같이 출력하시오.
	            
	        [예시]
	            0 1
	            1 2
	            2 3
	            3 1
	            4 2
	            5 3
	            6 1
	            7 2
	            8 3
	            9 1    
	    */
		

	    int a = 0;
	    int b = 1;

	    while(a < 10) {
	        System.out.println(a + " " + b);

	        a += 1;
	        b += 1;
	        if(b == 4) {
	            b = 1;
	        }
	    }

	}
}
