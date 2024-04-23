package 문자열1_개념_기본;


public class 문자열1_개념10_연결연산자 {
	public static void main(String[] args) {
		
		/*
		 	문자를 수정할때 직접변경은 불가능하다.
		 	
		  	[예시]
		  		c 를 k로 변경
		 */
		String str = "abcde";
			
		/*
		  	문자열은 더하기로 연결할수있다.
		 
		 */
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a == 'c') {
				temp += 'k';
			}else {
				temp += str.charAt(i);
			}
		}
		System.out.println(temp);
		
		
	}
}
