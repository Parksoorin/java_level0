package 반복문7_문제_개수;

public class 반복문7_문제06_배수_개수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            100 ~ 300 사이의 숫자 중에서 
	            [조건1] 8의 배수를 출력하고, 
	            [조건2] 개수를 구하시오.
	        [정답]
	            104 112 120 128 136 144 152 160 168 176 184 192 200 
	            208 216 224 232 240 248 256 264 272 280 288 296 
	            count = 25    
	    */
		
	    int count = 0;

	    int i = 100;
	    while(i <= 300) {
	        if(i % 8 == 0) {
	            System.out.print(i + " ");
	            count += 1;
	        }
	        i += 1;
	    }

	    System.out.println();
	    System.out.println("count = " + count);
		
	}
}
