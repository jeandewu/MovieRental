package JEAN;


import java.util.Date;

/**
 * Created by RENT on 2017-05-19.
 */
public class Rent {
    private Date data;
    private int customerId;
    private int movieId;

    public Rent(int customerId, int movieId) {
        this.customerId = customerId;
        this.movieId = movieId;
        this.data = new Date();
    }

    public Date getData() {
        return data;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getMovieId() {
        return movieId;
    }

}
