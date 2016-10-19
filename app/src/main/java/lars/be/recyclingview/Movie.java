package lars.be.recyclingview;

/**
 * Created by brandonstark on 19/10/16.
 */

public class Movie {

    private String title;
    private String description;
    private int poster;

    public Movie(String title, String description, int poster) {
        this.title = title;
        this.description = description;
        this.poster = poster;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
