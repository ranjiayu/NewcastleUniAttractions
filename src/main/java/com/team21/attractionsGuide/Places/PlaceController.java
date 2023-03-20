package com.team21.attractionsGuide.Places;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/place")
public class PlaceController {

    private GoogleMapService googleService = new GoogleMapService();

    @GetMapping(value = "/getNearbyAttractions", produces = "application/json;charset=UTF-8")
    @ResponseBody

    public String getNearbyAttractions(
            @RequestParam double latitude,
            @RequestParam double longitude
    ) {
        // Get parameters from the url
        // eg. /place/getNearbyAttractions?latitude=1&longitude=2, get '1' and '2'

        // TODO: Valid the parameters, springboot will check the type automatically.
        //  We should valid them logically.

        // handle by GoogleMapService class
        String respString = googleService.getNearbyPlaces(latitude, longitude);
        // Respond with json
        return respString;
    }

    @GetMapping(value = "/getAutoComplete", produces = "application/json;charset=UTF-8")
    public String getAutoCompletePlaces(
            @RequestParam String input,
            @RequestParam double latitude,
            @RequestParam double longitude,
            @RequestParam Integer radius
    ) {
        // TODO: Valid the parameters, springboot will check the type automatically.
        //  We should valid them logically.

        // handle by GoogleMapService class
        String respString = googleService.getAutocompletePlacesList(input, latitude, longitude, radius);
        // Respond with json
        return respString;
    }
}
