package 기타조건1_개념_else;

public class 기타조건문1_개념02_엘스_로그인 {
	public static void main(String[] args) {
		
		/*
			[회원가입과 로그인] 	
			1. 가입된 아이디와 비번과 로그인시 입력한 아이디와 비밀번호를 비교한다.
			2. "로그인 성공" 또는 "로그인 실패" 를 출력하시오. 
		*/
		
		int joinId = 1111;
		int joinPw = 2222;
				
		int logId = 1111;
		int logPw = 2222;

		if(joinId == logId && joinPw == logPw) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
}
