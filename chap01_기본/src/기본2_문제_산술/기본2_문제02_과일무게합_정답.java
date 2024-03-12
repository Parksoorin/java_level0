package 기본2_문제_산술;

public class 기본2_문제02_과일무게합_정답 {

	public static void main(String[] args) {
		/* 
		[문제]	  	
			사과 한 개의 무게는 140g 이다.
			귤 한 개의 무게는 78.3g 이다.	  	
			두 과일의 무게합을 구하시오.
			단, 소수점 두 자리까지 구하시오.
		[정답] 
			[정답] 218.30
		*/	
	
		/*
			[풀이]
				무게합 
				= 사과1개 + 귤1개
				= 140 + 78.3
		*/
		System.out.println(String.format("%.2f", 140+78.3));	

	}

}
