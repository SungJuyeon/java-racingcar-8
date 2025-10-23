package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Winner;
import racingcar.domain.RacingGame;
import racingcar.domain.ValidateInput;
import racingcar.view.InputHandler;
import racingcar.view.OutputHandler;

import static racingcar.domain.Winner.decideWinners;

public class RacingController {
    private final InputHandler inputHandler;
    private final RacingGame racingGame;
    private final OutputHandler outputHandler;

    public RacingController() {
        inputHandler = new InputHandler();
        racingGame = new RacingGame();
        outputHandler = new OutputHandler();
    }

    public void start() {
        String carNames = inputHandler.carNameInput();
        ValidateInput.validateCarName(carNames);

        int tryCount = inputHandler.tryCountInput();
        ValidateInput.validateTryCount(tryCount);

        Cars cars = Cars.from(carNames);

        startGame(tryCount, cars);

        announceWinner(cars);
    }

    public void startGame(int tryCount, Cars cars) {
        outputHandler.roundResultMessage();
        while(tryCount-- > 0) {
            racingGame.playRound(cars);
            outputHandler.printRoundResult(cars);
        }
    }

    public void announceWinner(Cars cars) {
        String decideWinner = decideWinners(cars);
        outputHandler.printWinners(decideWinner);
    }
}
