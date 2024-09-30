package factories;

import models.Movie;

public abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}