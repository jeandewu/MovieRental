package JEAN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-05-22.
 */
public class CustomerTest {
    @Test
    public void toCSVString() throws Exception {
        MovieRental movieRental = new MovieRental();
        Customer customer = new Customer("123", "Adam", "Kowalski", "Wrocław", new Date());

        // when
        movieRental.toCSVString

        // then
        assertEquals(1, movieRental.getCustomers().size());
        assertTrue(movieRental.getCustomers().contains(customer));


    }

}