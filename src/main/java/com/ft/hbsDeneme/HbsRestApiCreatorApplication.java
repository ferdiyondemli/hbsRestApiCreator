package com.ft.hbsDeneme;

import com.ft.restApiCreator.filecreator.FileCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HbsRestApiCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HbsRestApiCreatorApplication.class, args);
	}

	@Bean
	public FileCreator getfi(){

		return new FileCreator();
	}
}
