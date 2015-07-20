package com.androidgifts.gift.recyclerviewwithcustomadapter.data;

public class Movie {
    private String name;
    private String logo;
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Movie(String name, String logo, double rating) {
        this.name = name;
        this.logo = logo;
        this.rating = rating;
    }
}
