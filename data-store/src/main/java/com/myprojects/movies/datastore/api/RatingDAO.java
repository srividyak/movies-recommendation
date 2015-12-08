package com.myprojects.movies.datastore.api;

import com.myprojects.movies.model.Rating;

import java.util.List;
import java.util.Map;

/**
 * Created by srividyak on 08/12/15.
 */
public interface RatingDAO {
    void save(List<Rating> ratings);
    
    Map<String, List<Rating>> getRatingsByUser(List<String> userId);
    
    Map<String, List<Rating>> getRatingsOfMovies(List<String> movies);
    
    Map<String, Rating> getRatingsByIds(List<String> ids);
}
