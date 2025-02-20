#include <stdio.h>
#include <stdlib.h>

int Cal_weight(int i, int remainWeight, int Mount, int **dp, int *ObjWeight, int *ObjValue)
{
    if (i >= Mount || remainWeight <= 0)
    { // 종료 조건
        return 0;
    }

    if (dp[i][remainWeight] != -1)
    { // 이미 계산된 경우 반환
        return dp[i][remainWeight];
    }

    // 물건을 선택하지 않는 경우
    int nonselect = Cal_weight(i + 1, remainWeight, Mount, dp, ObjWeight, ObjValue);

    // 물건을 선택하는 경우
    int select = 0;
    if (ObjWeight[i] <= remainWeight)
    {
        select = ObjValue[i] + Cal_weight(i + 1, remainWeight - ObjWeight[i], Mount, dp, ObjWeight, ObjValue);
    }

    // 최댓값 저장
    dp[i][remainWeight] = (nonselect > select) ? nonselect : select;
    return dp[i][remainWeight];
}

int main()
{
    int Mount, MaxWeight;
    scanf("%d %d", &Mount, &MaxWeight);

    // 동적 배열 생성
    int *ObjWeight = (int *)malloc(sizeof(int) * Mount);
    int *ObjValue = (int *)malloc(sizeof(int) * Mount);

    // DP 배열 동적 생성
    int **dp = (int **)malloc(sizeof(int *) * (Mount));
    for (int i = 0; i < Mount; i++)
    {
        dp[i] = (int *)malloc(sizeof(int) * (MaxWeight + 1));
    }

    // DP 배열 초기화
    for (int i = 0; i < Mount; i++)
    {
        for (int w = 0; w <= MaxWeight; w++)
        {
            dp[i][w] = -1;
        }
    }

    // 입력 처리
    for (int i = 0; i < Mount; i++)
    {
        scanf("%d %d", &ObjWeight[i], &ObjValue[i]);
    }

    // 재귀 호출
    int result = Cal_weight(0, MaxWeight, Mount, dp, ObjWeight, ObjValue);

    // 결과 출력
    printf("%d\n", result);

    // 동적 메모리 해제
    free(ObjWeight);
    free(ObjValue);
    for (int i = 0; i < Mount; i++)
    {
        free(dp[i]);
    }
    free(dp);

    return 0;
}
