package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

    private String code;
    private String name;

    @JsonProperty("city_name")
    private String cityName;

    @JsonProperty("country_code")
    private String countryCode;

    private String state;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("display_title")
    private String displayTitle;

    @JsonProperty("display_sub_title")
    private String displaySubTitle;

    @JsonProperty("location_id")
    private Integer locationId;

    @JsonProperty("time_zone_name")
    private String timeZoneName;

    private double latitude;

    private double longitude;

    @JsonProperty("parent_code")
    private String parentCode;

    @Override
    public String toString() {
        return String.format(
                "Airport:\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17d = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17s = %s\n\t" +
                        "%-17f = %s\n\t" +
                        "%-17f = %s\n\t",
                "code", code,
                "city_name", cityName,
                "country_code ", countryCode,
                "state", state,
                "display_name", displayName,
                "display_title", displayTitle,
                "display_sub_title", displaySubTitle,
                "location_id", locationId,
                "time_zone_name", timeZoneName,
                "latitude", latitude,
                "longitude", longitude);
    }

    public Integer getId(){
        return locationId;
    }

    public String getName(){
        return name;
    }

    public String getCityName(){
        return cityName;
    }

    public String getCountryCode(){
        return countryCode;
    }

    public String getState(){
        return state;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public String getDisplaySubTitle() {
        return displaySubTitle;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public String getParentCode() {
        return parentCode;
    }

}

