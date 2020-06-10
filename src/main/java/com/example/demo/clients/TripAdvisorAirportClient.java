package com.example.demo.clients;

import com.example.demo.Airport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

@Component
public class TripAdvisorAirportClient {
    private static final Logger logger = LogManager.getLogger(TripAdvisorAirportClient.class);

    @Value("${rapidapi.tripadvisor.url.airport.search}")
    String airportSearchUrl;

    @Value("${rapidapi.key.name}")
    String apiKeyName;

    @Value("${rapidapi.key.value}")
    String apiKeyValue;

    @Value("${rapidapi.host.name}")
    String hostName;

    @Value("${rapidapi.host.tripadvisor.value}")
    String hostValue;

    RestTemplate restTemplate;

    public TripAdvisorAirportClient(RestTemplateBuilder restTemplateBuilder){
        restTemplate = restTemplateBuilder.build();
    }

    public Airport getAirports() {
        Airport airport = null;
        UriComponents uri = UriComponentsBuilder.newInstance()
                .fromHttpUrl(airportSearchUrl)
                .buildAndExpand("en_US", "jfk");

        logger.debug("Created URI Component: " + uri.toString());

        HttpHeaders headers = new HttpHeaders();
        headers.set(apiKeyName, apiKeyValue);
        headers.set(hostName, hostValue);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> request = new HttpEntity<String>(headers);

        ResponseEntity<Airport[]> totalEntity = restTemplate.exchange(
                uri.toUri(),
                HttpMethod.GET,
                request,
                Airport[].class);
        airport = totalEntity.getBody()[0];
        logger.debug("Got Airport: \n" + airport.toString());
        return airport;
    }
}
