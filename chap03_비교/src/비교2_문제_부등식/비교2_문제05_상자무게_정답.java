package 비교2_문제_부등식;

public class 비교2_문제05_상자무게_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            무게가 2킬로그램인 상자에 한 개에 5킬로그램인 
	            물건을 몇개 넣으면 전체 무게가 30킬로그램을 넘는다.
	        
	            위 식의 결과가 true 가 나올수있도록 , d의 값을 구하시오.
	            단, 부등식이므로 정답에 가장가까운 정수를 구하시오. 
	        [정답]
	            6
		*/
	
	    int a = 2;
	    int b = 5;
	    int c = 30;
	    int d = 0;
	
	    d = ((30 - 2) / 5) + 1; // 크다 이므로 1을 더해준다. 
	    boolean e= c < a + b * d;
	}

}
