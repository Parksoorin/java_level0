package 문자열2_문제_문자열함수;

public class 문자열2_문제01_수정_정답 {
	public static void main(String[] args) {
		  /*
		        [문제]
		            아래 번호 뒷자리를 **** 으로 변경하시오.
		        [결과]
		            Hong's number is 010-1234-****
		
		    */
		    String text = "Hong's number is 010-1234-5678";
		    String result = text.replace("5678", "****");
		    System.out.println(result);
	}
}
