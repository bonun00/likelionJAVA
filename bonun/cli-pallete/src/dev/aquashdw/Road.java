package dev.aquashdw;

import java.util.ArrayList;

public class Road {
    private ArrayList<CarInterface> carsOnRoad;
    // 함수의 인자와 반환값은 인터페이스 활용
    public Road() {
        this.carsOnRoad = new ArrayList<>();
    }

    public Road(ArrayList<CarInterface> carsOnRoad) {
        this.carsOnRoad = carsOnRoad;
    }

    //이메서드를 통해 smalcar 와 gocart 입장가능
    public void addCar(CarInterface car){
        this.carsOnRoad.add(car);
    }
}
