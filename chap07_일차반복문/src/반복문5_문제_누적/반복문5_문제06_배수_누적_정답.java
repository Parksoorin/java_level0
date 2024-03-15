package 반복문5_문제_누적;

public class 반복문5_문제06_배수_누적_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100 ~ 300 사이의 숫자 중에서 
	            [조건1] 8의 배수를 출력하고, 
	            [조건2] 그 총합을 구하시오.
	        [정답]
	            104 112 120 128 136 144 152 160 168 176 184 192 200 
	            208 216 224 232 240 248 256 264 272 280 288 296 
	            total = 5000
	    */
		
		int total = 0;

	    int i = 100;
	    while(i <= 300) {
	        if(i % 8 == 0) {
	            System.out.print(i + " ");
	            total += i;
	        }
	        i += 1;
	    }

	    System.out.println();
	    System.out.println("total = " + total);
		
	}
}
