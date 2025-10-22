package racingcar.controller;

import racingcar.domain.ValidateCarName;
import racingcar.view.InputHandler;

public class RacingController {
    private final InputHandler inputHandler;

    public RacingController() {
        inputHandler = new InputHandler();
    }

    public void start() {
        String carNames = inputHandler.carNameInput();
        ValidateCarName.validateCarName(carNames);
    }
}
