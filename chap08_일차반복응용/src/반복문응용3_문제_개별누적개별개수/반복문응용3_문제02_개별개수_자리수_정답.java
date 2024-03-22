package 반복문응용3_문제_개별누적개별개수;

public class 반복문응용3_문제02_개별개수_자리수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [조건1] 반복문을 사용하여 숫자를 200 부터 250까지 출력한다. 
	            [조건2] 각 자리별로 나눈후 각각의 자리에 2나 5가 있으면 그개수를 옆에 출력한다.
	            [조건3] 2와 5가 1개 이상 들어있는 숫자만 출력한다.
	        [정답]
	            205 2
	            215 2
	            225 3
	            235 2
	            245 2
	            250 2
	    */
		
	    int i = 200;
	    while(i <= 250) {
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        
	        int count = 0;
           if(a == 5 || a == 2){
               count += 1;
           }

           if(b == 5 || b == 2){
               count += 1;
           }

           if(c == 5 || c == 2){
               count += 1;
           }

	        
	        int count5 = 0;
	        int count2 = 0;

	        if(a == 5 || b == 5 || c == 5) {
	        	count5 += 1;
	        }
	        if(a == 2 || b == 2 || c == 2) {
	        	count2 += 1;
	        }
	        
	        if(count5 >= 1 && count2 >= 1) {
	        	System.out.println(i + " " + count);
	        }
	        i += 1;
	    }
	    
	}
}
