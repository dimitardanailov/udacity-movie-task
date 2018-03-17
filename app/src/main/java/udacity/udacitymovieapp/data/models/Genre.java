package udacity.udacitymovieapp.data.models;

/**
 * Created by mitko on 17.03.18.
 */

public class Genre {

    private int id;

    private String name;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*** Id ***/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*** Id ***/

    /*** Name ***/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*** Name ***/
}
