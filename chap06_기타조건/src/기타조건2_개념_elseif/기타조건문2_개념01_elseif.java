package 기타조건2_개념_elseif;

public class 기타조건문2_개념01_elseif {
	public static void main(String[] args) {
		
		/*
	        [if 의 옵션 else if]
	            if의 두 번째 옵션으로 else의 경우 경우의 수가 두 개일 경우만 사용할 수 있다.
	            경우의 수가 두 개 이상일 때는 else if를 사용한다. 
	        
	        [else if]
	            [1] 항상 if와 함께 사용하며, 단독으로 사용할 수 없다. 
	            [2] if의 조건이 거짓이면 동작한다. 
	            [3] 조건이 여러 개일 때 사용한다. 
	            [4] else if를 여러 개 사용한 경우 위에서부터 순차적으로 비교하며 
	                중간에 else if 조건이 참인경우 아래있는 else if는 전부 무시된다.
		*/
	
	    // if 가 거짓일때 동작하며, if가 사실인 경우 아래 else if는 내용이 사실이라도 동작하지않는다.
	
	    int a = 10;
	    if(a == 10) {
	        System.out.println("a1");
	    } else if(a == 10) {
	        System.out.println("a2");
	    } else if(a == 10) {
	        System.out.println("a3");
	    }
	
	    System.out.println("------------");
	
	    int b = 100;
	    if(b == 90) {
	        System.out.println("b1");
	    } else if(b == 100) {
	        System.out.println("b2");
	    } else if(b == 100) {
	        System.out.println("b3");
	    }
	
	    System.out.println("------------");
	
	    int c = 1000;
	    if(c == 800) {
	        System.out.println("c1");
	    } else if(c == 900) {
	        System.out.println("c2");
	    } else if(c == 1000) {
	        System.out.println("c3");
	    }
		
	}
}
