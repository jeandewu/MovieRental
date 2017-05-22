package JEAN;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static JEAN.Customer.DATE_PATTERN;
import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-05-22.
 */
public class CustomerTest {
    @Test
    public void toCSVString() throws Exception {
        // given
        Customer customer = new Customer("123", "Adam", "Kowalski", "Wrocław", new Date(0));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String expectedString = customer.getId() + ",123,Adam,Kowalski,Wrocław," + simpleDateFormat.format(new Date(0));

        // when
        String csvString = customer.toCSVString();

        // then
        assertEquals(expectedString, csvString);
    }

    @Test
    public void constructor_parseStringCorrectCase() throws ParseException {
        //given
        String text = "10,1234,Adam,Kowalski,Wrocław,1980-10-10";
        //when
        Customer customer = new Customer(text);
        //then
        assertEquals("Adam", customer.getFirstName());
        assertEquals("Kowalski", customer.getLastName());
        assertEquals("Wrocław", customer.getCity());
        assertEquals(10, customer.getId());
        assertEquals("1234", customer.getPesel());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);
        assertEquals("1980-10-10", simpleDateFormat.format(customer.getDate()));

    }

}