package Models;

import java.util.ArrayList;

public class TVSerie extends Media {
    private int numberOfSeasons;
    private Genre[] genres;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;
        this.genres = genres;
    }

    @Override
    public String toString() {
        String stringForm = super.getTitle() + " has " + numberOfSeasons + " seasons and is a " + genres + " that stars: " + super.getCast();
        System.out.println(stringForm);
        return stringForm;
    }

}
