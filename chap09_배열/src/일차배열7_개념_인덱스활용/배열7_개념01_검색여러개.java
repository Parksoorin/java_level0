package 일차배열7_개념_인덱스활용;

public class 배열7_개념01_검색여러개 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            numberList 는 학생 번호이다.
	            scoreList 는 이번 시험의 점수이다.
	            search 는 학생들이 검색한 순서를 저장한 배열이다.
	            search의 값은 numberList 와 scoreList의 인덱스이다.
	            학생들이 검색한 숫서에 맞춰서 번호와 점수를 출력하시오.
	
	        [설명]
	            1 은 1002 번학생이 검색한것이다. ==> 1002번69점 
	            2 는 1003 번학생이 검색한것이다. ==> 1003번23점
	            1 은 1002 번학생이 한번더 검색한것이다. ==> 1002번69점
	            ...
	            나머지도 같은방법으로 작성한다.
	
	        [정답]
	            1002번 69점
				1003번 23점
				1002번 69점
				1001번 45점
				1004번 100점
				1002번 69점
				1003번 23점
	        
	    */
	
	    int[] numberList  = {1001, 1002, 1003, 1004};
	    int[] scoreList = { 45, 69, 23, 100};
	
	    int[] search = {1, 2, 1, 0, 3, 1, 2};
	
	    for(int i = 0; i < search.length; i++){
	        int index = search[i];
	
	        int a = numberList[index];
	        int b = scoreList[index];
	        System.out.println(a + "번 " + b + "점");
	    }


	}

}
