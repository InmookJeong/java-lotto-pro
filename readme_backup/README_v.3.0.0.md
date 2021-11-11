_README version 3.0.0

# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 목록

1. 입력된 구매 금액을 통해 몇장의 로또를 구매하는지 계산하기
    - 입력된 구매 금액이 숫자인지 확인하기
    - 입력된 구매 금액이 1000 이상인지 확인하기

2. 수동으로 구매할 로또 수 입력받기

3. 수동으로 구매할 로또 번호 입력받기
    - 1~45 사이의 숫자

4. 총 구매 갯수에서 수동으로 구매할 갯수를 제외한 나머지 수만큼 로또 번호 가져오기
    - 1~45 사이의 숫자
    - 숫자 중복 확인하기
    - 오름차순 정렬하기

5. 지난 주 당첨 번호 입력 받기

6. 보너스 볼 1개 입력 받기

7. 당첨 번호와 몇 개가 일치하는지 확인하기
    - 3개 이상 일치하는 경우 Count 하기

8. 당첨 통계 출력하기

9. 수익률 계산하기