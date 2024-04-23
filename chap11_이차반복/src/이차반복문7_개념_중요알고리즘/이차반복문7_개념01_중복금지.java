package 이차반복문7_개념_중요알고리즘;

import java.util.Arrays;

public class 이차반복문7_개념01_중복금지 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            item배열은 기존에 이미있는 상품번호이다.
	            newItem 은 새로 추가할 아이템번호이다. 
	            newItem 에 있는 번호를 item 에 추가하시오.
	            단, 이미 추가된적이 있는 아이템번호는 추가하지마시오.
	    */

	    /*
	        중복금지 알고리즘은 
	        우리가 회원가입을 할때라든지 상품고유번호등에 사용되며, 
	        오로지 한개의 고유번호를 가져야할때 사용한다. 
	    */

	    int[] item  = {1001, 1002, 1003, 1004, 0, 0, 0};

	    int[] newItem = {1005, 1004, 1002, 1007, 1006};
	    
	    int index = 4;
	    for(int i = 0; i < newItem.length; i++){

	        int a = newItem[i];
	        int count = 0;

	        for(int j = 0; j < item.length; j++){
	            if(a == item[j]){
	                count += 1;
	            }
	        }
	        if(count == 0){
	        	item[index] = a;
	            index += 1;
	        }
	    }

	    System.out.println(Arrays.toString(item));

		
	}
}
