package Pro.sky.java.course1.homework1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;

    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    public boolean equals(Author author) {
        if (this.name.equals(author.name) && this.surname.equals(author.surname)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}