package 이차반복문7_개념_중요알고리즘;

import java.util.Arrays;

public class 이차반복문7_개념03_그룹바이 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            numberList는 여러가지숫자를 모아놓은 배열이다.
	            각각의 숫자가 몇개씩 있는지 출력하시오.
	            먼저 arr 배열에 겹치지않게 numberList 에 있는 서로 다른숫자들만 한개씩 저장한다.
	            그뒤 arr과 numberList를 비교하여 몇개가 있는지 count 에 저장한다.
	        [정답]
	            [1, 5, 3, 6, 7, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0]
				[1, 2, 3, 3, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0]

	        [그룹바이]
	            한배열의 중복값들을 개수별로 모으는것을 그룹바이라고 한다. 
	    */


	    int[] numberList = {1,5,3,3,5,6,6,7,6,7,7,4,2,3,4};
	    int[] arr = new int[numberList.length];
	    
	    int index = 0;
	    for(int i = 0; i < numberList.length; i++){ 

	        // 처음에는 무조건하나 들어간다.
	        if(arr.length == 0){
	        	arr[index] = numberList[i];
	        	index += 1;
	            continue;
	        }
	        
	        // 여기는 두번째 부터 실행된다.
	        int a = numberList[i];
	        int count = 0;
	        for(int j = 0; j < arr.length; j++){ 
	            int b = arr[j];
	            if(a == b){
	                count += 1;
	            }
	        }
	        if(count == 0){
	            arr[index] = a;
	            index += 1;
	        }
	    }
	    System.out.println(Arrays.toString(arr)); 
	    

	    index = 0;
	    int[] countList = new int[numberList.length];
	    for(int i = 0; i < arr.length; i++){

	        int a = arr[i];
	        countList[index] = 0;
	        index += 1;

	        for(int j = 0; j < numberList.length; j++){
	            int b = numberList[j];

	            if(a == b){
	                countList[i] += 1;
	            }
	        }
	    }
	    
	    System.out.println(Arrays.toString(countList));
		
	}
}
