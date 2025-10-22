package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇 회인가요?";
    public String carNameInput() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        return Console.readLine();
    }

    public int tryCountInput() {
        System.out.println(TRY_COUNT_INPUT_MESSAGE);
        return Integer.parseInt(Console.readLine());
    }
}
