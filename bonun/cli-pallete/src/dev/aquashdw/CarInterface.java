package dev.aquashdw;

public interface CarInterface {
    void setDriver(Driver driver);
    void acccelerate();
    void brake();

}
// 인터페이스를 잘 활용하면 서로 다른 구현체가 같은 목적을 위해 동작하도록 만들 수 있다.
//사용하고자하는 객체의 실제 자료형과 무관하게 동작하게 만들 수 있다.