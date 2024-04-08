package 일차배열7_문제_인덱스활용;

import java.util.Arrays;

public class 배열7_문제07_상품추가_정답 {

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
	            add = 0, count = [4, 1, 2, 1]
				add = 1, count = [4, 2, 2, 1]
				add = 3, count = [4, 2, 2, 2]
				add = 3, count = [4, 2, 2, 3]
				add = 2, count = [4, 2, 3, 3]
				add = 2, count = [4, 2, 4, 3]
				add = 1, count = [4, 3, 4, 3]
	    */
	
	    int[] item  = {1001, 1002, 1003, 1004};
	    int[] price = {500, 1200, 4300, 2300};
	    int[] count = {3, 1, 2, 1};
	
	    int[] add = {0, 1, 3, 3, 2, 2, 1};
	
	

	}

}
