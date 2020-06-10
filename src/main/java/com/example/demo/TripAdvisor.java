package com.example.demo;
import org.springframework.http.*;

import java.awt.*;

public class TripAdvisor {
    public static final String rapidApiHostKey = "x-rapidapi-host";
    public static final String rapidApiHostValue = "http://tripadvisor1.p.rapidapi.com";
    public static final String rapidApiKeyKey = "x-rapidapi-key";
    public static final String rapidApiKeyValue = "94936e3315mshcb5523d01421d70p18694cjsn95ba4cb7a810";
    public static final String airportSearch = "/airports/search";
    public static final String defaultLocale = "en_US";

    public static HttpEntity getHttpHeaderEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add(rapidApiHostKey, rapidApiHostValue);
        headers.add(rapidApiKeyKey, rapidApiKeyValue);
        HttpEntity entity = new HttpEntity(null, headers);
        return entity;
    }

}

