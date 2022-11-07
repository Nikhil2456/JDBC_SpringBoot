package com.nikhil.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource({"file:C:\\Users\\ynikh\\OneDrive\\Desktop\\course.properties"})
})
public class SpringJbdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJbdcApplication.class, args);
	}

}
