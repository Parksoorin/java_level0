package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제03_반복규칙찾기3_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 30
	            1 29
	            2 27
	            3 24
	            4 20
	            5 15
	            6 9
	            7 2
	            8 -6
	            9 -15   
	    */
		
	    int a = 0;
	    int b = 30;
	    int num = 1;
	    while(a < 10) {
	        System.out.println(a + " " + b);
	        
	        a += 1;
	        b -= num;
	        num += 1;
	    }


	}
}
