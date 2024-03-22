package 반복문응용4_개념_규칙찾기;

public class 반복문6_개념01_반복규칙찾기 {
	public static void main(String[] args) {
		
	    /*
	        반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 1 2
	            1 2 3
	            2 3 4
	            3 4 5
	            4 5 6
	    */

	    int a = 0;
	    int b = 1;
	    int c = 2;

	    while(a < 5) {
	        System.out.println(a + " " + b + " " + c);
	        a += 1;
	        b += 1;
	        c += 1;
	    }

	}
}
