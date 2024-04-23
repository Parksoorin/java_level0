package 문자열1_개념_기본;


public class 문자열1_개념11_형변환예측 {
	public static void main(String[] args) {
		/*
        [문제]
            아래 번호 뒷자리를 **** 으로 변경하시오.
        [결과]
            Hong's number is 010-1234-****

    */
	    String text = "Hong's number is 010-1234-5678";
	    String result = text.replaceAll("5678", "****");
	    System.out.println(result);
			
	}
}
