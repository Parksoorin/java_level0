package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제08_학점_정답1 {

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
		System.out.println(a);
		
	    if(0 <= a && a <= 80) {
	        System.out.println("재시험");
	    }
	    if(81 <= a && a <= 87) {
	        System.out.println("B");
	    }
	    if(88 <= a && a <= 90) {
	        System.out.println("B+");
	    } 
	    if(91 <= a && a <= 97) {
	        System.out.println("A");
	    }
	    if(98 <= a && a <= 100) {
	        System.out.println("A+");
	    }

	}

}
