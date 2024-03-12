package 기본3_개념_곱하기와나누기;

public class 기본3_개념02_삼각형넓이 {

	public static void main(String[] args) {
		/*
		[문제]
			가로가 3이고 세로가 7인 삼각형의 넓이를 구하시오. 
			단, 소수점 두자리까지 구하시오.	 	
		[정답] 
			10.50
	*/

	/*
		[풀이]
			삼각형 넓이 = 가로 * 세로 / 2
	*/
		System.out.println(String.format("%.2f", 3 * 7 / 2.0));
	}

}
