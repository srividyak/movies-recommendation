package com.myprojects.movies.model;

/**
 * Created by srividyak on 08/12/15.
 */
public class Rating {
    private String movieId;
    private String userId;
    private Float rating;
    private Long timestamp;
    private Long id;

    public String getMovieId() {
        return movieId;
    }

    public String getUserId() {
        return userId;
    }

    public Float getRating() {
        return rating;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Long getId() {
        return id;
    }
}
