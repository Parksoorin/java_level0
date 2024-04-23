package 문자열1_개념_기본;


public class 문자열1_개념08_비교 {
	public static void main(String[] args) {
		
		 /*
	        [문제]
	            아래는 두 학생의 가위바위보 데이터이다. 
	            철수는 몇번 승리했는지 출력하시오.
	        [정답]
	            winCount = 3
	    */
	
	    String[] 철수 = {"가위", "바위", "바위",   "보", "가위"};
	    String[] 민수 = {  "보", "가위", "바위", "가위",   "보"};
	
	    int winCount = 0;
	
	    for(int i=0; i<철수.length; i++) {
	        if(철수[i] == 민수[i]) {
	        	System.out.println("비겼다.");
	        } else if(철수[i] == "가위" && 민수[i] == "보") {
	        	System.out.println("이겼다.");
	            winCount += 1;
	        } else if(철수[i] == "바위" && 민수[i] == "가위") {
	        	System.out.println("이겼다.");
	            winCount += 1;
	        } else if(철수[i] == "바위" && 민수[i] == "가위") {
	        	System.out.println("이겼다.");
	            winCount += 1;
	        } else {
	        	System.out.println("졌다.");
	        }
	    }
	    System.out.println("win=" + winCount);
		
		
	}
}
