package 이급32_정답;
import java.util.*;
/*
 
#문제2
체력시험 합격 인원을 알아보려고 합니다. 체력시험 종목으로는 윗몸일으키기, 팔굽혀펴기, 달리기가 있습니다. 종목별 합격기준은 다음과 같습니다.

| 윗몸일으키기 | 팔굽혀펴기 | 달리기 |
|---|---|---|
| 80점 이상 | 88점 이상 | 70점 이상 |

* 통과한 종목이 하나 이하거나, 통과 점수의 반을 넘기지 못한 종목이 있다면 불합격입니다.
* 그 외에는 합격입니다.

시험에 합격한 인원을 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. 통과한 종목이 몇 개인지 셉니다.
2. 통과 점수의 반을 넘기지 못한 종목이 몇 개인지 셉니다.
3. 통과한 종목이 하나보다 많고 통과 점수의 반을 넘기지 못한 종목이 없으면 통과한 인원으로 셉니다.
```
각 종목 기록을 담고 있는 배열 scores가 매개변수로 주어질 때, 시험에 합격한 인원을 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b func_c 메소드와 매개변수를 알맞게 채워주세요.

---
#####매개변수 설명
각 종목 기록을 담고 있는 배열 scores가 solution 메소드의 매개변수로 주어집니다.

* scores에는 윗몸일으키기, 팔굽혀펴기, 달리기 점수가 차례로 들어있습니다.
* scores의 원소는 0 이상 100 이하인 정수입니다.
* scores의 길이는 0 이상 10,000 이하인 정수입니다.

---
#####return값 설명
시험에 합격한 인원을 return합니다.

---
#####예시

| score | return |
|---|---|
| [[30, 40, 100], [97, 88, 95]] | 1 |
| [[90, 88, 70], [85, 90, 90], [100, 100, 70], [30, 90, 80], [40, 10, 20], [83, 88, 80]] | 4 |

---
#####예시 설명
예시 #1
1번째 사람은 윗몸일으키기 30점, 팔굽혀펴기 40점으로 합격 점수의 반을 통과하지 못해 불합격입니다.
2번째 사람은 윗몸일으키기 97점, 팔굽혀펴기 88점, 달리기 95점으로 모두 통과하여 합격입니다. 따라서 총 1명이 합격하였습니다.

예시 #2
1번째, 2번째, 3번째, 6번째 사람이 합격 기준을 만족하여 총 4명이 합격하였습니다.


 
 
 */
class Solution {
    
	public int solution(int[][] scores) {
		int pass_count = 0;
		int people_count = 0;
		int[] pass_score = {80, 88, 70};
		
		for(int i = 0; i < scores.length; ++i) {
			pass_count = 0;
			for(int j = 0; j < scores[i].length; ++j) {
				if(scores[i][j] < pass_score[j]/2)
				{
					pass_count = 0;
					break;
				}
				else if(scores[i][j] >= pass_score[j])
				pass_count++;
				}
			if (pass_count >1)
				people_count++;
		}
		return people_count;
	}
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] scores1 = {
            {30, 40, 100},
            {97, 88, 95}
        };
        int ret1 = sol.solution(scores1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] scores2 = {
            {90, 88, 70},
            {85, 90, 90},
            {100, 100, 70},
            {30, 90, 80},
            {40, 10, 20},
            {83, 88, 80}
        };
        int ret2 = sol.solution(scores2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}