package Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Director {
    private String name;
    private LocalDate birthday;

    public Director(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        String stringForm = name + " has thier birthday on the " + birthday;
        System.out.println(stringForm);
        return stringForm;
    }
    public ArrayList<Movie> getDirectedMovies(ArrayList<Movie> movies) {
        ArrayList<Movie> directedMovies = new ArrayList<Movie>();
        for(Movie movie : movies) {
            if(movie.getDirector().equals(this)) {
                directedMovies.add(movie);
            }
        }
        return directedMovies;
    }


}
