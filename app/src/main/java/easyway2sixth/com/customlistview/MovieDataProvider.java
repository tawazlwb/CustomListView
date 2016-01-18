package easyway2sixth.com.customlistview;

/**
 * Created by MMD on 18/01/2016.
 */
public class MovieDataProvider {
    private int movie_poster_ressource;
    private String movie_title;
    private String movie_rating;

    public MovieDataProvider(int movie_poster_ressource, String movie_title, String movie_rating) {
        this.movie_poster_ressource = movie_poster_ressource;
        this.movie_title = movie_title;
        this.movie_rating = movie_rating;
    }

    public int getMovie_poster_ressource() {
        return movie_poster_ressource;
    }

    public void setMovie_poster_ressource(int movie_poster_ressource) {
        this.movie_poster_ressource = movie_poster_ressource;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(String movie_rating) {
        this.movie_rating = movie_rating;
    }
}
