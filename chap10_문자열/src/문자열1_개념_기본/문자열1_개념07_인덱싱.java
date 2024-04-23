package 문자열1_개념_기본;

/*
	# 형변환(type conversion)
		- 자료형(data type)을 바꾸는 것을 의미
*/

public class 문자열1_개념07_인덱싱 {
	public static void main(String[] args) {
		
		String str = "itacademy";
		
		
		//  문자 한 개 추출(인덱싱) : charAt(index)
		char ch = str.charAt(0); // 문자한개는 char 이기때문에 char 로저장된다.
		System.out.println(ch);
		
		
		/*
	        [문제]
	            str 변수에서 가장 마지막 글자를 출력하시오.
	        [정답]
	            e
		 */
		ch = str.charAt(str.length() - 1);
		// ch = str.charAt(8);
		System.out.println(ch);
		
		/*
	        [문제]
	            str 변수에서 c만빼고 출력하시오.
	        [정답]
	            itaademy
	    */
		System.out.println("===테스트문제===");
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a != 'c') {
				System.out.print(str.charAt(i)); 
			}
		}
		
		
	}
}
