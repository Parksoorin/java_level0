package 기본3_개념_곱하기와나누기;

public class 기본3_개념03_평균 {

	public static void main(String[] args) {
		/*
		[문제]
			총 3과목의 시험을 보았다.
			국어는 84점, 수학은 23점, 과학은 53점을 받았다.
			평균을 구하시오. 
			단, 소수점 두 자리까지 구하시오. 
		[정답] 
			53.33
	*/

	/*
		[풀이]
			평균
			= (국어 + 수학 + 과학) / 3
			= (84 + 23 + 53) / 3
	*/
		System.out.println(String.format("%.2f", (84 + 23 + 53) / 3.0));
	}

}
