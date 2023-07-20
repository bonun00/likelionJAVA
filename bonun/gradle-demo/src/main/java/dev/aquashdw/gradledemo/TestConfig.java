package dev.aquashdw.gradledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    // Beand어노테이션으로 인티져를 돌려준다 함수의
    //이름을 가지고 빈 객체가 생성된다
    //빈 객체가 TestComponent로 코드를 입력하여 들어가게된다
    //스프링부트를 사용하면 어노테이션들을 통해 원하는 시점에 원하는 값 내지는 객체를
    //전달할수 있도록 개발을 진행해야한다
    //스프링부트를 잘사용한다 = 어노테이션을 잘사용한다
    // Bean을 어떻게 잘 다루느냐
    @Bean
    public int gradeBean(){
        return 10;
    }

}
// 스프링과 스프링 부트의 차이
// 개발자코드 + 설정 = Beans이라는 객체 만든다
//Beans Xml의 형태로 설정을 만들었는데 이 XML을 사용하는데
// 오랜 시간이 걸린다
// 반면 스프링 부트는 설정이 스프링 부트 Starter에 정의가 되어 있다.
//위의 스타터로인해 스프링 프렘임워크에서 사용하는 XMl생략가능
// 스프링 프레임워크는 자바프로그램으로 자기자신을 사용할수 없어서 War파일 이용해야한다
//실행을 위해 톰켓과 같은 프로그램이 필요하다
//스프링 부트는 Tomcat같은 기능을 jar의 형태로 실행된다