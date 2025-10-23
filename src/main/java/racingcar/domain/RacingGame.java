package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.OutputHandler;

public class RacingGame {
    public static final int START_VALUE = 0;
    public static final int END_VALUE = 9;

    public int randomValue() {
        return Randoms.pickNumberInRange(START_VALUE, END_VALUE);
    }

    public void playRound(Cars cars) {
        for(Car car : cars.getCars()) {
            if(shouldMove()) {
                car.addPosition();
            }
        }
    }

    public boolean shouldMove() {
        return randomValue() >= 4;
    }
}
