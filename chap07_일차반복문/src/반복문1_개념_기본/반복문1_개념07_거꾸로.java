package 반복문1_개념_기본;

public class 반복문1_개념07_거꾸로 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 4~1 까지 거꾸로 출력하시오.
	        [정답] 4 3 2 1
	    */
	    int i = 4;
	    while(i >= 1) {
	        System.out.println(i);
	        i -= 1;
	    }
	    System.out.println("----------");
	
	    /*
	        위 방법보다는 아래 방법을 권장한다.
	        반복 횟수를 파악하는데 아래 방법이 더 직관적이다.
	        추가로 변수를 선언해서 원하는 값을 얻으면 된다. 
	    */
	
	    i = 1;
	    int num = 4;
	    while(i <= 4) {
	
	        System.out.println(num);
	        num -= 1;
	        i += 1;
	    }
		
	}
}
