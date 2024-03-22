package 반복문응용3_문제_개별누적개별개수;

public class 반복문응용3_문제01_개별개수_홀수_정답 {
	public static void main(String[] args) {
		
	   /*
	        [문제]
	            [조건1] 10~20까지 반복문 사용해서 출력한다.
	            [조건2] 각 자리별로 나눈후 각자리별 홀수의개수를 옆에 출력한다.
	        [정답]
	            10 1
	            11 2
	            12 1
	            13 2
	            14 1
	            15 2
	            16 1
	            17 2
	            18 1
	            19 2
	            20 0
	    */
		
	    int i = 10;
	    while(i <= 20){

	        int a = i / 10;
	        int b = i % 10;

	        int count = 0;

	        if(a % 2 == 1){
	            count += 1;
	        }
	        if(b % 2 == 1){
	            count += 1;
	        }

	        System.out.println(i + " " + count);

	        i += 1;
	    }
		
	}
}
