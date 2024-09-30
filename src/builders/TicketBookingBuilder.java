package builders;

import models.TicketBooking;

public class TicketBookingBuilder {
    private TicketBooking ticketBooking;

    public TicketBookingBuilder() {
        this.ticketBooking = new TicketBooking();
    }

    public TicketBookingBuilder setMovieTitle(String movieTitle) {
        ticketBooking.setMovieTitle(movieTitle);
        return this;
    }

    public TicketBookingBuilder setSeatNumber(String seatNumber) {
        ticketBooking.setSeatNumber(seatNumber);
        return this;
    }

    public TicketBookingBuilder setSnackCombo(String snackCombo) {
        ticketBooking.setSnackCombo(snackCombo);
        return this;
    }

    public TicketBooking build() {
        return ticketBooking;
    }
}