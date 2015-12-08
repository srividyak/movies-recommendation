package com.myprojects.movies.model;

import java.util.Locale;

/**
 * Created by srividyak on 08/12/15.
 */
public class Tag {
    private String userId;
    private String movieId;
    private String tag;
    private Long timestamp;
    private Long id;

    public String getUserId() {
        return userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTag() {
        return tag;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Long getId() {
        return id;
    }
}
