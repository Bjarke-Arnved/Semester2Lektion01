package Models;

import java.time.LocalDate;

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
}
