package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제05_반복규칙찾기6_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 30
	            1 28
	            2 24
	            3 18
	            4 10
	            5 0
	            6 -12
	            7 -26
	            8 -42
	            9 -60   
	    */
		
	    int a = 0;
	    int b = 30;
	    int num = 2;
	    while(a < 10) {
	        System.out.println(a + " " + b);
	        
	        a += 1;
	        b -= num;
	        num += 2;
	    }

	   
	}
}
