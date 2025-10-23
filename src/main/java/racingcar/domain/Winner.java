package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecisionWinner {
    List<String> winners;

    public DecisionWinner() {
        winners = new ArrayList<>();
    }

    public static List<String> decideWinners(Cars cars) {
        int maxPosition = cars.getMaxPosition(cars);
        return cars.getCars().stream()
                .filter(Car -> Car.getPosition() == maxPosition)
                .map(Car::getCarName)
                .toList();
    }
}
