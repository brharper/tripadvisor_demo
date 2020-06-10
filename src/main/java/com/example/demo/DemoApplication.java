package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
	private Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder){
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
//		return args -> {
//			String url = "https://tripadvisor1.p.rapidapi.com/airports/search?locale=en_US&query=jfk";
//			ResponseEntity<String> response = restTemplate.exchange(
//					url,
//					HttpMethod.GET,
//					TripAdvisor.getHttpHeaderEntity(),
//					String.class);
//
//			logger.info(response.getBody());
//		};
//	}

}
