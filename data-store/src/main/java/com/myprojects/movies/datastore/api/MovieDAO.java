package com.myprojects.movies.datastore.api;

import com.myprojects.movies.model.Movie;

import java.util.List;
import java.util.Map;

/**
 * Created by srividyak on 08/12/15.
 */
public interface MovieDAO {
    void save(List<Movie> movies);
    
    Map<String, Movie> getByIds(List<String> ids);
    
    Map<String, Movie> getByTitles(List<String> title);

    Map<String, List<Movie>> getByGenres(List<String> genre);
}
