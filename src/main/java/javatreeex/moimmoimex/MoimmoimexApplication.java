package javatreeex.moimmoimex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"javatreeex.moimmoimex.mapper"})
@SpringBootApplication
public class MoimmoimexApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoimmoimexApplication.class, args);
	}

}
