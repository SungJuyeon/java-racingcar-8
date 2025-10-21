# 기능 구현 목록
## What ? 무엇을 구현할 것인가
- Car
    - 이름 (5글자 이하)
    - 위치

- Cars
  - 가장 큰 위치 구하기

- 전진 / 멈춤
    - 0-9 무작위 값 구하기
    - 4 이상이면 전진

- 입력
    - 자동차 이름 입력 받기 (쉼표 기준으로 구분)
    - 이동 횟수

- 출력
    - 우승자 안내 문구
    - 차수별 실행 결과

- 우승자 결정
    - Cars 중 가장 큰 위치에 있는 모든 자동차 이름이 우승자

---

### Who ? (누가 구현할 것인가)

- Car
    - 이름
    - 위치

- ValidateCarName
    - 5글자 초과면 `IllegalArgumentException`
    - 자동차 이름이 없으면 `IllegalArgumentException`

- InputHandler
    - 자동차 이름 입력
    - 이동 횟수

- RacingController
    - 자동차 이름 입력 받으면 쉼표 기준으로 Car 생성

- RacingGame
    - 0-9 랜덤값 구하기
    - 값이 4 이상이면 전진

- DecisionWinner
    - 우승자 계산

- OutputHandler
    - 우승자 출력
    - 차수별 실행 결과 출력