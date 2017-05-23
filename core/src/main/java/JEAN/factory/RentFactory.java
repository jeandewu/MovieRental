package JEAN.factory;

import JEAN.Rent;

import java.text.ParseException;

/**
 * Created by RENT on 2017-05-23.
 */
public class RentFactory implements MyFactory<Rent> {
    @Override
    public Rent create(String text) {
        try {
            return new Rent(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}