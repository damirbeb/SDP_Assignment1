package models;

public class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public String getMovie() {
        return movie;
    }

    public String getTime() {
        return time;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StandardSchedule clone() {
        try {
            return (StandardSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
