package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private static final String JOIN_WINNERS_NAME = ",";
    List<String> winners;

    public Winner() {
        winners = new ArrayList<>();
    }

    public static String decideWinners(Cars cars) {
        int maxPosition = cars.getMaxPosition(cars);
        List<String> winners = cars.getCars().stream()
                .filter(Car -> Car.getPosition() == maxPosition)
                .map(Car::getCarName)
                .toList();

        return String.join(JOIN_WINNERS_NAME, winners);
    }
}
