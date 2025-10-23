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
            validateCarName(carName.trim());
            carList.add(new Car(carName.trim()));
        }
        return new Cars(carList);
    }

    public static void validateCarName(String carName) {
        if(carName.isEmpty() || carName.length() > 5)
            throw new IllegalArgumentException();
    }

    public int carCount() {
        return carList.size();
    }

    public Car get(int index) {
        return carList.get(index);
    }

    public List<Car> getCars() {
        return carList;
    }
}
