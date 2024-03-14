package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제08_학점_정답2 {

	public static void main(String[] args) {
		/*
	        [문제]
	            0에서 100 사이의 랜덤 숫자를 시험 점수로 저장한다.
	            시험점수에 해당하는 학점을 출력하시오.
	            아래는 점수표이다.
	            100~91 이면 A학점,
	            90~81  이면 B학점,
	            80 이하는 "재시험"
	            
	            단, 만점이거나, A 학점과 B 학점의 일의 자리가 8점 이상이면 + 기호를 추가하시오.
	            [예] 
	                100 => A+
	                88 ==> B+
	                82 ==> B
	                23 ==> 재시험
		*/
		
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(101);
		
	    // 원하는 랜덤값이 나오지않으면 아래와 같이 직접값을넣어서 테스트한다. 

	    /*  
	    a = 100;
	    */
		System.out.println(a);
		
	    int b = a % 10;

	    if(a == 100){
	        System.out.println("A+");
	    }
	    if(90 <= a && a <= 99){
	        System.out.println("A");
	        if(b >= 8){
	            System.out.println("+");
	        }
	    }
	    if(80 <= a && a <= 89){
	        System.out.println("B");
	        if(b >= 8){
	            System.out.println("+");
	        }
	    }
	    if(0 <= a && a <= 80) {
	        System.out.println("재시험");
	    }

	}

}
