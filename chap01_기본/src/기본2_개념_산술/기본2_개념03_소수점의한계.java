
package 기본2_개념_산술;

public class 기본2_개념03_소수점의한계 {
	public static void main(String[] args) {
		
		/*
		  	예상한결과와는 다르게 소수점이 이상하게 계산되는것을 알수있다. 
			프로그래밍은 소수점 계산을 정확하게 계산할수없다.
			그래서 어느정도 선에서 타협을 하고 반올림을 하게된다. 
		 
		 */
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
	}
}
