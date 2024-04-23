package 이차반복문6_문제_조인응용;

import java.util.Arrays;

public class 이차반복문6_문제05_상품추가_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            item배열은 상품의 번호이다.
	            price배열은 상품의 가격이다.
	            count배열은 상품의 재고 개수이다.
	            item과 price, count는 한 세트이다.

	            add 배열은 오늘 추가되는 새상품의 인덱스 이다.

	            상품을 전부 추가하고 count 를 출력해보시오.
	            단
	        [정답]
	            item=1001 count3,1,2,1
	            item=1002 count4,1,2,1
	            item=1004 count4,2,2,1
	            item=1004 count4,2,2,2
	            item=1003 count4,2,2,3
	            item=1003 count4,2,3,3
	            item=1002 count4,2,4,3
	    */

	    int[] item  = {1001, 1002, 1003, 1004};
	    int[] price = {500, 1200, 4300, 2300};
	    int[] count = {3, 1, 2, 1};

	    int[] add = {1001, 1002, 1004, 1004, 1003, 1003, 1002};

	    for(int i=0; i<add.length; i++) {

	        int number = add[i];
	        for(int j = 0; j < item.length; j++){
	            if(number == item[j]){
	                System.out.println("item="+ number + " " + "count" + Arrays.toString(count));
	                count[j] += 1;
	            }            
	        }
	    }


	}
}
