package 반복문응용9_문제_for;

public class 반복문응용9_문제09_369게임_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            1. 1~50까지 반복한다.
	            2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	            3. 각각의 숫자에 3이나 6이나 9가 두 개면 "짝짝!"
	            4. 각각의 숫자에 3이나 6이나 9가 한 개면 "짝!"
	            5. 3이나 6이나 9가 없으면 그냥 숫자를 출력하시오.
	            
	        [결과] 
	            1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...    
	    */
		
	    for(int i = 1; i <= 50; i++) {
	        int count = 0;
	        int x = i / 10;           // 십의 자리
	        int y = i % 10;           // 일의 자리

	        if(x == 3 || x == 6 || x == 9) {
	            count += 1;
	        }
	        if(y == 3 || y == 6 || y == 9) {
	            count += 1;
	        }

	        if(count == 2) {
	            System.out.print("짝짝! ");
	        } else if(count == 1) {
	            System.out.print("짝! ");
	        } else if(count == 0) {
	            System.out.print(i + " ");
	        }

	    }
		
	}
}
