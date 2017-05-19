package JEAN;

/**
 * Created by RENT on 2017-05-19.
 */
public class Movie {
    private static int nextId=0;
    private  int id;
    private String title;
    private String genere;
    String description;

    public Movie(String title, String genere, String description) {
        id=nextId;
        nextId++;
        this.title = title;
        this.genere = genere;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
