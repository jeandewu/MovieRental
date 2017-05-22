package JEAN;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENT on 2017-05-19.
 */
public class Customer {
    public static final String CSV_SEPARATOR = ",";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    private static int nextId = 0;

    private int id;
    private String pesel;
    private String firstName;
    private String lastName;
    private String city;
    private Date date;

    public Customer(String pesel, String firstName, String lastName, String city, Date date) {
        id = nextId;
        nextId++;

        this.date = date;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String toCSVString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id);
        stringBuilder.append(CSV_SEPARATOR);
        stringBuilder.append(pesel);
        stringBuilder.append(CSV_SEPARATOR);
        stringBuilder.append(firstName);
        stringBuilder.append(CSV_SEPARATOR);
        stringBuilder.append(lastName);
        stringBuilder.append(CSV_SEPARATOR);
        stringBuilder.append(city);
        stringBuilder.append(CSV_SEPARATOR);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);
        String formattedDate = simpleDateFormat.format(date);
        stringBuilder.append(formattedDate);


        return stringBuilder.toString();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}