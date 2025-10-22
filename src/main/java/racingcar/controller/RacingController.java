package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.ValidateInput;
import racingcar.view.InputHandler;

public class RacingController {
    private final InputHandler inputHandler;

    public RacingController() {
        inputHandler = new InputHandler();
    }

    public void start() {
        String carNames = inputHandler.carNameInput();
        ValidateInput.validateCarName(carNames);

        int tryCount = inputHandler.tryCountInput();
        ValidateInput.validateTryCount(tryCount);

        Cars cars = Cars.from(carNames);
    }
}
