package 문자열2_개념_문자열함수;

public class 문자열2_개념06_대소문자변환 {

	public static void main(String[] args) {
		 /*
	        [개념] 문자열 대소문자 변환
	            (1) toLowerCase() : 문자열을 소문자로 변환해 반환한다.
	            (2) toUpperCase() : 문자열을 대문자로 변환해 반환한다.
	    */
	
	    String text = "aBcDeFg";
	
	    String rs1 = text.toLowerCase();
	    String rs2 = text.toUpperCase();
	    System.out.println(rs1);
	    System.out.println(rs2);
	

	}

}
