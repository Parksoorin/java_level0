package 이차배열4_문제_정렬;

import java.util.Arrays;

public class 이차배열4_문제02_다중정렬_정답 {

	public static void main(String[] args) {
		/*
		    member 배열은 회원목록 리스트이다. 
		    데이터는 순서대로 번호, 이름, 등급 이다.
		
		*/
	
		String[][] member = {
			{"1001", "김철수", "A"},         
			{"1002", "이만수", "B"},         
			{"1003", "최수정", "C"},        
			{"1004", "조만식", "A"},         
			{"1005", "이영희", "B"},
			{"1006", "송민아", "B"},         
			{"1007", "이영희", "A"},        
			{"1008", "이만수", "A"},             
		};
		
		/*
			[문제]
				등급순서대로 오름차순하시오.
				단, 등급이 같으면 이름순서대로 오름차순하시오.
			[정답]
				[1001, 김철수, A]
				[1008, 이만수, A]
				[1007, 이영희, A]
				[1004, 조만식, A]
				[1006, 송민아, B]
				[1002, 이만수, B]
				[1005, 이영희, B]
				[1003, 최수정, C]
	
		
		
		*/
		
		Arrays.sort(member , (a , b)->{
			if(a[2].compareTo(b[2]) < 0) {
				return -1;
			}
			else if(a[2].compareTo(b[2]) > 0) {
				return 1;
			}else {
				if(a[1].compareTo(b[1]) < 0) {
					return -1;
				}
				else if(a[1].compareTo(b[1]) > 0) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		
		for(int i = 0; i < member.length; i++) {
			System.out.println(Arrays.toString(member[i]));
		
		}

	}

}
