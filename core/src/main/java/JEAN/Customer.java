package JEAN;

import java.util.Date;

/**
 * Created by RENT on 2017-05-19.
 */
public class Customer {
    private static int nextId=0;
    private String pesel;
    private String firstName;
   private  String lastName;
  private   int id;
    private String city;
    private Date date;

    public Customer(String pesel, String firstName, String lastName, String city, Date date) {
        id=nextId;
        nextId++;
        this.date=date;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
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

    public int getId() {
        return id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
