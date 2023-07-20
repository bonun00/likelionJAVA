package dev.aquashdw;

// Alt + Enter 오류 수정 가능

public class SmallerCar implements CarInterface {

    private Driver driver;
    private  int velocity;


    @Override
    public void setDriver(Driver driver) {
        if (driver.getLicense() < 1){
            throw new RuntimeException("insufficient license");

        }
        this.driver = driver;
    }

    @Override
    public void acccelerate() {
        this.velocity +=10;
    }

    @Override
    public void brake() {
        this.velocity -=10;
        if(this.velocity<0) this.velocity = 0;

    }
}
