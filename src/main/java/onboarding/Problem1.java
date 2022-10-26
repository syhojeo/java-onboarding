package onboarding;

import java.util.ArrayList;
import java.util.List;

/*
    요구 사항 분석
    제한 사항
    1. pobi, crong 의 길이는 2
    -> list 의 길이 2가 아닌 예외처리 필요

    2. pobi, crong에는 [왼쪽 페이지 번호, 오른쪽페이지 번호] 가 순서대로 들어있다
    -> 값이 순서대로 들어있는지 왼쪽페이지 번호와 오른쪽페이지 번호가 정상적으로 들어왔는지 확인할것
    1) 왼쪽페이지 번호가 1~ 399 사이의 값인가?
    2) 왼쪽 페이지의 번호가 홀 수 인가?
    3) 오른쪽페이지 번호가 왼쪽페이지 + 1 이 맞는가

    요구 사항 구현
    0. 예외처리에 걸릴 경우 -1 리턴
    1. 왼쪽 페이지 번호를 다 더한값과 곱한값 구해서 큰값 도출
    2. 오른쪽 페이지 번호를 다 더한값과 곱한값 구해서 큰값 도출
    3. 1,2 중 큰값 구해서 도출
    4. pobi와 crong 중 누가더 큰지 확인 후 포비승(1) , 크롱승(2), 무승부(0) 리턴
 */
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        //0. 예외처리에 걸릴 경우 -1 리턴
        if (exceptionCheck(pobi) == -1 || exceptionCheck(crong) == -1) {
            return -1;
        }

        return answer;
    }

    private static int exceptionCheck(List<Integer> player) {

        int leftPageNumber = player.get(0);
        int rightPageNumber = player.get(1);

        //1. pobi, crong 의 길이는 2
        if (player.size() != 2) {
            return -1;
        }

        //2.1) 왼쪽페이지 번호가 1~ 399 사이의 값인가?
        if (leftPageNumber < 1 || leftPageNumber > 399) {
            return -1;
        }

        //2.2) 왼쪽 페이지의 번호가 홀 수 인가?
        if (leftPageNumber % 2 == 0) {
            return -1;
        }

        //2.3) 오른쪽페이지 번호가 왼쪽페이지 + 1 이 맞는가
        if (rightPageNumber != leftPageNumber + 1) {
            return -1;
        }

        return 1;
    }


}