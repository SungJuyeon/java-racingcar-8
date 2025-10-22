package racingcar.domain;

public class ValidateInput {
    public static void validateCarName(String carNames) {
        if(carNames ==null || carNames.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateTryCount(int tryCount) {
        if(tryCount <= 0)
            throw new IllegalArgumentException();
    }
}
