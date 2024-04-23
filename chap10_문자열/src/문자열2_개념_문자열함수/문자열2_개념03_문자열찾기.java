package 문자열2_개념_문자열함수;

public class 문자열2_개념03_문자열찾기 {
	public static void main(String[] args) {
		
		// 여러글자도 찾아준다. 
		// 찾은글자의 첫번째 인덱스를 반환한다. 
        
        String text = "Hello, JavaScript!";
        String word = "llo";
        int index = text.indexOf(word);
       

        
        if(index == -1) {
        	System.out.println("해당 문자는 존재하지 않습니다.");
        }else {
        	System.out.println(index);
        }
	}
}
