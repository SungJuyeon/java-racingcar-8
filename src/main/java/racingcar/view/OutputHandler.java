package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputHandler {
    private static final String ROUND_RESULT_MESSAGE = "실행 결과";
    private static final String POSITION_PRINT = "-";
    private static final String FINAL_WINNER_MESSAGE = "최종 우승자 : ";

    public void roundResultMessage() {
        System.out.println(ROUND_RESULT_MESSAGE);
    }

    public void printRoundResult(Cars cars) {
        for(Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : ");
            System.out.println(POSITION_PRINT.repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(String winners) {
        System.out.print(FINAL_WINNER_MESSAGE + winners);
    }
}
