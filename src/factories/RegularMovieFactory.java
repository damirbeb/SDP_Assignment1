package factories;

import models.Movie;
import models.RegularMovie;

public class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}