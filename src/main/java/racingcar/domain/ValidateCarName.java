package racingcar.domain;

public class ValidateCarName {
    public static void validateCarName(String carNames) {
        if(carNames ==null || carNames.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
