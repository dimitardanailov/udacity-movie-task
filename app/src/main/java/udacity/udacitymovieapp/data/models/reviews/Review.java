package udacity.udacitymovieapp.data.models.reviews;

/**
 * Created by mitko on 17.03.18.
 */

public class Review {

    private int id;

    private Author author;

    private String content;

    private String url;

    public Review() {

    }

    /*** Id ***/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*** Id ***/
}
