package 반복문3_문제_반복문안의변수;

public class 반복문3_문제04_반복문안의변수활용4_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 150까지 출력한다. 
	            [2] 50에서 100사이의 범위에는 8의 배수만 출력한다.
				[3] 50에서 100사이의 범위가 아닐때에는 7의 배수만 출력한다.
	            [3] else 를 사용하지마시오.
				[4] 반복문 내부에 변수를 사용하시오.
				
			[정답]
				7
				14
				21
				28
				35
				42
				49
				56
				64
				72
				80
				88
				96
				105
				112
				119
				126
				133
				140
				147
		*/
		
		int i = 1;
		while(i <= 150) {
			
			boolean a = i < 50;
			boolean b = i > 100;
			boolean c = 50 <= i && i <= 100;
			boolean d = i % 7 == 0;
			boolean e = i % 8 == 0;
			

			if(a && d){
				System.out.println(i);
			}

			if(c && e) {
				System.out.println(i);
			}

			if(b && d){
				System.out.println(i);
			}

			i += 1;
		}
		
	}
}
