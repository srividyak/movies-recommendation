package com.myprojects.movies.datastore.api;

import com.myprojects.movies.model.Tag;

import java.util.List;
import java.util.Map;

/**
 * Created by srividyak on 08/12/15.
 */
public interface TagDAO {
    void save(List<Tag> tag);

    Map<String, Tag> getTagsByIds(List<String> ids);
    
    Map<String, List<Tag>> getTagsOfUser(List<String> userIds);
    
    Map<String, List<Tag>> getTagsOfMovies(List<String> movieIds);
}
