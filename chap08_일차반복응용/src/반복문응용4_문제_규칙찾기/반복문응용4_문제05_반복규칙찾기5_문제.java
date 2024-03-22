package 반복문응용4_문제_규칙찾기;

public class 반복문응용4_문제05_반복규칙찾기5_문제 {
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
		
		for(int i = 0; i < 10; i++) {
			a++;
			System.out.println(i + " " + a);
			if(a == 3) {
				a = 0;
			}
		}

	}
}
