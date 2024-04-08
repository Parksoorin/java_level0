package 일차배열2_문제_누적개수;

public class 배열2_문제03_개수_자리수_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 십의 자리가 1인 숫자들의 개수를 출력하시오.
	        [정답]
	            3   
	    */
	
	    int[] arr = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    int count = 0;
	    for(int i=0; i<arr.length; i++) {
	        int tenUnit = (arr[i] % 100 / 10);
	
	        if(tenUnit == 1) {
	            count += 1;
	        }
	    }


	}

}
