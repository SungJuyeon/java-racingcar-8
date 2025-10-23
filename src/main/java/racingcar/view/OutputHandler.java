package racingcar.view;

import racingcar.domain.Cars;

public class OutputHandler {
    private static final String ROUND_RESULT_MESSAGE = "실행 결과";
    private static final String POSITION_PRINT = "-";

    public static void roundResultMessage() {
        System.out.println(ROUND_RESULT_MESSAGE);
    }

    public static void roundResultPrint(Cars cars) {
        for(int i = 0; i < cars.carCount(); i++) {
            System.out.print(cars.get(i).getCarName() + " : ");
            System.out.println(POSITION_PRINT.repeat(cars.get(i).getPosition()));
        }
        System.out.println();
    }
}
