package 이차배열2_문제_게임;

public class 이차배열2_문제01_가위바위보_정답 {

	public static void main(String[] args) {
		    /*
		        [문제] 
		            아래 배열은 철수와 민수의 가위바위보 데이터이다. 
		            왼쪽이 철수의 데이터이고 오른쪽이 민수의 데이터이다.
		            
		            
		            민수와 철수는 계단 50번째에서 가위, 바위, 보게임 을 한다. 
		            아래의 규칙을따른다.
		            철수는 게임 종료 후 몇번째 계단에 있을지 구하시오.
		        [규칙]
		            이기면 계단 5증가
		            비기면 계단 1증가
		            지면 계단 3감소 			
		        [정답]
		            56
		    */
			String arr[][] = {
					{"바위", "가위"},
					{"바위", "보"},
			   		{"보",  "가위"},
					{"가위","가위"},
					{"바위", "바위"},
					{"보", "바위"}
				};
		       int pos = 50;

		       for(int i=0; i<arr.length; i++) {
		           if(arr[i][0] == arr[i][1]) {
		               pos += 1;
		               System.out.println("비겼다.");
		           } else if(arr[i][0] == "가위" && arr[i][1] == "보") {
		               pos += 5;
		               System.out.println("이겼다.");
		           } else if(arr[i][0] == "바위" && arr[i][1] == "가위") {
		               pos += 5;
		               System.out.println("이겼다.");
		           } else if(arr[i][0] == "보" && arr[i][1] == "바위") {
		               pos += 5;
		               System.out.println("이겼다.");
		           } else {
		               pos -= 3;
		               System.out.println("졌다.");
		           }
		       }

		       System.out.println(pos);

	}

}
