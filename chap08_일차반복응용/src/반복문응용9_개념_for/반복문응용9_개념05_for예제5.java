package 반복문응용9_개념_for;

public class 반복문응용9_개념05_for예제5 {
	public static void main(String[] args) {
		
	    /*
	        for문 의 () 안에 사용된 int i 는 for이 종료되면 같이 소멸되어, 
	        int i 를 또 사용할수있다.
	    */
	   for(int i = 0; i < 10; i++){
	        System.out.print(i + " ");
	   }
	   
	   System.out.println();
	   
	   for(int i = 0; i < 10;  i++){
	        System.out.print(i + " ");
	   }
		
	}
}
