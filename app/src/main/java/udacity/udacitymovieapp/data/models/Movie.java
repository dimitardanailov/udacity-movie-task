package udacity.udacitymovieapp.data.models;

import java.util.List;

/**
 * Created by mitko on 17.03.18.
 *
 *
 * URL: http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=API
 */

public class Movie {

    /**
     * key: "id"
     */
    private long id;

    /**
     * @json key: title
     */
    private String title;

    /**
     * @sjon key: poster_path
     */
    private String posterPath;



    private boolean favored;

    /**
     *
     */
    private List<Genre> genres;

    /**
     * @json key: release_date
     */
    private String releaseDate;

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
