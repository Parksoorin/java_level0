package 비교5_개념_랜덤;

import java.util.Random;

public class 비교5_개념01_랜덤비교 {
	public static void main(String[] args) {
		/*
			[문제]
				변수 a 와 b 에 각각 랜덤숫자 0~9사이의 숫자를 저장한후, 
				a가 b랑 같으면 true 가 나오는 식을 작성하시오.
		*/
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		
		boolean  c = a == b;

	}
}
