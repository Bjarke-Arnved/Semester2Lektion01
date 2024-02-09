package Models;

import java.util.ArrayList;

public class Movie extends Media {
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }
    @Override
    public String toString() {
        String stringForm = super.getTitle() + "came out in " + productionYear + "and was directed by " + director + ". It is a " + super.getGenres() + "that has gotten a rating of " + rating + ", and it stars: " + super.getCast();
        System.out.println(stringForm);
        return stringForm;
    }
    public Director getDirector() {
        return director;
    }
}
