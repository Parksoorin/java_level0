package 일차배열2_문제_누적개수;

public class 배열2_문제05_학생관리_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            numbers배열은 학생 다섯 명의 번호이다.
	            scores배열은 위 학생들의 수학 점수이다.
	            60점 이상은 합격이다.
	            [조건1] 전체학생들의 번호와 점수를 추력하시오.
	            [조건2] 합격한학생은 "[합격]" , 불합격한학생은 "[불합격]" 을  점수옆에 출력하시오.
	            [조건3] 전체 학생들의 점수와 평균을 출력하시오.
	            [조건4] 합격생들이 몇 명인지를 출력하시오.
	        [정답]
	            1001번 10점 [불합격]
	            1002번 32점 [불합격]
	            1003번 65점 [합격]
	            1004번 90점 [합격]
	            1005번 89점 [합격]
	            합격생 수 = 3명
	            총점 = 286점, 평균 = 57.2점
	    */

	    int[] numbers = {1001, 1002, 1003, 1004, 1005};
	    int[] scores  = {  10,   32,   65,   90,   89};
	    int count = 0;
	    double total = 0;
	    double avg = 0;
	
	    for(int i = 0; i < numbers.length; i++) {
	    	System.out.println(numbers[i] + "번 " + scores[i] + "점 ");
	    	if(scores[i] >= 60) {
	    		System.out.println("[합격]");
	    		count++;
	    	} else {
	    		System.out.println("[불합격]");
	    	}
	    	total += scores[i];
	    }
	    
	    avg = total / numbers.length;
	    
	    System.out.println("합격생 수 = " + count + "명");
	    System.out.println("총점 = " + total + "점, 평균 = " + avg + "점");
	 
	}

}
