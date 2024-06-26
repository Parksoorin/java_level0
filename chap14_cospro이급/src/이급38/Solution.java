package 이급38;
import java.util.*;
/*

#문제8
1번부터 n번까지의 후보에 대한 투표 결과가 주어질 때, 과반수를 득표한 후보자의 번호를 구하려고 합니다. 여기서 과반수란 절반이 넘는 수를 의미합니다.

예를 들어, 1번부터 3번까지의 후보에 대한 투표 결과가 [1, 2, 1, 3, 1, 2, 1]이라면 순서대로 [1번, 2번, 1번, 3번, 1번, 2번, 1번] 후보에 투표했음을 나타내고, 이 경우 당선된 후보자의 번호는 1번입니다.

후보의 수 n, 투표 결과가 담긴 배열 votes가 매개변수로 주어질 때, 과반수를 득표한 후보자의 번호를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 작동하지 않습니다. 주어진 코드에서 <U>**한 줄**</U>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요. 

---
#####매개변수 설명

후보의 수 n, 투표 결과가 담긴 배열 votes가 solution 메소드의 매개변수로 주어집니다.
* n은 1 이상 100 이하의 자연수입니다.
* votes의 길이는 1 이상 1,000 이하의 자연수입니다.
* votes의 각 원소는 1 이상 n 이하의 자연수입니다.

---
#####return 값 설명

과반수를 득표한 후보자의 번호를 return 해주세요.
* 만약, 과반수를 득표한 후보자가 없다면 -1을 return 해주세요.

---
#####예시

| n | votes | return |
|---|------|--------|
| 3 | [1,2,1,3,1,2,1] | 1 |
| 2 | [2,1,2,1,2,2,1] | 2 |

#####예시 설명

예시 #1
1번부터 3번까지의 후보 3명이 있으며, 투표 결과는 [1, 2, 1, 3, 1, 2, 1]입니다.
총 투표 수는 7표이며, 1번 후보가 4표, 2번 후보가 2표, 3번 후보가 1표씩 받았습니다.
이 경우, 1번 후보가 과반수를 득표하였으므로 1을 return 합니다.

예시 #2
1번부터 2번까지의 후보 2명이 있으며, 투표 결과는 [2, 1, 2, 1, 2, 2, 1]입니다.
총 투표 수는 7표이며, 1번 후보는 3표, 2번 후보는 4표를 받았습니다.
이 경우, 2번 후보가 과반수를 득표하였으므로 2를 return 합니다.

 */

class Solution {
    public int solution(int n, int[] votes) {
       
        return -1;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        int[] votes1 = {1, 2, 1, 3, 1, 2, 1};
        int ret1 = sol.solution(n1, votes1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 2;
        int[] votes2 = {2, 1, 2, 1, 2, 2, 1};
        int ret2 = sol.solution(n2, votes2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
    }    
}