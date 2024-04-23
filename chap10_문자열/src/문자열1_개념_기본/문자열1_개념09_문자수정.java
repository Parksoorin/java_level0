package 문자열1_개념_기본;


public class 문자열1_개념09_문자수정 {
	public static void main(String[] args) {
		
		/*
		 	문자를 수정할때 직접변경은 불가능하다.
		  	[예시]
		  		c 를 k로 변경
		 */
			String str = "abcde";
			
			// str.charAt(2) = 'k'; 에러가 발생한다.
			
			
		/*
		 	replace("기존단어","대체단어") : 한개의 문자열에 적용
		  	
		*/
			String str1 = "Hello Java!";
			str1 = str1.replace("Java", "JSP");
			System.out.println(str1);
			
			
			/*
			 	replaceAll("기존단어","대체단어") : 모든 문자열에 적용
			 */
			String str2 = "a b c d";
			str2 = str2.replaceAll(" ", "");
			System.out.println(str2);
		
		
	}
}
