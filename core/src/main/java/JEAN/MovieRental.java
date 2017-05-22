package JEAN;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-22.
 */
public class MovieRental {
private List<Customer> customers;
private List<Rent> rents;
private List<Movie> movies;

    public MovieRental() {
        this.customers = new ArrayList<>();
        this.rents = new ArrayList<>();
        this.movies= new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    

}
