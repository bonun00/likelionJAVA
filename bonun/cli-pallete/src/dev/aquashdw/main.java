package dev.aquashdw;

public class main {
    public static void main(String[] args) {
        Driver unlicensed = new Driver("unlicensed",0);
        Driver me = new Driver("me",1);
        CarInterface car = new GoCart();
        car.setDriver(unlicensed);
        car.setDriver(me);

        car = new SmallerCar();
        car.setDriver(me);
//        car.setDriver(unlicensed);

    }
}
// IoC Inversion of Control
// 스프링 등장 전 라이브러리의 코드를 사용하여 개발
// 스프링 등장후 제어역전이라는 개념이 등장 -- 개발자의 코드를 프레임워크가 사용

// spring Ioc Container - 개발자가 작성한 코드 설정정보가 합쳐져 완전한 웹서비스를 만들도록 도와줌
//개발자가 작성한 코드에 설정을 합쳐 Beans이라고 부른다
//Beans이 Ioc Container에 저장되있는데 이 빈을 필요한 시점에 다시 주입하여 사용할수 있게
// 하는것을 DI 디팬전시 인젝션 의존성 주입이라고 한다
//스프링에서 구현을 요구하는 부분들을 인터페이스로 정의 이후 사용자가 정의한
//구현체 Bean을 실제 서비스에서 사용