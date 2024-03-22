package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제02_반복규칙찾기2_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            반복문을 사용해서 아래와 같이 출력해보세요.
	        [예시]
	            0 0
	            1 1
	            2 3
	            3 6
	            4 10
	            5 15
	            6 21    
	    */
		
		int a = 0;
	    int b = 0;
	    int num = 1;
		
		for(int i = 0; i < 7; i++) {
			System.out.println(a + " " + b);
			a += 1;
	        b += num;
	        num += 1;
		}

	}
}
