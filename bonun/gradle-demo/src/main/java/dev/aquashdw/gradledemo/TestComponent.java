package dev.aquashdw.gradledemo;

import org.springframework.stereotype.Component;
//@ <- 어노테이션 , 밑의 어노테이션은 퍼블릭 클래스 위에 들어감으로
//테스트 컴포넌트는 스트링 IoC에서 관리하는 객체가 되게된다
@Component
public class TestComponent {
    private TestInterface testInterface;
    public  TestComponent(
            TestInterface testInterface,
            int gradeBean
    ){
        this.testInterface = testInterface;
        System.out.println(gradeBean);
    }

    public void sayHello(){
        this.testInterface.sayHello();
    }
}
