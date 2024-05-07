package 이급39;
import java.util.*;

/*

#문제9
4 x 4 크기 격자 모양 지형에 위험 지역이 몇 개인지 알고 싶습니다. 위험지역이란 동, 서, 남, 북 인접한 지역이 모두 해당 지역보다 높은 지역입니다. 예를 들어 지역 높이가 아래와 같다면

 ![ㅅㅡㅋㅡㄹㅣㄴㅅㅑㅅ 2018-07-25 ㅇㅗㅎㅜ 3.05.26.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/8a4540a61f/4c104489-628c-4a6d-889f-ffe93bd29055.png)

빨간 영역은 인접한 지역이 모두 해당 지역보다 높은 위험지역입니다.

지역별 높이가 담긴 2차원 배열 height가 solution 메소드의 매개변수로 주어질 때, 위험 지역이 몇 개인지 return 하도록 solution 함수를 완성해주세요.

---
#####매개변수 설명
지역별 높이가 담긴 2차원 배열 height가 solution 메소드의 매개변수로 주어집니다.
* 각 지역의 높이는 1 이상 50 이하인 자연수입니다.

---
#####return 값 설명
위험지역이 몇 개인지 return 해주세요.

---
#####예시
| height                                               	| return |
|----------------------------------------------------------|--------|
| [[3, 6, 2, 8], [7, 3, 4, 2], [8, 6, 7, 3], [5, 3, 2, 9]] | 5  	|

#####예시 설명
문제에 나온 예와 같습니다.
*/
class Solution {
    public int solution(int day, int[] numbers) {
        int count = 0;
       
        return count;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int day = 17;
        int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
        int ret = sol.solution(day, numbers);
    
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

