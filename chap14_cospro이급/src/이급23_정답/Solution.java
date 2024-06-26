package 이급23_정답;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

/*
 * 

#문제3
체조선수는 여러 심사위원의 점수 중 가장 높은 점수 하나와 가장 낮은 점수 하나를 제외하고 나머지 점수들의 평균을 계산하여 최종점수를 받습니다. _단, 이때 소수점 이하의 수는 버립니다._

예를 들어, A 선수가 10명의 심사위원에게 [35, 28, 98, 34, 20, 50, 85, 74, 71, 7]의 점수를 받았습니다. 가장 높은 점수인 98점과 가장 낮은 점수인 7점을 제외하고 나머지 8명의 심사위원 점수 평균을 구하면 49.625점입니다. 여기서 소수점 이하의 수를 버리면 49점입니다. 

각 심사위원이 매긴 점수가 담긴 배열 scores가 매개 변수로 주어질 때, 이 선수가 받은 점수를 return 하도록 solution 메소드를 작성해주세요.

---
#####매개변수 설명
심사위원이 준 점수가 들어있는 배열 scores가 solution 메소드의 매개변수로 주어집니다.
* scores의 길이는 3 이상 100 이하입니다.
* 심사위원이 부여하는 점수의 범위는 0 이상 100 이하의 정수입니다.

---
#####return 값 설명
심사위원이 준 점수 중 가장 높은 점수와 가장 낮은 점수를 제외한 점수의 평균에서 소수점을 버린 값을 return 합니다.

---
#####예시

| scores                               	| return |
|-----------------------------------------|--------|
| [35, 28, 98, 34, 20, 50, 85, 74, 71, 7] | 49 	|
| [1, 1, 1, 1, 1]                     	| 1  	|

#####예시 설명
예시 #1
문제에 나온 예와 같습니다.

예시 #2
가장 높은 점수는 1점이며, 가장 낮은 점수도 1점입니다. 1점을 두 개 제외한 나머지 점수의 합은 3점이며, 평균은 1점이 됩니다.


 * 
 */

class Solution {
	public int solution(int[] scores) {
        int answer = 0;
        
        int max = 0;
        int min = 100;
        int sum = 0;
        
        for(int i = 0; i < scores.length; ++i) {
            if(max < scores[i])
                max = scores[i];
            if(min > scores[i])
                min = scores[i];
            
            sum = sum + scores[i];
        }
        
        sum = sum - (max + min);
        answer = sum / (scores.length - 2);
        
        return answer;
    }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
     int ret1 = sol.solution(scores1);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
     
     int[] scores2 = {1, 1, 1, 1, 1};
     int ret2 = sol.solution(scores2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}