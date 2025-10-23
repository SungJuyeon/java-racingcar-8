package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputHandler {
    private static final String ROUND_RESULT_MESSAGE = "실행 결과";
    private static final String POSITION_PRINT = "-";

    public static void roundResultMessage() {
        System.out.println(ROUND_RESULT_MESSAGE);
    }

    public static void printRoundResult(Cars cars) {
        for(Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : ");
            System.out.println(POSITION_PRINT.repeat(car.getPosition()));
        }
        System.out.println();
    }
}
