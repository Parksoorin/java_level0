package 반복문응용6_문제_break;

public class 반복문응용6_문제06_무한반복_개수_자리수_비교_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            9의 배수 중 100보다 큰 네번째 배수 출력하시오. 
				단, 십의자리가 5이다.
	            단, break를 사용하시오.
	        [정답]
	            450
	   */ 
		
	    int i = 1;
	    int result = 0;
	    int count = 0;
	    
	    while(true) {
			int a = i % 100 / 10;
	        if(i % 9 == 0 && i > 100 && a == 5) {
	            // System.out.println(i + " ");
	            count += 1;
	            if(count == 4){
	                result = i;
	                break;
	            }
	        }
	        i += 1;
	       
	        
	    }
	    System.out.println();
	    System.out.println(result);
		
	}
}
