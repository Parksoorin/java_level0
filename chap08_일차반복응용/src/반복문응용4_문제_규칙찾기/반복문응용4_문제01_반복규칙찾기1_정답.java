package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제01_반복규칙찾기1_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 0 1
	            1 2 3
	            2 4 5
	            3 6 7
	            4 8 9  
	    */

	    int a = 0;
	    int b = 0;
	    int c = 1;

	    while(a < 5) {
	        System.out.println(a + " " + b + " " + c);
	        a += 1;
	        b += 2;
	        c += 2;
	    }
		
	}
}
