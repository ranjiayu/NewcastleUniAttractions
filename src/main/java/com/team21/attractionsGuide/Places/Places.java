package com.team21.attractionsGuide.Places;

import java.util.List;

public class Places {

    private String description;
    private Integer distanceMetres;
    private String placeID;
    private String mainText;
    private String secondaryText;
    private List<String> placeTypes;

    public Places(String description, Integer distanceMetres, String placeID, String mainText, String secondaryText, List<String> placeTypes) {
        this.description = description;
        this.distanceMetres = distanceMetres;
        this.placeID = placeID;
        this.mainText = mainText;
        this.secondaryText = secondaryText;
        this.placeTypes = placeTypes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDistanceMetres() {
        return distanceMetres;
    }

    public void setDistanceMetres(Integer distanceMetres) {
        this.distanceMetres = distanceMetres;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getSecondaryText() {
        return secondaryText;
    }

    public void setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
    }

    public List<String> getPlaceTypes() {
        return placeTypes;
    }

    public void setPlaceTypes(List<String> placeTypes) {
        this.placeTypes = placeTypes;
    }
}
