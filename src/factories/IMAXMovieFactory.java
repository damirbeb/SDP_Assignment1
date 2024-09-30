package factories;

import models.Movie;
import models.IMAXMovie;

public class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}