import config.CinemaConfig;
import factories.DarkThemeFactory;
import factories.MovieFactory;
import factories.RegularMovieFactory;
import models.Movie;
import models.MovieSchedule;
import models.StandardSchedule;
import models.TicketBooking;
import builders.TicketBookingBuilder;
import ui.Button;
import ui.TextField;

public class CinemaManagementApp {
    public static void main(String[] args) {
        // Singleton usage
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        // Factory Method usage
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        // Abstract Factory usage
        DarkThemeFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();
        TextField textField = uiFactory.createTextField();
        textField.render();

        // Builder usage
        TicketBookingBuilder ticketBookingBuilder = new TicketBookingBuilder();
        TicketBooking ticketBooking = ticketBookingBuilder.setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();
        System.out.println("Movie Title: " + ticketBooking.getMovieTitle());
        System.out.println("Seat Number: " + ticketBooking.getSeatNumber());
        System.out.println("Snack Combo: " + ticketBooking.getSnackCombo());

        // Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie.getTitle());
        System.out.println("Movie: " + eveningSchedule.getMovie() + ", Time: " + eveningSchedule.getTime());
    }
}