package com.example.demo;

import com.example.demo.clients.TripAdvisorAirportClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	private static final Logger logger = LogManager.getLogger(DemoApplicationTests.class);

	@Autowired
	TripAdvisorAirportClient airportClient;

	@Test
	public void testAirportSearch() {
		Airport firstAirport = airportClient.getAirports();
		assertFalse(firstAirport.toString().isEmpty());
		logger.debug(firstAirport.toString());
	}

}
