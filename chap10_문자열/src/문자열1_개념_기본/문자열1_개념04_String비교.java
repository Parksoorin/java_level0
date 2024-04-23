package 문자열1_개념_기본;

public class 문자열1_개념04_String비교 {
	
	public static void main(String[] args) {	
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2);
		
		String[] name1 = {"김철수" , "이만수"};
		String[] name2 = {"김철수" , "이만수"};
		
		for(int i = 0; i < name1.length; i++) {
			System.out.println(name1[i] == name2[i]);
		}
	}
}
