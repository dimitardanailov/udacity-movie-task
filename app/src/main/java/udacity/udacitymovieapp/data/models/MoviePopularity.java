package udacity.udacitymovieapp.data.models;

/**
 * Created by mitko on 24.03.18.
 */

public class MoviePopularity {

    /**
     * @json key: popularity
     */
    private String popularity;

    /**
     * @json key: vote_count
     */
    private String voteCount;

    /**
     * @json key: vote_average
     */
    private String voteAverage;

    public MoviePopularity(String popularity, String voteCount, String voteAverage) {

    }
}
