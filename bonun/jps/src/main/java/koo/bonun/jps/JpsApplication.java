package koo.bonun.jps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
// Auditing 허용해주는 어노테이션
public class JpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpsApplication.class, args);
	}

}
