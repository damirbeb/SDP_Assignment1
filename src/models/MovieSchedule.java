package models;

import java.lang.Cloneable;

public interface MovieSchedule extends Cloneable {
    String getMovie();
    String getTime();
    void setMovie(String movie);
    void setTime(String time);
}