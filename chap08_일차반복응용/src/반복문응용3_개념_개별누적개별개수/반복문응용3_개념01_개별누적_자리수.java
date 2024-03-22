package 반복문응용3_개념_개별누적개별개수;

public class 반복문응용3_개념01_개별누적_자리수 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 10 부터 90까지 출력한다. 
	            [2] 십의자리는 3의배수이고 일의자리는 4의 배수인수만출력한다.
	            [3] 단 조건[2]에서 0은 모든수의 배수이므로 자리에 0이 있으면 제외해준다.
	            [4] 위 조건의 숫자들의 옆에 각자리별 합을 옆에 출력한다.
	
	        [정답]
	            34 7
	            38 11
	            64 10
	            68 14
	    */
	
	    /*
	        [개별숫자의합]
	            윗 단원에서 배웠던 합은 전체에 대한합이라면,
	            이번단원은 각각의 숫자의 개별합에 대해 연습을한다. 
	            total 의 위치를 잘파악한다. 
	    */
	
	    int i = 10;
	    while(i <= 90) {
	        int a = i / 10;
	        int b = i % 10;
	
	        boolean a1 = a % 3 == 0 && a != 0;
	        boolean b1 = b % 4 == 0 && b != 0;
	
	        int total = a + b;
	
	        if(a1 && b1) {
	        
	            System.out.println(i + " " + total);
	        }
	        i += 1;
	    }
	    
	}
}
