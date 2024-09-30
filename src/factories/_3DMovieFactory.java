package factories;

import models.Movie;
import models._3DMovie;

public class _3DMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new _3DMovie(title);
    }
}