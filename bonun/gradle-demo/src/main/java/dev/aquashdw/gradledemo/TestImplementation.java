package dev.aquashdw.gradledemo;

import org.springframework.stereotype.Component;

//임플리멘테이션 구현체라는 의미를 가짐
//컴포넌트어노테이션 지워지면 에러 발생
//이게 있어야 스프링 Ioc에서 검색해서 사용하기 때문
@Component
public class TestImplementation implements TestInterface {
    @Override
    public void sayHello(){
        System.out.println("hello, i'm a bean");
    }
}
