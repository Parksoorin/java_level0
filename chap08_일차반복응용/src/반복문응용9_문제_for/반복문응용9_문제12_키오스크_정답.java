package 반복문응용9_문제_for;

import java.util.Random;

public class 반복문응용9_문제12_키오스크_정답 {
	public static void main(String[] args) {
		
	    /*
	        [키오스크]
	            철수는 키오스크에서 주문을 한다. 
	            철수는 현금 4000원을 가지고있다.
	            아래 반복문은 5번 반복된다. 
	            아래 조건에 모두 만족하는 식을 작성하시오.

	            [조건1] 랜덤값은 0~4 까지 선택한다. 
	            [조건2] 랜덤값 1~3은 음식주문으로 철수의 현금에서 차감하며 "..을 주문합니다" 를 출력한다.
	            [조건2-1] 단, 현금이 음식값보다 모자를시 "현금이 부족합니다" 를 출력한다.
	            [조건3] 랜덤값 0이 나왔을시 주문을 즉시 멈추고 종료한다."주문을 종료합니다" 를 출력한다.
	            [조건4] 랜덤값 4가 나왔을시 "잘못선택했습니다" 를 출력한다.
	            [조건5] 매 상황마다 현금을 출력한다. 
	        [예시]
	            현금=4000
	            3번을 선택했습니다
	            감자를 주문합니다
	            현금=3200
	            2번을 선택했습니다
	            콜라를 주문합니다
	            현금=2200
	            1번을 선택했습니다
	            햄버거를 주문합니다
	            현금=700
	            0번을 선택했습니다
	            주문을 종료합니다
	    */
	   
		Random ran = new Random();
		
	    int money = 4000;
	    System.out.println("현금="+money);
	    
	    int result = 0;
	    
	    for (int i = 0; i < 5; i++) {
	        System.out.println("--------------------");
	        System.out.println("0.종료");
	        System.out.println("1.햄버거 1500원");
	        System.out.println("2.콜라 1000원");
	        System.out.println("3.감자 800원");

	        int sel = ran.nextInt(5) ; 
	        System.out.println(sel + "번을 선택했습니다");
	        
	        if(sel == 0){
	            result = 1;
	            break;
	        } else if(sel == 1) {
	            if(money < 1500){
	                result = 2;
	                break;
	            }
	            money -= 1500;
	            System.out.println("햄버거를 주문합니다");
	        } else if(sel == 2) {
	            if(money < 1000){
	                result = 2;
	                break;
	            }
	            money -= 1000;
	            System.out.println("콜라를 주문합니다");
	        } else if(sel == 3) {
	            if(money < 800){
	                result = 2;
	                break;
	            }
	            money -= 800;
	            System.out.println("감자를 주문합니다");
	        } else {
	            System.out.println("잘못선택했습니다");
	        }

	        System.out.println("현금="+money);
	    }
	    
	    if(result == 1){
	        System.out.println("주문을 종료합니다");
	    }else if(result == 2){
	        System.out.println("현금이부족합니다");
	    }
	    
	}
}
