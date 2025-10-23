package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.domain.ValidateInput;
import racingcar.view.InputHandler;
import racingcar.view.OutputHandler;

public class RacingController {
    private final InputHandler inputHandler;
    private final RacingGame racingGame;

    public RacingController() {
        inputHandler = new InputHandler();
        racingGame = new RacingGame();
    }

    public void start() {
        String carNames = inputHandler.carNameInput();
        ValidateInput.validateCarName(carNames);

        int tryCount = inputHandler.tryCountInput();
        ValidateInput.validateTryCount(tryCount);

        Cars cars = Cars.from(carNames);

        startGame(tryCount, cars);


    }

    public void startGame(int tryCount, Cars cars) {
        OutputHandler.roundResultMessage();
        while(tryCount-- > 0) {
            racingGame.playRound(cars);
            OutputHandler.roundResultPrint(cars);
        }
    }
}
