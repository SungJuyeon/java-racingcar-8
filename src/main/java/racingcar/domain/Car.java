package racingcar.domain;

public class Car {
    private final String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        position = 0;
    }

    public void addPosition() {
        position++;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
