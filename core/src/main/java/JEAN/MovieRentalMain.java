package JEAN;

/**
 * Created by RENT on 2017-05-23.
 */
import JEAN.exceptions.MovieAlreadyExistsException;
import JEAN.exceptions.NullCustomerException;
import JEAN.exceptions.NullMovieException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 22/05/2017.
 */
public class MovieRentalMain {
    public static void main(String[] args) throws NullCustomerException, NullMovieException, MovieAlreadyExistsException {
        MovieRental movieRental = new MovieRental();
        movieRental.printAllData();

        System.out.println("dodaję klienta");
        movieRental.addCustomer(new Customer("1234", "Adam", "Kowalski", "Wrocław", new Date()));
        System.out.println("dodaję film");
        movieRental.addMovie(new Movie("Terminator", "Action", "BLA"));
        System.out.println("dodaję wypożyczenie");
        movieRental.addRent(new Rent(0,0));

        movieRental.printAllData();


    }
}