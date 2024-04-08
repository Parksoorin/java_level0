package 일차배열5_문제_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_문제03_전원합격_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열에 0 ~ 100사이의 랜덤값을 4개 저장한 후 출력한다. 
	            배열의 값은 학생들의 성적이다. 
	            60점이상이면 합격이다. 
	            전원 합격하면, "전체합격"을 출력하고,
	            전원 탈락하면, "전체탈락"을 출력하시오.
	            그외는 "일부합격"
	            그 외는 배열만 출력하시오.
	        [예시] 
	            100,89,68,84 : 전체합격
	            22,23,31,55 : 전체합격
	            40,23,46,89 : 일부합격
	    */
	
	    int[] arr = new int[4];
	    int size= 4;
	    Random ran = new Random();
	    for(int i = 0; i < size; i++){
	        int a = ran.nextInt(101);
	        arr[i] = a;
	    }
	    System.out.println(Arrays.toString(arr));
	
	    int count = 0;
	    for(int i = 0; i < size; i++){
	        if(arr[i] >= 60){
	            count += 1;
	        }
	    }
	    if(count == size){
	    	System.out.println("전체합격");
	    }
	    else if(count == 0){
	    	System.out.println("전체탈락");
	    }
	    else {
	    	System.out.println("일부합격");
	    }


	}

}
