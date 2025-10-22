package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars from(String carNamesInput) {
        List<Car> carList = new ArrayList<>();
        String[] carNames = carNamesInput.split(",");
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
        return new Cars(carList);
    }
}
