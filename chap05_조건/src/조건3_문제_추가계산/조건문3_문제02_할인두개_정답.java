package 조건3_문제_추가계산;

import java.util.Random;

public class 조건문3_문제02_할인두개_정답 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            철수는 마트에 갔더니, 오렌지가 한개에 1000원
	            사과가 한개에 800원에 팔고있다. 
	            단, 마트에서는 오렌지 와 사과 합쳐서 10개 이상구입하면,
	            각각 100원씩 할일해주는 행사를 하고있다. 
	            
	            철수는 
	            랜덤(1~10)개수 만큼 오렌지 구입하였고,
	            랜덤(1~10)개수 만큼 사과를 구입하였다.
	
	            철수가 구입한 오렌지와 사과의 개수와 구입가격을 출력하시오.
	        [예시]
	            오렌지 : 2
	            사과 : 8
	            구입가격 : 1800 + 5600 = 7400
	
	    */
	
	    int a = 1000;
	    int b = 800;
	    int a1 = 0;
	    int b1 = 0;
	    int c = 0;
	    int result = 0;
	    
	    Random ran = new Random();
	    a1 = ran.nextInt(10) + 1;
	    b1 = ran.nextInt(10) + 1;
	    
	    // 테스트하고 싶은 랜덤값이 잘 안나올 때에는
	    // 아래와 같이 임의로 값을 저장한 후 테스트한다.
	    /*
	     	a1 = 2;
	     	b1 = 8;
	     */
	    
	    c = a1 + b1;
	    if(c >= 10) {
	    	a = a - 100;
	    	b = b - 100;
	    }
	   
	    result = a * a1 + b * b1;
	    
	    System.out.println(a1 + ", " + b1 + ", " + result);
	}

}
