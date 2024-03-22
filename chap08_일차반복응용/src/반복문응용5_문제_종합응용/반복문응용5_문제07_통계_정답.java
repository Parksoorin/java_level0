package 반복문응용5_문제_종합응용;

import java.util.Random;

public class 반복문응용5_문제07_통계_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            1. 10회 반복을 한다.
	            2. 0~100 사이의 랜덤 숫자를 출력한다. (학생 점수)
	            3. 번호는 1번부터 시작한다. 번호와 점수를 출력한다. 
	            4. 성적이 60점 이상이면 합격생이다. 
	            합격생은 점수 옆에 [합격]을 불합격생은 [불합격]을 출력한다. 
	            5. 전교생(10명)의 총점과 평균을 출력한다.
	            6. 1등의 번호와 점수를 출력한다.    
	        [예시]
	            1번. 52점 [불합격]
	            2번. 34점 [불합격]
	            3번. 96점 [합격]
	            4번. 95점 [합격]
	            5번. 92점 [합격]
	            6번. 31점 [불합격]
	            7번. 85점 [합격]
	            8번. 49점 [불합격]
	            9번. 38점 [불합격]
	            10번. 59점 [불합격]
	            평균점수 = 63.10
	            1등학생 = 3번(96점)
	    */
		
		Random ran = new Random();
		
	    int maxScore = 0;
	    int maxBunho = 0;
	    int total = 0;

	    int bunho = 1;
	    int i = 0;
	    while(i < 10) {

	        int score = ran.nextInt(101);
	        System.out.println(bunho + "번. " + score + "점 ");
	        
	        if(score >= 60) {
	            System.out.println("[합격]");
	        } else {
	            System.out.println("[불합격]");
	        }
	        
	        if(maxScore < score) {
	            maxScore = score;
	            maxBunho = bunho;
	        }
	        
	        total += score;
	        bunho += 1;
	        i += 1;
	    }

	    double avg = total / 10.0;

	    System.out.printf("평균점수 = %.2f\n", avg);
	    System.out.println("1등학생 = " + maxBunho + "번(" + maxScore + "점)");
		
	}
}
