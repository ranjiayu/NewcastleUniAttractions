package com.team21.attractionsGuide.service;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import com.google.gson.Gson;


public class GoogleMapService {

    final String apiKey = "AIzaSyCOVP27tJRVNkn4D9BxLo6oap9nM3V-lVA";

    public String getNearbyPlaces(double latitude, double longtitude) {
        RestTemplate restTemplate = new RestTemplate();
        // read the key from configuration in production environment

        String requestUrl = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location={location}&radius={radius}&key={key}";

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("location", latitude + "," + longtitude);
        params.put("radius", "1500");
        params.put("key", apiKey);
        // JSON string, return directly or process it. Here just return.
        String resp = restTemplate.getForObject(requestUrl, String.class, params);
        return resp;
    }

    public String getAutocompletePlacesList(String input, double latitude, double longitude, Integer radius) {
        RestTemplate restTemplate = new RestTemplate();

        String requestUrl = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input={input}&location={location}&origin={location}&radius={radius}&key={key}";

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("input", input);
        params.put("location", latitude + "," + longitude);
        params.put("radius", Integer.toString(radius));
        params.put("key", apiKey);

        // JSON string, return directly or process it. Here just return.
        // TODO process JSON string into Array or List(make a separate function to format Json data into Places Object)

        String resp = restTemplate.getForObject(requestUrl, String.class, params);
        return resp;
    }


}
