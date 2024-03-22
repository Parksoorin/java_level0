package 반복문응용6_문제_break;

public class 반복문응용6_문제04_무한반복_개수_비교_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            9의 배수 중 100보다 큰 네번째 배수 출력하시오. 
	            단, break를 사용하시오.
	        [정답]
	            135
	   */ 
		
	    int i = 1;
	    int result = 0;
	    int count = 0;
	    while(true) {
	        if(i % 9 == 0 && i > 100) {
	            // System.out.print(i + " ");
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
