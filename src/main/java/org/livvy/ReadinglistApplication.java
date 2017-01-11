package org.livvy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.livvy.reading.mapper")
public class ReadinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadinglistApplication.class, args);
	}


}
