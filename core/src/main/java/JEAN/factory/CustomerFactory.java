package JEAN.factory;

import JEAN.Customer;

import java.text.ParseException;

/**
 * Created by RENT on 2017-05-23.
 */
public class CustomerFactory implements MyFactory<Customer> {
    @Override
    public Customer create(String text) {
        try {
            return new Customer(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}