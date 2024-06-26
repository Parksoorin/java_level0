package 이차배열2_문제_게임;

public class 이차배열2_문제04_택시게임_정답 {

	public static void main(String[] args) {
		 /*
	        [문제] 	
	            현재 택시는 5, 5 위치에 있다.
	            배열의 왼쪽 세로줄은 속도를 뜻한다.
	            배열의 오른쪽 세로줄은 방향을 뜻하고 (북, 동, 남, 서)를 뜻한다. 
	            
	            속도와 방향은 택시가 매번 이동한 내용을 기록한 것이다. 
	            
	            예) 속도는 4이고 방향은 북쪽을 뜻한다. 
	                y가 4증가해  x : 5 , y : 1 가 된다.  
	                단, 프로그래밍에서는 y축이 위에서 아래로 실행되니 위로갈수록 숫자가 작아진다. 
	
	            arr길이만큼 모두 이동한 후 택시의 위치를 출력하시오. 
	        [정답]
	            y = 2
	            x = -1   
	    */
	
	    String[][] arr = {
			{"4", "북"},
			{"2", "동"},
			{"1", "남"},
			{"5", "서"},
			{"4", "서"},
			{"1", "동"}
	    };
	
	    int y = 5;
	    int x = 5;
	
	    for(int i=0; i<arr.length; i++) {
	    	int a = Integer.parseInt(arr[i][0]);
	        if(arr[i][1] == "북"){
	            y -= a;
	        } else if(arr[i][1] == "동"){
	            x += a;
	        } else if(arr[i][1] == "남"){
	            y += a;
	        } else if(arr[i][1] == "서"){
	            x -= a;
	        }
	    }
	    System.out.println("y = " + y);
	    System.out.println("x = " + x);

	}

}
