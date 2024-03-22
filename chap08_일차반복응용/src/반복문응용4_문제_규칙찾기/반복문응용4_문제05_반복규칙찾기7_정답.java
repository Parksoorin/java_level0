package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제05_반복규칙찾기7_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 0
	            1 2
	            2 6
	            3 12
	            4 20
	            5 30
	            6 42
	            7 56
	            8 72
	            9 90  
	    */
		
	    int a = 0;
	    int b = 0;
	    int num = 2;
	    while(a < 10) {
	        System.out.println(a + " " + b);
	        
	        a += 1;
	        b += num;
	        num += 2;
	    }

	}
}
