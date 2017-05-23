package JEAN;

import JEAN.exceptions.MovieAlreadyExistsException;
import JEAN.exceptions.NullCustomerException;
import JEAN.exceptions.NullMovieException;

import java.io.IOException;
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
        this.rents = new ArrayList<>();
        this.movies = new ArrayList<>();

        try {
            this.customers = DataFileReader.readCustomersFromFile("customers.csv");
        } catch (IOException e) {
            System.err.println("Błąd podczas wczytywania klientów z pliku");
            this.customers = new ArrayList<>();
        }
    }

    public void addCustomer(Customer customer) throws NullCustomerException {
        if (customer == null) {
            throw new NullCustomerException();
        }

        customers.add(customer);
    }

    public void addMovie(Movie movie) throws NullMovieException, MovieAlreadyExistsException {
        if (movie == null) {
            throw new NullMovieException();
        }

        if(movies.contains(movie)){
            throw new MovieAlreadyExistsException();
        }

        movies.add(movie);
    }

    public void addRent(Rent rent){
        // TODO handle errors
        rents.add(rent);
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

    public void printAllData(){
        System.out.println("====== WYPOŻYCZALNIA =====");
        System.out.println("--- CUSTOMERS ---");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("--- MOVIES ---");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("--- RENTS ---");
        for (Rent rent : rents) {
            System.out.println(rent);
        }
        System.out.println("==========================");
    }

    public void saveCustomersToFile(){
        DataFileWriter.writeCustomersToFile("customers.csv", customers);
    }
}