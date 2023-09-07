package Pro.sky.java.course1.homework1;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int publicationYear;


    public Book(String bookTitle, Author author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги - " + this.bookTitle + " Автор - " + author.toString() + " Год издания - " + this.publicationYear;
    }

    public boolean equals(Book book) {
        if (this.author.equals(book.author) && this.bookTitle.equals(book.bookTitle) && this.publicationYear == book.publicationYear) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationYear);
    }
}
