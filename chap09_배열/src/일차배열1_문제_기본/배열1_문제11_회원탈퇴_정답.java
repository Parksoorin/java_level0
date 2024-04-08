package 일차배열1_문제_기본;

public class 배열1_문제11_회원탈퇴_정답 {

	public static void main(String[] args) {
		/*
	        [문제] 
	            numberList 배열은 회원 번호 목록이다.
	            removeList 배열은 회원의 탈퇴 여부 목록이다.
	            숫자1이면 현재 가입되어있는상태,
	            숫자-1이면 탈퇴한 상태이다.
	            
	            현재 가입되어있는 회원들만 출력하시오.
	
	        [정답]
	            1001 1002 1005
	    */
	
	    int[] numberList = {1001, 1002, 1003, 1004, 1005};
	    int[] removeList  = {  1,   1,   -1,   -1,   1};
	
	    for(int i = 0; i < removeList.length; i++){
	        if(removeList[i] == 1){
	        	System.out.println(numberList[i]);
	        }
	    }

	}

}
