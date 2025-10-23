package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    public static final int START_VALUE = 0;
    public static final int END_VALUE = 9;

    public int randomValue() {
        return Randoms.pickNumberInRange(START_VALUE, END_VALUE);
    }

    public void isMove(Cars cars) {
        for(int i = 0; i < cars.carCount(); i++) {
            if(randomValue() >= 4) {
                cars.get(i).addPosition();
            }
        }
    }
}
