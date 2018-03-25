package udacity.udacitymovieapp.utils;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitko on 24.03.18.
 */

public class JsonListUtils {

    private static List<String> parseJsonArray(JSONArray array) {
        List<String> items = new ArrayList<>();

        for (int i = 0; i < array.length(); i++) {
            items.add(array.optString(i));
        }

        return items;
    }
}
