package com.example.exam1.ApplicationContext.bean;

import java.sql.Date;

public class File {
   private int film_id;
   private String title;
   private String description;
   private int release_year;
    private int language_id;
    private int riginal_language_id;
    private int rental_duration;
    private double  rental_rate;
    private int length;
    private double replacement_cost;
    private String rating;
    private String special_features;
    private Date last_update;
    public File( int film_id, String title, String description, int release_year, int  language_id, int  riginal_language_id, int  rental_duration, double rental_rate, int length, double replacement_cost, String rating, String special_features, Date last_update)
    {
        this.description=description;
        this.film_id=film_id;
        this.language_id=language_id;
        this.last_update=last_update;
        this.length=length;
        this.rating=rating;
        this.release_year=release_year;
        this.rental_duration=rental_duration;
        this.replacement_cost=replacement_cost;
        this.special_features=special_features;
        this.title=title;
        this.riginal_language_id=riginal_language_id;
        this.rental_rate=rental_rate;


    }
    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setRiginal_language_id(int riginal_language_id) {
        this.riginal_language_id = riginal_language_id;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public int getRiginal_language_id() {
        return riginal_language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public int getLength() {
        return length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public Date getLast_update() {
        return last_update;
    }
}
