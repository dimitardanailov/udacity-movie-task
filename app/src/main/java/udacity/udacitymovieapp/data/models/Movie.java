package udacity.udacitymovieapp.data.models;

import java.util.List;

/**
 * Created by mitko on 17.03.18.
 */

public class Movie {

    private long id;

    private String overview;

    private String releaseDate;

    private String posterPath;

    private double popularity;

    private String title;

    private double voteAverage;

    private long voteCount;

    private boolean favored;

    private List<Genre> genres;

    public Movie() {

    }

    /*** ID ***/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    /*** ID ***/
}
