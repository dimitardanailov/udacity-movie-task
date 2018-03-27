package udacity.udacitymovieapp.data.utils;

import org.json.JSONException;
import org.json.JSONObject;

import udacity.udacitymovieapp.data.models.Movie;

/**
 * Created by mitko on 24.03.18.
 */

public class MovieJsonUtils {

    public static Movie parseMovieJson(String json) {

        try {
            JSONObject jsonObject = new JSONObject(json);

            return null;
        } catch (JSONException e) {
            e.printStackTrace();

            return null;
        }
    }
}
