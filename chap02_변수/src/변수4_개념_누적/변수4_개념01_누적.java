package 변수4_개념_누적;

public class 변수4_개념01_누적 {

	public static void main(String[] args) {
		/*
		[문제]
			아래 변수 a안에 15가 저장되어 있다. 
			값을 두 번 더 누적해서 저장하고 그 과정을 전부 출력하시오.
			a변수 하나만 사용해야 한다. 
			값은 -3과 11를 누적한다.
		[정답] 
			15
			12
			23
	*/

		int a = 15;
		System.out.println(a);
	
		a = a + -3;
		System.out.println(a);
	
		a = a + 11;
		
		System.out.println(a);
	}

}
