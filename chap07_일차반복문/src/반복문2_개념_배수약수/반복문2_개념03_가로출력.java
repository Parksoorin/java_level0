package 반복문2_개념_배수약수;

public class 반복문2_개념03_가로출력 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            1~15 사이의 숫자를 출력하시오.
	        [가로 출력]
	            공백을 써서 옆으로 출력할수도있다.
	            가로든 세로든 편한걸 사용하면된다.
	    */
	
	    int i = 1;
	    while(i <= 15) {
	        System.out.print(i);
	        System.out.print(" ");
	        if(i <= 14) {
	        }
	        i = i + 1;
	    }

	}
}
