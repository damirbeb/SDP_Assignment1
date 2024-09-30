package models;

public class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    public void setSnackCombo(String snackCombo) {
        this.snackCombo = snackCombo;
    }
}