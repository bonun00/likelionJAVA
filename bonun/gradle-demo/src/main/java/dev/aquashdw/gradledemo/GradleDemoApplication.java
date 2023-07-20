package dev.aquashdw.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleDemoApplication {

	public static void main(String[] args) {
		// new를 통해서 테스트 컴포넌트를 만들고 인터페이스를 만들어서 제공
		//생성자에 있는 인자들을 실제로사용하는 코드시점에서 만들어주고 전달을 해줘여지
		//정상적으로 작동한다
//		TestComponent testComponent = new TestComponent(
//				new TestInterface() {
//					@Override
//					public void sayHello() {
//						System.out.println("hello world! this is temp interface");
//					}
//				}
//		);
//		testComponent.sayHello();
		SpringApplication.run(GradleDemoApplication.class, args);
	}

}
