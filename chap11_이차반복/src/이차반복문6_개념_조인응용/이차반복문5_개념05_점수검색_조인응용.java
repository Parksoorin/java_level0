package 이차반복문6_개념_조인응용;

public class 이차반복문5_개념05_점수검색_조인응용 {
	public static void main(String[] args) {
		
	    /*
	         [조인]
	            이와 같이 한배열의 각각의 값이 다른모든 배열을 검사하는것을 조인이라고한다. 
	    */

	    /*
	        [문제]
	            number 배열은 학생 번호이고, 
	            score 배열은 각 학생의 시험점수이다.
	            search 배열은 학생들이 시험 결과가 궁금해서  검색한 번호들이다. 
	            각 학생이 검색한 순서대로 점수를 출력하시오.
	        [정답]
	            1002 : 65
	            1004 : 1
	            1003 : 23
	            1001 : 4
	            1005 : 45    
	    */

	    int[] number = {1001, 1002, 1003, 1004, 1005, 1006};
	    int[] score =  {4,      65,   23,    1,   45,    7};
	    
	    int[] search = {1002, 1004, 1003, 1001, 1005};

	    for(int i=0; i<search.length; i++) {
	        
	        for(int j=0; j<number.length; j++) {
	            
	            if(search[i] == number[j]) {

	               System.out.println(search[i] + " : " + score[j]);
	            }
	        }
	    }

	}
}
