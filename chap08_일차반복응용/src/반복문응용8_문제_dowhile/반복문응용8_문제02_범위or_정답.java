package 반복문응용8_문제_dowhile;

public class 반복문응용8_문제02_범위or_정답 {
	public static void main(String[] args) {
		
	    /*
				[문제] 
					아래 조건을 참고해서  정답과 똑같이 출력하시오.
					
					[조건1] 1~10까지 반복문을 실행하여 숫자를 출력한다.
					[조건2] 3보다 작거나 7보다클때는 원래숫자의 3배를 출력하시오.
					단, else 를 사용하지마시오.
					단, do-while문을 사용하시오.
				[정답]			
					3
					6
					3
					4
					5
					6
					7
					24
					27
					30			
		*/
		
		int i = 1;
		do {
			if(i < 3 || 7 < i){
				System.out.println(i * 3);
				
			}
			if(3 <= i && i <= 7){
				System.out.println(i);
			}
			
			i += 1;
			
		} while ( i <= 10 );

		
	}
}
