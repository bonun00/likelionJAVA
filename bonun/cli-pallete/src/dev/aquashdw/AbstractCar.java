package dev.aquashdw;

public abstract class AbstractCar implements CarInterface {
    protected  int velocity = 0;

    @Override
    public void brake(){
        if(this.velocity<0)  this.velocity = 0;
    }
}
