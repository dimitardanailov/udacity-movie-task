package udacity.udacitymovieapp.helpers.locales;

import java.util.HashMap;

/**
 * Created by mitko on 24.03.18.
 *
 * HashMapGenres has an information about the api.themoviedb.org movie genres.
 *
 * Why the information is hardcoded:
 * - Reduce the REST API calls
 * - Reduce memory and CPU usage
 * - Better performance
 */
public class HashMapGenres {

    private static final String ACTION = "Action";
    private static final String ADVENTURE = "Adventure";
    private static final String ANIMATION = "Animation";
    private static final String COMEDY = "Comedy";
    private static final String CRIME = "Crime";
    private static final String DOCUMENTARY = "Documentary";
    private static final String DRAMA = "Drama";
    private static final String FAMILY = "Family";
    private static final String FANTASY = "Fantasy";
    private static final String HISTORY = "History";
    private static final String HORROR = "Horror";
    private static final String MUSIC = "Music";
    private static final String MYSTERY = "Mystery";
    private static final String ROMANCE = "Romance";
    private static final String SCIENCE_FICTION = "Science Fiction";
    private static final String TV_MOVIE = "TV Movie";
    private static final String THRILLER = "Thriller";
    private static final String WAR = "War";
    private static final String WESTERN = "Western";

    /**
     * Method can access the data about the movie genres
     *
     * HashMap key has an information about en-US locale name
     * HasMap value has an information about Database key
     *
     * @return HashMap<String, Integer>
     */
    public static HashMap<String, Integer> getGenres() {
        HashMap<String, Integer> genres = new HashMap<>();

        // Action
        genres.put(ACTION, 28);

        // Adventure
        genres.put(ADVENTURE, 12);

        // Animation
        genres.put(ANIMATION, 16);

        // Comedy
        genres.put(COMEDY, 35);

        // Crime
        genres.put(CRIME, 80);

        // Documentary
        genres.put(DOCUMENTARY, 99);

        // Drama
        genres.put(DRAMA, 18);

        // Family
        genres.put(FAMILY, 10751);

        // Fantasy
        genres.put(FANTASY, 14);

        // History
        genres.put(HISTORY, 36);

        // Horror
        genres.put(HORROR, 27);

        // Music
        genres.put(MUSIC, 10402);

        // Mystery
        genres.put(MYSTERY, 9648);

        // Romance
        genres.put(ROMANCE, 10749);

        // Science Fiction
        genres.put(SCIENCE_FICTION, 10749);

        // TV Movie
        genres.put(TV_MOVIE, 10770);

        // Thriller
        genres.put(THRILLER, 53);

        // War
        genres.put(WAR, 10752);

        // Western
        genres.put(WESTERN, 37);

        return genres;
    }
}
