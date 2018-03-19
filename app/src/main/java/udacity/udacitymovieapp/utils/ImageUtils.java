package udacity.udacitymovieapp.utils;

/**
 * Created by mitko on 18.03.18.
 */

public final class ImageUtils {

    private static final String BASE_URL = "http://image.tmdb.org/t/p";

    /**
     * A note on resolving poster paths with themoviedb.org API
     *
     * You will notice that the API response provides a relative path
     * to a movie poster image when you request the metadata for a
     * specific movie.
     *
     * For example, the poster path return for Interstellar
     * is “/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg”
     *
     * You will need to append a base path ahead of this relative path to
     * build the complete url you will need to fetch the image using Picasso.
     *
     * It’s constructed using 3 parts:
     *  1. The base URL will look like: http://image.tmdb.org/t/p/.
     *  2. Then you will need a ‘size’, which will be one of
     *  the following: "w92", "w154", "w185", "w342", "w500", "w780",
     *  or "original". For most phones we recommend using “w185”.
     *  3. And finally the poster path returned by the query,
     *  in this case “/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg”
     *
     * Combining these three parts gives us a final url of
     * http://image.tmdb.org/t/p/w185//nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg
     *
     * This is also explained explicitly in the
     * API documentation for /configuration.
     *
     * @param width
     * @param imagePath
     *
     * @return BASE_URL + widthPath + imagePath
     */
    public static String buildPosterUrl(int width, String imagePath) {
        String widthPath;

        if (width <= 92) widthPath = "/w92";
        else if (width <= 154) widthPath = "/w154";
        else if (width <= 185) widthPath = "/w185";
        else if (width <= 342) widthPath = "/w342";
        else if (width <= 500) widthPath = "/w500";
        else widthPath = "/w780";

        return BASE_URL + widthPath + imagePath;
    }
}
