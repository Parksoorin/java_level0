package 함수7_문제_리턴배열;

import java.util.Arrays;
import java.util.Random;

public class 함수7_문제03_중복금지_정답 {	
	
	public static int[] getArr(int[] arr) {
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		int index = 1;
		for(int i = 1; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < index; j++) {
				if(arr[i] == temp[j]) {
					count += 1;
					break;
				}
			}
			if(count == 0) {
				temp[index] = arr[i];
				index += 1;
			}
		}

		int [] temp2 = new int[index];
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = temp[i];
		}
		
		return temp2;
	}
	public static void main(String[] args) {	
		/*
		   [문제]
            numberList는 여러가지숫자를 모아놓은 배열이다.
            각각의 숫자가 몇개씩 있는지 출력하시오.
            먼저 arr 배열에 겹치지않게 numberList 에 있는 서로 다른숫자들만 한개씩 저장한다.
            arr 을 리턴하는 함수를 만드시오.
        [정답]
            1,5,3,6,7,4,2
		 */		
		 int[] item  = {1,5,3,3,5,6,6,7,6,7,7,4,2,3,4};
		  
		 int [] data = getArr(item);
		 System.out.println(Arrays.toString(data));
		 
	}
}
