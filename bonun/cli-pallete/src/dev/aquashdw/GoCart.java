package dev.aquashdw;

public class GoCart extends AbstractCar implements CarInterface {
    private  Driver driver;


    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;

    }

    @Override
    public void acccelerate() {
        this.velocity += 5;
    }

    @Override
    public void brake() {
        this.velocity -=5;
        super.brake();
        // 오버라이드를 했던 추상클래스의 브레이크 함수에 도달 하기위한 함수

    }
}
